
/**
 * Write a description of class Bishop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bishop extends Piece
{
    // instance variables - replace the example below with your own
    private int value;

    /**
     * Constructor for objects of class Bishop
     */
    public Bishop()
    {
        super();
        value = 3;
    }

    //bishops can move in a diagonal straight line
    public void move()
    {
    }
    
    public void kill()
    {
    }
    
    public boolean isValid()
    {
        return false;
    }
    
    public void print()
    {
        System.out.println("♝");
    }
}
