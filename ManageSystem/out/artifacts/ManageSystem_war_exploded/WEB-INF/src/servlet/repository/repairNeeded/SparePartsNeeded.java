package servlet.repository.repairNeeded;

import bean.repair.A4;
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


//�û������һ��ҳ�����Ϣ
@WebServlet(name = "SparePartsNeededServlet", urlPatterns = "/servlet/repository/repaireNeeded/SparePartsNeededServlet")
public class SparePartsNeeded extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        int a41 = (int)session.getAttribute("a41");
//        String a47 = (String)session.getAttribute("a47");
//        String a49 = (String)session.getAttribute("a49");
        //done: ��Ϊ���ڻ��޸�a47 a49 ���Ը���Ϊ��a1ʵʱ��ѯ79
        serviceForRepositoryIMP serviceForRepositoryIMP = new serviceForRepositoryIMP();
        A4 a4 = serviceForRepositoryIMP.selectA4byNumber(a41);
        String a47 = StringTools.nullToEmpty(a4.getA47());
        String a49 = StringTools.nullToEmpty(a4.getA49());
        //�ȴ�����ڱ���
        //����ArrayList
        ArrayList<NameTypeNumber> arrayList = StringTools.stringToArrayList(a47);
        Iterator<NameTypeNumber> iterator = arrayList.iterator();
        ArrayList<Integer> repositoryNumber = new ArrayList<>();
        NameTypeNumber nameTypeNumber = new NameTypeNumber();
        while(iterator.hasNext()){
            //��server dao ʵ�ֲ���A7�Ŀ������
            nameTypeNumber = iterator.next();
            repositoryNumber.add(serviceForRepositoryIMP.selectSparePartsNumber(nameTypeNumber.getName(),nameTypeNumber.getType()));
        }

        ArrayList<NameTypeNumber> newSparePartArrayList = StringTools.stringToArrayList(a49);
        req.setAttribute("newSparePartArrayList",newSparePartArrayList);
        req.setAttribute("nameTypeNumber",arrayList);
        req.setAttribute("repositoryNumber",repositoryNumber);
        req.getRequestDispatcher(req.getContextPath() + "/content/repository/SparePartsNeeded.jsp").forward(req,resp);
//            System.out.println(iterator.next().toString());

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }
}
