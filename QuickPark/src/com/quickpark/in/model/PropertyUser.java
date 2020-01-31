package com.quickpark.in.model;

public class PropertyUser {

	private  String first_name;
	private String last_name;
	private int user_id;
	private String lat;
	private String longitude;
	private int available_status;
	private int is_deleted;
	public PropertyUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public int getAvailable_status() {
		return available_status;
	}
	public void setAvailable_status(int available_status) {
		this.available_status = available_status;
	}
	public int getIs_deleted() {
		return is_deleted;
	}
	public void setIs_deleted(int is_deleted) {
		this.is_deleted = is_deleted;
	}
	
	
	
}
