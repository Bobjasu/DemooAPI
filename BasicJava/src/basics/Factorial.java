package basics;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int result=1;
		
		for(int i=num;i>0;i--)
		{
		   result=result*i;
		}
		System.out.println(result);
		
	}

}
