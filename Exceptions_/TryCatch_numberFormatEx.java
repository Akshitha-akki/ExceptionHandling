package Exceptions_;

//NumberFormatException
public class TryCatch_numberFormatEx 
{
	public static void main(String[] args) {
		try 
		{ 
			 String s="ABC";
			 //String s=null;
			 int i=Integer.parseInt(s);
			 System.out.println(i);
		}
		catch (Exception e) 
		{
			System.out.println("NumberFormatException");
		}
		finally 
		{
			System.out.println("Finally block");
		}
	}
}
