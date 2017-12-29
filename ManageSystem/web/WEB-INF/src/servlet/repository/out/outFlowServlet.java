package servlet.repository.out;

import bean.repository.A5;
import bean.repository.A6;
import service.repository.serviceForRepositoryIMP;
import tools.StringTools;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.DoubleSummaryStatistics;


@WebServlet(name = "outFlowServlet",urlPatterns = "/servlet/repository/out/outFlowServlet")
public class outFlowServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("test11111");
        String a52 = StringTools.nullToEmpty(req.getParameter("a52"));
        String a53 = StringTools.nullToEmpty(req.getParameter("a53"));
        int a54 = Integer.valueOf(req.getParameter("a54"));
        int a55 = Integer.valueOf(req.getParameter("a55"));
        double a56 = Double.valueOf(req.getParameter("a56"));
        Date a57 = Date.valueOf(req.getParameter("a57"));

        A5 a5 =new A5(a52,a53,a54,a55,a56,a57);
        System.out.println(a5.toString());
//        写server和dao 存入A5
        serviceForRepositoryIMP serviceForRepositoryIMP = new serviceForRepositoryIMP();
        serviceForRepositoryIMP.addProductOut(a5);
        serviceForRepositoryIMP.addProductOutToorepository(a5);
        serviceForRepositoryIMP.UpdateA47AfterOutFlow(a5);

        req.getRequestDispatcher(req.getContextPath() + "/servlet/repository/repaireNeeded/SparePartsNeededServlet").forward(req, resp);
    }

    // TODO: 2017/12/28 跳转实现 
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
