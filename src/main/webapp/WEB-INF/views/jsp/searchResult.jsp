<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="here">
		<table border=1>
			<tr>
				<th>호텔명</th><th>분류</th><th>위치</th><th>사진url</th><th>이용가능 방 개수</th><th>가격</th><th>리뷰수</th>
			</tr>
			<c:forEach items="${result}" var="res">
				<tr>
					<th>${cottage_name}</th><th>${cottage_cat}</th><th>${cottage_location}</th>
					<th>${photo_url}</th><th>${availableRoomCount}</th><th>${prices}</th><th>${reviewCount}</th>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>