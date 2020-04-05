package MyPackage;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

public class Date {
   

	public static void main(String[] args) {
		
DateTimeFormatter jineh = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
System.out.println(jineh.format(LocalDateTime.now())); 

		    }

		

	}


