<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POST 데이터 처리 결과</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	int age = Integer.parseInt(request.getParameter("age"));
	int point = Integer.parseInt(request.getParameter("point"));
%>
<h2>요청된 데이터</h2>
<%
	String hak = "";
	if(point>=90) {
		hak = "A";
	}
	else if(point>=80) {
		hak = "B";
	}
	else if(point>=70) {
		hak = "C";
	}
	else if(point>=60) {
		hak = "D";
	}
	else {
		hak = "F";
	}
%>
<ul>
	<li><strong>이름</strong> : <span><%=name %></span></li>
	<li><strong>나이</strong> : <span><%=age %></span></li>
	<li><strong>점수</strong> : <span><%=point %></span></li>
	<li><strong>학점</strong> : <span><%=hak %></span></li>
</ul>
</body>
</html>