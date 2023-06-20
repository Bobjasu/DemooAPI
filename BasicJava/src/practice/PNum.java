package practice;

public class PNum {
	public static boolean isPrimeNumber(int num)
	{
		if(num<1)
		{
			return false;
		}
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
		
	}
	
	public static void getPrimeNumber(int number)
	{
		for(int i=2;i<number;i++)
		{
			if(isPrimeNumber(i))
			{
				System.out.println(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("197 is a prime number : "+isPrimeNumber(197));
		getPrimeNumber(30);
	}
	
	

}
