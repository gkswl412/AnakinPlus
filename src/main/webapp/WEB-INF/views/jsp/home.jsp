<!-- JSTL(core) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- language set, session data available -->
<%@ page session="true" contentType="text/html; charset=utf-8"%>

<!-- JSTL을 이용한 현재경로 가져오기 -->
<c:set var="path" value="${pageContext.request.contextPath}" />

<!-- jQuery Google CDN -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<!-- jQuery CSS -->
<link rel="stylesheet"
	href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">

<!-- jQuery UI -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>

<!-- areaSelectBar.js load-->
<script src="js/areaSelectBar.js"></script>

<!-- dateSelectBar.js load -->
<script src="js/dateSelectBar.js"></script>

<!-- dateSelectView.css load -->
<link rel="stylesheet"
	href="css/dateSelectView.css">

<html>
<head>
<title>여행과 숙박을 동시에 Anakin</title>
</head>
<body>
	<h1>여행갈땐? Anakin!</h1>
	<form action="search/byArea" method="post">
		시/도 선택: <select name="sido" required="required"></select> 
		구/군 선택: <select name="gugun" required="required"></select>
		체크인 날짜 선택: <input type="text" name="checkin" class="date" id="from" required="required" autocomplete="off"> 
		체크아웃 날짜 선택: <input type="text" name="checkout" class="date" id="to" required="required" autocomplete="off">
		<input type="submit" value="GO">
	</form>
</body>
</html>
