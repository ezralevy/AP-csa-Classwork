

/**
 * Classwork 8: Practice Assessment Problems 11 and 12
 */
public class Classwork8
{
    public static void main(String[] args)
    {
        // text your methods here
        
         
    }
    
   // Dirtbike racing code
    public static boolean raceToday(int size, boolean isFriday) 
    {               
        if (size >= 150 && size <= 800 && isFriday == true)
        return true;
        else 
        return false;
     
    }
    
    /** Question 12: Define a function to determine if a number entered is even, then returns that number times 5.
     * If
    ** the number entered is odd and is divisible by 5, then the function returns that number divided by five. If the 
    ** number is odd and is not divisible by 5, then the function returns three times that number. 
    **
    **@param number the number that determines the outputs to the function
    **
    **@return five times number if the number is even, number/five if number is odd and 
    ** divisible by five, and three times number if the number is odd and not divisible by five
    **/

    public static int numValue(int number)
    {               
      if (number % 2== 0)
        return 5*number;
      else if (number % 5 == 1)
        return number/5;
        else
        return 3*number;
      
    }
}
