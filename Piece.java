
/**
 * Abstract class Piece - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Piece
{
    // instance variables - replace the example below with your own
    private int value;
    private boolean dead;
    
    public Piece()
    {
        dead = false;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public boolean getDead()
    {
        return dead;
    }
    //moves the piece
    public abstract void move();
    //kills other pieces
    public abstract void kill();
    //checks to see if the move is valid
    public abstract boolean isValid();
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
}
