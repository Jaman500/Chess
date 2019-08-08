
/**
 * Write a description of class Board here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Board
{
    // instance variables - replace the example below with your own
    private char[][] board;

    /**
     * Constructor for objects of class Board
     */
    public Board()
    {
        board = new char[8][8];
        for(int o = 2; o < 6; o++)
        {
            for(int i = 0; i < 8; i++)
            {
                board[o][i] = ' ';
            }
        }
        for(int i = 0; i < 8; i++)
        {
            board[0][i] = 'P';
            board[7][i] = 'P';
        }
        board[1][0] = 'R'; board[1][7] = 'R'; board[6][0] = 'R'; board[6][7] = 'R';
        board[1][1] = 'B'; board[1][6] = 'B'; board[6][1] = 'B'; board[6][6] = 'B';
        board[1][2] = 'K'; board[1][5] = 'K'; board[6][2] = 'K'; board[6][5] = 'K';
        board[1][3] = 'Q'; board[6][4] = 'Q';
        board[1][4] = 'M'; board[6][3] = 'M';
    }

    public char[][] getBoard()
    {
        return board;
    }
    
    public void printBoard()
    {
        sop("-----------------------------------");
        sop("|A| " +board[0][0]+" | "+board[0][1]+" | "+board[0][2]+" | "+board[0][3]+" | "+board[0][4]+" | "+board[0][5]+" | "+board[0][6]+" | "+board[0][7]+" |");
        sop("-----------------------------------");
        sop("|B| " +board[1][0]+" | "+board[1][1]+" | "+board[1][2]+" | "+board[1][3]+" | "+board[1][4]+" | "+board[1][5]+" | "+board[1][6]+" | "+board[1][7]+" |");
        sop("-----------------------------------");
        sop("|C| " +board[2][0]+" | "+board[2][1]+" | "+board[2][2]+" | "+board[2][3]+" | "+board[2][4]+" | "+board[2][5]+" | "+board[2][6]+" | "+board[2][7]+" |");
        sop("-----------------------------------");
        sop("|D| " +board[3][0]+" | "+board[3][1]+" | "+board[3][2]+" | "+board[3][3]+" | "+board[3][4]+" | "+board[3][5]+" | "+board[3][6]+" | "+board[3][7]+" |");
        sop("-----------------------------------");
        sop("|E| " +board[4][0]+" | "+board[4][1]+" | "+board[4][2]+" | "+board[4][3]+" | "+board[4][4]+" | "+board[4][5]+" | "+board[4][6]+" | "+board[4][7]+" |");
        sop("-----------------------------------");
        sop("|F| " +board[5][0]+" | "+board[5][1]+" | "+board[5][2]+" | "+board[5][3]+" | "+board[5][4]+" | "+board[5][5]+" | "+board[5][6]+" | "+board[5][7]+" |");
        sop("-----------------------------------");
        sop("|G| " +board[6][0]+" | "+board[6][1]+" | "+board[6][2]+" | "+board[6][3]+" | "+board[6][4]+" | "+board[6][5]+" | "+board[6][6]+" | "+board[6][7]+" |");
        sop("-----------------------------------");
        sop("|H| " +board[7][0]+" | "+board[7][1]+" | "+board[7][2]+" | "+board[7][3]+" | "+board[7][4]+" | "+board[7][5]+" | "+board[7][6]+" | "+board[7][7]+" |");
        sop("-----------------------------------");
        sop("| | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |");
        sop("-----------------------------------");
    }
    
    public void sop(String x)
    {
        System.out.println(x);
    }
    
    //i sure hope this works
}
