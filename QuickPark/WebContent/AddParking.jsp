<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<style>
#map {
	height: 400px;
	width: 100%;
}

body{
	background:fixed;
  	<!--background-image: url('resources/image.jpg');-->
  	background-repeat:no-repeat;
  	background-attachment:auto;
    background-color:white;
    height: 100vh;
    background-size: cover;
    background-position: center;
	
}
</style>
</head>
<body>
	
	<%-- 	
		Welcome Admin <%=session.getAttribute("username")%>
	 --%>
	 <div style="margin-top: 1cm;">
	<button style="float: left;margin-left: 1cm;" class="btn btn-primary" onclick="getLocation()">Get my location</button>
<a href="logout"><button style="float: right; margin-right: 1cm;" class="btn btn-primary" onclick="" value="Logout">Logout</button>
	</a>
	</div>

	<p id="demo"></p>
	<div id="map"></div>

	<script>
		//Variable to make form that will submit current data to database
		var x = document.getElementById("demo");

		//Variable that will have current latitude and longitude
		var latco;
		var lonco;
		var latlon;
		
		//Function to get current location
		function getLocation() {
			if (navigator.geolocation) {
				navigator.geolocation.getCurrentPosition(showPosition);
			} else {
				x.innerHTML = "Geolocation is not supported by this browser.";
			}
		}
		
		//Form to display submit button
		function showPosition(position) {
			x.innerHTML =
				"<form action=" +"coordinates" +" method=" +"post" +">"
				+ `<h2>Your Current Coordinates</h2>`
				+ "Latitude"+"<input name=" +"latitude " +" value = " + position.coords.latitude  +" readonly>"
				+ "</br>  "
				+ "Longitude"+"<input name=" +"longitude" +" value = " + position.coords.longitude +" readonly>"
				+ "</br> " 
				
				//+ " <input type=" +"submit" +" value=" + "Submit Coordinates"+">"
				+ `<input type="submit" value="Submit Coordinates">`
				+ " </form>"
				+ "</br>  "
				+ `<h2>Your Current Location</h2>`;
				
				
				
			//Saving current data to variables		
			latco = position.coords.latitude;
			lonco = position.coords.longitude;
			
			//Converting data to API readable format
			latlon = new google.maps.LatLng(latco, lonco);
			initMap();
		}

		function initMap() {
			var dummy = latco.value;
			//Options of map to be loaded
			var options = {
				center : latlon,
				zoom : 12,
			}
			var map = new google.maps.Map(document.getElementById('map'),
					options);

	        
	    	//Custom icon and size of icon
	        var icon = {
	        	    url: 'http://maps.google.com/mapfiles/kml/shapes/man.png', // url
	        	    scaledSize: new google.maps.Size(40, 40), // scaled size
	        	    origin: new google.maps.Point(0,0), // origin
	        	    anchor: new google.maps.Point(0, 0) // anchor
	        	};
	        
			
			var marker = new google.maps.Marker(
					{
						position : latlon,
						map : map,
						icon : icon
					});

			var infoWindow = new google.maps.InfoWindow({
				content : '<h1>Your current location</h1>'
			});

			marker.addListener('click', function() {
				infoWindow.open(map, marker);
			});
		}
	</script>


	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAAVNhBfWdQq8-gMhG20DEIej0DEoN-c-A&callback=initMap"
		async defer></script>

</body>
</html>