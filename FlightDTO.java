package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.constant.Company;

public class FlightDTO {
	
	private String airplaneCode;
	private Company company;
	private String startingPoint;
	private String destination;
	private int totalseats;
	private Boolean domestic;
	private double  businessClassPrice;
	private double economyClassPrice;

	
	public String getAirplaneCode() {
		return airplaneCode;
	}
	public void setAirplaneCode(String airplaneCode) {
		this.airplaneCode = airplaneCode;
	}

	public Company getCompany() {
	return company;
}
public void setCompany(Company company) {
	this.company = company;
}
	public String getStartingPoint() {
		return startingPoint;
	}
	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getTotalseats() {
		return totalseats;
	}
	public void setTotalseats(int totalseats) {
		this.totalseats = totalseats;
	}
	public boolean getDomestic() {
		return domestic;
	}
	public void setDomestic(boolean domestic) {
		this.domestic = domestic;
	}
	public double getBusinessClassPrice() {
		return businessClassPrice;
	}
	public void setBusinessClassPrice(double businessClassPrice) {
		this.businessClassPrice = businessClassPrice;
	}
	public double getEconomyClassPrice() {
		return economyClassPrice;
	}
	public void setEconomyClassPrice(double economyClassPrice) {
		this.economyClassPrice = economyClassPrice;
	}
	
	

}
