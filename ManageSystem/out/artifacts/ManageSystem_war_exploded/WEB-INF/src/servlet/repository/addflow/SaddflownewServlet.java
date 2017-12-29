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


@WebServlet(name = "SaddflownewServlet",urlPatterns = "/servlet/repository/addflow/SaddflownewServlet")
public class SaddflownewServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double a65 = Double.valueOf(req.getParameter("a65"));
        String a62 = req.getParameter("a62");
        String a63 = req.getParameter("a63");
        int a64 = Integer.valueOf(req.getParameter("a64"));
        Date a66 = Date.valueOf(req.getParameter("a66"));
        System.out.println("a65");
        A6 flownew = new A6(a62,a63,a64,a65,a66);
        serviceForRepositoryIMP serviceForRepositoryIMP = new serviceForRepositoryIMP();
        serviceForRepositoryIMP.addProductIn(flownew);
        // TODO: 2017/12/28  ������Ҫ�޸�A47 ��A49 �µ��Ѿ���� ��ô��Ӧ�ðɶ�Ӧ��A49��ȡ��A47����
//        A6����û�ж�Ӧ��ά�ޱ�� ���Ի��Ǵ�session���浼��
        int a41 =(int) req.getSession().getAttribute("a41");
        serviceForRepositoryIMP.UpdateA47A49AfterNewInFlow(flownew, a41);
        req.getRequestDispatcher(req.getContextPath() + "/servlet/repository/repaireNeeded/SparePartsNeededServlet").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
