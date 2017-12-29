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
        <p style="font-size: 40px" class="heading headding2">入库流水</p>
        <%--<%A7 addA7 = (A7)request.getAttribute("addA7");%>--%>
        <%--<%Date addtime =(Date)request.getAttribute("dateadd");%>--%>
        <form action="<%=request.getContextPath()%>/servlet/repository/addflow/SaddflowoldServlet" method="post">
            <table style="margin-top: 30px;" class="confermation-table" border="1px solid">
                <tr>
                    <th colspan="4" style="text-align: center; font-weight: 400; font-size:35px">入库流水</th>
                </tr>
                <tr>
                    <th>备件名称</th>
                    <th><input type="text" id="a62" name="a62" class="customer-form-input" value="${addA7.getA72()}" readonly></th>
                    <th>型号</th>
                    <th><input type="text" id="a63" name="a63" class="customer-form-input" value="${addA7.getA73()}" readonly></th>
                </tr>
                <tr>
                    <th>数量</th>
                    <th><input type="number" id="a64" name="a64" class="customer-form-input" value="${addA7.getA75()}"></th>
                    <th>进价</th>
                    <th><input type="number" id="a65" name="a65" class="customer-form-input" value="0"></th>
                </tr>
                <tr>
                    <th>入库时间</th>
                    <th colspan="3"><input type="date" id="a66" name="a66" class="customer-form-input"></th>
                    <script>
                        document.getElementById('a66').valueAsDate = new Date();
                    </script>
                </tr>
            </table>
            <input  type="submit" class="submit" value="提交"  onmousemove="deleteboChange(this)" onmouseout="deleteboChangeback(this)">

        </form>
        <div class="innerlink">

        </div>

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
