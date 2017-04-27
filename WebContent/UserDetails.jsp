<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Details</title>
</head>
<body>
<jsp:include page ="navbar.jsp"> </jsp:include>


<c:choose>
<c:when test="${editProfile==false}">
<table>
<tr> 
<td> User Name: </td>
<td><c:out value = "${User.getUsername()}"/></td> 

</tr>
<tr> 
<td> User Email:</td>
<td><c:out value = "${User.getEmail()}"/></td> 

</tr>
<tr> 
<td> Motto :</td>
<td><c:out value = "${User.getMotto()}"/></td> 

</tr>
</table>
 </c:when>
 <c:when test="${editProfile==true}">
 <form action="UpdateUser" method="post">
 
<table>
<tr> 
<td> User Name: </td>
<td><input type="text" value="<c:out value = "${User.getUsername()}"/>"></td> 

</tr>
<tr> 
<td> User Email:</td>
<td><input type="text" value="<c:out value = "${User.getEmail()}"/>"></td> 

</tr>
<tr> 
<td> Motto :</td>
<td><input type="text" value="<c:out value = "${User.getMotto()}"/>"></td> 

</tr>
</table>
<input type="submit" value="Modify">
</form>
 </c:when>
 </c:choose>
<br>
</body>
</html>