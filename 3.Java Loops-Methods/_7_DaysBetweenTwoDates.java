import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class _7_DaysBetweenTwoDates {
	
	public static void main(String[]args) throws ParseException{
		
	System.out.print("Insert first date : ");
    Scanner s = new Scanner(System.in);
    String start = s.nextLine();
    System.out.print("Insert second date : ");
    String end = s.nextLine();
    
    SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
    Date date1 = myFormat.parse(start);
    Date date2 = myFormat.parse(end);
    System.out.println((int)computeDaysBetweenDates(date1, date2));
    
    }
   
    public static double computeDaysBetweenDates(Date d1, Date d2) {
        long diff;
        diff = d2.getTime() - d1.getTime();
        return ((double) diff) / (86400.0 * 1000.0);
    }
}