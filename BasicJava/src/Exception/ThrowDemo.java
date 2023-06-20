package Exception;

public class ThrowDemo {
	public static void main(String[] args) {
		int a=15;
		int b=10;
		
		if(a>b)
		{
			throw new ArithmeticException("manually thrown");
		}
		else
		{
			System.out.println("No exception");
		}
		
	}

}
