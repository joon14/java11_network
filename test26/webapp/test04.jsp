<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="org.kh.dto.Member" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현언어(EL)의 기본 연산</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<hr>
<h2>표현언어(EL)의 기본 연산</h2>
<%
	int num1 = 3;
	pageContext.setAttribute("num2", 4);
	pageContext.setAttribute("num3", "5");
	pageContext.setAttribute("num4", "8");
%>
<!-- c:set 을 활용한 변수 선언 -->
<c:set scope="page" var="num5" value="7" />

<div class="container">
	<h3>EL Basic</h3>
	<p>1. 스크립트릿에서 선언한 값 : ${num1 }</p>
	<%--<p>스크립트릿에서 선언한 값 : <%=num1 %></p>--%>
	<p>2. page에서 선언한 값 : ${num2 }</p>
	<p>3. page에서 선언한 값 대입 : ${num1 = 7 }</p>
	<p>4. page에서 선언한 값 연산 : ${num2 = 8; 'num2' } => ${num2 }</p>
	<hr>
	<h3>EL Operation - Arithmetic(산술연산)</h3>
	<p>1. num1 + num2 = ${num1 + num2 }</p>
	<p>2. num1 - num2 = ${num1 - num2 }</p>
	<p>3. num1 * num2 = ${num1 * num2 }</p>
	<p>4. num1 / num2 = ${num1 / num2 }</p>
	<p>5. num1 div num2 = ${num1 div num2 }</p>
	<p>6. num1 % num2 = ${num1 % num2 }</p>
	<p>7. num1 mod num2 = ${num1 mod num2 }</p>
	<p>※ 문자열 연산도 숫자 덧셈이 되며, 문자열은 덧셈만 가능</p>
	<p>num1 + num2 = ${num1 + num2 }</p>
	<p>"12" + "34" = ${"12" + "34" }</p>
	<hr>
	<h3>EL Operation - Compare(비교연산)</h3>
	<p>1. num4 > num3 = ${num4 gt num3 }</p>
	<p>2. num4 < num3 = ${num4 lt num3 }</p>
	<p>3. num4 >= num3 = ${num4 ge num3 }</p>
	<p>4. num4 <= num3 = ${num4 le num3 }</p>
	<p>5. num4 == num3 = ${num4 eq num3 }</p>
	<hr>
	<h3>EL Operation - Logical(논리연산)</h3>
	<p>1. num1 <= num2 && num3 == num4 = ${num1 le num2 and num3 eq num4 }</p>
	<p>2. num1 >= num2 || num3 != num4 = ${num1 ge num2 or num3 ne num4}</p>
</div>
</body>
</html>