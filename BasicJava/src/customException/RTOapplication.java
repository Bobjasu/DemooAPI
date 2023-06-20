package customException;

import java.util.Scanner;

public class RTOapplication
{
	static void verifyAge()
	{
		Scanner s=new Scanner(System.in);
		int eligibleage=18;
		System.out.println("Enter age of the applicant");
		int age=s.nextInt();
		if(age>=eligibleage)
		{
			System.out.println("The application is accepted succesfully");
		}
		else
		{
			try
			{
				throw new AgeInvalidException("Application for DL");
			}
			catch(Exception e)
			{
				System.out.println("Age is not eligible");
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		verifyAge();
		
		}
		
	}


