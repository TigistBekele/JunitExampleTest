package com.qa.scannersandexceptions;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {		
	      int num1, num2, add, sub, multi;
		    double devi;
		    Scanner scanner = new Scanner(System.in);

		    System.out.print("Enter the first number: \n");
		    num1 = scanner.nextInt();
		    System.out.print("And enter second: \n");
		    num2 = scanner.nextInt();

		    add = num1 + num2;
		    sub = num1 - num2;
		    multi = num1 * num2;
		    devi = (double) num1 / num2;

		    System.out.println("Sum = " + add);
		    System.out.println("Difference = " + sub);
		    System.out.println("Multiplication = " + multi);
		    if(num2 == 0) {
		    	System.out.println("invalid number");
		    }else {
		    System.out.println("Division = " + devi);
		    }
			
		
	}
}
