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
<h3>�ڷ��</h3>
<a href="${pageContext.request.contextPath }/views/file/form.jsp">���ε��ϱ�</a><br/>
<ul>
<c:forEach var="f" items="${flist }">
	<li><a href="${pageContext.request.contextPath }/FileController?cmd=down&fname=${f }">${f }</a></li>
</c:forEach>
</ul>
</body>
</html>