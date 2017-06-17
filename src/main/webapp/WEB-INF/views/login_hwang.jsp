<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Example of Bootstrap 3 Linked List Groups</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
body {
	background: #064879;
}

.list-group {
	width: 400px;
	margin: 200px;
}

.bs-example {
	margin: 300;
}
</style>
</head>
<body>
	<div class="bs-example" align="center">
		<div class="list-group">
			<a href="#" class="list-group-item active" onclick="disabled()">
				<span class="glyphicon glyphicon-file""></span> 강의 과목
			</a> <a href="${pageContext.request.contextPath}/chatting.do"
				class="list-group-item"> <span class="glyphicon glyphicon-file"></span>
				컴퓨터 비전 <span class="badge">5</span>
			</a> <a href="${pageContext.request.contextPath}/AIchatting.do"
				class="list-group-item"> <span class="glyphicon glyphicon-file"></span>
				데이터베이스<span class="badge">6</span>
			</a> <a href="#" class="list-group-item"> <span
				class="glyphicon glyphicon-file"></span> 컴파일러 <span class="badge">10</span>
			</a> <a href="#" class="list-group-item"> <span
				class="glyphicon glyphicon-file"></span>객체지향프로그래밍 <span
				class="badge">15</span>
			</a><a href="#" class="list-group-item"> <span
				class="glyphicon glyphicon-file"></span>절차지향프로그래밍 <span
				class="badge">5</span>
			</a> <a href="#" class="list-group-item"> <span
				class="glyphicon glyphicon-file"></span>자료구조<span class="badge">6</span>
			</a> <br>
			<button type="button" class="btn"
				onclick="location.href='${pageContext.request.contextPath}/logout.do'">로그아웃</button>
		</div>
	</div>
</body>
</html>
