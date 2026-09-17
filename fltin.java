import java.util.Scanner ;

class fltans 
/*  indicates that you can name it anything.
    When you execute it use this name.
	JVM is interested only in class name.
	The file name is for storge purpose only.

*/
{
   public static void main(String args[])
   {
	   
	int a = 0 , b = 0 ;
	float c = 0.0f ;

     Scanner input = new Scanner( System.in ) ;
	 System.out.println("Divide Two Numbers") ;
	 System.out.print("Give a : ") ;
	 a = input.nextInt() ;
	 System.out.print("Give b : ") ;
	 b = input.nextInt() ;
	 c = (float) a / (float) b ;
	 System.out.println(a + " / " + b + " = " + c );
	 System.out.printf("\n%d / %d = %6.2f", a, b, c );
   }
}