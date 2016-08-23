/**
* Exercise 2.61
*/

public class Person
{
    //  Ex. 2.61 fields 
    private int age;
    private String name;
    public String eyeColor;
    public int heightInCm;
            
   /**
    * Constructor
    */ 
    public Person(String myName, int myAge)
    {
        name = myName;
        age = myAge ;
        heightInCm = 172;
        eyeColor = "Brown" ;
    }
    
    public String getName()
    {
        return name;
    }   
    
    public int setAge(int age){
        return age;
    }
           
    
    public void speak()
    {
        System.out.println("Hello, my name is "+name);
        System.out.println("I am "+age+" years old");
        System.out.println();
        
    }
    
    public void sleep() { 
    System.out.println("Sleeping ....");
    }

    public void walk() { 
    System.out.println("Walking ....");
    }
    
    public void eat() { 
    System.out.println("Eating ....");
    }
}


