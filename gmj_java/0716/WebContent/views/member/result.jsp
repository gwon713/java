<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>${sessionScope.id }�� ������</h3>
<a href="${pageContext.request.contextPath }/MemController?cmd=editForm">������</a><br/>
<a href="${pageContext.request.contextPath }/MemController?cmd=logout">�α׾ƿ�</a><br/>
<a href="${pageContext.request.contextPath }/MemController?cmd=out">Ż��</a><br/>
<a href="${pageContext.request.contextPath }/BoardController?cmd=list">�Խ���</a><br/>
</body>
</html>