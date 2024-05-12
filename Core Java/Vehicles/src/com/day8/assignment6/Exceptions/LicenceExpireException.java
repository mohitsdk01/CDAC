package com.day8.assignment6.Exceptions;

@SuppressWarnings("serial")
public class LicenceExpireException extends Exception {
//to avoid null as the err mesg --add parameterized ctor
	public LicenceExpireException(String mesg) {
		super(mesg);
	}
}
