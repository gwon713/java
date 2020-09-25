<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>${sessionScope.id }님 페이지 - 관리자</h3>
<a href="${pageContext.request.contextPath }/MemController?cmd=editForm">내정보</a><br/>
<a href="${pageContext.request.contextPath }/MemController?cmd=logout">로그아웃</a><br/>
<a href="${pageContext.request.contextPath }/MemController?cmd=out">탈퇴</a><br/>
<a href="${pageContext.request.contextPath }/MemController?cmd=">상품등록</a><br/>
<a href="${pageContext.request.contextPath }/MemController?cmd=">자기 등록 상품 목록</a><br/>
<a href="${pageContext.request.contextPath }/MemController?cmd=">상세페이지</a><br/>
<a href="${pageContext.request.contextPath }/MemController?cmd=">수정</a><br/>
<a href="${pageContext.request.contextPath }/MemController?cmd=">삭제</a><br/>
</body>
</html>