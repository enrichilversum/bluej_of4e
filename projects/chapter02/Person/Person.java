/**
* Exercise 2.61
*/

public class Person
{
	//  Ex. 2.61 fields 
	private int age;
	private String name;
		
	public Person(String myName, int myAge)
	{
		name = myName;
		age = myAge ;
	}
	
	public String getName()
	{
		return name;
	}	
	
	public int setAge(int age){
		return age;
	}
		
	public void printDetails()
	{
		System.out.println("The name of this person is "+name);
		System.out.println(", aged "+age+" years");
		System.out.println();
		
	}
	
}


