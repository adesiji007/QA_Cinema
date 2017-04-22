package com.qacinema.project;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Ticket {
	
	
	public double applyDiscount(double ticket){
		
		
	 	int dayOfWeek;
	 	
	 	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("e");
	 	LocalDate localDate = LocalDate.now();
	 	//System.out.println(dtf.format(localDate)); //2016/11/16
	 	
	 	dayOfWeek = Integer.valueOf(dtf.format(localDate));
	 	
	 	if(dayOfWeek == 3){
	 		int dayofWeek = Integer.valueOf(dtf.format(localDate));
	 		return (ticket * 2);
	 	}
	 	return ticket;
		
	}

}
