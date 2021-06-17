package javaprograms;

import java.util.Scanner;

public class Power 
{
	 int num;
	 int pow;
	 int ans;
	 int i;
	void calculate()//method to calculate power
	{
		for(i=1;i<=pow;i++)
		{
			ans = 2*i;
			System.out.println("power of 2^"+i+ "is"+ans);
					
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("enter no to calculate power of 2");
		try (Scanner sc = new Scanner(System.in)) 
		{
			//Object creation
			Power p=new Power();
			p.pow=sc.nextInt();
			//method calling
			p.calculate();
		}
	}
}
