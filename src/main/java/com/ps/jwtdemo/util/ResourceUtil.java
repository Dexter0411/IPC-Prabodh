package com.ps.jwtdemo.util;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class ResourceUtil {

	public static String getQuarter(LocalDate date) {

		if (date.getMonthValue() >= 1 && date.getMonthValue() <= 3) {
			return "Q1";
		} else if (date.getMonthValue() >= 4 && date.getMonthValue() <= 6) {
			return "Q2";

		} else if (date.getMonthValue() >= 7 && date.getMonthValue() <= 9) {
			return "Q3";

		} else if (date.getMonthValue() >= 10 && date.getMonthValue() <= 12) {
			return "Q4";
		}
		return null;

	}
	
	public static LocalDate getDeploymentDate(LocalDate date) {
		int monthVal = date.getMonthValue();
		int monthDay = date.getDayOfMonth();
		if(monthVal==3 && monthDay>23) {
			return date.plusDays(31-monthDay+1); 
		}else if(monthVal==6 && monthDay>23) {
			return date.plusDays(30-monthDay+1); 
		}else if(monthVal==9 && monthDay>23) {
			return date.plusDays(30-monthDay+1); 
		}else if(monthVal==12 && monthDay>23) {
			return date.plusDays(31-monthDay+1); 
		}else {
			return date.plusDays(4);
		}
		
	}

}
