package com.assignment.talkingclock;

import java.util.Calendar;

import com.assignment.talkingclock.util.TimeInEnglishUtil;
/**
 * @author Lakshmi Sankari .S
 *
 */
class TimeCurrent {
	public static void main(String args[]) {

		int hr = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		int min = Calendar.getInstance().get(Calendar.MINUTE);
		
		EnglishTime engTime = TimeInEnglishUtil.returnTimeInEnglish(hr, min);
		
		System.out.println("Current Time is : "+engTime.getTime());
	}
}