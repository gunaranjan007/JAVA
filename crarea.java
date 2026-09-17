import java.util.Scanner ;

class crarea
/*  indicates that you can name it anything.
    When you execute it use this name.
	JVM is interested only in class name.
	The file name is for storge purpose only.

*/
{
   public static void main(String args[])
   {
	   
	int radius = 0  ;
	//double area = 0.0f ;
	int area = 0 ;

     Scanner input = new Scanner( System.in ) ;
	 System.out.println("Area of a Circle\n\n") ;
	 System.out.print("Give radius : ") ;
	 radius = input.nextInt() ;
	 
	 //area = 3.14 * (double) radius * (double) radius ;
	 area = (int) ( 3.14 *  radius *  radius ) ;
	 //System.out.println(a + " / " + b + " = " + c );
	 //System.out.printf("\n for %d ( radius ) area is =  %7.2f", radius,area );
	 System.out.printf("\n for %d ( radius ) area is =  %d", radius,area );
	 
   }
}