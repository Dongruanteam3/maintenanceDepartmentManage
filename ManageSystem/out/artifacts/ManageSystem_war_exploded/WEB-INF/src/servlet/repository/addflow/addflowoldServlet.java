package servlet.repository.addflow;

import bean.repository.A6;
import service.repository.serviceForRepositoryIMP;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;


@WebServlet(name = "addflowoldServlet",urlPatterns = "/servlet/repository/addflow/addflowoldServlet")
public class addflowoldServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("test");
//        System.out.println("req");
        double a65 = Double.valueOf(req.getParameter("a65"));
        String a62 = req.getParameter("a62");
        String a63 = req.getParameter("a63");
        int a64 = Integer.valueOf(req.getParameter("a64"));
        Date a66 = Date.valueOf(req.getParameter("a66"));
//        System.out.println("a65");
        A6 flownew = new A6(a62,a63,a64,a65,a66);
//        System.ouprintln(flownew.toString());
//        写server和dao 存入A6
        serviceForRepositoryIMP serviceForRepositoryIMP = new serviceForRepositoryIMP();
        serviceForRepositoryIMP.addProductIn(flownew);
        serviceForRepositoryIMP.addProductInToorepository(flownew);
//        System.out.println(a66InAddnew);
        //做一个数量添加的server
        req.getRequestDispatcher(req.getContextPath() + "/servlet/repository/select/reoldSparePartsStorageServlet").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
