package com.QA.TestUtils;


import java.util.Date;

public class Utility {
	
public static String setTimestamp () {
	   Date date = new Date();
	      //This method returns the time in millis
	      long timeMilli = date.getTime();
	      System.out.println("Time in milliseconds using Date class: " + timeMilli);

	return Long.toString(timeMilli) ;
	
	
	
}



}
