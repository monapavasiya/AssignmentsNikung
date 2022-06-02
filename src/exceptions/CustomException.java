package exceptions;

public class CustomException extends Exception 
{
	public CustomException(String message) 
	{
		super(message);
	}

	public static void main(String args[]) throws CustomException {

		try {
			int age = -5;
			if (age < 0) 
			{
				throw new CustomException("An animal can't have a negative age : " + age);
			}
			else 
			{
				System.out.println("Dog is there");
			}
		} 
		catch (CustomException e)
		{
			System.out.println(e.getMessage());

		}

	}
}
