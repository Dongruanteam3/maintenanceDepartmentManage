<%@ page contentType="text/html; charset=UTF-8" language="java" errorPage="" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="utf-8">
    <title>新备件入库</title>
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
                    <a style="color: #5d594d;" href="keeper.html">首页</a>
                    <a style="color: #5d594d;" href="addnew.jsp">入库</a>
                    <a style="color: #5d594d;" href="repairNeeded.html">出库</a>
                    <a style="color: #5d594d;" href="select.html" class="selectPage">查询库存</a>
                    <a style="color: #5d594d;" href="../Sign/Sign.html">登出</a>
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
<!--<div class="title">-->
<!--<img src="../res/png/titleImage.jpg">-->
<!--</div>-->

<main class="clearfix" role="main">
    <div class="container">
        <h6 class="heading">
            仓库管理
        </h6>
        <p style="font-size: 40px" class="heading headding2">查询库存</p>
        <br>
        <form action="<%=request.getContextPath()%>/servlet/repository/select/oldSparePartsStorageServlet" method="post"  accept-charset="UTF-8" autocomplete="off"> >
            <div style="margin-left: 30%;">
                <label for="selectStatus">
                    状态
                </label>
                <br>
                <select name="selectStatus" id="selectStatus" style="margin-left: 40px; padding-left: 20px"  class="sign-form-input">
                    <option value="1">正常</option>
                    <option value="2">临界</option>
                    <option value="3">警示</option>
                    <option value="4">缺货</option>
                    <option value="5" selected>All</option>
                </select>
                <%--<input style="margin-left: 40px" class="sign-form-input" id="selectStatus" name="selectStatus" type="number">--%>
                <br>
                <label for="selectName">
                    备件名称
                </label>
                <br>
                <input style="margin-left: 40px" class="sign-form-input" id="selectName" name="selectName" type="text">
            </div>
            <input type="submit" class="submit submitlefter" value="搜索"  onmousemove="deleteboChange(this)" onmouseout="deleteboChangeback(this)" onclick="submit_sure()">
        </form>
        <div style="margin-bottom: 100px"></div>
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
