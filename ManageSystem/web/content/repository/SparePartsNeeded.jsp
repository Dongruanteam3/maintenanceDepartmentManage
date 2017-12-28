<%@ page import="java.util.ArrayList" %>
<%@ page import="bean.repair.A4" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="tools.StringTools" %>
<%@ page import="bean.repository.A7" %>
<%@ page import="bean.repository.NameTypeNumber" %>
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
        <p style="font-size: 40px" class="heading headding2">单次维修单号的入库信息</p>
        <br>
        <%
            ArrayList<NameTypeNumber> ntnArrayList = (ArrayList<NameTypeNumber>)request.getAttribute("nameTypeNumber");
            Iterator<NameTypeNumber> ntnIterator = ntnArrayList.iterator();
            ArrayList<Integer>repositoryNumber = (ArrayList<Integer>)request.getAttribute("repositoryNumber");
            Iterator<Integer>numIterator = repositoryNumber.iterator();
        %>
        <table style="margin-top: 30px; margin-bottom: 100px" class="confermation-table" border="1px solid">
            <tr>
                <th colspan="8" style="text-align: center; font-weight: 400; font-size:35px">单个维修物品入库一览</th>
            </tr>
            <tr>
                <th>备件</th>
                <th>型号</th>
                <th>需求数量</th>
                <th>库存数量</th>
                <th>入库</th>
                <th>出库</th>
            </tr>
            <%
                while(ntnIterator.hasNext()){
                    NameTypeNumber nameTypeNumber = ntnIterator.next();
            %>
            <tr>
                <form action="" method="post" accept-charset="UTF-8" autocomplete="off" name="form1">
                    <th><input type="text" id="a72" name="a72" class="customer-form-input" readonly value="<%=nameTypeNumber.getName()%>"></th>
                    <th><input type="text" id="a73" name="a73" class="customer-form-input" readonly value="<%=nameTypeNumber.getType()%>"></th>
                    <th><input type="text" id="a55" name="a55" class="customer-form-input" readonly value="<%=nameTypeNumber.getNumber()%>"></th>
                    <th><input type="text" id="a75" name="a75" class="customer-form-input" readonly value="<%=numIterator.next()%>"></th>
                    <th><input type="image" style="margin-left: 10%; margin-top: 10px" height="25px" src="<%=basePath%>/res/png/customerservice/详细信息.png" alt="继续/确认" onclick="form.action='/servlet/repository/addold/SoldSparePartsStorageTowardFlowServlet'; form.submit()"></th>
                    <th><input type="image" style="margin-left: 10%; margin-top: 10px" height="25px" src="<%=basePath%>/res/png/customerservice/详细信息.png" alt="继续/确认" onclick="form.submit()" ></th>
                    <input type="number" id="number" name="number" class="customer-form-input" hidden value="0">

                </form>
            </tr>
            <%
                }
            %>
        </table>
        <div class="innerlink">
            <a href="repairNeeded.html" style="font-size: 30px; color: white" class="heading headding2">˚∆˚返回上级</a>
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
