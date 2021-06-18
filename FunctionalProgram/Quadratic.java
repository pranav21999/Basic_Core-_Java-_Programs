package javaprograms;

import java.util.Scanner;

public class Quadratic {
	private static void Roots(int a, int b, int c) {
		double delta = (b * b) - 4 * a * c;
		if ( delta < 0 ) {
			System.out.println("This equation has imaginary roots");
		} else {
		double root1 = (-b + Math.sqrt(delta))/(2 * a);
		double root2 = (-b - Math.sqrt(delta))/(2 * a);
		System.out.println("Delta = "+delta);
		System.out.println("Root1 = "+root1);
		System.out.println("Root2 = "+root2);
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the program to find roots of quadratic equation a*x*x + b*x + c.");
		System.out.println("Please enter value of a,b and c.");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		Roots(a,b,c);
	}
}