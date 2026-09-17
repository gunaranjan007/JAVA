import java.util.Scanner ;

class Getin  // program to add two numbers
{
   public static void main( String args[] )
   {
	int n1 = 0 , n2 = 0, sum = 0 ;

    Scanner input = new Scanner( System.in ) ;  // declare input class
	 
	 System.out.print("Give number 1 : ") ;
	 n1 = input.nextInt() ;

	 System.out.print("Give number 2 : ") ;
	 n2 = input.nextInt() ;
	 
	 sum = n1 + n2 ;
	 System.out.println( n1 + " + " + n2 + " = " + sum ) ;
	 System.out.println( "Total is = " + sum ) ;
	 System.out.printf( "\nTotal of %d + %d  = %d \n", n1, n2, sum ) ;
	 
	 
	 
   }  // PSVM ends
    
}  //  Clss Ends