package Exceptions_;

//BufferedReader
import java.io.*;
public class Buffer_Reader {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Name : ");
		String name=br.readLine();
		System.out.println("Enter the age : ");
		int age=Integer.parseInt(br.readLine());
		System.out.println("Enter the Percentage : ");
		float per=Float.parseFloat(br.readLine());
		System.out.println("Name : "+name+"\nAge :"+age+"\nPercentage : "+per);
		
	}

}
