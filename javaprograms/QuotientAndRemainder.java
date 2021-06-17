package javaprograms;

import java.util.Scanner;

public class QuotientAndRemainder 
{
	double dividend, divisor;
	
	void Division() //method to calculate quotient and remainder
	{
		double quotient = dividend / divisor;
		double remainder = dividend % divisor;
		System.out.println("Quotient = "+quotient);
		System.out.println("Remainder ="+remainder);
	}
	public static void main(String[] args) 
	{
		System.out.println(" program to compute quotient And remainder."
				+ "\n Enter dividend and divisor : ");
		Scanner sc = new Scanner(System.in);
		QuotientAndRemainder qr = new QuotientAndRemainder();
		qr.dividend = sc.nextDouble();
		qr.divisor = sc.nextDouble();
		sc.close();
		//method calling to main
		qr.Division();
	}
}
