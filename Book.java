

public class Book
{
    private String title;
    private int pgNum;
    private String author;
    
  
    public Book(String t, String a, int p)
    {
        title = t;
        pgNum = p;
        author = a;
        
    }
    public int getPgNum()
    {
      return pgNum;
    }
    public String getName()
    {
      return title;
    }
    public String getAuthor()
    {  
     return author;
     }
    public string toString()
    {
     String objectsData = "Title:" + title;
     String objectsData += "Author:" + author;
     
     
    }