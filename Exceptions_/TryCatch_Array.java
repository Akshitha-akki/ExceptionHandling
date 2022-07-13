package Exceptions_;

//ArrayIndexOutOfBoundsException
public class TryCatch_Array {

	public static void main(String[] args) 
	{	 
		try 
		{ 
			 int []a=new int[5];
			 a[6]=10;
			 System.out.println("Inside try block");
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		finally 
		{
			System.out.println("Finally block");
		}
	}

}
