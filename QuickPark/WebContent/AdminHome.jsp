<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	
	
		<style>
		
			.prophp
			{
				  background-image: url('resources/image.jpg');
				 -webkit-filter: grayscale(100%);
  				  filter: grayscale(100%);
  				     
			}
			
		</style>
	<link href="https://fonts.googleapis.com/css?family=Pacifico&display=swap" rel="stylesheet">
	
		<link rel="stylesheet" href="resources/style.css"/>
		
		<meta charset="ISO-8859-1">
		<title>Admin Home Page</title>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
       

        
	</head>
	<body class="prophp">
        
         <div class="row sticky-top  btn-dark" style="height: 100px; font-size:40px;" >
           
           <div class="col-10" style=" margin-top: 0.5cm; font-family: 'Pacifico', cursive;" >&nbsp;&nbsp;Admin Home Page</div>
             
<a class="col-2" href="logout"><button style="float: right; margin-right: 1cm;margin-top: 0.5cm;" class="btn btn-danger" onclick="" value="Logout">Logout</button>
	</a>
	</div>
        <br /><br /><br /><br /><br />
        <h1 align="center">
            <font face="Lato" color="" >
            
          
          <div style="font-style: oblique;padding-left: 8% " class="text-left">
             	 
                	<a class="text-light" href="propertyownerlist">List of property Owner</a>
             
                <br><br>
          </div>   
           
          <div 	style="font-style: oblique; padding-left: 8%"  class="text-left">     
                	
                <a class="text-light" href="vehicleownerlist">List of vehicle owner</a>
                	
                <br/><br>
          </div>  
          
          <div style="font-style: oblique; padding-left: 8%"  class="text-left"> 
          			
                	<a class="text-light" href="selectproperty">List of parking property</a>
                	
                <br/> <br>
          </div>
          
	<div style="font-style: oblique; padding-left: 8%"  class="text-left"> 
          			
                	<a class="text-light" href="bookingdetails">Booking details of parking</a>
                	
                <br/> <br>
          </div>
            
            </font>
        </h1>
        <br />
        
    </body>
</html>