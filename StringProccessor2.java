
public class StringProccessor2



{
    public static String front2(String str)
  {
   String last2 = str.substring(str.length()-2);
   String firstPart = str.substring(0,str.length()-2); 
   return last2+firstPart; 
  }

    public static String withoutEnds(String str)
    {
     return str.substring(1, str.length()-1);
     
    

    } 
    
  
    }
    