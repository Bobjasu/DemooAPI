package practice;

public class Test {
	public static void main(String[] args) {
		P p=new P();
		p.marry();
		
		C c=new C();
		c.marry();
		
		
		P p1=new C();
		p1.marry();
		
	}

}
