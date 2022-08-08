
// Thats not workink
// Não está funcionando
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.*;

public class Calendar {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07z")); // utc

        System.out.println(sdf.format(d));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        
        //calendar.add(Calendar.HOUR_OF_DAY, 4);
        //d = calendar.getTime();
        //System.out.println(sdf.format(d));
        
        //int minutes = calendar.get(Calendar.MINUTE);
        //int month = 1+ calendar.get(Calendar.MONTH); // "1 +" por que o Calendar começa em 0 = janeiro
        //System.out.println("Minutes: " + minutes);
        //System.out.println("Month: " + month);

        
    }

    private Date getTime() {
        return null;
    }

    private void setTime(Date d) {
    }

    private static Calendar getInstance() {
        return null;
    }
} 
