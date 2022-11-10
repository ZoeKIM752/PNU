<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
	<header>
		<div style="display: flex;">
			<h5>[${USER.name}]님 반갑습니다.</h5>
			<div style="margin: auto;">
				<button type="button" onclick="window.location.href='main.do'">회원정보</button>
				<button type="button" onclick="window.location.href='logout.do'">로그아웃</button>
			</div>
		</div>
	</header>
	
	<section>
		<h3>게시판</h3>
		<table>
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>등록날짜</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${boardList}" var="item">
					<tr>
						<td><c:out value="${item.boardId}"/></td>
						<td><c:out value="${item.title}"/></td>
						<td><c:out value="${item.writerId}"/></td>
						<td><c:out value="${item.registrationDate}"/></td>
					</tr>
				</c:forEach>
			</tbody>
		
		</table>
		
		<button type="button" onclick="window.location.href='boardInsertPage.do'">게시글 등록</button>
	</section>
	
	
	
</body>
</html>