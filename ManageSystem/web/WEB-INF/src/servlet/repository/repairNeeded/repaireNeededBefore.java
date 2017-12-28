package servlet.repository.repairNeeded;

import bean.repair.A4;
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
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;

@WebServlet(name = "repaireNeededBeforeServlet", urlPatterns = "/servlet/repository/repaireNeeded/repaireNeededBeforeServlet")
public class repaireNeededBefore extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //取得A4集合 这是所有正在维修的A4(a48 != 维修完成)
        serviceForRepositoryIMP serviceForRepositoryIMP = new serviceForRepositoryIMP();
        ArrayList<A4> a4ArrayList =  serviceForRepositoryIMP.selectWorkingA4();
//        Iterator<A4> a4Iterator = a4ArrayList.iterator();
        HttpSession session = req.getSession();
        session.setAttribute("a4ArrayList",a4ArrayList);
        req.getRequestDispatcher(req.getContextPath() + "/content/repository/repairNeeded.jsp").forward(req,resp);
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }
}
