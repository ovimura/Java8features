package java8forprofessionals.ch1;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.LocalDateTime;

public class DatesAndTimes {

	
	public static void main(String [] args) {
		// Date
		LocalDate ld1 = LocalDate.now();
		LocalDate ld2 = LocalDate.of(2014, 3, 17);
		LocalDate ld3 = LocalDate.of(2022, Month.DECEMBER, 25);
		
		System.out.println(ld1);
		System.out.println(ld2);
		System.out.println(ld3);

		// invalid date
		// LocalDate invalidDate = LocalDate.of(2022, 13, 1);
		
		LocalTime lt1 = LocalTime.now();
		LocalTime lt2 = LocalTime.of(10, 5);
		
		System.out.println(lt1);
		System.out.println(lt2);
		
		// DateTime
		LocalDateTime ldt1 = LocalDateTime.now();
		LocalDateTime ldt2 = LocalDateTime.of(2022, 2, 1, 2, 3);
		LocalDateTime ldt3 = LocalDateTime.of(ld1, lt1);
		System.out.println(ldt1);
		System.out.println(ldt2);
		System.out.println(ldt3);
		
		// MonthDay
		MonthDay monthDay = MonthDay.of(7, 8);
		LocalDate newLocalDate = monthDay.atYear(2022);
		
		System.out.println(monthDay);
		System.out.println(newLocalDate);
		
		// YearMonth
		YearMonth yearMonth = YearMonth.now();
		LocalDate yearMonthLocalDate = yearMonth.atDay(8);

		System.out.println(yearMonth);
		System.out.println(yearMonthLocalDate);
	}
}
