package exceptions;

   public class InvalidAgeException extends Exception 
   {
	   public InvalidAgeException(String message) 
	   {
		super(message);
	   }
	   
	public static void main(String args[]) throws InvalidAgeException 
	{
		int age = 15;
		try {
			if (age < 18)
			   {
				System.out.println("Age is : " + age);
				throw new InvalidAgeException("Not eligible for vote");
			   }
			else 
			   {
				System.out.println("Welcome to vote");
			   }

	    	 } 
		catch (InvalidAgeException e) 
		   {
			System.out.println(e);
		   }
	}
}
