package localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class LocalDateToDate {

	/*
	 * java.util.Date - date + time + timezone java.time.LocalDate - only date
	 * 
	 * 
	 */
	public static void main(String[] args) {
		LocalDate ldate = LocalDate.of(2018, 06, 06);
		System.out.println(Date.from(ldate.atStartOfDay(ZoneId.systemDefault()).toInstant()));

		// Instant is intermediate class for these two APIs

		LocalDateTime localDateTime = ldate.atTime(LocalTime.now());
		System.out.println(Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant()));

		Date date = new Date();
		System.out.println(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
		System.out.println(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
	}

}
