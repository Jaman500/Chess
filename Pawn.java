
/**
 * Write a description of class Pawn here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pawn extends Piece
{
    // instance variables - replace the example below with your own
    private int value;
    private boolean firstMove;
    /**
     * Constructor for objects of class Pawn
     */
    public Pawn()
    {
        super();
        value = 1;
        firstMove = true;
    }
    
    /*pawns can move one or two spaces forward if it's the initial move. 
     * if it's not the first move, then they can move one space forward at a time
     * or they can go for a kill move which is one space diagonally
     */
    public void move()
    {
        if(firstMove == true)
        {
            //do the move
            firstMove = false;
        }
        else
        {
            //moves forward one space
        }
    }
    
    public void openMoves(Board b)
    {
        
    }
    public void kill()
    {
        //moves diagonally one space
    }
    
    public boolean isValid()
    {
        
        return false;
    }
    
    public void print()
    {
        System.out.println("♟");
    }
}
