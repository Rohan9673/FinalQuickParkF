<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<!------ Include the above in your HEAD tag ---------->
<html>

	<head>
	
		<title>Available Status</title>
		
		<link rel="stylesheet" href="resources/style2.css">
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
   	
   		<div style="font-size: 50px; font-style: oblique; background-color: gray" class="text-light">
   			&nbsp;&nbsp;&nbsp;&nbsp;Available Status
   		</div>
   		
   </head>


<body class="block" style="background-image: url('resources/image.jpg')">
        <br><br><br><br>
        
        
        <div class="container col-4" style="background-color: rgb(230,230,250);">
        
                    <h4 class="text-left text-info">Is Parking Available</h4><br>

						<form action="prop" method="post">
					<input class="text-center" type="radio" name="status" value="available">&nbsp;&nbsp;&nbsp;&nbsp;Available<br><br>

					<input class="text-center" type="radio" name="status" value="notavailable">&nbsp;&nbsp;&nbsp;&nbsp;Not Available<br><br>
	
                    <input type="submit" name="submit" class="btn btn-info btn-md" value="submit"><br></form>
                     <%
		      String msg=(String)request.getAttribute("msg");
			 if(msg!=null)
			 {
			%> 
			
		 <h5 style="color: red;"><%=msg %></h5> 
		 <% 
			 }
			%>

        </div>
		
		      	
	     <div class="text-center">
                 	<a href="PropertyOwnerHome.jsp" class="text-info text-light">Back to Home</a></br>
                 	<a href="logout" class="text-info text-light">logout</a>
         </div>

</body>

</html>