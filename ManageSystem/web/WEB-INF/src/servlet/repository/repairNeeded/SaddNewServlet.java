package servlet.repository.repairNeeded;

import bean.repository.A7;
import bean.repository.NameTypeNumber;
import tools.StringTools;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "SaddNewServlet", urlPatterns = "/servlet/repository/repairNeeded/SaddNewServlet")
public class SaddNewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //用A7来暂存数据 这样就不用再用一个jsp
//        String a72 = StringTools.emptyToNull(req.getParameter("a722"));
//        String a73 = StringTools.emptyToNull(req.getParameter("a732"));
//        int a75 = Integer.valueOf(req.getParameter("number"));
        NameTypeNumber nameTypeNumber = new NameTypeNumber();
        nameTypeNumber.setName(StringTools.emptyToNull(req.getParameter("a722")));
        nameTypeNumber.setType(StringTools.emptyToNull(req.getParameter("a732")));
        nameTypeNumber.setNumber(Integer.valueOf(req.getParameter("a552")));
        req.setAttribute("AddnewNTN", nameTypeNumber);
        req.getRequestDispatcher(req.getContextPath() + "/content/repository/SaddNew.jsp").forward(req,resp);
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }
}
