<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>

.box {
	width: 100px;
	height: 100px;
	/* float: left;	like flexbox */
	position: absolute;	/* pin current location */
	opacity: 0.8;	/* transparency 0~1 */
}

.box:nth-child(1) {
	background-color: red;
	left: 10px;
	top: 10px;
	z-index: 100;	
}

.box:nth-child(2) {
	background-color: blue;
	left: 50px;
	top: 50px;
	z-index: 10;
}

.box:nth-child(3) {
	background-color: green;
	left: 90px;
	top: 90px;
	z-index: 20;
}

</style>

</head>
<body>

	<div class="box"></div>
	<div class="box"></div>
	<div class="box"></div>
	
	
</body>
</html>