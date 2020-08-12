package com.forum.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

//Utility class is used implement basic utilities which are used at multiple places in your program
//And you don't need multiple instances of these utilities, one instance is enough to be used at multiple places
public class Utility {
	/**
	 * This method will return the current data from system time
	 * @return current date in IST timezone
	 */
	public static Date getCurrentDate() {
		return Calendar.getInstance(TimeZone.getTimeZone("IST")).getTime();
	}

	/**
	 * This method will check whether a string is empty or null or not
	 * @param arg String to be checked for null or empty
	 * @return true if string is not null or empty else false
	 */
	public static boolean isNotNullAndEmpty(String arg) {
		if (arg != null && !arg.equals("")) {
			return true;
		}
		return false;
	}

	/**
	 * This is an utility method to take input from user
	 * @return input provided by user
	 * @throws IOException : will be thrown for any IO issue
	 */
	public static String inputFromUser() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		return input;
	}
}
