import java.util.Scanner;
class Stringbuilder
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.print("Enter your Place :");
		String place="tambaram";
		
	//StringBuilder -character in the StringBuilder can be changeable in any number of times (mutable)
		
		StringBuilder sb=new StringBuilder(10);//string builder 10 characters
	
		System.out.println(sb.append(place));//append method to add the String in the Stringbuilder 
		
		System.out.println(sb.insert(1,"h"));//insert value in our desired place
		
		System.out.println(sb.deleteCharAt(4));//delete particular index of character
		
		System.out.println(sb.delete(1,5));//delete a sequence of string 
		
		System.out.println("Replace"+sb.replace(0,2,"jah"));//To replace the builder with  current 
	
		sb.setCharAt(2,'b');//setCharAt void so do the changes and print the sb
		System.out.println(sb);

        System.out.println(sb.length());//to find length of the string 
		
		System.out.println("substring "+sb.substring(2));//some part of string 
		
		System.out.println("substring "+sb.substring(0,4));
		
		String tostring=sb.toString();
		System.out.print(tostring);//converts the string builder to string 
		
		System.out.println(sb.charAt(2));// tells the character in that specified index
		
		System.out.println(sb.indexOf("b"));//tells the index of given character 
	
		System.out.println(sb.lastIndexOf("b"));//return the last index of the string which has been specifed 
		//StringBuilder sb=new StringBuilder("guna");//creating an string from stringbuilder
	    // System.out.println(sb);
	}
		
	
}
	