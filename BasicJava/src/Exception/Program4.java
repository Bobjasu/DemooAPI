package Exception;

public class Program4 {
	public static void main(String[] args) {
		int a[]= {10,20,30};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		try
		{
			System.out.println(a[99]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("Exception is handled");
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			
		}
		
		finally {
			System.out.println("Finally is executed");
		}
		
	}

}
