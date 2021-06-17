package javaprograms;
import java.util.Scanner;

public class PrimeFactorization 
{
	int num, i;
	void Factors()//methos to compute factors
	{
		for (i=2; i*i<num; i++) 
		{
			while (num % i == 0) 
			{
				System.out.println(i+" ");
				num = num/i;
			}
		}
		if (num > 2)
		{
			System.out.println(num);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Welcome to prime factorization program.\nPlease enter a number.");
		Scanner sc = new Scanner(System.in);
		PrimeFactorization myObj = new PrimeFactorization();
		myObj.num = sc.nextInt();
		sc.close();
		myObj.Factors();
	}
}

