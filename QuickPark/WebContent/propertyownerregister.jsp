<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<!-- JavaScript Validation -->




  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.4.1.min.js"></script>
<script
  src="https://code.jquery.com/jquery-3.4.1.min.js"
  integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
  crossorigin="anonymous"></script>


				
			<script type="text/javascript">
					function validate() 
					{ 
						
						var username = document.getElementById("username").value;
						var fname = document.getElementById("fname").value;
						var lname = document.getElementById("lname").value;
						var mobile = document.getElementById("mobile").value;
						var emailid = document.getElementById("emailid").value;
						var password = document.getElementById("password").value;
						var address = document.getElementById("address").value;
						var pattern = /^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$/;
				//		var pattern = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/; 
				
				
						if(username == "")
						{
							document.getElementById('usernameerror').innerHTML = "please fill UserName";
							return false;
						}else
						{
							document.getElementById('usernameerror').innerHTML = "";
						}
						
						if(fname == "")
						{
							document.getElementById('fnameerror').innerHTML = "please fill first name";
							return false;
						}else
						{
							document.getElementById('fnameerror').innerHTML = "";
						}	
						
						if(lname == "")
						{
							document.getElementById('lnameerror').innerHTML = "please fill last name";
							return false;
						}else
						{
							document.getElementById('lnameerror').innerHTML = "";
						}
				
						if(mobile == "")
						{
							document.getElementById('mobileerror').innerHTML = "please enter mobile nnumber";
							return false;
						}else
						{
							document.getElementById('mobileerror').innerHTML = "";
						}
						
						if(isNaN(mobile))
						{
							document.getElementById('mobileerror').innerHTML = "mobile number must be digits";
							return false;					
						}else{
							document.getElementById('mobileerror').innerHTML = "";
						}
				
						if(mobile.length < 10)
						{
							document.getElementById('mobileerror').innerHTML = "mobile number must be 10 digits";
							return false;					
						}else{
							document.getElementById('mobileerror').innerHTML = "";
						}
							
						if(emailid == "")
						{
							document.getElementById('emailiderror').innerHTML = "email required";
							return false;
						}else{
							document.getElementById('emailiderror').innerHTML = "";
						}
						
						if(address == "")
						{
							document.getElementById('addresserror').innerHTML = "please enter address";
							return false;
						}else{
							document.getElementById('addresserror').innerHTML = "";
						}
						
						if(password == "")
						{
							document.getElementById('passworderror').innerHTML = "please enter password ";
							return false;
						}else
						{
							document.getElementById('passworderror').innerHTML = "";
						}
						
						if(password.length<=5 || password.length>=15)
						{
							document.getElementById('passworderror').innerHTML = "password must greater then 5 letters";
							return false;
						}else
						{
							document.getElementById('passworderror').innerHTML = "";
						}
						
					}  		
						
				</script>	


		
	
	<meta charset="ISO-8859-1">
	<title>
			Property Owner Register Page
	</title>
		<link rel="stylesheet" href="resources/style.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body class="img">
	<div class="login-page">
         <div class="form">
            <div class="col-3"></div>
            <div style="font-size:30px;">Property Owner Register</div> 
            <div class="col-3"><br></div> 
           
             <form class="Login-form" action="propertyregitration" onsubmit="return validate()" method="post" >
             
             
             	
             	 <span id="usernameerror" class="text-danger font-weight-bold"></span>
             	<input type="text"  name="userName" placeholder="User Name" id="username" autocomplete="off"/>
                  
                 <span id="fnameerror" class="text-danger font-weight-bold"></span>
                 <input type="text"  name="firstName" placeholder="First Name" id="fname" autocomplete="off"/>
                 
                 <span id="lnameerror" class="text-danger font-weight-bold"></span>
                 <input type="text"  name="lastName" placeholder="Last Name" id="lname" autocomplete="off"/>
                 
                 <span id="mobileerror" class="text-danger font-weight-bold"></span>
                 <input type="text"  name="mobNo" placeholder="Mobile No" id="mobile" autocomplete="off"/>
                 
                 <span id="emailiderror" class="text-danger font-weight-bold"></span>
                 <input type="text"  name="emailId" placeholder="Email Id" id="emailid" autocomplete="off"/>
                 
                 <span id="addresserror" class="text-danger font-weight-bold"></span>
                 <input type="text"  name="address" placeholder="Address" id="address" autocomplete="off"/>
                 
                 <span id="passworderror" class="text-danger font-weight-bold"></span>
                 <input type="Password"  name="password" placeholder="PassWord" id="password" autocomplete="off"/>
                 <input type="text"  name="role" value="propertyowner"  hidden="true"/>
                 
                 <button >
                     Submit
                 </button>
                 
                <p class="message">Already registered?
             	<a class="text-light" href="login">login</a></p>
            
             </form></div>
         </div>

     
</body>
<script type="text/javascript">
$(document).ready(function(){
	$("#username").change(function(){
		$.ajax({
			url : 'check_avail',
			data : {userName : $("#username").val()},
			success : function(data){
				$("#usernameerror").html(data);
			}
		});
		
	});
});
</script>
</html>