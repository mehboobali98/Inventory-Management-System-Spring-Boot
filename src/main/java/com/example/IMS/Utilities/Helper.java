package com.example.IMS.Utilities;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Helper {

	private static DateFormat dateFormat;
	public static double highPrecedenceFineRate;
	public static double lowPrecedenceFineRate;

	static {
		dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		highPrecedenceFineRate = 100;
		lowPrecedenceFineRate = 50;
	}

	public static Date convertStringToDate(String date) {
		Date newDate = null;
		try {
			newDate = dateFormat.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return newDate;

	}

	public static String getCurrentTime() {
		Calendar cal = Calendar.getInstance();
		return dateFormat.format(cal.getTime());
	}

	public static String getDueDate(String issueDate, long l) {
		Calendar cal = Calendar.getInstance();
		try {
			cal.setTime(dateFormat.parse(issueDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		cal.add(Calendar.DATE, (int) l);
		return convertDateToString(cal.getTime());
	}

	private static String convertDateToString(Date date) {
		return dateFormat.format(date);
	}
}
