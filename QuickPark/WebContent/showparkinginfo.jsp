<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.quickpark.in.model.Coordinates"%>
<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">

<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>


<%
		Coordinates p2 = (Coordinates)request.getAttribute("detailsList");
		%>
		<body style="background-color: buttonshadow;">
<div class="container">
    <div class="row">
		<div class="span12">
		
			<form action="submitbooking" method="post">
			    
			    <div style="font-size: 40px;">
			      	<h1> Booking Details </h1> 
			    </div>
			    
			    
			    <div class="text-right"  style="font-size: 30px;  ">
			    <a style="background-color: white;" href="login.jsp">Logout</a>
			    </div>
			    
			    <br><br><br><br>
			 
			 <div>   
			     
			    <div class="control-group" >
				 <label style="font-size: 30px;" class="control-label">ID </label>
			      <div class="controls">
			      
			 <input class="table" type="text" name="name" value="<%=p2.getName()%>" hidden="true" readonly="readonly"/>	
			      </div>
			    </div>
			    
			    <div class="control-group" >
				 <label style="font-size: 30px;" class="control-label">latitude </label>
			      <div class="controls">
			      
			        <input style="font-size: 20px;" class="table" type="text" name=latitude value="<%=p2.getLatitude()%> " readonly="readonly"/>	
			      </div>
			    </div>
			    
			    <br>
			    
			    <div class="control-group">
			      <label style="font-size: 30px;" class="control-label">longitude </label>
			      <div class="controls">
			        <input class="table" type="text" name=longitude value="<%=p2.getLongitude()%> " readonly="readonly"/>
			        
			      </div>
			      
			    </div>

				<br>
			    
			    <div class="control-group">
			      <label style="font-size: 30px;" class="control-label">Arrival Time </label>
			      <div class="controls">
			        <input class="table" type="text" name="arrival_time" value="">
			      </div>
			    </div>

				<br>

			    <div class="control-group">
			      <label style="font-size: 30px;" class="control-label">Departure Time</label>
			      <div class="controls">
			        <input class="table" type="text" name="departure_time" value="">
			      </div>
			    </div>

				<br>
					
			    <div class="control-group">
			      <label style="font-size: 30px;" class="control-label">Arrival Date </label>
			      <div class="controls">
			        <input class="table" type="text" name="arrivale_date" value="">
			      </div>
			    </div>
			    
			    <br>
			    
			    <div class="control-group">
			      <label style="font-size: 30px;" class="control-label">Departure Date</label>
			      <div class="controls">
			        <input class="table" type="text" name="departure_date" value="">
			      </div>
			    </div>

				<br>
				
				<div class="control-group">
			      <label style="font-size: 30px;" class="control-label">type of vehicle</label>
			      <div class="controls">
			        <input class="table" type="text" name="type" value="">
			      </div>
			    </div>

				<br>
				<div class="control-group">
			      <label style="font-size: 30px;" class="control-label">Vehicle Number</label>
			      <div class="controls">
			        <input class="table" type="text" name="vehicle_no" value="">
			      </div>
			    </div>

				<br>
					
			    
			    </div>
			<input class="text-center" type="submit">
			</div>
			</form>
		</div>
	</div>
</div>
</body>