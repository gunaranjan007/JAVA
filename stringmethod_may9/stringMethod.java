import java.util.Scanner;
class stringMethod
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		String word= " guna ranjan ";
		String s12="";//must been initiate early
		String s1=word.trim();// Trim the space in end/beginning of the string Method
		int s2=word.length();// Give the length of the String Integer(Integer)
		int s3=word.indexOf("h");//Give the index of the particular element which is Represents(integer)
		int s4=word.lastIndexOf('a');//Give the Last index occurance of the particular  character  which is Represents(integer)
		char  s5=word.charAt(2);//Give the Particular single  Character in the repersented Index (Character)
		String s6=word.replace("a","*");//Replace the specified value of string in given value 
		String []n=s1.split(" ");// splits the String via Seperator(like space , comma , dot etc)(array)
		String s7=word.toLowerCase();//Give the lower case string not consider lower or upper only return enery thing in  lower case
		String s8=word.toUpperCase();//Give the Upper case string
		String s9=word.concat("aaa");//Add the string in end of existing string 
		char[] s10 =word.toCharArray();// Give the string to each  character 
		String s11=word.substring(0,5);//Given the substring based on the start and end index 
		 s12=s12.copyValueOf(n,0,n.length)//write the char array to string //with the optimal given parameter
		System.out.println("Trim:"+s1);
		System.out.println("Length:"+s2);
		System.out.println("Index of given a:"+s3);
		System.out.println("Last Index of given a :"+s4);
		System.out.println("Character of the index(charAt) 2 :"+s5);
		System.out.println("Replace the a with * replace: "+s6);
		System.out.println("Print The Split the String : index 1:"+n[0]+" inedx 1 :"+n[1]);
		System.out.println("The lower case string:"+s7);
		System.out.println("The Upper case string:"+s8);
		System.out.println("Add the string to the end of string:"+s9);
		System.out.println("The character Array:"+s10[8]);
		System.out.println("The substring starts from 0 to 5 is :"+ s11);
		
		
		
		
		
		if(word.isEmpty())//Checks the input string is empty or not 
			System.out.println("RIGHT SOMETHING IT IS BLANK");
		if(s1.startsWith("g"))// Checks if string starts with given element 
			System.out.println("Checks string Starts with g");
		if(s1.startsWith("n"))// Checks if string ends with given element 
			System.out.println("Checks string ends with N");
		
		
	}//psvm ends
}//class ends