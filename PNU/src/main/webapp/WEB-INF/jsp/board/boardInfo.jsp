<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>게시판</title>
</head>
<body>
	<header>
		<div style="display: flex; border-bottom: 1px solid black">
			<h5>[<c:out value="${USER.name}"></c:out>]님 반갑습니다.</h5>
			<div style="margin: auto;">
				<button type="button" class="btn btn-primary" style="margin-rigth: 3px;" 
					onclick="window.location.href='${pageContext.request.contextPath}/pwdConfirmPage.do'"> 
					회원정보 </button>
				<button type="button" class="btn btn-secondary" 
					onclick="window.location.href='${pageContext.request.contextPath}/logout.do'"> 
					로그아웃 </button>
			</div>
		</div>
	</header>
	<section>
		<h3>게시글 상세</h3>
		<table style="width: 50%;">
			<tr>
				<th>제목</th>
				<td><c:out value="${board.title }"></c:out></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><c:out value="${board.writerName }"></c:out></td>
			</tr>
			<tr>
				<th>등록날짜</th>
				<td><fmt:parseDate value="${board.registrationDate}" var="registrationDate" 
								pattern="yyyy-MM-dd HH:mm" />
					<fmt:formatDate value="${registrationDate}" pattern="yyyy년MM월dd일  HH:mm" /></td>
			</tr>
			<tr>
				<th>내용</th>
				<td style="width: 90%; height: 100px;"><c:out value="${board.contents }"></c:out></td>
			</tr>
		</table>
		<br>
		<button type="button" onclick="history.back(); return false;"> 
			이전 </button>
		<button type="button" id="updateBtn">수정 </button>
	</section>
</body>

<script>

	window.onload = function(){
		
		var updateBtn = document.getElementById("updateBtn");
		
		updateBtn.onclick = function() {
			var path = "${pageContext.request.contextPath}/boardUpdatePage.do";
			var params = {
					"boardId": "${board.boardId}"
			};
			post(path, params);
		}
		
	}
	
	function post(path, params) {
		
		const form = document.createElement('form');
		form.method = "post";
		form.action = path;
		
		for (const key in params) {
		  if (params.hasOwnProperty(key)) {
		    const hiddenField = document.createElement('input');
		    hiddenField.type = 'hidden';
		    hiddenField.name = key;
		    hiddenField.value = params[key];
		    form.appendChild(hiddenField);
		  }
		}
		
		document.body.appendChild(form);
		form.submit();
	}
</script>
</html>