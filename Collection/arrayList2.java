import java.util.Scanner;
import java.util.ArrayList ;

class arrayList2
{
  public static void main(String args[])
  {
    ArrayList<Integer>  nums = new ArrayList<Integer>() ;
    
    for (int i = 0 ; i < 23 ; i+=2)
      nums.add(i);
    
    System.out.println(nums);
    
    nums.removeIf( n -> ( ( n %  4 ) == 0) ) ;
    
    System.out.println(nums);    



  }
}