
import java.util.*;
public class Arraylist2
{
   public static void main(String[] args)
   {
       ArrayList<String> sports = new ArrayList<String>();
       sports.add("softball");
       sports.add("soccer");
       sports.add("Tennis");
       sports.add("Rowing");
       sports.add("skiing");
       sports.add("Basketball");
       sports.add("Baseball");
       System.out.println("Question 3:" +returnElement(sports,3));
       System.out.println("Question 4:");
       removeThirdElement(sports);
       insertElement(sports, "baseball");
}

public static String returnElement(ArrayList<String> inList, int i)
{
    return inList.get(i);

}

public static void removeThirdElement(ArrayList<String> inList)
{
    inList.remove(2);
    for(int i = 0; i < inList.size();i++)
        System.out.println(inList.get(i));
}
public static void insertElement(ArrayList<String> inList, String sportName)
{ 
    inList.add(0, sportName);
    for(int i = 0; i < inList.size();i++)
        System.out.println(inList.get(i));
}
public static void searchForElement(ArrayList<String>s, String a)
{

    for(int i = 0; i < s.size();i++)
    if (s.get(i) == a)
        System.out.println(i);

}
public static void searchAndCountElement(ArrayList<String> s, String a)
{
 
}
}