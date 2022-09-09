/**
 * 
 */
package com.bridgelabz;
import java.util.*;
/**
 * @author Dell
 *
 */
public class PerfectNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter nuber");
		int number= input.nextInt();
		int sum=0;
		
		for(int i=1;i<=number/2;i++) {
			if(number%i==0) {
				sum+=i;
			}
		}
		
		if(sum==number) {
			System.out.println(number+" is a perfect number");
		}
		else {
			System.out.println(number+" is not a perfect number");
		}
	}

}
