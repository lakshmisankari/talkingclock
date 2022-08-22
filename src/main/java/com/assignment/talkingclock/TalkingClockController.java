package com.assignment.talkingclock;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.talkingclock.util.TimeInEnglishUtil;
/**
 * @author Lakshmi Sankari .S
 *
 */
@RestController
public class TalkingClockController {

	@GetMapping("/getEnglishTime/{hour}")
	public ResponseEntity<EnglishTime> getEnglishTime(@PathVariable String hour) {

		String[] parsedTime = TimeInEnglishUtil.parseStringTimeToArray(hour);

		int hr = Integer.parseInt(parsedTime[0]);
		int min = Integer.parseInt(parsedTime[1]);

		EnglishTime engTime = TimeInEnglishUtil.returnTimeInEnglish(hr, min);

		return new ResponseEntity<EnglishTime>(engTime, HttpStatus.OK);

	}
}