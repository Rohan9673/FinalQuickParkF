<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	
	
		<style>
			.propownerhp
			{
				  background-image: url('resources/image1.jpg');
				 -webkit-filter: grayscale(100%);
  				  filter: grayscale(100%);
			}	
		</style>
	
	
		<meta charset="ISO-8859-1">
		<title>Property Owner Home Page</title>
<link href="https://fonts.googleapis.com/css?family=Pacifico&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
       
       <link rel="stylesheet" href="resources/style.css">
        
  
	</head>
	<body class= "propownerhp">
  
  <div class="row sticky-top  btn-dark" style="height: 100px; font-size:40px;" >
           
            <div class="col-9" style=" margin-top: 0.5cm; margin-left:0.5cm; font-family: 'Pacifico', cursive;" >&nbsp;&nbsp;Property Owner HomePage</div>
             
<a class="col-2" href="logout"><button style="float: right;margin-top: 0.8cm;" class="btn btn-danger" onclick="" value="Logout">Logout</button>
	</a>
	</div>      
		
        <br /><br /><br />
        <h1 align="center">
            <font face="Lato" color="" >
            
          <div style="font-style: oblique; padding-left: 8%;" class="text-left"> 
          		
                <button class="btn-primary btn-md"><a class="text-light" href="update">Update Profile</a></button>
     
                <br/><br/> 
          </div>
          
          <div 	style="font-style: oblique; padding-left: 8%;" class="text-left">     
                	
              	<button class="btn-primary btn-md"><a class="text-light" href="Propertyinsert">Add Parking Slots</a></button>
           
                <br/><br/> 
          </div>
          
           <div style="font-style: oblique; padding-left: 8%;" class="text-left"> 
          			
                <button class="btn-primary btn-md"><a class="text-light" href="prop">Availability Status</a></button>
             		
                <br/> <br/> 
          </div> 
            
          <div 	style="font-style: oblique; padding-left: 8%;" class="text-left">     
           	
                <button class="btn-primary btn-md"><a class="text-light" href="delete">Block Account</a></button>
                
                <br/>
          </div>   
            
          
            
            </font>
        </h1>
        <br />
        
    </body>
</html>