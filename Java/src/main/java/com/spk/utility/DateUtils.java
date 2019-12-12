package com.spk.utility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Stream;
/**
 * @author Praveen
 *
 */
public class DateUtils {
	public static long DaysBetween(LocalDate startDate, LocalDate endDate) {
		return ChronoUnit.DAYS.between(startDate, endDate);
	}

	public static long HoursBetween(LocalDateTime startDate, LocalDateTime endDate) {
		return ChronoUnit.HOURS.between(startDate, endDate);
	}

	public static long MinsBetween(LocalDateTime startDate, LocalDateTime endDate) {
		return ChronoUnit.MINUTES.between(startDate, endDate);
	}

	public static long SecondsBetween(LocalDateTime startDate, LocalDateTime endDate) {
		return ChronoUnit.SECONDS.between(startDate, endDate);
	}

	public static long WeeksBetween(LocalDate startDate, LocalDate endDate) {
		return ChronoUnit.WEEKS.between(startDate, endDate);
	}

	public static long DaysBetween(LocalDate startDate, LocalDate endDate, List skipDays) {
		return Stream.iterate(startDate, d -> d.plusDays(1)).limit(startDate.until(endDate, ChronoUnit.DAYS))
				.filter(d -> !skipDays.contains(d.getDayOfWeek())).count();
	}

	public static void main(String[] args) {
		System.out.println();
		LocalDate startDate = LocalDate.parse("2019-02-10");
		LocalDate endDate = LocalDate.parse("2019-05-25");

		System.out.println(DaysBetween(startDate, endDate));

	}

}