/**
* Write a description of class rectangle here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class rectangle
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;

    /**
    * Constructor for objects of class rectangle
    */
    public rectangle(int height, int lenght)
    {
        // initialise instance variables
        x = lenght;
        y = height;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public int area()
    {
        // put your code here
        return x*y;
    }
}
