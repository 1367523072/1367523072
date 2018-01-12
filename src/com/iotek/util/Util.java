package com.iotek.util;

import java.util.Calendar;
import java.util.Date;

public class Util {
	
	public static boolean isSameDate(Date date1, Date date2) { //判断是否是同一天
	       Calendar cal1 = Calendar.getInstance();
	       cal1.setTime(date1);
	       Calendar cal2 = Calendar.getInstance();
	       cal2.setTime(date2);
	       boolean isSameYear = cal1.get(Calendar.YEAR) == cal2
	               .get(Calendar.YEAR);
	       boolean isSameMonth = isSameYear
	               && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);
	       boolean isSameDate = isSameMonth
	               && cal1.get(Calendar.DAY_OF_MONTH) == cal2
	                       .get(Calendar.DAY_OF_MONTH);
	       return isSameDate;
	   }
	
	public static boolean isSameDate(Date date) { //判断是否是10号
	       Calendar cal = Calendar.getInstance();
	       cal.setTime(date);
	       boolean isSameDate = cal.get(Calendar.DAY_OF_MONTH)==11;
	       return isSameDate;
	   }
}
