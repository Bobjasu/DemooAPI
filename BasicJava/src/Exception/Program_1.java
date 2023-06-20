package Exception;

import java.util.Scanner;

public class Program_1 {
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
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handled");
		}
		catch(Exception e)
		{
			System.out.println("Supermost exception class");
			
		}
	}


}
