<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<script language="javascript">
function ma(menuid){
	if(menuid.style.display=="none"){
		menuid.style.display="";
	}else{
		menuid.style.display="none";
	}
}
</script>
</head>

<body>
<div onmouseup="ma(menuid1)">
<h1>-客户信息管理</h1></div>
<div id="menuid1" style="display:none;width:auto">
<a href="userupdate.jsp">用户信息修改</a><br/>
<a href="userselect.jsp">客户信息查询</a><br/>
<a href="userinsert.jsp">添加用户</a>
</div>
</body>
</html>