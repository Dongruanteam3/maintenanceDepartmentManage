<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
库存状态：
 <select name="road">
    <option>正常</option>
    <option>临界</option>
    <option>警示</option>
    <option>缺货</option>
  </select>
  <input type="button" value="查询" onclick="window.location.href='beijianselect.jsp'">
</body>
</html>