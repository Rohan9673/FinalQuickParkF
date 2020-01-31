<%@page import="com.quickpark.in.model.PropertyUser"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of property owner</title>
<script >




</script>
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
<link rel="stylesheet" href="liststyle.css">
<link href="https://fonts.googleapis.com/css?family=Pacifico&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<%
List <PropertyUser> li =(List <PropertyUser>)request.getAttribute("li");
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
    					<th style="width:200px">Latitude</th>
    					<th style="width:200px">Longitude</th>
    					<th style="width:200px">Available Status</th>
    					
    					
  					</tr>
  
				</table>
            </div>            	
            <div class="col-1"></div>
         </div>
         
        <% 
 for(PropertyUser p : li){
		%>          
         <div class="row mt-1 " >
        	<div class="col-1 "></div>
        	<div class="col-10">
            	<table class="jumbotron" style="height:100px;">
  					<tr>
    					<th style="width:200px;"><%=p.getFirst_name()%></th>
    					<th style="width:200px"><%=p.getLast_name()%></th>
    					
    					<th style="width:200px"><%=p.getLat() %></th> 
    					
    					<th style="width:200px"><%=p.getLongitude() %></th>
    					<th style="width:200px"><%=p.getAvailable_status()%></th>
    				
				</table>
				    </div>   
                     	
            <div class="col-1"></div>

         </div>
			<%} %>	

 </div>
</body>
</html>