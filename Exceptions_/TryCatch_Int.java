package Exceptions_;

//ArithmeticException
public class TryCatch_Int {

	public static void main(String[] args) {
		int a;
		try 
		{ 
			 a=10/0;
			 System.out.println("ArithmeticException");
		}
		catch (ArithmeticException e) 
		{
			System.out.println("ArithmeticException : NotDividedZero"+e);
		}
		finally //optional - whether error contains or not it'll 
		{
			System.out.println("Finally block");
		}
	}

}
