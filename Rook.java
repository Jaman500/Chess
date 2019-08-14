
/**
 * Write a description of class Rook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rook extends Piece
{
    // instance variables - replace the example be
    private int value;

    /**
     * Constructor for objects of class Rook
     */
    public Rook()
    {
        super();
        value = 5;
    }
    
    //rook can move in a straight line forwards, backwards, or sideways
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
        System.out.println("♜");
    }
}
