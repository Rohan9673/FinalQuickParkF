<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.quickpark.in.model.User"%>
 <%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of property owner</title>

<style>
body{
	background:fixed;
  	background-image: url('resources/image.jpg');
  	background-repeat:no-repeat;
  	background-attachment:auto;
    background-color:aliceblue;
    height: 100vh;
    background-size: cover;
    background-position: center;
	
}
</style>
<script >




</script>
<link rel="stylesheet" href="liststyle.css">
<link href="https://fonts.googleapis.com/css?family=Pacifico&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<%
List <User> li =(List <User>)request.getAttribute("li");
%>
<body>
 <div class="container-fluid name">
 		
        <div class="row sticky-top  btn-dark" style="height: 100px; font-size:40px;" >
           
            <div class="col-10" style=" margin-top: 0.5cm; font-family: 'Pacifico', cursive;" >Quick Park</div>
             
<a class="col-2" href="logout"><button style="float: right; margin-right: 1cm;margin-top: 0.5cm;" class="btn btn-danger" onclick="" value="Logout">Logout</button>
	</a>
	</div>
     
        <div class="row mt-2 " >
        	<div class="col-1 "></div>
        	<div class="col-10">
            	<table class="jumbotron" style="height:100px;">
  					<tr>
    					<th style="width:200px">First Name</th>
    					<th style="width:200px">Last Name</th>
    					<th style="width:200px">Mob No</th>
    					<th style="width:300px">Email Id</th>
    					<th style="width:200px">Status</th>
    					<!--<th style="width:20%">Block/Unblock</th>-->
    					
  					</tr>
  
				</table>
            </div>       

            <div class="col-1"></div>
 			</div>

<% 
 for(User p : li){
		%>          
         <div class="row mt-1 " >
        	<div class="col-1 "></div>
        	<div class="col-10">
            	<table class="jumbotron" style="height:100px;">
  					<tr>
    					<th style="width:200px;"><%=p.getFirstName()%></th>
    					<th style="width:200px"><%=p.getLastName()%></th>
    					<th style="width:200px"><%=p.getMobNo()%></th>
    					<th style="width:300px"><%=p.getEmailId()%></th>
    					<% if(p.getIsDeleted()==1)
    					{%>
			<th style="width:200px">exist</th>
			
			<form action="blockpropertyowner" method="post">
			<th><input type="text" name="user_id" value="<%= p.getUserId() %>" hidden="true"/></th>
			 
			  <th style="width:100px"><input class="btn btn-danger"  type="submit" value="Block"/></th>
			</form>
			<%} else{ 
			%>
			<th style="width:200px"> not exist</th>
    			<%} %>
    					
  					</tr>
  	<%} %>
				</table>
            </div>   
                     	
            <div class="col-1"></div>

         </div>

 </div>
</body>
</html>