import java.util.*;

class iteratorlist {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) 
	    {
            list.add(i);
            System.out.print(i + " ");
        }
		Iterator<Integer> i=list.iterator();//Integer wrapper class //Iteraor is like the book mark of a book
		while(i.hasNext())// return true if some value is next otherwise false 
		{
			System.out.print(i.next());// i.next() ,i.hasNext(),i.remove()is a method of class Iterator
		}

        System.out.println();
  
    }
}
	