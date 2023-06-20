package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program6 {
	public static void main(String[] args) {
		
		try
		{
			FileReader f=new FileReader("abcd.txt");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("File not found");
			System.out.println(e.getMessage());
		}
		
	}

}
