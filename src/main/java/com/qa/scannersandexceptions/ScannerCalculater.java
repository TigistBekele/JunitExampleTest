package com.qa.scannersandexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerCalculater {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double result;

		System.out.println("Please inter two numbers");

		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();

		System.out.println("Which opration you want Sub,Add,multi,Divi");
		String opration = scanner.next();

		try {
			switch (opration) {
			case "Add":
				result = Calculator.add(num1, num2);
				System.out.println("The result of Addition is:" + result);
				break;

			case "Sub":
				result = Calculator.subtraction(num1, num2);
				System.out.println("The result of substraction is:" + result);
				break;

			case "Multi":
				result = Calculator.multiplication(num1, num2);
				System.out.println("The result of multiplication is:" + result);
				break;

			case "Divi":
				if (num2 == 0) {
					throw new ArithmeticException("you can not divide with zero");
				}
				result = Calculator.division(num1, num2);

				System.out.println("The result of division is:" + result);
				break;
			}
		} catch (InputMismatchException ex) {
			System.out.println(ex);
		}
		scanner.close();
	}

}
