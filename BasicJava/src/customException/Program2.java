package customException;

public class Program2 {
	void display() throws InterruptedException
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			Thread.sleep(2000);
		}
	}
	
	public static void main(String[] args) {
		Program2 pro=new Program2();
		try {
		pro.display();
		}
		catch(Exception e)
		{
			System.out.println("Handled");
		}
	}
	

}
