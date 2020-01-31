<!DOCTYPE html>
<html lang="en">
<head>
   
    <title>Parking Slot</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

	<style>
	*{
    margin: 0px;
    padding: 0px;
}
body{
    background-image: url(resources/p1.jpg);
    background-attachment: fixed;
    background-size: cover;
    font-family: new time roman;
}
h1{
    font-size: 40px;
    color: grey;
    margin-top: 20px;
    margin-bottom: 30px;
}
.label{
    font-size: 20px;
    margin-top: 20px;
    font-weight: normal;
}
.form-control{

    background: rgba(255, 255,255, 0.2);
    border: 0px;
    border-radius: 0px;
    border-bottom: 2px solid white;
    font-size: 21px;
    color: whitesmoke;

    
}
.A{
    margin-top: 70px;
    margin-right: 100px;
    font-family: cursive;
}
.btn-info{
    margin-top: 50px;
    margin-left: 15px;
    width: 180px;
    font-size: 19px;

}</style>

</head>
<body>
    
     
        <div class="row sticky-top  btn-dark" style="height: 100px; font-size:40px;" >
           
            <div class="col-9" style=" margin-top: 0.5cm; margin-left:0.5cm; font-family: 'Times New Roman';" >Quick Park</div>
             
<a class="col-2" href="logout"><button style="float: right;margin-top: 0.8cm;" class="btn btn-danger" onclick="" value="Logout">Logout</button>
	</a>
	</div>
        <div class="container" >
			        
        <div class="col-md-6 text-white" >
            <br><br><br><br>
            <a href="booking" style="font-size: 30px;margin-top: 10px; font-family: cursive; background-color: yellow;" >Search parking slot</a><br><br><br>
            <a href="updatevehicleowner" style="font-size: 30px;margin-top: 10px; font-family: cursive; background-color: yellow; " >Update Details</a><br><br><br>
            <a href="deletevehicleOwner1" style="font-size: 30px;margin-top: 10px; font-family: cursive; background-color: yellow; " >Block Account</a><br>
        </div>
     </div>
    </div>
    
</body>
</html>