<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.ArrayList,guestbook.Article" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>����</h3>
<a href="/web0722/guestbook/form">���ۼ�</a>
<table border="1">
<%
	ArrayList<Article> list =(ArrayList<Article>)request.getAttribute("list");
	for(Article a:list){
		
%>
	<tr>
		<th>�۹�ȣ</th><td><a href="DWP0722.guestbook.editform"><%=a.getNum() %></td>
	</tr>
	<tr>
		<th>�ۼ���</th><td><%=a.getWriter() %></td>
	</tr>
	<tr>
		<th>�ۼ���</th><td><%=a.getW_date() %></td>
	</tr>
	<tr>
		<th>�۳���</th><td><%=a.getContent() %></td>
	</tr>
<% } %>
</table>
</body>
</html>