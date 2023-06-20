package Exception;

public class Program2 {
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
			System.out.println("Exception is handled");
		}
		
	}

}
