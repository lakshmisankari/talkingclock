package com.assignment.talkingclock.util;

import com.assignment.talkingclock.EnglishTime;

/**
 * @author Lakshmi Sankari .S
 *
 */
public class TimeInEnglishUtil {

	public static EnglishTime returnTimeInEnglish(int hr, int min) {
		String hour = hr + ":" + min;
		EnglishTime engTime = new EnglishTime(hour);

		String word;
		String wordsEnglish[] = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
				"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen",
				"Twenty", "Twenty one", "Twenty two", "Twenty three", "Twenty four", "Twenty five", "Twenty six",
				"Twenty seven", "Twenty eight", "Twenty nine" };

		if (hr > 12) {
			hr = hr - 12;
		}
		if ((hr >= 1 && hr <= 12) && (min >= 0 && min <= 59))// checking valid condition of time entered
		{
			if (hr == 12) // if hr is 12
			{
				word = wordsEnglish[1];
			} else // if hour is between 1-11
			{
				word = wordsEnglish[hr + 1];
			}
			if (min == 0) {
				engTime.setTime(wordsEnglish[hr] + " O' clock");
			} else if (min == 15) {
				engTime.setTime("Quarter past " + wordsEnglish[hr]);
			} else if (min == 30) {
				engTime.setTime("Half past " + wordsEnglish[hr]);
			} else if (min == 45) {
				engTime.setTime("Quarter to " + word);
			} else if (min < 30) // mins. betn. 1-29
			{
				engTime.setTime(wordsEnglish[min] + " " + "past " + wordsEnglish[hr]);
			} else // mins. betn. 30-59
			{
				engTime.setTime(wordsEnglish[60 - min] + " " + "to " + word);
			}
		} 
		else {
			engTime.setTime("Invalid Time Entered");
		}
		return engTime;
	}
	

	public static String[] parseStringTimeToArray(String time) {
		if (time == null) {
			throw new IllegalArgumentException("The input time must not be null");
		}
		String[] timeArr = time.split(":");
		if (timeArr.length != 2) {
			throw new IllegalArgumentException("The input time must be in format \"HH:MM\"");
		}
		return timeArr;
	}

}
