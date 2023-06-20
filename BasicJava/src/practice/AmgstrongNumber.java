package practice;

public class AmgstrongNumber {
	public static void main(String[] args) {
		int num=153;
		int cube=0;
		int rem=0;
		int temp=num;
		
		while(num!=0)
		{
			rem=num%10;
			cube=cube+rem*rem*rem;
			num=num/10;
		}
		if(temp==cube)
		{
			System.out.println("This is an Amngstrong number");
		}
		else
		{
			System.out.println("This is not an amgstrong number");
		}
	}

}
