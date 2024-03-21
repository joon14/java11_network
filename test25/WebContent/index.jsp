<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	private String name;
	public String getName(){
		return this.name;
	}
	public void setName() {
		this.name = name;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>
<body>
	<h2>메인 페이지</h2>
	<hr>
	<nav>
		<ul>
			<li><a href="test01.jsp">JSP 페이지의 기본 구성 요소</a></li>
			<li><a href="test02.jsp?name='정도준'&age=26&point=80">GET 데이터 전송</a></li>
			<li><a href="test03.jsp">POST 데이터 전송</a></li>
			<li><a href="test04.jsp">데이터 전송 비교</a></li>
			<li><a href="test05.jsp?msg=복습하세요">메세지 전달</a></li>
			<li><a href="test06.jsp">jsp의 기본객체</a></li>
			<li><a href="test10.jsp">로그인 테스트</a></li>
			<li><a href="test11.jsp">include</a></li>
		</ul>
	</nav>
</body>
</html>