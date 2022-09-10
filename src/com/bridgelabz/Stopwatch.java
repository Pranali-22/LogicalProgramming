/**
 * 
 */
package com.bridgelabz;
import java.util.*;

/**
 * @author Dell
 *
 */
public class Stopwatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter start time in hours and minute");
		int startHours=input.nextInt();
		int startMinutes = input.nextInt();
		
		System.out.println("Enter end time in hours and minute");
		int endHours=input.nextInt();
		int endMinutes = input.nextInt();
		
		int mins, hrs;
		
		if(endMinutes < startMinutes) {
			endMinutes = endMinutes +60;
			endHours = endHours-1;
		}
		
		mins = endMinutes - startMinutes;
		hrs = endHours - startHours;
		
		System.out.println("Elapsed Time = "+hrs+" hours and "+mins+" minutes");
		

	}

}
