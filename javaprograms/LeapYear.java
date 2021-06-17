package javaprograms;

import java.util.Scanner;

public class LeapYear 
{
	int year;
	 void LeapYearOrNot()//methods to validate leap year or not
	{
		int count = 0; int digits = year;
		while (digits != 0)
		{
			digits = digits / 10;
			count +=1;
		}
		if (count == 4 && year > 999 && year <3000 )//initial validation for year
		{
			if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			{
				System.out.println(year+" is a Leap Year.");
			} else System.out.println(year+ " is not a leap year.");
		} else System.out.println("Invalid format. please enter year in YYYY format");
	}	
	

	public static void main(String[] args) 
	{
		System.out.println("program to check weather given year is leap year or not");
		Scanner sc = new Scanner(System.in);//accept input from user
		LeapYear myObj = new LeapYear();
		myObj.year = sc.nextInt();
		sc.close();
		//method calling
		myObj.LeapYearOrNot();
	
	}

}
