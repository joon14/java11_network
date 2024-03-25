<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.kh.dto.Member" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>액션 태그 - forward2</title>
</head>
<body>
<%
	request.setAttribute("memberObj", new Member(1,"jung", "1004","정도준"));
	request.setAttribute("strObj", "정도준");
	request.setAttribute("intObj", 100);
%>
<jsp:forward page="test12_result.jsp">
	<jsp:param name="num1" value="1212" />
	<jsp:param name="num2" value="7979" />
</jsp:forward>
</body>
</html>