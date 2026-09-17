class Student_name //Base class (Grand father class)
{
	String name;
	protected int rollno;
	
	Student_name(String name,int rollno) //Constructor of base class 
	{
		this.name=name;
		this.rollno=rollno;
	}
	
}
class Student_mark extends Student_name
{
	protected int mark1=0,mark2=0,mark3=0,mark4=0,mark5=0;
	String tam,eng,mat,sci,soc;
	
	Student_mark(String name,int rollno,int mark1,int mark2, int mark3,int mark4, int mark5)//constructor of a subclass 
	{
		super(name,rollno);
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		this.mark4=mark4;
		this.mark5=mark5;
		
	}
	
	public void Checkresult()
	{
		
		 tam=Markevaluation(mark1);
		 eng=Markevaluation(mark2);
		 mat=Markevaluation(mark3);
		 sci=Markevaluation(mark4);
		 soc=Markevaluation(mark5);
	}
		
		
	private String Markevaluation(int dmark)
	{
		String result;
		if(dmark>=35)
			result="pass";
		else
			result="fail";
	return(result);
	}
	
			
}
class Student_details extends Student_mark // Grand child class 
{
	protected int Pet_parcticalmrk=0, Pet_theorymrk=0;
	String status;

	Student_details(String name,int rollno,int mark1,int mark2, int mark3,int mark4, int mark5,int Pet_parcticalmrk,int Pet_theorymrk )
	{
		super(name,rollno,mark1,mark2,mark3,mark4,mark5);//super keyword is used to access the data members from the base class or upper class 
		
		this.Pet_parcticalmrk=Pet_parcticalmrk;
		this.Pet_theorymrk=Pet_theorymrk;
		
	}//derived sub class ends 
		
		
	public void sportscota_eligible()
	{
	
		if((Pet_parcticalmrk>=50 && Pet_parcticalmrk<=60) && (Pet_theorymrk>=30 && Pet_theorymrk<=40))
			status="Eligible";
		else
			status="Not Eligible";
	}
	
	public void displaydetails()
	{
		
		
		Checkresult();//from 2nd class  Because class can call from anywhere 
		sportscota_eligible();
		
	    System.out.println("Name :"+name);
		System.out.println("Roll number:"+rollno);
		System.out.println("Result of  Subject Tamil:"+tam);
		System.out.println("Result of subject English :"+ eng);
		System.out.println("Result of subject Maths :"+ mat);
		System.out.println("Result of subject Science  :"+ sci);
		System.out.println("Result of subject Social :"+ soc);
		System.out.println("The STATUS of Sports COTA:"+status);		
	}
}
public class Studentmultiinherent
{
	public static void main(String args[])
	{
		Student_details stu1=new Student_details("guna",101,32,98,67,75,49,50,32);
		Student_details stu2=new Student_details("ragul",102,67,89,49,34,88,45,23);
		
		stu1.displaydetails();
		System.out.println();
		stu2.displaydetails();
		
	}
}
		
		
		
		
	
