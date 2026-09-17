import java.util.Scanner;
class namelength
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		String name,trimname;
		System.out.print("Enter Any word:");
		name=input.nextLine();
		trimname=name.trim();//trim the space  in end/begginning of the String 
	    System.out.print("Trimmed Name:"+trimname);
		System.out.print("The length of the name"+name.length());
	}//psvm ends
}//class ends