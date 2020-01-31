

package com.quickpark.in.model;
public class Coordinates {

	private String latitude;
	private String longitude;
	private int name;
	private  String arrivale_date;
	private  String departure_date;
	private int arrival_time;
	private int departure_time;
	private int type;
	private String vehicle_no;
	
	public String getArrivale_date() {
		return arrivale_date;
	}

	public void setArrivale_date(String arrivale_date) {
		this.arrivale_date = arrivale_date;
	}

	public String getDeparture_date() {
		return departure_date;
	}

	public void setDeparture_date(String departure_date) {
		this.departure_date = departure_date;
	}

	public int getArrival_time() {
		return arrival_time;
	}

	public void setArrival_time(int arrival_time) {
		this.arrival_time = arrival_time;
	}

	public int getDeparture_time() {
		return departure_time;
	}

	public void setDeparture_time(int departure_time) {
		this.departure_time = departure_time;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getVehicle_no() {
		return vehicle_no;
	}

	public void setVehicle_no(String vehicle_no) {
		this.vehicle_no = vehicle_no;
	}

	public Coordinates() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coordinates(String latitude, String longitude, int name) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Coordinates [latitude=" + latitude + ", longitude=" + longitude + ", name=" + name + ", arrivale_date="
				+ arrivale_date + ", departure_date=" + departure_date + ", arrival_time=" + arrival_time
				+ ", departure_time=" + departure_time + ", type=" + type + ", vehicle_no=" + vehicle_no + "]";
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}
	
	
}
	