import java.util.Scanner;
class trycatchfinally
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
	  catch(ArrayIndexOutOfBoundsException | ArithmeticException  err)
	  {
		  System.out.print("Exception Occured"+ err.getMessage());//Specifies an message from java 
		  
	  }
	  finally
	  {
		  System.out.print("finally");
	  }
	  
	 
	  
	  
  }
}