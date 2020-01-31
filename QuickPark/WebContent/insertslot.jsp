<!DOCTYPE html>
<html lang="en">
<head>
   
    <title>Parking Slot</title>
    <link rel="stylesheet" href="resources/addparkingslot.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
    <div class="container" >
    
        <div class="row sticky-top  btn-dark" style="height: 100px; font-size:40px;" >
           
            <div class="col-9" style=" margin-top: 0.5cm; margin-left:0.5cm; font-family: 'Pacifico', cursive;" >Quick Park</div>
             
<a class="col-2" href="logout"><button style="float: right;margin-top: 0.8cm;" class="btn btn-danger" onclick="" value="Logout">Logout</button>
	</a>
	</div>
     <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-6">
            <h1 class="A text-info">ADD PARKING SLOT</h1>

            <br><br>
           
            <form action="addressinsert" method="post">
            <label class="label col-md-3 control-label text-white">Add Slots</label>
            <div class="col-md-9">
                <select name="slot" class="form-control">
                    <option >Select slots</option>
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                    <option>6</option>
                    <option>7</option>
                    <option>8</option>
                    <option>9</option>
                    <option>10</option>
                </select>
                 <input type="submit"  value="add address">
            </div>
          
           
              </form>
                 </div>
      
       
     </div>
    </div>
    
</body>
</html>

