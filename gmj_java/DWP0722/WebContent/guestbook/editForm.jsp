<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>${a.num}�� ��</h3>
<table border="1">
<tr>
<td>�ۼ���</td><td><input type="text" name="writer" value="$(a.writer)"></td><br/>
</tr>
<tr>
<td>�ۼ���</td><td><input type="password" name="pwd" value="$(a.w_date)"></td><br/>
</tr>
<tr>
<td>�۳���</td><td><textarea id="content">${a.content}</textarea></td><br/>
</tr>
<tr>
<td colspan="2"><input type="button" value="���� " onclick="edit(${a.num}, '${a.pwd}')">
<input type="button" value="���� " onclick="del(${a.num}, '${a.pwd}')"></td>
</tr>
</table>
</body>
</html>