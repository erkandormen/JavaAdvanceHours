package day02;

import java.util.Scanner;

public class Advance_1_RightTrianglePattern {

	public static void main(String[] args) {
		/*
		 * Create Right Triangle pattern by using rightTrianglePattern() method
		 * 
		 * Example: Enter a number 
					5
					 
					 * 
					 * * 
					 * * * 
					 * * * * 
					 * * * * * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to create triangle pattern");
		int n = scan.nextInt();
		
		rightTrianglePattern(n);
		
	}
	
	public static void rightTrianglePattern(int n) {
		//cerate rows
		for(int i=0; i<=n;i++) {
			//create columns and the char
			for(int j=0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	

}
