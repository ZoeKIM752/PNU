<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정</title>
</head>
<body>
	<form action="userUpdate.do" method="post" id="userUpdateForm">
		<table>
			<thead>
				<tr>
					<th colspan="2">회원정보 수정</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th>아이디</th>
					<td><input type="text" name="userId" required="required" value="${USER.userId}" readonly/></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" id="pwdInput1" name="pwd" required="required"/></td>
				</tr>
				<tr>
					<th>비밀번호 확인</th>
					<td><input type="password" id="pwdInput2" required="required"/></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name" value="${USER.name}" required="required"/></td>
				</tr>
				<tr>
					<th>부서</th>
					<td>
						<select name="deptCd" required="required">
							<option value="${USER.deptCd}" hidden>${USER.deptNm}</option>
							<c:forEach items="${dept}" var="item">
								<option value="${item.deptCd}">${item.deptNm}</option>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<th>직급</th>
					<td><input type="text" name="job" value="${USER.job}"/></td>
				</tr>
				<tr>
					<th>연락처</th>
					<td><input type="text" name="phone" value="${USER.phone}"/></td>
				</tr>
				<tr>
					<th>메일</th>
					<td><input type="text" name="email" value="${USER.email}"/></td>
				</tr>
			</tbody>
		</table>
		
		<button type="button" onclick="window.history.back()">이전</button>
		<button type="button" id="okBtn">확인</button>
		<button type="button" id="deleteBtn">회원탈퇴</button>
	</form>
</body>
<script src="${pageContext.request.contextPath }/js/jquery-3.6.1.min.js"></script>
<script>
	
	window.onload = function() {
		
		$("#okBtn").click(function() {
			var pwdInput1 = $("#pwdInput1").val();
			var pwdInput2 = $("#pwdInput2").val();
			
			if(pwdInput1 == pwdInput2){
				$("#userUpdateForm").submit();
			} else {
				alert("비밀번호를 확인해주세요.");
			}
		});
		
		$("#deleteBtn").click(function() {
			var del = confirm("탈퇴하시겠습니까?");
			if(del) {
				window.location.href='userDelete.do';
			} else {
				return false;
			}
		});
		
	}
	
</script>

</html>