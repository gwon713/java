<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
function a(){
	location.href = "${pageContext.request.contextPath }/BoardController?cmd=del&num=${b.num}";
}
</script>
</head>
<body>
<c:if test="${sessionScope.id!=b.writer }">
<c:set var="read">readonly</c:set>
</c:if>
<h3>�� ��������</h3>
<a href="${pageContext.request.contextPath }/BoardController?cmd=list">�۸��</a><br>
<form action="${pageContext.request.contextPath }/BoardController?cmd=edit&num=${b.num}" method="post">
<table border="1">
<tr><th>�۹�ȣ</th><td>${b.num }</td></tr>
<tr><th>����</th><td><input type="text" value="${b.title }" name="title" ${read }></td></tr>
<tr><th>�ۼ���</th><td>${b.writer }</td></tr>
<tr><th>�ۼ���</th><td>${b.w_date }</td></tr>
<tr><th>����</th><td><textarea name="content" cols="20" rows="10" ${read }>${b.content }</textarea></td></tr>
<c:if test="${sessionScope.id==b.writer }">
	<tr><td colspan="2"><input type="submit" value="����"><input type="button" value="����" onclick="a()"></td></tr>
</c:if>
</table>
</form>
</body>
</html>