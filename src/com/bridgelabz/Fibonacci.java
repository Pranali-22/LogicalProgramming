/**
 * 
 */
package com.bridgelabz;
import java.util.*;
/**
 * @author Dell
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter range for fibonacci series");
		int range= input.nextInt();
		int fibonacciNumber;
		int a=0, b=1;
		
		if(range==1) {
			System.out.println(a);
		}
		else {
			System.out.println(a+"\n"+b);
			
			for(int i=2;i<range;i++) {
				
				fibonacciNumber=a+b;
				a=b;
				b=fibonacciNumber;
				System.out.println(fibonacciNumber);
			}
		}
		
		input.close();
	}

}
