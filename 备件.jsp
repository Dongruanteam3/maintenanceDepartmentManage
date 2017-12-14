<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">备件</h1>

	<form>
		<table border="1" align="center">
		<caption>有<font color="red">*</font>为必填项</caption>
		<tr><td>备件名称<font color="red">*</font></td><td><input type="text"></td></tr>	
		<tr><td>型号<font color="red">*</font></td><td><input type="text"></td></tr>	
		<tr><td>维修编号</td><td><input type="text"></td></tr>	
		<tr><td>数量</td><td><input type="text"></td></tr>	
		<tr><td>单价</td><td><input type="text"></td></tr>	
		<tr><td>入库时间</td><td><input type="text"></td></tr>	
		<tr><td>警戒数量</td><td><input type="text"></td></tr>	
		<tr><td>库存状态</td><td><select>
								<option value="1">正常</option>
								<option value="2">临界</option>
								<option value="3">警示</option>
								<option value="4">缺货</option>
								</select></td></tr>	
		</table>
	</form>

</body>
</html>