package com.crime.model;

public class Admin {
	private String name;
	private String address;
	private String email;
	private String password;
	
	
	
	
	
	
	public Admin() {
		
	}

	public Admin(String name, String address, String email, String password) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdminRegister [name=" + name + ", address=" + address + ", email=" + email + ", password=" + password
				+ "]";
	}
	
	
	
	
	
	
	
	

}
