<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<h1 align="center">维修记录</h1>
	<form>
		<table border="1" align="center">
		<caption>有<font color="red">*</font>为必填项</caption>
			<tr><td>维修编号<font color="red">*</font></td><td><input type="text"></td><td>维修人员</td><td><input type="text"></td></tr>
			<tr><td>检测编号</td><td><input type="text"></td><td>维修记录</td><td><input type="text"></td></tr>
			<tr><td>维修检测时间</td><td><input type="text"></td><td>工作量</td><td><input type="text"></td></tr>
			<tr><td>维修所用的期间</td><td><input type="text"></td><td>维修状态<font color="red">*</font></td><td><select>
																					<option value="0">未分配</option>
																					<option value="1">分配未检测</option>
																					<option value="2">检测完成维修未完成</option>
																					<option value="3">维修完成</option>
																					</select></td></tr>
		</table>
	</form>
</body>
</html>