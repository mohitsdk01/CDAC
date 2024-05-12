package custom_exceptions;

@SuppressWarnings("serial")
public class SpeedOutOfRangeException extends Exception {
//to avoid null as the err mesg --add parameterized CTOR
	public SpeedOutOfRangeException(String mesg) {
		super(mesg);
	}
}
