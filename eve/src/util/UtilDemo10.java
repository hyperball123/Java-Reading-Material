package util;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class UtilDemo10 {
	public static void main(String[] args) {
		LocalDate currentDate=LocalDate.now();
		
		System.out.println(currentDate);
		LocalDate nextDate=currentDate.plus(2,ChronoUnit.DAYS);
		
		System.out.println(nextDate);
		
	//	Duration n=Duration.between(currentDate, nextDate);
	//	System.out.println(n);
		
		LocalTime currentTime=LocalTime.now();
		
		System.out.println(currentTime);
		
		LocalTime nextTime=currentTime.plusHours(10);
		System.out.println(nextTime);
		
		Duration n=Duration.between(currentTime, nextTime);
		System.out.println(n.toHours());
	}
}
