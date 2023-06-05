package com.alabi.app.utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateAndTime {

	public static String todaysDate() {    
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		   LocalDateTime now = LocalDateTime.now();  
		   //System.out.println("date ::::::::::::::: " + dtf.format(now));  
		   
		   return dtf.format(now);
		  }    
	
	public static String time() {    
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");  
		   LocalDateTime now = LocalDateTime.now();  
		   return dtf.format(now);  
		  }   
}
