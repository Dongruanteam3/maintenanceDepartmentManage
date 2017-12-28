package servlet.repository.select;

import bean.repository.A7;
import service.repository.serviceForRepositoryIMP;
import tools.StringTools;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "reoldSparePartsStorageServlet",urlPatterns = "/servlet/repository/select/reoldSparePartsStorageServlet")
public class reOldSparePartsStorage extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String flag = (String)session.getAttribute("flag");
        String state = "All";
        if (flag.equals("1")) state = "正常";
        else if (flag.equals("2")) state = "临界";
        else if (flag.equals("3")) state = "警示";
        else if (flag.equals("4")) state = "缺货";

        String selectName = StringTools.emptyToNull((String)session.getAttribute("name"));
//        System.out.println("state:" + state);
//        System.out.println("name:" + selectName);

        //server dao 要判断各个状态 如果state为all 就不加条件, name为null也不加条件
        serviceForRepositoryIMP serviceForRepositoryIMP = new serviceForRepositoryIMP();
        ArrayList<A7> a7ArrayList = serviceForRepositoryIMP.selectSpareParts(state,selectName);

        //传递到request 然后 请求转发
        session.setAttribute("flag", req.getParameter("selectStatus"));
        session.setAttribute("name", req.getParameter("selectName"));
        session.setAttribute("a7ArrayList",a7ArrayList);
        req.getRequestDispatcher(req.getContextPath() + "/content/repository/addold.jsp").forward(req, resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }
}
