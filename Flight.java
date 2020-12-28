package com.xworkz.xworkzapp;



public class Flight {
	public FlightDTO[] flight=new FlightDTO[3];
	public int index;
	
	
	
	public void addFlightBooking(FlightDTO flight)
	{
		
			if(flight.getAirplaneCode()!=null && flight.getCompany()!=null && 
					flight.getStartingPoint()!=null && flight.getBusinessClassPrice()!=0){
				if(flight.getBusinessClassPrice()>=1000) {
					this.flight[index++]=flight;
					System.out.println("added flight company "+flight.getCompany());
				}
				else {
					System.out.println("price should be greater than 1000");
				}
			}
			else
			{
				System.out.println("flight booking details are not added");
			}
	}
	
		
	public void displayAllDetails() {
		for (int i = 0; i < flight.length; i++) {
			if(flight[i]!=null) {
				 System.out.println("company name is:"+ flight[i].getCompany()+" "+"starting point is:" 
						 +flight[i].getStartingPoint()+" "+"destination point is:"
			+" "+ flight[i].getDestination()+" "+"total seats are:" + flight[i].getTotalseats()+" "+
			"domestic cost price is:"+ flight[i].getDomestic()+" "+"Buisness Cost price is:"+" "+
			flight[i].getBusinessClassPrice()+" "+"economy class price is:"+ flight[i].getEconomyClassPrice());
						  }
			
			else if(flight[i]==null) {
				System.out.println("added the flight details");
			}
			
		}
	}
	
	public void searchByStartingPoint(String startingPoint) {
		boolean point=false;
		for (int i = 0; i < flight.length; i++) {
			if(flight[i]!=null)
			{
			  if(flight[i].getStartingPoint().equals(startingPoint)) {
				  System.out.println("company name is:"+flight[i].getCompany()+" "+"starting point is"
				  		+ flight[i].getStartingPoint()+" "+"destination point is:"+
			  flight[i].getDestination()+" "+"Total seats are:"+flight[i].getTotalseats()+" "+
			  "domestic price is:"+flight[i].getDomestic()+" "+"Buisness price is:"+
			  flight[i].getBusinessClassPrice()+" "+"Economy price is:"+
			  flight[i].getEconomyClassPrice());
				  
			  }
			  else
			  {
				point=false;
			  }
			
		}}
if(point==false) {
	System.out.println("flight is not available at the starting point Ballari");
}

	}}

