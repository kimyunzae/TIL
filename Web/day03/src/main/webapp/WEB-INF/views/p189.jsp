<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.big_bt {
	width: 150px;
	height: 70px;
	background-color: #FF6A00;
	border: 10px solid #FFFFFF;
	border-radius: 30px;
	box-shadow: 5px 5px 5px #A9A9A9;
}

.big_bt > a {
	text-decoration: none;
	color: black;
	display: block;
	text-align: center;
	line-height: 70px;
	font-size: 1.2em; /* 2x bigger than default size */
	font-weight: bold;
}

.big_bt > a:hover {
	color: yellow;
}

.big_bt:hover {
	background: blue;
	border: 10px solid black;
}

</style>
</head>
<body>
	<h1>P189</h1>
	<div class="big_bt">
		<a href="#">Click</a>
	</div>
</body>
</html>