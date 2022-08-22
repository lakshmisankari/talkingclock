package com.assignment.talkingclock;

import java.util.Scanner;

import com.assignment.talkingclock.util.TimeInEnglishUtil;
/**
 * @author Lakshmi Sankari .S
 *
 */
class Time {

	public static void main(String args[]) {

		try (Scanner in = new Scanner(System.in)) {
			int hr, min;

			System.out.println("Enter Time in format \\\"HH:MM\\\"");
			String[] parsedTime = TimeInEnglishUtil.parseStringTimeToArray(in.next());
			hr = Integer.parseInt(parsedTime[0]);
			min = Integer.parseInt(parsedTime[1]);
			EnglishTime engTime = TimeInEnglishUtil.returnTimeInEnglish(hr, min);
			
			System.out.println(engTime.getTime());

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}