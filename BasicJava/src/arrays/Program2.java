package arrays;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=s.nextInt();
		
		String []s1=new String[size];
		System.out.println("enter string elements");
		
		for(int i=0;i<s1.length;i++)
		{
			s1[i]=s.next();
		}
		
		System.out.println("entered elements are");
		
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
	}

}
