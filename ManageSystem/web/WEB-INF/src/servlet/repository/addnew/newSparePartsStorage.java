package servlet.repository.addnew;

import bean.repository.A7;
import service.repository.serviceForRepositoryIMP;
import tools.StringTools;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

@WebServlet(name = "newSparePartsStorageServlet",urlPatterns = "/servlet/repository/addnew/newSparePartsStorageServlet")
public class newSparePartsStorage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("UTF-8");
//        resp.setCharacterEncoding("UTF-8");
//        resp.setContentType("text/html; charset=UTF-8");
        String a72 = StringTools.emptyToNull(req.getParameter("a72"));
        String a73 = StringTools.emptyToNull(req.getParameter("a73"));
        double a74 = Double.valueOf(req.getParameter("a74"));
        int a75 = Integer.valueOf(req.getParameter("a75"));
        int a76 = Integer.valueOf(req.getParameter("a76"));
        String flag = req.getParameter("a77");
        String a77 = null;
        if (flag.equals("1")) a77 = "正常";
        else if (flag.equals("2")) a77 = "临界";
        else if (flag.equals("3")) a77 = "警示";
        else if (flag.equals("4")) a77 = "缺货";
        A7 addnew = new A7(a72,a73,a74,a75,a76,a77);
//        System.out.println(addnew.toString());

        //开始server 和dao 把类存进去
        serviceForRepositoryIMP serviceForRepositoryIMP = new serviceForRepositoryIMP();
        serviceForRepositoryIMP.addNewSpareParts(addnew);
//        String str = new String(req.getParameter("A1051").getBytes("iso-8859-1"), "utf-8");
//        System.out.println(str);
        req.setAttribute("addA7",addnew);
        Date a66InAddnew = Date.valueOf(req.getParameter("a66"));
//        System.out.println(a66InAddnew);
        req.setAttribute("dateadd",a66InAddnew);
        req.getRequestDispatcher(req.getContextPath() + "/content/repository/addflowToNew.jsp").forward(req,resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }
}
