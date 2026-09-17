import java.util.*;

class arraylist {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();//Moreover its like Array but it has some methods , only wrapper class and dynamic size not fixed 

        for (int i = 0; i < 10; i++) {
            list.add(i);
            System.out.print(i + " ");
        }

        System.out.println();
       
		
		System.out.println(list.get(4));//Get the value at that Specified Index
		list.set(0,100);//set the Value replace with that specified value
	    list.remove(4);//Remove the value at the Index
		 System.out.println(list);
		
    }
}
	