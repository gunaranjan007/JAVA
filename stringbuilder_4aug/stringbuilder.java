import java.util.Scanner;
class Stringbuilder
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String name="sivasakthi";
		String place="chennai";

		StringBuilder sb=new StringBuilder();
		
		sb.append(name);
		
		System.out.print(sb.length());
		
		System.out.println(sb.capacity());
		
		System.out.println(sb.append(place));
		
		System.out.println("Length :"+sb.length());
		
		System.out.println("Capacity :"+sb.capacity());
		
	}
}