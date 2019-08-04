
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Player
{
    // instance variables - replace the example below with your own
    private int score;
    private char color;
    Scanner sc = new Scanner(System.in);
    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        score = 0;
        color = 'W';
    }
    
    public void chooseMove()
    {
        sop("Enter the coordinates of the piece you would like to move");
        String loc = sc.nextLine();
        String a = loc.substring(0,1);
        String b = loc.substring(1);
        
    }
    
    public void help()
    {
        sop("");
    }
    
    public void sop(String x)
    {
        System.out.println(x);
    }
}
