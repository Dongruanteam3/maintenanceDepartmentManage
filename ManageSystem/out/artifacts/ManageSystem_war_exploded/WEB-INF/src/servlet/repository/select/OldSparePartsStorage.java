package servlet.repository.select;

import tools.StringTools;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "oldSparePartsStorageServlet",urlPatterns = "/servlet/repository/select/oldSparePartsStorageServlet")
public class OldSparePartsStorage extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String flag = req.getParameter("selectStatus");
        String state = null;
        if (flag.equals("1")) state = "正常";
        else if (flag.equals("2")) state = "临界";
        else if (flag.equals("3")) state = "警示";
        else if (flag.equals("4")) state = "缺货";

        String selectName = StringTools.emptyToNull(req.getParameter("selectName"));
        System.out.println("state:" + state);
        System.out.println("name:" + selectName);

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }
}
