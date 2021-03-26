package day04;

import java.util.Scanner;

public class Advance_1_GCDandLCM {

	public static void main(String[] args) {
		// Take 2 integers from user and find GCD (Greatest Common Divisor) 
		// ebob -> en büyük ortak bölen
		//and LCM (Least Common Multiplier)//ekok -> en küçük ortak kat
		// Hint: Take the greater number is bounded as maximum 50.000

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two positive integer");
		System.out.println("for GCD (Greatest Common Divisor) and LCM (Least Common Multiplier)");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("Numbers you are entered "+num1+" ,"+num2);
		int flag=0;
		
		//calculate GCD
		int limitGCD=0;//it is crated to find which number is smaller than the other
		if(num1<num2) {
			limitGCD=num1;
		}else {
			limitGCD=num2;
		}
		
		for(int i=limitGCD;i>2;i--) {
			if(num1%i == 0 && num2 %i ==0) {
				System.out.println("The GCD of the numbers: "+i);
				flag++;
				break;
			}
		}
		
		if(flag==0) {
			System.out.println("There is no GCD for that numbers");
		}
		
		//calculate LCM
		//We are starting from 1 and increasing one by one
		//Upper bound is 50.000
		flag=0;
		
		for(int i=1;i<50000;i++) {
			if(i%num1 ==0 && i%num2==0) {
				System.out.println("LCM for that numbers: "+i);
				flag++;
				break;
			}
			
		}
		
		if(flag==0) {
			System.out.println("There is no LCM for that numbers up to 50.000");
		}
		
		scan.close();	
	}

}

