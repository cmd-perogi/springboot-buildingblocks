package com.stacksimplify.restservices.Hello;

public class UserDetails {
	
	private String fname;
	private String lname;
	private String city;
	
	
	//Fields Constructor
	public UserDetails(String fname, String lname, String city) {
	
		this.fname = fname;
		this.lname = lname;
		this.city = city;
	}
	
	
	//Getters and Setters
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	//ToString
	@Override
	public String toString() {
		return "UserDetails [fname=" + fname + ", lname=" + lname + ", city=" + city + "]";
	}
	
	

	
	
	
}
