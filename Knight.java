
/**
 * Write a description of class Knight here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Knight extends Piece
{
    // instance variables - replace the example below with your own
    private int value;

    /**
     * Constructor for objects of class Knight
     */
    public Knight()
    {
        super();
        value = 3;
    }
    
    
    /*
     * Knights can move in an L shape
     * they move 2 spaces in one direction, the one in a perpendicular direction
     * they can jump pieces as well
     */
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
        System.out.println("♞");
    }
}
