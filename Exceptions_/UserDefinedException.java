package Exceptions_;

class Myexception extends Exception
{
	public Myexception(String s) 
	{
		 super(s);
	}
}
public class UserDefinedException {

	public static void main(String[] args) {
		try
		{
			//String FirstName="Akshitha";
			//String LastName ="Srinivas";
			String FirstName="";
			String LastName ="Srinivas";
			String name=CheckName(FirstName, LastName);
			System.out.println(name);
		}
		catch (Myexception e)
		{
			 System.out.println(e.getMessage());
		}
	}
	public static String CheckName(String FirstName,String LastName) throws Myexception
	{
		if(FirstName=="" || LastName=="")
		//if(FirstName==null && SecondName==null)
		{
			throw new Myexception("UserDefinedException");
		}
		else
		{
			return (FirstName+LastName);
		}
	}
}
