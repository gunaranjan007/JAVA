class Parent
{
	public int savings=5000,maleChild_savings=2000,femaleChild_savings=3000;  //Declared Data Members in Static block
	
	char relation;
	int Parentasset=0;
	Parent(char relation)
	{
		this.relation=relation;
	}
	public void Calculation(char relation)
	{
		if(relation=='w'||relation=='W')
		{
		  Parentasset=savings+maleChild_savings+femaleChild_savings;
		       System.out.print("The Asset money is"+Parentasset);
		}
	}
}
class Child extends Parent//Single Inheritance 
{
	int Childsavings=1000;
	int Childasset=0;
	
	Child(char relation)//Constructor 
	{
		super(relation);	
	}
	@Override public void Calculation(char relation)
	{
		if(relation=='m'||relation=='M')
			 Childasset=savings+maleChild_savings+Childsavings;
		else if(relation=='f'||relation=='F')
			Childasset=savings+femaleChild_savings+Childsavings;
		
	    System.out.print("The Assest Money is "+Childasset);
	}
}
public class savings
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		int childrens=0;
		
		System.out.print("How many childrens :");
		childrens=input.nextInt();
		Child heir = new Child('f');
		if(childrens>0)
		    Child heir = new Child('f');
		
		else
			Parent heir = new Parent('w');
			
		if(heir instanceof Child) //Instanceof operator is used for check object(instance )	belong to which class		
			heir.Calculation('f');
		else if(heir instanceof Parent)
			heir.Calculation('f');
	}
}
