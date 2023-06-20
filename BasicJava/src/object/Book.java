package object;

public class Book {
	String bname;
	
	Book(String bname)
	{
		this.bname=bname;
	}
	
	@Override
	public boolean equals(Object o)
	{
		String book1=this.bname;
		Book b=(Book)o;
		String book2=b.bname;
		
		if(book1==book2)
		    return true;	
		else
			return false;
	}
	
	public static void main(String[] args) {
		Book b1=new Book("Java");
		Book b2=new Book("Java");
		System.out.println(b1.bname);
		System.out.println(b2.bname);
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
		int h1=b1.hashCode();
		int h2 = b2.hashCode();
		System.out.println(h1==h2);
		
	}

}
