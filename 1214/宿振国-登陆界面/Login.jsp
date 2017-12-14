<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
function val(){
	document.getElementById("img").src="Img?date="+new Date();
}
</script>
<style>
body{
	background:url(cat.jpg);
}
h1{
	text-align:center;
	margin-top:250px;
}
</style>
</head>
<body>
<h1><font color="#FF0033">设备维修管理系统-登录界面</font></h1>
<form>
<table align="center" valign="middle" style="height:180px;margin-top:-90px;top:50%;position:absolute;left:40%;width:500px;">
<tr>
<td>
<b>用户名:</b><input type="text" name="user">
</td>
</tr>

<tr>
<td>
<b>密&nbsp;&nbsp;码:</b><input type="password" name="pwd">
</td>
</tr>
<tr>
<td width="400">
<b>验证码:</b><input type="text" name="code"><img src="Img" id="img"/><a href="#" onclick="val()">看不清,换一张</a>
</td>
</tr>
<tr>
<td align="center">
<input type="submit" name="login" value="登录">
</td>
</tr>
</table>
</form>
</body>
</html>