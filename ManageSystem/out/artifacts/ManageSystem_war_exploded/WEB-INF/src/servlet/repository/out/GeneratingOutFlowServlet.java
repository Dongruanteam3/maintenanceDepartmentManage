package servlet.repository.out;

import bean.repository.A7;
import bean.repository.NameTypeNumber;
import tools.StringTools;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//通过之前的备件 型号 需求数量 生成出库流水表
@WebServlet(name = "GeneratingOutFlowServlet",urlPatterns = "/servlet/repository/out/GeneratingOutFlowServlet")
public class GeneratingOutFlowServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        NameTypeNumber nameTypeNumber = new NameTypeNumber();
        nameTypeNumber.setName(StringTools.nullToEmpty(req.getParameter("a72")));
        nameTypeNumber.setType(StringTools.nullToEmpty(req.getParameter("a73")));
        nameTypeNumber.setNumber(Integer.valueOf(req.getParameter("a55")));
        req.setAttribute("ntn",nameTypeNumber);
//        System.out.println(nameTypeNumber.toString());
        req.getRequestDispatcher(req.getContextPath() + "/content/repository/outflow.jsp").forward(req,resp);
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }
}
