package object;

import java.util.Objects;

public class Laptop {
	String brand;
	int modelnum;
	
	Laptop(String brand,int modelnum){
		super();
		this.brand=brand;
		this.modelnum=modelnum;
	}
	
	public String toString() {
		return brand+" "+modelnum;
	}
	
	public int hashCode() {
		return Objects.hash("brand",modelnum);
	}
	
	public static void main(String[] args) {
		Laptop l=new Laptop("Dell",1255);
		Laptop l1=new Laptop("Hp",5286);
		System.out.println(l.toString());
		System.out.println(l.hashCode());
		System.out.println(l1.toString());
		System.out.println(l1.hashCode());
		
		
	}

}
