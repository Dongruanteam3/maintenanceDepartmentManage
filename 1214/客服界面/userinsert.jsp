<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
</head>

<body>
<h1>客户信息管理-添加客户</h1>
<form action="">
<table>
<tr><td>客户姓名：</td><td><input type="text" name="a1019" id="a1019"/><font color="red">*</font></td></tr>
<tr><td>身份证号码：</td><td><input type="text" name="a1012" id="a1012"/><font color="red">*</font></td></tr>
<tr><td>移动电话：</td><td><input type="text" name="a1016" id="a1016"/><font color="red">*</font></td></tr>
<tr><td>客户地址：</td><td><input type="text" name="a1017" id="a1017"/></td></tr>
<tr><td>邮编:</td><td><input type="text" name="a1018" id="a1018"></td></tr>
<tr><td>座机:</td><td><input type="text" name="a10111" id="a10111"></td></tr>
<tr><td>email:</td><td><input type="text" name="a10110" id="a10110"></td></tr>
<tr><td>单位名称:</td><td><input type="text" name="a1015" id="a1015"></td></tr>
<tr><td>客户类型：</td><td><select name="a1014" id="a1014">  
  <option value="1" selected="selected">家庭用户</option>  
  <option value="2">单位用户</option>  
  <option value="3">代理商</option>  
  <option value="4">签约用户</option>  
</select> </td></tr>
<tr><td>客户送机时间：</td><td><input type="text" name="a1013" id="a1013"/><font color="red">*</font></td></tr>
<tr><td><input type="submit" value="提交信息"></td></tr>
</table>
</form>
</body>
</html>