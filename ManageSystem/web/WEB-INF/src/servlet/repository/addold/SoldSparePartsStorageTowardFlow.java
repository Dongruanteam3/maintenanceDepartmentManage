package servlet.repository.addold;

import bean.repository.A7;
import tools.StringTools;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "SoldSparePartsStorageTowardFlowServlet",urlPatterns = "/servlet/repository/addold/SoldSparePartsStorageTowardFlowServlet")
public class SoldSparePartsStorageTowardFlow extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //用A7来暂存数据 这样就不用再用一个jsp
        String a72 = StringTools.emptyToNull(req.getParameter("a72"));
        String a73 = StringTools.emptyToNull(req.getParameter("a73"));
        int a75 = Integer.valueOf(req.getParameter("number"));
        A7 a7 = new A7(a72,a73,a75);
        req.setAttribute("addA7",a7);
        req.getRequestDispatcher(req.getContextPath() + "/content/repository/SaddflowToOld.jsp").forward(req,resp);
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }
}
