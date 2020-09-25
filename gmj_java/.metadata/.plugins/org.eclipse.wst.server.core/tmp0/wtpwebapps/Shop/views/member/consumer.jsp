<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>${sessionScope.id }님 페이지 - 고객</h3>
<a href="${pageContext.request.contextPath }/MemController?cmd=editForm">내정보</a><br/>
<a href="${pageContext.request.contextPath }/MemController?cmd=logout">로그아웃</a><br/>
<a href="${pageContext.request.contextPath }/MemController?cmd=out">탈퇴</a><br/>
<a href="${pageContext.request.contextPath }/MemController?cmd=">구매(즉시구매/장바구니)</a><br/>
<a href="${pageContext.request.contextPath }/MemController?cmd=">내 구매 목록</a><br/>
<a href="${pageContext.request.contextPath }/MemController?cmd=">장바구니 목록</a><br/>
<a href="${pageContext.request.contextPath }/MemController?cmd=">상품검색</a><br/>
</body>
</html>