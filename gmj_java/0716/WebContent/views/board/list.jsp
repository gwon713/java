<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>�۸��</h3>
<a href="${pageContext.request.contextPath }/BoardController?cmd=writeForm">���ۼ�</a><br/>
<table border="1">
<tr><th>�۹�ȣ</th><th>�ۼ���</th><th>����</th><th>�ۼ���</th><th>����</th></tr>
<c:forEach var="b" items="${list }">
<tr>
<td>${b.num }</td>
<td>${b.writer }</td>
<td><a href="${pageContext.request.contextPath }/BoardController?cmd=detail&num=${b.num }">${b.title }</a></td>
<td>${b.w_date }</td>
<td>${b.content }</td>
</tr>
</c:forEach>
</table>
</body>
</html>