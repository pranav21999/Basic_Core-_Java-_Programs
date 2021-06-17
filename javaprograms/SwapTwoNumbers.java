package javaprograms;

import java.util.Scanner;

public class SwapTwoNumbers
{
	double num1, num2, temp;
	
	void Swap() //method to swap the no.
	{
		System.out.println("\nNumbers before swapping :\nnum1 = "+num1 +" , "+"num2 = "+num2);
		// Swap using temp.
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("\nNumbers after swapping :\nnum1 = "+num1 +" , "+"num2 = "+num2);
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome to the program to swap two numbers."
				+ "\nPlease Enter num1 and num2");
		Scanner sc = new Scanner(System.in);
		SwapTwoNumbers myObj = new SwapTwoNumbers();
		myObj.num1 = sc.nextDouble();
		myObj.num2 = sc.nextDouble();
		sc.close();
	//method calling
		myObj.Swap();
		
	}
}