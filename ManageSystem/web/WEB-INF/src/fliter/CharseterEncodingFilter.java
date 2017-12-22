package fliter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class CharseterEncodingFilter implements Filter
{
    private FilterConfig filterConfig = null;
    private String defaultCharset = "UTF-8";

    public CharseterEncodingFilter() {
        super();
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        HttpServletRequest httpServletRequest = (HttpServletRequest)servletRequest;

        httpServletRequest.setCharacterEncoding("UTF-8");
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("text/html;charset=UTF-8");

        MyRequest myRequest = new MyRequest(httpServletRequest);
        filterChain.doFilter(myRequest,httpServletResponse);
    }

    @Override
    public void destroy() {

    }
    class MyRequest extends HttpServletRequestWrapper {
        private HttpServletRequest request;
        public MyRequest(HttpServletRequest request) {
            super(request);
            this.request = request;
        }
        @Override
        public String getParameter(String name) {
            if(request.getMethod().equalsIgnoreCase("post")){
                return this.request.getParameter(name);
            }

            String value = this.request.getParameter(name);
            if(value==null){
                return null;
            }

            try {
                value = new String(value.getBytes("iso8859-1"),"UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }

            return value;
        }
    }
}