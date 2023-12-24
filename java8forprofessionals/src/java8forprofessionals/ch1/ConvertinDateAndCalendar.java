package java8forprofessionals.ch1;

import java.util.Date;
import java.util.Calendar;
import java.time.ZoneId;
import java.time.LocalDateTime;

public class ConvertinDateAndCalendar {
	public static void main(String[] args) {
		Date date = new Date(122, 5, 10);
		LocalDateTime ldt = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		System.out.println(ldt);
		
		Calendar calendar = Calendar.getInstance();
		LocalDateTime ldt2 = calendar.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		System.out.println(ldt2);
	}
}
