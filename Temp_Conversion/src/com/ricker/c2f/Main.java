package com.ricker.c2f;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		boolean looper = true;
		double result, var1;
		String inputOfText;
		Scanner ScanyScan = new Scanner(System.in);
		System.out.println("Enter Value to convert from Fahrenheit to Celsius or x to exit \n");
		while (looper) {
			System.out.print("Enter Input: ");
			inputOfText = ScanyScan.next();
			char exitM = inputOfText.charAt(0);
			if (exitM == 'x') {
				System.out.println("Exiting!");
				looper = false;
				System.exit(1);
			}
			else{

				var1 = Double.parseDouble(inputOfText);
				result = ((var1 - 32) * 5) / 9;
				System.out.printf("The result of the calculation of %4.0f Fahrenheit to  Celsius is %4.1f degrees Celsius \n", var1, result);
				System.out.println();
			}
		}
	}
}