package practice;

public class revInteger {
	public static void main(String[] args) {
		int num=12354;
		int rev=0;
		
		while(num!=0)
		{
			rev=num%10+rev*10;
			num=num/10;
		}
		
		System.out.println(rev);
		
		int number=12546;
		StringBuffer sb=new StringBuffer(String.valueOf(number));
		System.out.println(sb.reverse());
		
	}

}
