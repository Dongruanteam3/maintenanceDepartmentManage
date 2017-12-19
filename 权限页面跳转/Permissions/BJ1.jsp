<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function ma()
{
	confirm("确认删除吗?");
}
</script>

</head>
<body>
<table border="1" align="center" width=800px cellspacing="0" height=100px valign="middle" style="margin-top:-50px;top:30%;position:absolute;left:20%">
<tr><td><h3 align="center">员工姓名</h3></td><td><h3 align="center">员工权限</h3></td><td></td></tr>
<tr><td></td><td></td><td align="center"><a href="XG.jsp"><input type="button" name="XG" value="修改"></a><input type="button" name="SC" value="删除" onclick="ma()"></td></tr>
</table>
<table border="0" align="center" width=800px cellspacing="0" height=100px valign="middle" style="margin-top:-50px;top:70%;position:absolute;left:20%">
<tr><td align="center"><b><&nbsp;1&nbsp;></b></td></tr>
</table>
</body>
</html>