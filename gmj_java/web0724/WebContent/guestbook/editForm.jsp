<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
function edit(num, pwd){
	pwd2 = prompt("�� ��й�ȣ");
	if(pwd==pwd2){
		ta = document.getElementById("content");
		str = ta.value;
		//alert(str);
		location.href="/web0722/guestbook/Controller?cmd=edit&content="+str+"&num="+num;
	}else{
		alert("�� ��й�ȣ�� Ʋ�Ƚ��ϴ�. �������");
	}
}
function del(num, pwd){
	pwd2 = prompt("�� ��й�ȣ");
	if(pwd==pwd2){
		location.href="/web0722/guestbook/Controller?cmd=del&num="+num;
	}else{
		alert("�� ��й�ȣ�� Ʋ�Ƚ��ϴ�. �������");
	}
}
</script>
</head>
<body>

<h3>${a.num}�� ��</h3>
<table border="1">
<tr>
<th>�ۼ���</th><td><input type="text" name="writer" value="${a.writer }" readonly></td>
</tr>
<tr>
<th>�ۼ���</th><td><input type="text" name="w_date" value="${a.w_date }" readonly></td>
</tr>
<tr>
<th>�۳���</th><td><textarea id="content">${a.content }</textarea></td>
</tr>
<tr>
<td colspan="2"><input type="button" value="����" onclick="edit(${a.num}, '${a.pwd }')">
<input type="button" value="����" onclick="del(${a.num}, '${a.pwd }')">
</td>
</tr>
</table>
</body>
</html>