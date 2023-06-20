package object;

public class Hashcode {
	public static void main(String[] args) {
    Hashcode h=new Hashcode();
    Hashcode h1=new Hashcode();
    Hashcode h2=h1;
	System.out.println(h.hashCode());
	System.out.println(h1.hashCode());
	System.out.println(h2.hashCode());
	
}
		   
}
