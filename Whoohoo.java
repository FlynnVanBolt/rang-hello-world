package com.rang.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public final class Foo {

	private static DateTimeFormatter dateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
	private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
	private static DateTimeFormatter timeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);

	private Foo() {
		// This class is never instaciated
	}

	public static String localDate2string(LocalDate date) {
		return date.format(dateFormatter);
	}

	public static String localDateTime2string(LocalDateTime dateTime) {
		return dateTime.format(dateTimeFormatter);
	}

	public static String localTime2string(LocalTime time) {
		return time.format(timeFormatter);
	}

	public static String localDate2string(LocalDate date, FormatStyle style) {
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(style);
		return date.format(formatter);
	}

	public static String localDateTime2string(LocalDateTime dateTime, FormatStyle style) {
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(style);
		return dateTime.format(formatter);
	}
	
	public static String zonedDateTime2string(ZonedDateTime dateTime, FormatStyle style) {
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(style);
		return dateTime.format(formatter);
	}

	public static String localTime2string(LocalTime time, FormatStyle style) {
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(style);
		return time.format(formatter);
	}

	public static void main(String[] args) {

		System.out.println("Date 1:     " + localDate2string(LocalDate.now(), FormatStyle.FULL));
		System.out.println("Date 2:     " + localDate2string(LocalDate.now(), FormatStyle.LONG));
		System.out.println("Date 3:     " + localDate2string(LocalDate.now(), FormatStyle.MEDIUM));
		System.out.println("Date 4:     " + localDate2string(LocalDate.now(), FormatStyle.SHORT));
		System.out.println();
		System.out.println("DateTime 1: " + zonedDateTime2string(ZonedDateTime.now(), FormatStyle.FULL));
		System.out.println("DateTime 2: " + zonedDateTime2string(ZonedDateTime.now(), FormatStyle.LONG));
		System.out.println("DateTime 3: " + localDateTime2string(LocalDateTime.now(), FormatStyle.MEDIUM));
		System.out.println("DateTime 4: " + localDateTime2string(LocalDateTime.now(), FormatStyle.SHORT));
		System.out.println();
		//System.out.println("Time 1:     " + localTime2string(LocalTime.now(), FormatStyle.FULL));
		//System.out.println("Time 2:     " + localTime2string(LocalTime.now(), FormatStyle.LONG));
		System.out.println("Time 3:     " + localTime2string(LocalTime.now(), FormatStyle.MEDIUM));
		System.out.println("Time 4:     " + localTime2string(LocalTime.now(), FormatStyle.SHORT));

	}
}
