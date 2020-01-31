<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.quickpark.in.model.PropertyUser"%>
    <%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
List <PropertyUser> li =(List <PropertyUser>)request.getAttribute("li");
%>
<body>
 <% for(PropertyUser p : li){
		%>
		<tr>
			<td><%=p.getFirst_name()%></td>
			<td><%=p.getLast_name()%></td>
			<td><%=p.getLat()%></td>
			<td><%=p.getLongitude()%></td>
			<td><%=p.getAvailable_status()%></td>
			<td><%=p.getIs_deleted()%></td>
			
			
		</tr>
		</br>
		<%
	}
	%>
	<a href="logout">logout</a>
</body>
</html>