<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward로 전송한 데이터 받기</title>
</head>
<body>
<jsp:useBean id="mem" scope="request" class="org.kh.dto.Member" />
<h2>표현식(Expression)으로 가져오기</h2>
<ul>
	<li>번호 : <%=mem.getNo() %></li>
	<li>아이디 : <%=mem.getId() %></li>
	<li>비밀번호 : <%=mem.getPw() %></li>
	<li>이름 : <%=mem.getName() %></li>
</ul>
<br><hr><br>
<h2>표현언어(Expression Language)로 가져오기</h2>
<ul>
	<li>번호 : ${mem.no }</li>
	<li>아이디 : ${mem.id }</li>
	<li>비밀번호 : ${mem.pw }</li>
	<li>이름 : ${mem.name }</li>
</ul>
<!-- dispatch : URL은 보낸 페이지로 표시되고, 페이지의 내용은 받은 페이지를 표시 -->
<!-- forward : 전달 -->
<!-- 보낸 페이지 : http://localhost:8091/test26/test11.jsp -->
<!-- 받은 페이지 : test11_result.jsp -->
</body>
</html>