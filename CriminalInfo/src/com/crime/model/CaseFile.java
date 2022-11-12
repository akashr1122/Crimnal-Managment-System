package com.crime.model;

public class CaseFile {
	
	private String  victim_name;
	private String descrption_of_crime ;
	private String place_of_crime;
	private String date;
	private String name_of_suspected;
	private String  details_descrption;
	
	
	
	public CaseFile() {
		// TODO Auto-generated constructor stub
	}



	public CaseFile(String victim_name, String descrption_of_crime, String place_of_crime, String date,
			String name_of_suspected, String details_descrption) {
		super();
		this.victim_name = victim_name;
		this.descrption_of_crime = descrption_of_crime;
		this.place_of_crime = place_of_crime;
		this.date = date;
		this.name_of_suspected = name_of_suspected;
		this.details_descrption = details_descrption;
	}



	public String getVictim_name() {
		return victim_name;
	}



	public void setVictim_name(String victim_name) {
		this.victim_name = victim_name;
	}



	public String getDescrption_of_crime() {
		return descrption_of_crime;
	}



	public void setDescrption_of_crime(String descrption_of_crime) {
		this.descrption_of_crime = descrption_of_crime;
	}



	public String getPlace_of_crime() {
		return place_of_crime;
	}



	public void setPlace_of_crime(String place_of_crime) {
		this.place_of_crime = place_of_crime;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getName_of_suspected() {
		return name_of_suspected;
	}



	public void setName_of_suspected(String name_of_suspected) {
		this.name_of_suspected = name_of_suspected;
	}



	public String getDetails_descrption() {
		return details_descrption;
	}



	public void setDetails_descrption(String details_descrption) {
		this.details_descrption = details_descrption;
	}



	@Override
	public String toString() {
		return "CaseFile [victim_name=" + victim_name + ", descrption_of_crime=" + descrption_of_crime
				+ ", place_of_crime=" + place_of_crime + ", date=" + date + ", name_of_suspected=" + name_of_suspected
				+ ", details_descrption=" + details_descrption + "]";
	}
	
	 
	
	
	

}
