<%@ page contentType="text/html; charset=UTF-8" language="java" errorPage="" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/html">
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
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
                    <a style="color: #5d594d;" href="addnew.jsp" class="selectPage">入库</a>
                    <a style="color: #5d594d;" href="repairNeeded.html">出库</a>
                    <a style="color: #5d594d;" href="select.html">查询库存</a>
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
<!--<div class="title">-->
<!--<img src="../res/png/titleImage.jpg">-->
<!--</div>-->

<main class="clearfix" role="main">
    <div class="container">
        <h6 class="heading">
            仓库管理
        </h6>
        <p style="font-size: 40px" class="heading headding2">新备件入库</p>
        <br>
        <form action="<%=request.getContextPath()%>/servlet/repository/addnew/newSparePartsStorageServlet" method="post" onsubmit="return vilidate_form()"  accept-charset="UTF-8" autocomplete="off">
            <table style="margin-top: 30px" class="confermation-table" border="1px solid">
                <tr>
                    <th colspan="4" style="text-align: center; font-weight: 400; font-size:35px">新备件入库</th>
                </tr>
                <tr>
                    <th>备件名称</th>
                    <th><input type="text" id="a72" name="a72" class="customer-form-input"></th>
                    <th>型号</th>
                    <th><input type="text" id="a73" name="a73" class="customer-form-input"></th>
                <tr>
                    <th>单价</th>
                    <th><input type="number" id="a74" name="a74" class="customer-form-input" value="0"></th>
                    <th>数量</th>
                    <th><input type="number" id="a75" name="a75" class="customer-form-input" value="0" oninput="getstatu()"></th>
                </tr>
                <tr>
                    <th>入库时间</th>
                    <th><input type="date" id="a66" name="a66" class="customer-form-input" > </th>
                    <script>
                        document.getElementById('a66').valueAsDate = new Date();
                    </script>
                    <th>警戒数量</th>
                    <th><input type="number" id="a76" name="a76" class="customer-form-input" oninput="getstatu()" value="0"></th>

                </tr>
                <tr>
                    <!--根据数量是否低于警戒动态生成 -->
                    <th>库存状态</th>
                    <th colspan="3">
                        <select name="a77" id="a77">
                            <option value="1">正常</option>
                            <option value="2">临界</option>
                            <option value="3">警示</option>
                            <option value="4" selected>缺货</option>
                        </select>
                    </th>
                </tr>
            </table>
            <input  type="submit" class="submit" value="提交"  onmousemove="deleteboChange(this)" onmouseout="deleteboChangeback(this)">
        </form>

        <div class="innerlink">
        <a href="select.jsp" style="font-size: 30px; color: white" class="heading headding2">原备件添加</a>
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
