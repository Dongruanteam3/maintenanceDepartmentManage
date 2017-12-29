<%@ page import="tools.StringTools" %>
<%@ page import="bean.repository.A7" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %>
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
    <style>
        .submitlefter{
            margin-left: 70%;margin-top: -10px; font-size: 30px
        }
    </style>
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
                    <a style="color: #5d594d;" href="<%=basePath%>/content/repository/addnew.jsp" class="selectPage">入库</a>
                    <a style="color: #5d594d;" href="<%=basePath%>/servlet/repository/repaireNeeded/repaireNeededBeforeServlet">出库</a>
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
<!--<div class="title">-->
<!--<img src="../res/png/titleImage.jpg">-->
<!--</div>-->

<main class="clearfix" role="main">
    <div class="container">
        <h6 class="heading">
            仓库管理
        </h6>
        <p style="font-size: 40px" class="heading headding2">查询库存</p>
        <%--<%String flag= (String)request.getAttribute("flag");%>--%>
        <%--<%String name= (String)request.getAttribute("name");%>--%>
        <br>
        <form action="<%=request.getContextPath()%>/servlet/repository/select/oldSparePartsStorageServlet" method="post"  accept-charset="UTF-8" autocomplete="off">
            <div style="margin-left: 20%;">
                <input id="flagneeded" value="${flag}" type="text" hidden>
                <label for="selectStatus">
                    状态
                </label>
                    <select name="selectStatus" id="selectStatus" style="width: 210px; margin-right: 20px; padding-left: 20px"  class="sign-form-input" >
                    <option value="1">正常</option>
                    <option value="2">临界</option>
                    <option value="3">警示</option>
                    <option value="4">缺货</option>
                    <option value="5">All</option>
                </select>
                <script>
                    var flag = document.getElementById("flagneeded").value;
                    var index = Number(flag);
                    document.getElementById("selectStatus").options[index-1].selected = true;
                </script>
                <label for="selectName">
                    备件名称
                </label>
                <input style="width: 210px; margin-right: 20px" class="sign-form-input" id="selectName" name="selectName" type="text" value="${name}">
            </div>
            <input  type="submit" class="submit submitlefter" value="搜索"  onmousemove="deleteboChange(this)" onmouseout="deleteboChangeback(this)">
        </form>
        <%ArrayList<A7> a7ArrayList = (ArrayList<A7>)session.getAttribute("a7ArrayList");
            Iterator<A7> a7Iterator = a7ArrayList.iterator();
        %>
        <table style="margin-top: 70px; margin-bottom: 100px" class="confermation-table" border="1px solid">
            <tr>
                <th colspan="8" style="text-align: center; font-weight: 400; font-size:35px">单个维修物品入库一览</th>
            </tr>
            <tr>
                <th>备件</th>
                <th>型号</th>
                <th>库存数量</th>
                <th>预警数量</th>
                <th>入库数量</th>
                <th>入库</th>
            </tr>
            <% while (a7Iterator.hasNext()){
                 A7 nextA7 = a7Iterator.next();
            %>

            <tr>
                <form action="/servlet/repository/addold/oldSparePartsStorageTowardFlowServlet" method="post" accept-charset="UTF-8" autocomplete="off">
                    <th><input type="text" id="a72" name="a72" class="customer-form-input" readonly value="<%=nextA7.getA72()%>"></th>
                    <th><input type="text" id="a73" name="a73" class="customer-form-input" readonly value="<%=nextA7.getA73()%>"></th>
                    <th><input type="text" id="a75" name="a75" class="customer-form-input" readonly value="<%=nextA7.getA75()%>"></th>
                    <th><input type="text" id="a76" name="a76" class="customer-form-input" readonly value="<%=nextA7.getA76()%>"></th>
                    <th><input type="number" id="number" name="number" class="customer-form-input" value="0"></th>
                    <th>
                        <input type="image" style="margin-left: 10%; margin-top: 10px" height="25px" src="<%=basePath%>/res/png/customerservice/详细信息.png" alt="继续/确认" onclick="form.submit()" ></th>
                </form>
            </tr>

            <%}%>

        </table>

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

</body>
</html>
