package com.quickpark.in.model;

import com.sun.istack.internal.NotNull;

public class Property {
	
	private String latitude;
	private String longitude;

	private int user_id;
	@NotNull
	private int slot;
	@NotNull
	private int available_slot;
	@NotNull
	private int is_delete;
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
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getSlot() {
		return slot;
	}
	public void setSlot(int slot) {
		this.slot = slot;
	}
	public int getAvailable_slot() {
		return available_slot;
	}
	public void setAvailable_slot(int available_slot) {
		this.available_slot = available_slot;
	}
	public int getIs_delete() {
		return is_delete;
	}
	public void setIs_delete(int is_delete) {
		this.is_delete = is_delete;
	}
	public Property(String latitude, String longitude, int user_id, int slot, int available_slot, int is_delete) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.user_id = user_id;
		this.slot = slot;
		this.available_slot = available_slot;
		this.is_delete = is_delete;
	}
	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
