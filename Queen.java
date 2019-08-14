
/**
 * Write a description of class Queen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Queen extends Piece
{
    // instance variables - replace the example below with your own
    private int value;

    /**
     * Constructor for objects of class Queen
     */
    public Queen()
    {
        super();
        value = 9;
    }

    //Queens can move in any direction 
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
        System.out.println("♛");
    }
}
