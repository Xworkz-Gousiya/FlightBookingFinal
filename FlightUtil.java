package com.xworkz.util;



import com.xworkz.xworkzapp.Flight;
import com.xworkz.xworkzapp.FlightDTO;
import com.xworkz.xworkzapp.constant.Company;

public class FlightUtil {
	
	public static final int size = 0;

	public static void main(String[] args) {
		FlightDTO flightdto=new FlightDTO();
		
			flightdto.setAirplaneCode("Air123");
			flightdto.setCompany(Company.Indigo);
			flightdto.setStartingPoint("Bangalore");
			flightdto.setDestination("Delhi");
			flightdto.setTotalseats(100);
			flightdto.setDomestic(true);
			flightdto.setBusinessClassPrice(2000);
			flightdto.setEconomyClassPrice(700);
			
			FlightDTO flightOne=new FlightDTO();		
			flightOne.setAirplaneCode("Air456");
			flightOne.setCompany(Company.AirIndia);
			flightOne.setStartingPoint("Delhi");
			flightOne.setDestination("Bangalore");
			flightOne.setTotalseats(100);
			flightOne.setDomestic(true);
			flightOne.setBusinessClassPrice(4000);
			flightOne.setEconomyClassPrice(8000);
			
			
			Flight flight=new Flight();
			flight.addFlightBooking(flightdto);
			flight.addFlightBooking(flightOne);
			
			flight.displayAllDetails();
			flight.searchByStartingPoint("Ballari");
			
			
		/*	System.out.println(flightdto.getCompany()+" "+flightdto.getStartingPoint()+" "+
					  flightdto.getCompany()+" "+flightdto.getDestination()+" "+flightdto.getTotalseats()+" "+
					  flightdto.getDomestic()+" "+flightdto.getBusinessClassPrice()+" "+
					  flightdto.getEconomyClassPrice());
			System.out.println(flightOne.getCompany()+" "+flightOne.getStartingPoint()+" "+
					  flightOne.getCompany()+" "+flightOne.getDestination()+" "+flightOne.getTotalseats()+" "+
					  flightOne.getDomestic()+" "+flightOne.getBusinessClassPrice()+" "+
					  flightOne.getEconomyClassPrice());*/
			
			
			
		}
		
		
		
		
			
			
			
			

	}


