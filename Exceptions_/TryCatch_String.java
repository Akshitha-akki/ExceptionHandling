package Exceptions_;

//NullPointerException
public class TryCatch_String {

	public static void main(String[] args) {
		try 
		{ 
			 String s=null;
			 System.out.println(s.length());
		}
		catch (NullPointerException e) 
		{
			System.out.println("NullPointerException");
		}
		finally 
		{
			System.out.println("Finally block");
		}
	}
}
