/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Dell
 *
 */
public class ReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number : ");
		int number = input.nextInt();
		
		int temp=number;
		int i, reverseNum=0;
		
		for(i=0; temp>0; temp=temp/10) {
			reverseNum = reverseNum*10 + (temp%10);
			i++;
		}
		
		System.out.println("Original Number : "+number + "\nReverse Number : "+reverseNum);
		
		input.close();
	}

	
}
