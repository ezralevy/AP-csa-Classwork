import java.util.*;
public class CandyLand
{
   
    public static void main(String[] args)
    
    {
   int roll;
   int pos = 0;

    while (pos < 41)
   {
    roll= (int) (Math.random()*8)+1;
     if (roll ==4 || roll == 6)
    
     {
       pos -= roll;
    }
       if (pos<0)
    
       {
           System.out.println("Sheesh you're bad");
           pos += roll;
    }

    else
    {
        pos += roll;
    {   
        if (pos>=41)
        System.out.println("your position is " + pos + " you beat the game!");
    }
    System.out.println("Your player is at " + pos);
    System.out.println("Press return to roll again");
    try {System.in.read();}catch(Exception e) {e.printStackTrace();}
    } 
    
    
   }
  }
 }


