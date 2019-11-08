
/**
 * Write a description of class GunStrength here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class gunSelect
{
    private int amountAmo;
    private int gunRating;
    /**
     * out of 10
     */
    private double hitPoints;

    public gunSelect()
    {
       amountAmo = 10;
       gunRating = 10;
       hitPoints = 20;
     
    }
    public gunSelect(int amo, int rating, double hit)
    {
        amountAmo = amo;
        gunRating = rating;
        hitPoints = hit;
    }
    public int getAmo()
    {
        return amountAmo;
    }
    public double getDamage()
    {
    return hitPoints;
    }
    public String toString()
    {
        String gunsData = "This gun has" + amountAmo+ "bullets";
        gunsData += "And does" + hitPoints + "damage per shot";
        gunsData+= "This guns grade is" + (hitPoints * amountAmo);
        return gunsData;
        
    }
}   