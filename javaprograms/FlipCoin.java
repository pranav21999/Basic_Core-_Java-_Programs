package javaprograms;//name of the package 
import java.util.*;

public class FlipCoin 
{
	//variables and constant
	int head=0,tail=0,num;
	double headsPercentage;
	 double tailPercentage;
	
	void welcome()
	{
		System.out.println("welcome to flip coin game");
	}
	void  flip() //method to flip the coin
	{
	
			for (int i = 0; i < num; i++)
			{
				double result = Math.random();
				if (result > 0.5)
				{
					System.out.println("Heads");
					head++;
				} else
				{
					System.out.println("Tails");
					tail++;
				}
			}
	}
	
	void percentage()//methods to calculate percentage of head and tail
	{
	
		headsPercentage = ((head * 100) / num);
		tailPercentage = ((tail * 100) / num);
		System.out.println("percentage of head is :"+headsPercentage+"%");
		System.out.println("percentage of head is :"+tailPercentage+"%");
		
	}
		 

	public static void main(String[] args)
	{
		FlipCoin f=new FlipCoin();//object creation
		f.welcome();
		System.out.println("enter the no upto which you have to flip the coin");

		 try (Scanner sc = new Scanner(System.in))
		 {
			 f.num=sc.nextInt();
		 }
		 //methods calling to main function
		 f.flip();
		 f.percentage();
	
	}

}
