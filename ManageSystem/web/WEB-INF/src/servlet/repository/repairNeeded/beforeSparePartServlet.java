package servlet.repository.repairNeeded;

import bean.repository.NameTypeNumber;
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
import java.util.Iterator;

@WebServlet(name = "beforeSparePartServlet", urlPatterns = "/servlet/repository/repaireNeeded/beforeSparePartServlet")
public class beforeSparePartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        int a41 = Integer.valueOf(req.getParameter("a41"));
//        String a47 = req.getParameter("a47");
//        String a49 = req.getParameter("a49");
        //先处理存在备件
        HttpSession session = req.getSession();
        session.setAttribute("a41",Integer.valueOf(req.getParameter("a41")));
        session.setAttribute("a47",req.getParameter("a47"));
        session.setAttribute("a49",req.getParameter("a49"));
        req.getRequestDispatcher(req.getContextPath() + "/servlet/repository/repaireNeeded/SparePartsNeededServlet").forward(req,resp);

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }
}
