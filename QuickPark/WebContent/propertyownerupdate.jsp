<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.quickpark.in.model.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Request</title>
		<script >
		
				function validate() 
				{ 
					
					
					var fname = document.getElementById("fname").value;
					var lname = document.getElementById("lname").value;
					var mobile = document.getElementById("mobile").value;
					var emailid = document.getElementById("emailid").value;
					var password = document.getElementById("pass").value;
					var address = document.getElementById("address").value;
					var pattern = /^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$/;
		
					
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
				}  		
		
		</script>
<link href="https://fonts.googleapis.com/css?family=Pacifico&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>

<%
User p2 = (User)request.getAttribute("p2");

%>
<body>
 <div class="container-fluid" style="background-image: url('resources/image.jpg')">
       <div class="row sticky-top  btn-dark" style="height: 100px; font-size:40px;" >
           
            <div class="col-9" style=" margin-top: 0.5cm; margin-left:0.5cm; font-family: 'Pacifico', cursive;" >Quick Park</div>
             
<a class="col-2" href="logout"><button style="float: right;margin-top: 0.8cm;" class="btn btn-danger" onclick="" value="Logout">Logout</button>
	</a>
	</div>
        <div class="row mt-4">
            <div class="col-4 d-none d-md-block"></div>
            <div class="col-12 col-md-4 jumbotron" style="height:900px;">
            	
  <div class="form-group">
   <form id="contact-form" action="update" onsubmit="return validate()"    method="post" >
            
            <label for="username">Username : </label>
            <input name="userName" type="text" class="form-control" id="uname" readonly="readonly" value="<%=p2.getUserName() %>"><br>
            
            <label for="firstname">FirstName :</label>
            <span id="fnameerror" class="text-danger font-weight-bold"></span>
            <input name="firstName" type="text" class="form-control" id="fname" value="<%=p2.getFirstName() %>"><br>

            <label for="Lastname">LastName :</label>
            <span id="lnameerror" class="text-danger font-weight-bold"></span>
            <input name="lastName" type="text" class="form-control" id="lname" value="<%=p2.getLastName() %>"><br>
            
            <label for="Password">Password : </label>
            <span id="passworderror" class="text-danger font-weight-bold"></span>
            <input name="password" type="text" class="form-control" id="pass" value="<%=p2.getPassword() %>"><br>

            <label for="MobileNo">MobileNo :</label>
            <span id="mobileerror" class="text-danger font-weight-bold"></span>
            <input name="mobNo" type="text" class="form-control" id="" value="<%=p2.getMobNo() %>"><br>
            
            <label for="EmailId">EmailId :</label>
            <span id="emailiderror" class="text-danger font-weight-bold"></span>
            <input name="emailId" type="text" class="form-control" id="emailid" value="<%=p2.getEmailId() %>"><br>

            <label for="Address">Address :</label>
             <span id="addresserror" class="text-danger font-weight-bold"></span>
            <input name="address" type="text" class="form-control" id="address" style="height:80px;" value="<%=p2.getAddress() %>"><br>



           

            <input type="submit" class="form-control submit" onsubmit="return validate()" value="update"> 
             
        </form>
            
            </div>
           
        </div>
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
</body>
</html>