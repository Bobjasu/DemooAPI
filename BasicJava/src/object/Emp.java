package object;

public class Emp {
       String name;
       
       Emp(String name){
    	   this.name=name;
       }
       
       public static void main(String[] args) {
    	   Emp e=new Emp("Bob");
    	   System.out.println(e);
    	   System.out.println(e.name);
    	   System.out.println(e.toString());
		
	}
}
