<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

	body{ 
		background-color: black;
	}
	
	h1 {
		color: white;
	}
	
	table > thead > tr > th {
		text-align: center;
		color: red; 
		width: 150px;
		border: 2px solid white;
	}
	
	table > tbody > tr > td {
		text-align: center;
		color: red;
		border: 1px solid white;
	}
	
	table > tbody > tr > td > img {
		width: 200px;
	}
	
</style>
</head>
<body>
<h1>Table</h1>
	<table>
		<thead>
			<tr><th>Product</th><th>name</th><th>price</th></tr>
		</thead>
		<tbody>
			<tr><td><img src="img/1.png"></td><td>Iron-Maiden</td><td>$20</td></tr>
			<tr><td><img src="img/2.png"></td><td>Slipknot</td><td>$20</td></tr>
			<tr><td><img src="img/3.png"></td><td>Iron-Maiden2</td><td>$17</td></tr>	
			<tr><td><img src="img/4.png"></td><td>Megadeth</td><td>$30</td></tr>
			<tr><td><img src="img/5.png"></td><td>Metallica</td><td>$38</td></tr>
			<tr><td><img src="img/6.png"></td><td>ACDC</td><td>$30</td></tr>
	</table>

</body>
</html>