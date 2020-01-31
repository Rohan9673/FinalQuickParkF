<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<!------ Include the above in your HEAD tag ---------->
<html>

	<head>
	
		<title>Account Status</title>
		
		<link rel="resources/stylesheet" href="style2.css">
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
   	
   		<div style="font-size: 50px; font-style: oblique; background-color: gray" class="text-light">
   			&nbsp;&nbsp;&nbsp;&nbsp;Account Status
   		</div>
   		
   </head>


<body class="block" style="background-image: url('resources/image1.jpg');">
        <br><br><br><br>
        
        
        <div class="container col-4" style="background-color: rgb(230,230,250);">
        
        			<br>	
			
                    <h4 class="text-left text-info">Are you sure you want to Block Account</h4><br>

				<form action="deletevehicleOwner" method="get">
				<input class="text-light" style="border-radius: 8px; background-color: green;" type="submit" value="subimt" id="submit" >
				</form>
					

					
                   

        </div>
		
		      	
	     <div class="text-center">
                 	<a href="VehicleOwnerHome.jsp" class="text-info">Back to Home</a><br>
                 	<a href="logout">logout</a>
         </div>

</body>

</html>