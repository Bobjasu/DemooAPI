package practice;

public class Palindrome {
	public static void main(String[] args) {
		int num=151;
		int rev = 0; 
		int temp=num;
		
		while(num!=0)
		{
			rev=num%10+rev*10;
			num=num/10;
		}
		
		System.out.println(rev);
		if(temp==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
