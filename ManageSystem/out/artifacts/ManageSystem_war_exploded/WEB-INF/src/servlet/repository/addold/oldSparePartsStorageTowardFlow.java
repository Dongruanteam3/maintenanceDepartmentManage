package servlet.repository.addold;

import bean.repository.A6;
import bean.repository.A7;
import service.repository.serviceForRepositoryIMP;
import tools.StringTools;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "oldSparePartsStorageTowardFlowServlet",urlPatterns = "/servlet/repository/addold/oldSparePartsStorageTowardFlowServlet")
public class oldSparePartsStorageTowardFlow extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //��A7���ݴ����� �����Ͳ�������һ��jsp
        String a72 = StringTools.emptyToNull(req.getParameter("a72"));
        String a73 = StringTools.emptyToNull(req.getParameter("a73"));
        int a75 = Integer.valueOf(req.getParameter("number"));
        A7 a7 = new A7(a72,a73,a75);
        req.setAttribute("addA7",a7);
        Date a66InAddnew = new Date(System.currentTimeMillis());
        req.setAttribute("dateadd",a66InAddnew);
        req.getRequestDispatcher(req.getContextPath() + "/content/repository/addflowToOld.jsp").forward(req,resp);
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }
}
