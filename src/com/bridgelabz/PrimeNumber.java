/**
 * 
 */
package com.bridgelabz;
import java.util.*;
/**
 * @author Dell
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number");
		int number= input.nextInt();
		int isPrime=0;
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				isPrime=1;
				break;
			}
		}
		
		if(isPrime==1) {
			System.out.println(number+" is not a prime number");
		}else {
			System.out.println(number+" is a prime number");
		}
	}

}
