package com.test;

public class location {

	private String city;
	private double longitude;//경도
	private double latitude;//위도
	
	public location(String c,double lo,double la) {
		this.city = c;
		this.longitude = lo;		
		this.latitude = la;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
}
