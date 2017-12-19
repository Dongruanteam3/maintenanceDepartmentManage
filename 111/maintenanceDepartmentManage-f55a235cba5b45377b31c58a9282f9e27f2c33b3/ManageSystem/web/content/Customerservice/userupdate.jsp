<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
</head>

<body>
<h1 align="left">-客户信息编辑</h1>
<form action="">
<p align="center"><b>请输入需要修改的客户编号/用户姓名：</b><input type="text" name="username"><input type="submit" value="确定"></p>
<table border="1" cellspacing="0" width="78%" align="center">
<tr><td colspan="2" align="center"  >客户信息</td></tr>
<tr><td colspan="2">客户编号:</td></tr>
<tr><td>客户姓名:</td><td>身份证号</td></tr>
<tr><td colspan="3">地址:</td></tr>
<tr><td>客户类型：</td><td>邮编：</td></tr>
<tr><td colspan="2" align="center"><input type="button" value="编辑信息"><input type="button" value="删除该客户"></td>
</table>
</form>
</body>
</html>