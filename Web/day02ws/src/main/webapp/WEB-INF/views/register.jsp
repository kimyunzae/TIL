<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Register Page</h1>
	<form action="register" method="POST">
		<fieldset> 
			<legend>회원가입</legend> 
			ID<input type="text" name="id"><br>
			PWD<input type="password" name="pwd"><br>
			AGE<input type="number" name="age"><br>
			BIRTH<input type="date" name="birth"><br>
			GENDER<br>
			<input type="radio" name="gender" value="f">Female<br>
			<input type="radio" name="gender" value="m">Male<br>
			<input type="radio" name="gender" value="a">etc<br>
			HOBBY<br>
			<input type="checkbox" name="hobby" value="s">Study<br>
			<input type="checkbox" name="hobby" value="t">Train<br>
			<input type="checkbox" name="hobby" value="e">Eat<br>
			Car<br>
			<select name="car">
				<option value="k1">K1</option>
				<option value="k2">K2</option>
				<option value="k3">K3</option>
			</select><br>
			Resume<br>
			<textarea name="resume" rows="10" cols="100"></textarea>
			<input type="hidden" name="loginid" value="leejan">
			<input type="range" name="range" size="10" step="1"><br>
		</fieldset>
		<input type="submit" value="REGISTER">
		<input type="reset" value="RESET">
	</form>
	
</body>
</html>