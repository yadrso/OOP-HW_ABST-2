import java.time.LocalDateTime;
import java.util.Locale;

public class SmartLogger implements Logger {
    private int counter = 1;
    @Override
    public void log(String msg) {
        System.out.printf("%s#%d [%s] %s\n",
                msg.toLowerCase().contains("ошибка") ? "ERROR" : "INFO",
                counter,
                LocalDateTime.now(),
                msg);
        counter ++;

    }
}
