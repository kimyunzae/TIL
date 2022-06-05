<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
/* Global CSS start ------------------------------------- */
* {
	margin: 0;
	padding: 0;
}

a {
	text-decoration: none;
	color: black;
}

ul, ol {
	list-style: none;
}
/* Global CSS end --------------------------------------- */

/* Header CSS start ------------------------------------- */
header {
	width: 600px;
	height: 150px;
	background: red;
	margin: 0 auto;
}

header>h1 {
	text-align: center;
	line-height: 100px;
}
/* Header CSS end --------------------------------------- */

/* Nav CSS start ------------------------------------- */
nav {
	width: 600px;
	height: 30px;
	background: pink;
	margin: 0 auto;
}

nav>ul {
	width: 500px;
	margin: 0 auto;
}

nav>ul>li {
	float: left;
	width: 125px;
	line-height: 30px;
}

nav>ul>li>a {
	display: block;
	text-align: center;
}
/* Nav CSS end --------------------------------------- */

/* Section CSS start ------------------------------------- */
section {
	width: 600px;
	height: 500px;
	background: gray;
	margin: 0 auto;
}

section>aside {
	float: left;
}

section>#left_aside {
	width: 100px;
	height: 500px;
	background: yellow;
}

section>#center_aside {
	width: 400px;
	height: 500px;
	background: white;
}

section>#right_aside {
	width: 100px;
	height: 500px;
	background: gray;
}

/* Section CSS end --------------------------------------- */

/* Footer CSS start --------------------------------------- */
footer {
	width: 600px;
	height: 30px;
	background: black;
	margin: 0 auto;
}
/* Footer CSS end --------------------------------------- */
</style>
</head>

<body>

	<header>
		<h1>HTML5 & CSS3.0</h1>
	</header>

	<nav>
		<ul>
			<li><a href="#">HTML5</a></li>
			<li><a href="#">CSS3</a></li>
			<li><a href="#">JavaScript</a></li>
			<li><a href="#">AJAX</a></li>
		</ul>
	</nav>

	<section>
		<aside id="left_aside">
		
		</aside>
		
		<aside id="center_aside">
		
		</aside>
		
		<aside id="right_aside">
	
		</aside>
	</section>

	<footer> </footer>

</body>
</html>