package com.assignment.talkingclock;


/**
 * @author Lakshmi Sankari .S
 *
 */
public class EnglishTime {
	@Override
	public String toString() {
		return "EnglishTime [time=" + time + "]";
	}

	public EnglishTime() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String time;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public EnglishTime(String time) {
		super();
		this.time = time;
	}

}
