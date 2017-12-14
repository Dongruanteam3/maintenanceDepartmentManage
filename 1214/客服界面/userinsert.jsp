<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
</head>

<body>
客户信息管理-添加客户
<form action="">
<table>
<tr><td>客户姓名：</td><td><input type="text" name="username"/></td></tr><br/>
<tr><td>身份证号码：</td><td><input type="text" name="userid"/></td></tr><br/>
<tr><td>电话：</td><td><input type="text" name="userphone"/></td></tr><br/>
<tr><td>客户地址：</td><td><input type="text" name="useraddress"/>
 </td></tr><br/>
<tr><td>客户类型：</td><td><select>  
  <option value="1" selected="selected">家庭用户</option>  
  <option value="2">单位用户</option>  
  <option value="3">代理商</option>  
  <option value="4">签约用户</option>  
</select> </td></tr>
<tr><td>客户送机时间：</td><td><input type="text" name="time"/></td></tr><br/>
<tr><td><input type="submit" value="提交信息"></td></tr>
</table>
</form>
</body>
</html>