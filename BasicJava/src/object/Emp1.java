package object;

public class Emp1 {
	String name;
	int id;
	
	Emp1(String name,int id){
		super();
		this.name=name;
		this.id=id;
	}
	
	@Override
	public String toString() {
		return name+" "+id;
	}
	
	public static void main(String[] args) {
		Emp1 e=new Emp1("Bob",123);
		System.out.println(e);
		System.out.println(e.name);
		System.out.println(e.id);
		System.out.println(e.toString());
	}

}
