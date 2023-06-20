package Exception;

public class Program5 {
	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
				System.out.println(" is handled");
			}
			
			finally {
				System.out.println(" is executed");
			}
		
		
		}
		
	}

}
