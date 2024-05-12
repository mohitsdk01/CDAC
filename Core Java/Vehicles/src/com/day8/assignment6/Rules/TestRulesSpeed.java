package com.day8.assignment6.Rules;

import com.day8.assignment6.Exceptions.*;

public class TestRulesSpeed {
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	static {
		MIN_SPEED = 40;
		MAX_SPEED = 80;
	}
	public static void validateSpeed(int speed) 
			throws SpeedOutOfRangeException {
		if (speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("Speed too low!");
		if (speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("Speed too high , FATAL !!!!");
		System.out.println("speed within range...");
	}
}
