package com.hossary.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	
	private String firstName="ahmed";
	private String lastName="sayed";
	
	private String country;
	
	private String favoriteLanguage;
	
	private String[] operatingSystems;
	
	LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		countryOptions=new LinkedHashMap<String, String>();
		
		countryOptions.put("Br", "Brazil");
		countryOptions.put("Fr", "Fance");
		countryOptions.put("Us", "United States");
		countryOptions.put("Gb", "Great Britian");
		countryOptions.put("Sw", "Switzerland");
		
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}


	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}


	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}


	public String[] getOperatingSystems() {
		return operatingSystems;
	}


	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	

}
