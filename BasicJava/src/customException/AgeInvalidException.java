package customException;

public class AgeInvalidException extends RuntimeException{
	private String name;
	
	public AgeInvalidException(String name) {
		this.name=name;
	}
	
	public String getMessage()
	{
		return name;
	}

}
