<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
			
	
		
		 <script type="text/javascript">

			function validateform() 
			{ 
				var user = document.getElementById("user").value;
				var pass = document.getElementById("pass").value;

				if(user == "")
				{
					document.getElementById('username').innerHTML = "Please Enter User Name";
					return false;
				}
				else{
					document.getElementById('username').innerHTML = "";
					
				}
			 if(pass == "")
				{
					document.getElementById('password').innerHTML = "Please Enter Password";
					return false;
				}
			 else{
					document.getElementById('password').innerHTML = "";
					
				}
			}
		
      </script>
      
			
	
	
	
		<meta charset="ISO-8859-1">
	<title>
			Login Page
	</title>
		<link rel="stylesheet" href="resources/style.css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body class="img">
	<div class="login-box">
         <div class="form">
            <div class="col-3"></div>
            <div style="font-size:30px;">Login Page</div> 
            <div class="col-3"><br></div> 
            
         
             <form  class="Login-form" name="loginForm"   method="post" onsubmit="return validateform()" action="login">
                
                <span id="username" class="text-danger font-weight-bold"></span>        
                 <input type="text" style="border-radius: 4px;" placeholder="Username" id="user" autocomplete="off" name="userName"/>
        		 <span id="password" class="text-danger font-weight-bold"></span>
                 <input type="password" style="border-radius: 4px;" placeholder="Password" id="pass" autocomplete="off" name="password"/>
                    <%
		      String msg=(String)request.getAttribute("msg");
			 if(msg!=null)
			 {
			%> 
			
		 <h5 style="color: red;"><%=msg %></h5> 
		 <% 
			 }
			%>
			 	
			 	
				
			
                 <input class="text-light" style="border-radius: 8px; background-color: green;" type="submit" value="Login" id="submit" onsubmit="return validateform()" >
             
            	<div class="row  mt-4" >
          		
          		<div class="col-1"></div>
                <div class="col-4 btn btn-primary"><a class="text-light" href="propownerregitration">Property Owner</a> </div> 
                <div class="col-2"></div>
                <div class="col-4 btn btn-primary"><a class="text-light"  href="vehicleownerregitration"> Vehicle Owner </a></div>
            	<div class="col-1"></div>
            </div>
            
             </form>
         </div>

     </div>
     
     
</body>
</html>