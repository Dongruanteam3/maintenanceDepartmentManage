<%@ page import="bean.repository.A7" %>
<%@ page import="java.sql.Date" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="bean.repair.A4" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="tools.StringTools" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" errorPage="" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!--给出库阶段用的会返还给这个维修所需要的配件-->
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="utf-8">
    <title>入库流水</title>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/content/frame.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/content/about/tableNeeded.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/content/Sign/banerNeeded.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/content/Customerservice/customerNeeded.css">
    <script src="keeperNeeded.js"></script>

</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="<%=basePath%>/content/frame.html" >
                <img height="75" width="75" src="<%=basePath%>/res/png/brand.png" class="navbar-brand">
            </a>
        </div>

        <div class="collapse navbar-collapse">
                <span class="navbar-bar">
                    <a style="color: #5d594d;" href="<%=basePath%>/content/repository/keeper.html">首页</a>
                    <a style="color: #5d594d;" href="<%=basePath%>/content/repository/addnew.jsp">入库</a>
                    <a style="color: #5d594d;" href="<%=basePath%>/servlet/repository/repaireNeeded/repaireNeededBeforeServlet" class="selectPage">出库</a>
                    <a style="color: #5d594d;" href="<%=basePath%>/content/repository/select.jsp">查询库存</a>
                    <a style="color: #5d594d;" href="<%=basePath%>/content/Sign/Sign.html">登出</a>
                </span>
        </div>
    </div>

</nav>
<br>
<div class="title">
    <div class="show-info" style="padding-top: 210px;">
        <a href="http://www.baidu.com" class="midtitle">仓库管理</a>
    </div>
</div>
<main class="clearfix" role="main">
    <div class="container">
        <h6 class="heading">仓库管理</h6>
        <p style="font-size: 40px" class="heading headding2">出库</p>
        <%ArrayList<A4> a4ArrayList = (ArrayList<A4>)session.getAttribute("a4ArrayList");
            Iterator<A4> a4Iterator = a4ArrayList.iterator();
        %>
        <table style="margin-top: 30px; margin-bottom: 100px" class="confermation-table" border="1px solid">
            <tr>
                <th colspan="5" style="text-align: center; font-weight: 400; font-size:35px">显示所有正维修的记录</th>
            </tr>
            <tr>
                <th>维修编号</th>
                <th>存在备件</th>
                <th>未存在备件</th>
                <th>详情</th>
            </tr>
            <%  while (a4Iterator.hasNext()){
                A4 nextA4 = a4Iterator.next();
            %>
            <tr>
                <%--每个form都提交到入库流水号那个表单--%>
                <form action="/servlet/repository/repaireNeeded/beforeSparePartServlet" method="post" accept-charset="UTF-8" autocomplete="off">
                    <th><input type="number" id="a41" name="a41" class="customer-form-input" readonly value="<%=nextA4.getA41()%>"></th>
                    <th><input type="text" id="a47" name="a47" class="customer-form-input" readonly value="<%=StringTools.nullToEmpty(nextA4.getA47())%>"></th>
                    <th><input type="text" id="a49" name="a49" class="customer-form-input" readonly value="<%=StringTools.nullToEmpty(nextA4.getA49())%>"></th>
                    <th><input type="image" style="margin-left: 10%; margin-top: 10px" height="25px" src="<%=basePath%>/res/png/customerservice/详细信息.png" alt="出库" onclick="subimt()"></th>
                 </form>
            </tr>

            <%}%>
        </table>
        <div style="margin-bottom: 200px"></div>
    </div>

</main>
<footer class="footer  footer-defult">
    <div class="container-fluid">
        <div class="show-copyright" style="margin-left: 5%">
            <a class="footer-brand">Rio</a>
            <p>
                is © 2017 Team3
            </p>
            <p>宇宙无敌维修公司</p>
        </div>


        <div class="collapse footer-collapse">
                <span class="navbar-bar">
                  <div class="list-of-socials" style="margin-top: 50px">
                      <a href="https://github.com/Dongruanteam3">
                          <img class="socialsicon" src="<%=basePath%>/res/png/GitHub-Mark.png">
                      </a>
                      <a href="http://qun.qzone.qq.com/group#!/562921687/share">
                          <img class="socialsicon" src="<%=basePath%>/res/png/qq.png">
                      </a>
                  </div>
                </span>
        </div>
    </div>
</footer>
</body>
</html>
