
/**
 * Write a description of class Multiplier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Multiplier
{
    // instance variables - replace the example below with your own
    private int start;
    private int stop;
    private int interval;

    /**
     * Constructor for objects of class Multiplier
     */
    public Multiplier(int start, int stop, int interval)
    {
        // initialise instance variables
        this.start = start;
        this.stop = stop;
        this.interval = interval;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void whileLoopTheHeckOutOfIt()
    {
        int i=start;
        
        while((i>=start)&&(i<=stop)) {
            System.out.println(i);
            i=i+interval;
        
        }
    }
}
