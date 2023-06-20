package practice;

public class PrimeNumber {
	public static void main(String[] args) {
		int number=197;
		int count=0;
		
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count++;
			}
		}
			if(count==2)
			{
				System.out.println("This is a prime number");
			}
			else
			{
				System.out.println("This is not a prime number");
			}
		
	}

}
