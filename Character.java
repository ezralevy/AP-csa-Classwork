
/**
 * Write a description of class character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Character
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private String playername;
    
    /**
     * Constructor for objects of class character
     */
    public Character()
    {
        // initialise instance variables
        x = 10;
        y = 150;
        playername = "firstnameLastname";
    }
    public Character(String name, int x, int y)
    {
     playername = name;
     x = this.x;
     y = this.y;
    }
    public String getPlayerName()
    {
        return playername;
    }   
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public void setPlayerName(String name)
    {
        playername = name;
    }
    public void setX(int xValue)
    {
        x = xValue;
    }
    public void setY(int yValue)
    {
        y= yValue;
    }
    public String toString()
    {return "player name:" + playername + "position:" + x + y;}
}
