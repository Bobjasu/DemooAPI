package Exception;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numeretor value");
		int a=s.nextInt();
		System.out.println("Enter the denominator value");
		int b=s.nextInt();
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception handled");
			System.out.println("Denominator must not be zero");
		}
	}

}
