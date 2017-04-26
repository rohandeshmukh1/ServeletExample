<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Details</title>
</head>
<body>
<table>
<tr> 
<td> User Name: </td>
<td>${User.getUsername()}</td> 

</tr>
<tr> 
<td> User Email:</td>
<td>${User.getEmail()}</td> 

</tr>
<tr> 
<td> Motto :</td>
<td>${User.getMotto()}</td> 

</tr>
</table>
<br>
<h1>${message}</h1>
<h1>${User.getPassword()}</h1>
</body>
</html>