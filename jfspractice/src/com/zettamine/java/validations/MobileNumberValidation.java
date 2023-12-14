package com.zettamine.java.validations;

import java.util.regex.Pattern;

public class MobileNumberValidation {
	public static boolean validateMobile(String Mobile) {
		String mobileNoPattern = "[6-9][0-9]{9}";
		return Pattern.matches(mobileNoPattern, Mobile);
	}
}
