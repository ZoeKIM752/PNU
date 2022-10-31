<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Main Page</title>
</head>
<body>
	<h1>[<c:out value="${USER.name}"></c:out>]님 반갑습니다.</h1>
	<h2>id : <c:out value="${USER.userId}"></c:out></h2>
	<h2>deptNm : <c:out value="${USER.deptNm}"></c:out></h2>
	<h2>email : <c:out value="${USER.email}"></c:out></h2>
	<h2>job : <c:out value="${USER.job}"></c:out></h2>
	<h2>phone : <c:out value="${USER.phone}"></c:out></h2>
	
	<button type="button" style="float: left" onclick="window.location.href='logout.do'"> 
		로그아웃 </button>
	
	<button type="button" style="float: left" onclick="window.location.href='pwdConfirmPage.do'"> 
		회원정보수정 </button>
</body>
</html>