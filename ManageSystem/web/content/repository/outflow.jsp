<%@ page import="bean.repository.A7" %>
<%@ page import="java.sql.Date" %>
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
        <a href="http://www.baidu.com" class="midtitle">仓库管理员</a>
    </div>
</div>
<!--<div class="title">-->
<!--<img src="../res/png/titleImage.jpg">-->
<!--</div>-->

<main class="clearfix" role="main">
    <div class="container">
        <h6 class="heading">
            仓库管理
        </h6>
        <p style="font-size: 40px" class="heading headding2">出库流水</p>
        <br>
        <form action="<%=request.getContextPath()%>/servlet/repository/out/outFlowServlet" method="post" accept-charset="UTF-8" autocomplete="off" >
            <table style="margin-top: 30px" class="confermation-table" border="1px solid">
                <tr>
                    <th colspan="4" style="text-align: center; font-weight: 400; font-size:35px">出库流水</th>
                </tr>
                <tr>
                    <th>备件名称</th>
                    <th><input type="text" id="a52" name="a52" class="customer-form-input" value="${ntn.getName()}" readonly></th>
                    <th>型号</th>
                    <th><input type="text" id="a53" name="a53" class="customer-form-input" value="${ntn.getType()}" readonly></th>
                </tr>
                <tr>
                    <th>维修编号</th>
                    <th><input type="number" id="a54" name="a54" class="customer-form-input" value="${sessionScope.a41}" readonly></th>
                    <th>售价</th>
                    <th><input type="number" id="a56" name="a56" class="customer-form-input" value="0"></th>
                </tr>

                <tr>
                    <th>数量</th>
                    <th><input type="number" id="a55" name="a55" class="customer-form-input" value="${ntn.getNumber()}" readonly></th>
                    <th>出库时间</th>
                    <th><input type="date" id="a57" name="a57" class="customer-form-input"> </th>
                    <script>
                        document.getElementById('a57').valueAsDate = new Date();
                    </script>
                </tr>
            </table>
            <input type="submit" class="submit" value="提交"  onmousemove="deleteboChange(this)" onmouseout="deleteboChangeback(this)">
        </form>


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
