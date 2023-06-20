package Exception;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=s.nextInt();
		System.out.println("Enter the value");
		int b=s.nextInt();
		System.out.println("Program starts");
		
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("Exception is handled");
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			
		}
		System.out.println("End");
		
	}

}
