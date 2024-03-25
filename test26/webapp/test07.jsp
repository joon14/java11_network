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
<title>JSTL(Java Standard Tag Library) FMT</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<hr>
<h2>FMT(Format : 표시형식)</h2>
<c:set var="num" value="12345678.9876543" />
<c:set var="data" value="3,652,733" />
<c:set var="su1" value="0" />
<c:set var="su2" value="4" />
<c:set var="su3" value="-6500000" />
<c:set var="today" value="<%=new Date() %>" />
<br><hr><br>
<h3>01. 숫자 바꾸는 변환문 fmt:parseNumber</h3>
<c:out value="${data }" />
<p><fmt:parseNumber value="${data }" pattern="0,000" var="num2" /></p>
<p>${num2 }</p>
<p>1년은 ${num2/10000 }일 입니다.</p>
<hr>
<h3>02. 숫자 표시형식 변환문 fmt:formatNumber</h3>
<p>groupingUsed 속성 : 천단위 구분기호 사용여부</p>
<p><fmt:formatNumber value="${num }" groupingUsed="true" /></p>
<p><fmt:formatNumber value="${su1 }" groupingUsed="true" /></p>
<p><fmt:formatNumber value="${su3 }" groupingUsed="true" /></p>
<br>
<p>pattern 속성 활용 : 천단위 구분기호 사용여부</p>
<p><fmt:formatNumber value="${num }" pattern="#,##0" /></p>
<p><fmt:formatNumber value="${su1 }" pattern="#,##0" /></p>
<p><fmt:formatNumber value="${su3 }" pattern="#,##0" /></p>
<p><fmt:formatNumber value="${num }" pattern="\ #,##0" /></p>
<br>
<p><fmt:formatNumber value="${num }" pattern="#.##" /></p>
<p><fmt:formatNumber value="${su1 }" pattern="#.##" /></p>
<p><fmt:formatNumber value="${su3 }" pattern="#.##" /></p>
<br>
<p><fmt:formatNumber value="${num }" pattern="0.00" /></p>
<p><fmt:formatNumber value="${su1 }" pattern="0.00" /></p>
<p><fmt:formatNumber value="${su3 }" pattern="0.00" /></p>
<br>
<h3>type 속성: percent</h3>
<p><fmt:formatNumber value="${num }" type="percent" /></p>
<p><fmt:formatNumber value="${su1 }" type="percent" /></p>
<p><fmt:formatNumber value="${su3 }" type="percent" /></p>
<br>
<h3>type 속성 : currency</h3>
<p><fmt:formatNumber value="${num }" type="currency" /></p>
<p><fmt:formatNumber value="${su1 }" type="currency" /></p>
<p><fmt:formatNumber value="${su3 }" type="currency" /></p>
<br>
<h3>국가-언어 코드 설정</h3>
<h4>대한민국(ko_kr)</h4>
<p><fmt:setLocale value="ko_kr"/></p>
<p><fmt:formatNumber value="${num }" type="currency" /></p>
<p><fmt:formatNumber value="${su1 }" type="currency" /></p>
<p><fmt:formatNumber value="${su3 }" type="currency" /></p>
<p><fmt:formatDate value="${today }" pattern="yyyy-MM-dd EEEE a hh:mm:ss" /></p>
<br>
<h4>일본(ja_jp)</h4>
<p><fmt:setLocale value="ja_jp"/></p>
<p><fmt:formatNumber value="${num }" type="currency" /></p>
<p><fmt:formatNumber value="${su1 }" type="currency" /></p>
<p><fmt:formatNumber value="${su3 }" type="currency" /></p>
<p><fmt:formatDate value="${today }" pattern="yyyy-MM-dd EEEE a hh:mm:ss" /></p>
<br>
<h4>미국(en_us)</h4>
<p><fmt:setLocale value="en_us"/></p>
<p><fmt:formatNumber value="${num }" type="currency" /></p>
<p><fmt:formatNumber value="${su1 }" type="currency" /></p>
<p><fmt:formatNumber value="${su3 }" type="currency" /></p>
<p><fmt:formatDate value="${today }" pattern="yyyy-MM-dd EEEE a hh:mm:ss" /></p>
<br>
<h4>중국(zh_CN)</h4>
<p><fmt:setLocale value="zh_CN"/></p>
<p><fmt:formatNumber value="${num }" type="currency" /></p>
<p><fmt:formatNumber value="${su1 }" type="currency" /></p>
<p><fmt:formatNumber value="${su3 }" type="currency" /></p>
<p><fmt:formatDate value="${today }" pattern="yyyy-MM-dd EEEE a hh:mm:ss" /></p>
<br>
<h4>대만(zh_TW)</h4>
<p><fmt:setLocale value="zh_TW"/></p>
<p><fmt:formatNumber value="${num }" type="currency" /></p>
<p><fmt:formatNumber value="${su1 }" type="currency" /></p>
<p><fmt:formatNumber value="${su3 }" type="currency" /></p>
<p><fmt:formatDate value="${today }" pattern="yyyy-MM-dd EEEE a hh:mm:ss" /></p>
<br>
<h4>베트남(vi_VN)</h4>
<p><fmt:setLocale value="vi_VN"/></p>
<p><fmt:formatNumber value="${num }" type="currency" /></p>
<p><fmt:formatNumber value="${su1 }" type="currency" /></p>
<p><fmt:formatNumber value="${su3 }" type="currency" /></p>
<p><fmt:formatDate value="${today }" pattern="yyyy-MM-dd EEEE a hh:mm:ss" /></p>
<br>
<h4>말레이시아(ms_MY)</h4>
<p><fmt:setLocale value="ms_MY"/></p>
<p><fmt:formatNumber value="${num }" type="currency" /></p>
<p><fmt:formatNumber value="${su1 }" type="currency" /></p>
<p><fmt:formatNumber value="${su3 }" type="currency" /></p>
<p><fmt:formatDate value="${today }" pattern="yyyy-MM-dd EEEE a hh:mm:ss" /></p>
<br>
<h4>프랑스(fr_FR)</h4>
<p><fmt:setLocale value="fr_FR"/></p>
<p><fmt:formatNumber value="${num }" type="currency" /></p>
<p><fmt:formatNumber value="${su1 }" type="currency" /></p>
<p><fmt:formatNumber value="${su3 }" type="currency" /></p>
<p><fmt:formatDate value="${today }" pattern="yyyy-MM-dd EEEE a hh:mm:ss" /></p>
<br>
<h4>독일(de_DE)</h4>
<p><fmt:setLocale value="de_DE"/></p>
<p><fmt:formatNumber value="${num }" type="currency" /></p>
<p><fmt:formatNumber value="${su1 }" type="currency" /></p>
<p><fmt:formatNumber value="${su3 }" type="currency" /></p>
<p><fmt:formatDate value="${today }" pattern="yyyy-MM-dd EEEE a hh:mm:ss" /></p>
<br>
<fmt:setLocale value="ko_kr"/>
<hr>
<br>
<c:set var="date1" value="2024-03-25" />
<c:set var="time1" value="19:26:29" />
<c:set var="today2" value="<%=new Date() %>" />
<br>
<h2>날짜 데이터 표시 형식 지정</h2>
<h3>03. 문자열을 날짜/시간 데이터로 변환</h3>
<fmt:parseDate value="${date1 }" pattern="yyyy-MM-dd" var="date2" />
<fmt:parseDate value="${time1 }" pattern="HH:mm:ss" var="time2" />
<p>문자열을 날짜 데이터로 변환 : ${date2 }</p>
<p>문자열을 시간 데이터로 변환 : ${time2 }</p>
<br>
<h3>04. 날짜/시간의 표시형식을 지정</h3>
<h3>type 속성 : both, date, time</h3>
<p>type : both - <fmt:formatDate value="${today2 }" type="both" /></p>
<p>type : date - <fmt:formatDate value="${today2 }" type="date" /></p>
<p>type : time - <fmt:formatDate value="${today2 }" type="time" /></p>
<p></p>
<h3>dateStyle 속성 : full, long, medium, short</h3>
<h4>type:date, dataStyle:full, long, medium, short</h4>
<p>dateStyle : full - <fmt:formatDate value="${today2 }" type="date" dateStyle="full" /></p>
<p>dateStyle : long - <fmt:formatDate value="${today2 }" type="date" dateStyle="long" /></p>
<p>dateStyle : medium - <fmt:formatDate value="${today2 }" type="date" dateStyle="medium" /></p>
<p>dateStyle : short - <fmt:formatDate value="${today2 }" type="date" dateStyle="short" /></p>
<p></p>
<h4>type:time, dataStyle:full, long, medium, short</h4>
<p>dateStyle : full - <fmt:formatDate value="${today2 }" type="time" dateStyle="full" /></p>
<p>dateStyle : long - <fmt:formatDate value="${today2 }" type="time" dateStyle="long" /></p>
<p>dateStyle : medium - <fmt:formatDate value="${today2 }" type="time" dateStyle="medium" /></p>
<p>dateStyle : short - <fmt:formatDate value="${today2 }" type="time" dateStyle="short" /></p>
<p></p>
<h4>type:both, dataStyle:full, long, medium, short</h4>
<p>dateStyle : full - <fmt:formatDate value="${today2 }" type="both" dateStyle="full" /></p>
<p>dateStyle : long - <fmt:formatDate value="${today2 }" type="both" dateStyle="long" /></p>
<p>dateStyle : medium - <fmt:formatDate value="${today2 }" type="both" dateStyle="medium" /></p>
<p>dateStyle : short - <fmt:formatDate value="${today2 }" type="both" dateStyle="short" /></p>
<p></p>
<br>
<hr>
<br>
<h3>표시형식 코드</h3>
<p>y:년도, M:월, d:일, D:현재 년도 1월1일부터 몇 일째인지, E:요일
   a:오전/오후, h:12시간제, H:24시간제, m:분, s:초, S:밀리초</p>
<h4>pattern 속성</h4>
<h3>05. 날짜 표시형식 코드를 지정하여 출력</h3>
<p><fmt:formatDate value="${today2 }" pattern="yyyy년 MM월 dd일 EEEE a hh:mm:ss" /></p>
<p><fmt:formatDate value="${today2 }" pattern="yy/M/d E H:m:s" /></p>
<br>
<hr>
<br>
<h2>06. timeZone(시간대) 태그</h2>
<p>setLocale은 지정된 다음부터 변경 전까지 계속 변경되지만, timeZone은 해당 하위 요소에만 시간대에 대한 날짜/시간만 적용</p>
<h3>서울(대한민국)</h3>
<p>
	<fmt:timeZone value="Asia/Seoul">
		<fmt:formatDate value="${today2 }" pattern="yyyy/MM/dd EEEE a hh:mm:ss" />
	</fmt:timeZone>
</p>
<h3>도쿄(일본)</h3>
<p>
	<fmt:timeZone value="Asia/Tokyo">
		<fmt:formatDate value="${today2 }" pattern="yyyy/MM/dd EEEE a hh:mm:ss" />
	</fmt:timeZone>
</p>
<h3>뉴욕(미국)</h3>
<p>
	<fmt:timeZone value="Ameria/New_York">
		<fmt:formatDate value="${today2 }" pattern="yyyy/MM/dd EEEE a hh:mm:ss" />
	</fmt:timeZone>
</p>
<h3>런던(영국)</h3>
<p>
	<fmt:timeZone value="Europe/London">
		<fmt:formatDate value="${today2 }" pattern="yyyy/MM/dd EEEE a hh:mm:ss" />
	</fmt:timeZone>
</p>
<h3>파리(프랑스)</h3>
<p>
	<fmt:timeZone value="Europe/Paris">
		<fmt:formatDate value="${today2 }" pattern="yyyy/MM/dd EEEE a hh:mm:ss" />
	</fmt:timeZone>
</p>
<h3>세계표준시(UTC)</h3>
<p>
	<fmt:timeZone value="UTC">
		<fmt:formatDate value="${today2 }" pattern="yyyy/MM/dd EEEE a hh:mm:ss" />
	</fmt:timeZone>
</p>
<br>
<h2>07. setTimeZone(시간대) 태그</h2>
<p>setLocale은 해당 화폐단위와 언어가 모두 변경되지만, setTimeZone은 해당 지역의 시간대로 날짜/시간만 적용</p>
<h3>서울(대한민국)</h3>
<p>
	<fmt:setTimeZone value="Asia/Seoul"/>
	<fmt:formatDate value="${today2 }" pattern="yyyy/MM/dd EEEE a hh:mm:ss" />
</p>
<h3>도쿄(일본)</h3>
<p>
	<fmt:setTimeZone value="Asia/Tokyo"/>
	<fmt:formatDate value="${today2 }" pattern="yyyy/MM/dd EEEE a hh:mm:ss" />
</p>
<h3>뉴욕(미국)</h3>
<p>
	<fmt:setTimeZone value="America/New_York"/>
	<fmt:formatDate value="${today2 }" pattern="yyyy/MM/dd EEEE a hh:mm:ss" />
</p>
<h3>런던(영국)</h3>
<p>
	<fmt:setTimeZone value="Europe/London"/>
	<fmt:formatDate value="${today2 }" pattern="yyyy/MM/dd EEEE a hh:mm:ss" />
</p>
<h3>파리(프랑스)</h3>
<p>
	<fmt:setTimeZone value="Europe/Paris"/>
	<fmt:formatDate value="${today2 }" pattern="yyyy/MM/dd EEEE a hh:mm:ss" />
</p>
<h3>세계표준시(UTC)</h3>
<p>
	<fmt:setTimeZone value="UTC"/>
	<fmt:formatDate value="${today2 }" pattern="yyyy/MM/dd EEEE a hh:mm:ss" />
</p>
<p style="font-size:32px;color:red"><strong>※ DB(datetime) -> Java(String) -> Webpage(parseDate -> formatDate)</strong></p>
</body>
</html>