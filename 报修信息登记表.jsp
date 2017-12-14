<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<h1 align="center">报修信息登记表</h1>
	<form action="">
		<table border="1" align="center">
			<tr><td>维修编号<font color="red">*</font></td><td><input type="text" id="sno"></td><td>客户编号<font color="red">*</font></td><td><input type="text" id="cno"></td></tr>
			<tr><td>产品类型<font color="red">*</font></td><td><select name="type">
							<option value="1">台式机</option>
							<option value="2">笔记本</option>
							<option value="3">投影仪</option>
							<option value="4">打印机</option>
							<option value="5">其他</option>
						</select></td>
						<td>机器品牌</td><td><input type="text"></td></tr>
						<caption>有<font color="red">*</font>为必填项</caption>
			<tr><td>机器型号</td><td><input type="text" id="ctype"></td><td>系列号</td><td><input type="text" id="cno"></td></tr>			
			<tr><td>HDD</td><td><input type="text" id="ctype"></td><td>内存</td><td><input type="text" id="cno"></td></tr>			
			<tr><td>外置PC卡</td><td><input type="text" id="ctype"></td><td>AC适配器</td><td><input type="text" id="cno"></td></tr>
			<tr><td>电池</td><td><input type="text" id="ctype"></td><td>外接光驱</td><td><input type="text" id="cno"></td></tr>
			<tr><td>外接软驱</td><td><input type="text" id="ctype"></td><td>开机口令</td><td><input type="text" id="cno"></td></tr>					
			<tr><td colspan="4" align="center">机器故障现象<font color="red">*</font></td></tr>
			<tr><td colspan="4"><textarea cols="100%" rows="1"></textarea></td></tr>
			<tr><td>缺少零件</td><td><input type="text"></td><td>故障类型<font color="red">*</font></td><td><select>
						<option value="1">固定性故障</option>
						<option value="2">间隙性故障</option>
			</select></td></tr>
			<tr><td>预估价格</td><td><input type="text" value="预估的维修价格"></td></tr>
			<tr><td>报修时间</td><td><input type="text" id="time"></td><td>报修状态<font color="red">*</font></td><td><select>
						<option value="0">未打印</option>
						<option value="1">打印</option>
						<option value="2">提交</option>
			</select></td></tr>
			<tr><td colspan="2"><input type="submit" value="提交" align="right"></td><td colspan="2"><input type="reset" value="重置"></td></tr>
		</table>
	</form>
</body>
</html>