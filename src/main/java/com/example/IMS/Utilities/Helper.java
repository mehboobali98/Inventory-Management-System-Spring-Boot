package com.example.IMS.Utilities;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Helper {

	private static DateFormat dateFormat;

	static {
		dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cal.add(Calendar.DATE, (int) l);
		return convertDateToString(cal.getTime());
	}

	private static String convertDateToString(Date date) {
		return dateFormat.format(date);
	}
}
