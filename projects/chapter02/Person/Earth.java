
/**
 * Write a description of class Earth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Earth
{
    public static void main(String args[]){
        Person tom;
        
        tom = new Person("Tom",26);
        tom.eyeColor = "Blue";
        tom.heightInCm=155;
        
        tom.speak();
        
        Person joe = new Person("Joe",56);
                
        tom = new Person("Tom",26);
        tom.eyeColor = "Blue";
        tom.heightInCm=155;
        
        tom.speak();
        joe.speak();

    }
}