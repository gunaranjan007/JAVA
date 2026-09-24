import java.util.Scanner;
import java.util.ArrayList ;

class arrayList
{
  public static void main(String args[])
  {
    ArrayList<String>  nams = new ArrayList<String>() ;

        nams.add("Siva") ;
    nams.add("Nandhi") ;
        nams.add("Sakthi") ;
        nams.add("Vignesh") ;
     System.out.println(nams);
    
      nams.add(1,"Vishnu") ;
    System.out.println(nams);
    
    for( int i = 0 ; i < nams.size() ; ++i)
      System.out.println(nams.get(i));

        String sn = "Siva" ;
    /*nams.remove(sn) ;
    System.out.println(nams);
         */
     
    nams.set(4, "Luxmi") ; 

    nams.removeIf(s -> s.length() < 6 ) ;
    System.out.println(nams);    
    
    nams.clear() ;

    System.out.println(nams);    



  }