<!-- JSTL(core) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- language set, session data available -->
<%@ page session="true" contentType="text/html; charset=utf-8"%>

<!-- JSTL을 이용한 현재경로 가져오기 -->
<c:set var="path" value="${pageContext.request.contextPath}"/>

<!-- jQuery Google CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<!-- areaSelectBar.js load-->
<script src="js/areaSelectBar.js"></script>

<html>
<head>
	<title>여행과 숙박을 동시에 Anakin</title>
</head>
<body>
	<h1>여행갈땐? Anakin!</h1>
	<form action="search/byArea" method="post">
		<select name="sido"></select>
		<select name="gugun"></select>
		<input type="submit" value="GO">
	</form>
</body>
</html>
