
/**
 * Write a description of class King here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class King extends Piece
{
    // instance variables - replace the example below with your own
    private int value;
    private boolean check;
    /**
     * Constructor for objects of class King
     */
    public King()
    {
        super();
        value = 4;
        check = false;
    }
    
    /*
     * Kings can move one space in any direction as long as 
     */
    public void move()
    {
        if(check == false)
        {
            //any move will work
        }
        else
        {
            //only moves which will result in check = true will work
            check = true;
        }
    }
    
    public void kill()
    {
    }
    
    public boolean isValid()
    {
        return false;
    }
    
    /*
     * checks if king is in checkmate.
     * if true, game is over
     */
    public boolean checkMate()
    {
        return false;
    }
    
    public void print()
    {
        System.out.println("♚");
    }
}
