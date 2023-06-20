package arrays;

public class Program1 {
	public static void main(String[] args) {
		String []s= {"Bob","Tiru","Bi","Ta","Mi"};
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		System.out.println(s[4]);
		System.out.println("-----------");
		
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		System.out.println("----------");
		for(String a:s) {
			System.out.println(a);
		}
		
		System.out.println("------------");
		for(int i1=s.length-1;i1>=0;i1--) {
			System.out.println(s[i1]);
		}
	}

}
