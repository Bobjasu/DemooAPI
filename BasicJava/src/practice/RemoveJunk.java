package practice;

public class RemoveJunk {
	public static void main(String[] args) {
		String s="*+&!@#$%^^^ Utsab @#$%^^#!$^ Jasu &*^*%$##";
		
		String rem = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		System.out.println(rem);
	}

}
