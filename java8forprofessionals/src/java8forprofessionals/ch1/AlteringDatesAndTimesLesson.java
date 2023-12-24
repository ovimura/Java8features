package java8forprofessionals.ch1;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class AlteringDatesAndTimesLesson {
	public static void main(String[] args) {
		LocalDateTime ldt1 = LocalDateTime.now();
		
		LocalDateTime ldt2 = ldt1.plusDays(7);
		System.out.println(ldt2);
		
		LocalDateTime ldt3 = ldt1.plusMinutes(7);
		System.out.println(ldt3);
		
		LocalDateTime ldt4 = ldt1.withMonth(9);
		System.out.println(ldt4);
		
		LocalDateTime ldt5 = ldt1.plus(Period.ofWeeks(1));
		System.out.println(ldt5);
		
		LocalDateTime ldt6 = ldt1.minus(Duration.ofHours(12));
		System.out.println(ldt6);
		
		LocalDateTime ldt7 = ldt1.withMonth(9);
		System.out.println(ldt7);
	}
}
