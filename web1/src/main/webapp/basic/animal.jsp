<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- html 주석  -->
<%-- jsp 주석 --%>
<%
	request.setCharacterEncoding("utf-8");
	//String animals = request.getParameter("animal");
	String animals[] = request.getParameterValues("animal");
	
	
	out.print("<h3>"+Arrays.toString(animals)+"</h3>");
%>
<h3><%= Arrays.toString(animals) %></h3>
</body>
</html>