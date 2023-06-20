package customException;

public class Program1 {
	static void div() throws ArithmeticException
	{
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		System.out.println("Start");
		try 
		{
		 div();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Handled");
			System.out.println(e.getMessage());
		}
		System.out.println("End");
		
	}

}
