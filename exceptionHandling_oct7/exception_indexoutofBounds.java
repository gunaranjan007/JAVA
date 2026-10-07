import java.util.Scanner;
class exception_indexoutofBounds
{
	static Scanner input=new Scanner(System.in);
   public static void main(String args[])
  {
	  int[] arr ={1,2,3,4,5};
	  int index=0;
	  try
	  {    
			System.out.println("Enter index to get an number :");
			index=input.nextInt();
			System.out.print(arr[index]);
	  }
	  catch(ArrayIndexOutOfBoundsException err)  
	  {
		System.out.println(" Array index out of Bounds Exception Occured "+ err.getMessage()+ " is not an available index");//Specifies an message from java                                                          //returns int for ArrayIndexOutOfBoundsException obj.getMessage
		  
	  }
	  finally
	  {
		System.out.println("finally");
	  }
	  
	 
	  
	  
  }
}