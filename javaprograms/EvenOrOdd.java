package javaprograms;

import java.util.Scanner;

public class EvenOrOdd {//check condition of even and odd
	double num, result;
	void CheckNum()//methods to check condition of even or odd
	{
		result = num % 2;
		if (result == 0 ) 
		{
			System.out.println(+num +" is Even.");
		} else System.out.println(+num +" is Odd.");
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Welcome to the program to check if number is even or odd.\nPlease enter a number :");
		Scanner sc = new Scanner(System.in);
		EvenOrOdd myObj = new EvenOrOdd();
		myObj.num = sc.nextDouble();
		sc.close();
		//method calling to main
		myObj.CheckNum();
		
	}
}