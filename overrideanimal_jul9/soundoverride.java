class Animal
{
	String name;
	Animal(String name)//constructor
	{
		this.name=name;
	}
	public void makesound(String name)                         //rule: should have same return datatype for both method
	{
		
		System.out.print(name+" I am an Animal"); 
	}
}//Animal class ends

class Dog extends Animal
{
	Dog(String name)
	{
		super(name);
	}
	public void makesound(String name)
	{
		super.makesound(name);
		System.out.print(name+" make a sound Wow wow");
	}
}//sub class Dog ends 

public class soundoverride
{
	public static void main(String args[])
	{
		Dog jimmy=new Dog("jimmy");
		jimmy.makesound("jimmy");
	}
}//public class Ends
	
		
		
		
		
		
	