package basics;

public class EvenNumver {
	public static boolean isEvenNum(int number)
	{
		if(number%2!=0)
		{
			return false;
		}
		return true;
	}
	
	public static void getEvenNumber(int num)
	{
		for(int i=0;i<=num;i++)
		{
			if(isEvenNum(i))
			{
				System.out.println(i+" : even");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("The number is Even : "+isEvenNum(23));
		getEvenNumber(23);
		//1st pull
	}

}
