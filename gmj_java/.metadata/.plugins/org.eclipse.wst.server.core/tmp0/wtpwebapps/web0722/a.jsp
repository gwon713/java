<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% //��ũ��Ʈ��: �ڹ��ڵ� .request:��û / response:����
	String id = request.getParameter("id");//���Ķ���� �� ����.�Ķ����:���Ķ���� �̸�
	String pwd = request.getParameter("pwd");
	String[] hobby = request.getParameterValues("hobby");
	String gender = request.getParameter("gender");
	String grade = request.getParameter("grade");
	String msg = request.getParameter("msg");
	String type = request.getParameter("type");
%>
<h3>�Ķ���� ���</h3>
id:<%= id %><br/> <!-- �ڹ� ���� ��� -->
pwd:<%= pwd %><br/>
hobby:<% for(String i:hobby){out.print(i+"<br/>");} %><br/>
gender:<%= gender %><br/>
grade:<%= grade %><br/>
msg:<%= msg %><br/>
type:<%= type %><br/>
</body>
</html>