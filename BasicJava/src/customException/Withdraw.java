package customException;

import java.util.Scanner;

public class Withdraw {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int balance=10000;
		System.out.println("The the amount to be withdraw");
		int bal=s.nextInt();
		
		if(bal<=balance)
		{
			System.out.println("Succfully withdraw Rs: "+bal);
		}
		
		else
		{
			try
			{
				throw new InsufficientBalanceException();
			}
			
			catch(InsufficientBalanceException e)
			{
				System.out.println("insufficient balance");
			}
		}
		
	}

}
