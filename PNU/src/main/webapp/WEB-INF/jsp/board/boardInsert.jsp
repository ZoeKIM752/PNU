<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<style>
		fieldset {
			width: 750px;
		}
		
		legend {
			font-weight: bold;
		}
	</style>
	<meta charset="UTF-8">
	<title>게시글 등록</title>
</head>
<body>
	<form action="boardInsert.do" method="post">
		<fieldset>
			<legend>게시글 등록</legend>
			<table style="width: 80%;">
				<tr>
					<th>제목</th>
					<td>
						<input type="hidden" name="writerId" value="${USER.userId}">
						<input type="text" name="title" style="width: 100%;" required/>
					</td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea style="width: 100%; height: 100px;" name="contents" required></textarea></td>
				</tr>
			</table>
			<button type="submit">등록</button>
		</fieldset>
	</form>
</body>
</html>