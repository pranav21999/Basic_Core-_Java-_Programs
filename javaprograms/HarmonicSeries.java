package javaprograms;

import java.util.Scanner;

public class HarmonicSeries
{
	 int num;
	 int ans;
	 int i;
	void printseries()//method to print harmonic series
	{
		for(i=1;i<=num;i++)
		{
			System.out.print("\t1/"+i);
					
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("enter no upto which we have to print harmonic series");
		try (Scanner sc = new Scanner(System.in)) 
		{
			//Object creation
			HarmonicSeries hs=new HarmonicSeries();
			hs.num=sc.nextInt();
			//method calling
			hs.printseries();
		}
	}
}
