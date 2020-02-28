
/**
 * Write a description of class SuperMario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SuperMario extends Character
{
    private String outfit;
    public SuperMario()
    {
        super();
        outfit = "Overalls";
    }
    public SuperMario(String playerN, int x, int y, String outfit)
    {
        super(playerN, x, y);// constructor
        this.outfit = outfit;
    }
    public void swim()
    {
        int x = super.getX() + 1;
        int y = super.getY() + 1;
        super.setX(x);
        super.setY(y);
    }
    
}

