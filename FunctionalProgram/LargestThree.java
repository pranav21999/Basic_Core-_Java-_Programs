package javaprograms;

import java.util.Scanner;

public class LargestThree 
{
	double num1, num2, num3;
	void LargestNum() //method to calculate largest among three no;
	{
		if (num1 > num2 && num1 > num3) 
		{
			System.out.println(+num1+" is largest among three numbers.");
		} else if (num2 > num1 && num2 > num3) 
		{
			System.out.println(+num2+" is largest among three numbers.");
		} else if (num3 > num1 && num3 > num2) 
		{
			System.out.println(+num3+" is largest among three numbers.");
		} else System.out.println("Invalid! Entered numbers are not distinct.");
	}
	public static void main(String[] args) 
	{
		System.out.println("Welcome to the program to find largest of three numbers."
				+ "\nPlease enter three distinct numbers num1, num2 and num3");
		Scanner sc = new Scanner(System.in);
		LargestThree myObj = new LargestThree();
		myObj.num1 = sc.nextDouble();
		myObj.num2 = sc.nextDouble();
		myObj.num3 = sc.nextDouble();
		sc.close();
		myObj.LargestNum();
	}
}