
//This class implements a method where date in converted into a certain string format. 
public class ToString 
{
    private int day;
    private int month;
    private int year;


    public ToString (int d, int m, int y)
    {
        if (d < 1 || d >33)
        {
          System.out.println("Your day in invalid; the extra day is going to be added in month.");
          day = d - 30;
          m = m + d/30; 
        }
        else 
        {
          day = d;
        }
        
        if (m < 1 || m >12)
        {
          System.out.println("Your month in invalid; the extra month is going to be added in year.");
          month = m - 12;
          y = y + m/12; 
        }
        else 
        {
          month = m;
        }
  
        year = y;
    }
    
    public  String timeInString()
    {
        return String.format("%02d/%02d/%02d", month, day, year);
    }
}
