<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<!-- <script type="text/javascript">
window.onload=function(){
	res = ${result}
	if(res!=null && res=''){
		alert(res);
	}
}
</script> -->
</head>
<body>
<h3>�α���</h3>
${result }
<form action="${pageContext.request.contextPath }/member/login" method="post">
<table border="1">
<tr>
<th>ID</th><td><input type="text" name="id"></td>
</tr>
<tr>
<th>PWD</th><td><input type="text" name="pwd"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Login"></td>
</tr>
</table>
</form>
</body>
</html>