<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Example of Bootstrap 3 Linked List Groups</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">

	body{
	
		background:   #064879;
	}
	.list-group{
		width: 400px;
		margin: 200px;
	}
    .bs-example{
    	margin: 300;
    }
</style>
</head>
<body>
<div class="bs-example" align="center">
    <div class="list-group">
        <a href="#" class="list-group-item active" onclick="disabled()">
            <span class="glyphicon glyphicon-file""></span> 강의 과목 
        </a>
        <a href="${pageContext.request.contextPath}/chatting.do" class="list-group-item">
            <span class="glyphicon glyphicon-file"></span> 소프트웨어 공학 <span class="badge">5</span>
        </a>
        <a href="${pageContext.request.contextPath}/AIchatting.do" class="list-group-item">
            <span class="glyphicon glyphicon-music"></span> 인공지능 <span class="badge">6</span>
        </a>
        <a href="#" class="list-group-item">
            <span class="glyphicon glyphicon-film"></span> 시스템 프로그래밍 <span class="badge">10</span>
        </a>
    </div>
</div>
</body>
</html>                                		