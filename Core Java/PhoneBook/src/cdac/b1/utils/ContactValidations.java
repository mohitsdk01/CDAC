package cdac.b1.utils;

import static java.time.LocalDate.parse;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cdac.b1.core.Contact;
import cdac.b1.exceptions.ContactBookException;

public class ContactValidations {
	public static Contact inputValidation(String pNo, String name, 
			String dob, String email, Map<String, Contact>map) 
					throws ContactBookException {
			phoneNumberBelongsValidation(pNo, map);
			nameAndDobValidation(dob, name, map);
			phoneNumberDigitsValidation(pNo);
				return new Contact(pNo, name, parse(dob), email);
		
	}

	private static void phoneNumberDigitsValidation(String pNo) throws ContactBookException {
		String regex = "^\\d{10}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(pNo);
		if(!matcher.matches()) {
			throw new ContactBookException("Phone Number Must Contains 10 Digits!!!");
		}
		
	}

	private static void nameAndDobValidation(String dob, String name, Map<String, Contact> map) 
			throws ContactBookException {
		for(Contact c : map.values()) {
			if(c.getName().equalsIgnoreCase(name) && c.getDob().equals(parse(dob))) {
				throw new ContactBookException(" Date and Name Already Exists!");
			}
		}
		
	}

	private static void phoneNumberBelongsValidation(String pNo, Map<String, Contact> map)
			throws ContactBookException {
		for(Contact c : map.values()) {
			if(c.getpNo().equals(pNo)) {
				throw new ContactBookException(pNo + " Already Exists!");
			}
		}
		
	}
}
