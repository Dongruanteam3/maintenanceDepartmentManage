<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<from action="BJ.jsp">
<table align="center" width=200px>
<tr>
<td><h1 align="center">添&nbsp;&nbsp;&nbsp;加&nbsp;&nbsp;&nbsp;员&nbsp;&nbsp;&nbsp;工</h1></td>
</tr>
<tr>
<td align="center"><h3>请输入姓名:</h3><input type="text" name="a11"></td>
</tr>
<tr>
<td align="center"><h3>请输入密码:</h3><input type="text" name="a12"></td>
</tr>
<tr>
<td align="center"><h3>请选择权限:
<select>
<option value="kefu">客服</option>
<option value="jishu">技术工程师</option>
<option value="renwu">任务调度员</option>
<option value="qian">财务员</option>
<option value="kuguan">库管员</option>
<option value="yunying">运营监督员</option>
</select>
</td>
</tr>
<tr><td></td></tr>
<tr><td></td></tr>
<tr><td></td></tr>
<tr>
<td align="center"><a href="BJ.jsp"><input type="submit" value="提交"></a></td>
</tr>
</table>
</from>
</body>
</html>