package com.crime.model;

public class criminalRecord {
	
	private String name;
	private int age;
	private String gender;
	private String address;
	private String  Indentitfy_mark;
	private String  Area_where_arrested;
	private String crime;
	
	
	
	public criminalRecord() {
		// TODO Auto-generated constructor stub
	}



	public criminalRecord(String name, int age, String gender, String address, String indentitfy_mark,
			String area_where_arrested, String crime) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.Indentitfy_mark = indentitfy_mark;
		this.Area_where_arrested = area_where_arrested;
		this.crime = crime;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getIndentitfy_mark() {
		return Indentitfy_mark;
	}



	public void setIndentitfy_mark(String indentitfy_mark) {
		Indentitfy_mark = indentitfy_mark;
	}



	public String getArea_where_arrested() {
		return Area_where_arrested;
	}



	public void setArea_where_arrested(String area_where_arrested) {
		Area_where_arrested = area_where_arrested;
	}



	public String getCrime() {
		return crime;
	}



	public void setCrime(String crime) {
		this.crime = crime;
	}



	@Override
	public String toString() {
		return "criminalRecord [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address
				+ ", Indentitfy_mark=" + Indentitfy_mark + ", Area_where_arrested=" + Area_where_arrested + ", crime="
				+ crime + "]";
	}
	
	

}
