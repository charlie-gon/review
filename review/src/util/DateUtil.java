package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil {

	/**
	 * String->Date SimpleDateFormat.parse
	 */
	public static Date toDate(String date) {
		Date result = null;
		// to do
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		try {
			result = dateFormat.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Date->String SimpleDateFormat.format
	 */

	public static String toStr(Date date) {
		String result = null;
		// to do
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		result = dateFormat.format(date);
		return result;
	}
	

	/**
	 * Date를 주어진 포맷대로 String으로 변환 Date->String SimpleDateFormat.format
	 */

	public static String toStrFormat(Date date, String format) {
		String result = null;
		// to do
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		result = dateFormat.format(date);

		return result;
	}
	
	/**
	 * 날짜 계산
	 * @throws ParseException 
	 */
	
	public static Date addDays(Date date, int cnt) {
		Date result = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			result = dateFormat.parse("2021-02-18");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
