<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#map {
	height: 400px;
	width: 100%;
}
</style>
</head>
<body>
	
	<%-- 	
		Welcome Admin <%=session.getAttribute("username")%>
	 --%>
	
	<button onclick="window.location.href = 'showparking';">Show Parking Spots</button>

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