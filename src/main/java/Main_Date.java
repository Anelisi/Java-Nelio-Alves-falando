import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main_Date {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = Date.from(Instant.parse("2020-10-12T10:33:00Z"));
        System.out.println(sdf.format(date));

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        date = cal.getTime();
        int minuto = cal.get(Calendar.MINUTE);
        int mes = 1 + cal.get(Calendar.MONTH);
        System.out.println(sdf.format(date));
        System.out.println("minutos =  " + minuto);
        System.out.println("mês = " + mes);

    }
}
