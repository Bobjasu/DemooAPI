package customException;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the userId");
		String Id=s.next();
		System.out.println("Enter the password");
		String PWD=s.next();
		
		if(Id.equals("admin"))
		{
			if(PWD.equals("password"))
			  {
				System.out.println("Login successful");
			  }
			else
			{
				try
				{
					InvalidPasswordException ipe=new InvalidPasswordException();
					throw ipe;
				}
				catch(InvalidPasswordException e)
				{
					System.out.println("Invalid password");
				}
				
			}
		}
		else
		{
			System.out.println("Invalid username");
		}
		
	}

}
