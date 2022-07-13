package Exceptions_;

class Valid {
	static void Validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not Valid");
		}
		else
		{
			System.out.println("You can Vote");
		}
	}
}
class Throw{
	public static void main(String[] args) 
	{
		 Valid.Validate(13);
		 System.out.println("Vote");
	}

}

