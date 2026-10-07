import java.util.Scanner;
class exceptionalhandling
{
	static Scanner input=new Scanner(System.in);
   public static void main(String args[])
  {
	  int a=0,b=0;
	  try
	  {
		   a=input.nextInt();
		b=input.nextInt();
	   System.out.print(a/b);
		  
	  }
	   catch(ArithmeticException err)   //Arithmetic 
	  {
		  System.out.print("Arithmetic Exception Occured");
		  
	  }
	  catch (Exception err)      //General Exception
	  {
		  
		  System.out.print("Something went wrong");
		  
	  }
	  System.out.print(" You are continuing");
	 
	  finally
	  {
		  System.out.print("finally");
	  }
	  
	 
	  
	  
  }
}