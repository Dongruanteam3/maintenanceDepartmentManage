<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">报修信息</h1>
	<form>
		<table >
			<tr><td>维修编号<input type="text" id="sno"></td><td>客户编号<input type="text" id="cno"></td></tr>
			<tr><td>产品类型<select>
							<option value="">台式机</option>
							<option>笔记本</option>
							<option>投影仪</option>
							<option>打印机</option>
							<option>其他</option>
						</select></td></tr>
		</table>
	</form>
</body>
</html>