
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateFromWeb {

    public static void main(String[] args) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());

        System.out.println(((SimpleDateFormat) formatter).format(date));
    }

    public class CurrentDateTimeExample2 {
        public void main(String[] args) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date));
        }
    }
}
