<!DOCTYPE html>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>    
<html>

    <head>
        <meta charset="utf-8">
        <meta http-equiv="refresh" content="60">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Google Maps APIs</title>
    <style>
    #map_wrapper {
    height: 500px;
    }
    #map_canvas {
    width: 100%;
    height: 100%;
    }
	#mydiv{
	width:250px;
	height:130px;
	}
	.button {
	  background-color: #4CAF50; /* Green */
	  border: none;
	  color: white;
	  padding: 10px;
	  text-align: center;
	  text-decoration: none;
	  display: inline-block;
	  font-size: 16px;
	  margin: 4px 2px;
	  border-radius: 12px;
	  cursor: pointer;
	}
    </style>
    </head>
<script type="text/javascript">
	//Saves latitude in an Array
    var markerLat = [
        <c:forEach var="s" items="${clist}">
            <c:out value="${s.latitude}"/>,
        </c:forEach>
    ];
    
  //Saves longitude in an Array
    var markerLong = [
      <c:forEach var="s" items="${clist}">
          <c:out value="${s.longitude}"/>,
      </c:forEach>
    ];
    
  //Saves name in an Array
  
    var markerInfo = [
        <c:forEach var="s" items="${clist}">
       	 <c:out value="${s.name}"/>,
    	</c:forEach>
    ];
  	//Array of contents to be displayed on clicking a marker
  	
    var windowContent= [
        <c:forEach var="s" items="${clist}">
       	`<div id="mydiv"><h2>Parking available for 3 days</h2>
        <p><h2>Parking Space ID : <c:out value="${s.name}"/></h2></p>
        <form action="propertyownerdetails" method = "post">
        <input type="hidden" name="SendName" value = "${s.name}">
        <input type="submit" class ="button"style="" value="Book Parking" />
        </form>
        </div>`,
    	</c:forEach>
    ];
  	
  	//Function responsible for fetching current location
    function getLocation() {
    	  if (navigator.geolocation) {
    	    navigator.geolocation.getCurrentPosition(showPosition);
    	  } else { 
    	    x.innerHTML = "Geolocation is not supported by this browser.";
    	  }
    	}
  	//Function which converts latitude and logitude from database to API readable format
   	function showPosition(position) {
   		 latco = position.coords.latitude;
   		 lonco = position.coords.longitude;
   		 latlon = new google.maps.LatLng(latco, lonco);
   		 initialize();
    	}
    
    function initialize() {
    	//Variable which will point to the map
        var map;
        
    	//Options of how the map should be displayed
        var mapOptions = {
            zoom: 6,
            center: latlon,
            mapTypeId: 'roadmap'
        };
        
    	//Map created with options
        map = new google.maps.Map(document.getElementById("map_canvas"), mapOptions);
        
    	//Code for single marker of current location
    	var contentString = "Your current location";
    	
        var singleinfowindow = new google.maps.InfoWindow({
            content: contentString
          });
          var singlemarker = new google.maps.Marker({
            position: latlon,
            map: map,
          });
          
          google.maps.event.addListener(singlemarker,'click', function() {
            singleinfowindow.open(map, singlemarker);
          });
          singleinfowindow.open(map, singlemarker);  	
    	
    	//Variable for marker window
        var infoWindow = new google.maps.InfoWindow(), marker, i; 
        
    	//Custom icon and size of icon
        var icon = {
        	    url: 'http://maps.google.com/mapfiles/kml/shapes/cabs.png', // url
        	    scaledSize: new google.maps.Size(30, 30), // scaled size
        	    origin: new google.maps.Point(0,0), // origin
        	    anchor: new google.maps.Point(0,0) // anchor
        	};
        
        for (i = 0; i < markerLat.length; i++) {
        		var position = new google.maps.LatLng(markerLat[i], markerLong[i]);
        		marker = new google.maps.Marker({
                								position: position,
               									map: map,
                								icon: icon,
								                title: markerInfo[i]
								            });
         		// Allows each marker to have an info window    
		         google.maps.event.addListener(marker, 'click', (function(marker, i) 
		        	{
		                 return function() {
		                 infoWindow.setContent(windowContent[i]);
		                 infoWindow.open(map, marker);
		             }
		         })(marker, i));		
        }
    }
</script>

<body>
    <div id="map_wrapper">
    <h2>Available Parking Spots</h2>
        <div id="map_canvas" class="mapping"></div>
    </div>
</body>

<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAAVNhBfWdQq8-gMhG20DEIej0DEoN-c-A&callback=getLocation" async defer ></script>

</html>