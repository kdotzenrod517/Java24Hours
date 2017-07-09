package com.java24hours;

import java.time.*;
import java.time.temporal.ChronoField;

public class Clock {

	public static void main(String[] args){
		
		//get current time and date
		LocalDateTime now = LocalDateTime.now();
		int hour = now.get(ChronoField.HOUR_OF_DAY);
		int minute = now.get(ChronoField.MINUTE_OF_HOUR);
		int month = now.get(ChronoField.MONTH_OF_YEAR);
		int day = now.get(ChronoField.DAY_OF_MONTH);
		int year = now.get(ChronoField.YEAR);
		
		//display greeting
		if (hour < 12){
			System.out.println("Good morning!\n");
		} else if (hour < 17){
			System.out.println("Good afternoon!\n");
		} else {
			System.out.println("Good evening!\n");
		}
		
		//begin time message by showing the minutes
		System.out.print("It's");
		if (minute != 0){
			System.out.print(" " + minute + " ");
			System.out.print((minute != 1) ? "minutes" : "minute");
			System.out.print(" past");
		}
		
		//display the hour
		System.out.print(" ");
		System.out.print((hour > 12) ? (hour - 12) : hour);
		System.out.print(" o'clock on ");
		
		//display the name of the month
		switch(month){
        case 1:
            System.out.println("January");
            break;
        case 2:
        	System.out.println("February");
            break;
        case 3:
        	System.out.println("March");
            break;
        case 4:
        	System.out.println("April");
            break;
        case 5:
        	System.out.println("May");
            break;
        case 6:
        	System.out.print("June");
            break;
        case 7:
        	System.out.print("July");
            break;
        case 8:
        	System.out.print("August");
            break;
        case 9:
        	System.out.print("September");
            break;
        case 10:
        	System.out.println("October");
            break;
        case 11:
        	System.out.println("November");
            break;
        case 12:
        	System.out.println("December");
            break;		
		}
		
		//display date and year
		System.out.print(" " + day + ", " + year + ".");
		System.out.println("\n\n<3");
		
		
	}
}
