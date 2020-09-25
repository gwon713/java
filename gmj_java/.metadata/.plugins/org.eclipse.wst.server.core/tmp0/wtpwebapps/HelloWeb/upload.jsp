<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="com.oreilly.servlet.MultipartRequest" %>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@page import="java.io.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
    int maxSize = 10*1024*1024;
    String savePath = "C:\\Users\\Playdata\\Desktop\\gmj_java\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\webapps\\img";
    String format = "UTF-8";
    String uploadFile="";
    String type = "";
    int read = 0;
    byte[] buf = new byte[1024];
    try{
        MultipartRequest multi = new MultipartRequest(request, savePath, maxSize, format, 
        		new DefaultFileRenamePolicy());
        
        String title = multi.getParameter("title");
        type = multi.getParameter("type");
        System.out.println("title:"+title);
        //uploadFile = multi.getOriginalFileName("file");
        multi.getFile("file");
        System.out.println("type:"+type);
        System.out.println("upload 완료");
    }catch(Exception e){
        e.printStackTrace();
    }
    if(type.equals("pc")){
    	response.sendRedirect("img.jsp");
    }
    else if(type.equals("raspberry")){
    	response.sendRedirect("ras.jsp");
    }
%>

</body>
</html>