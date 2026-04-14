package userPKG;

import terminalPKG.*;

import mainPKG.*;

public class User {
	public static String username;
	
	public static String inputName(String name) {
		username = name;
		return username;
	}
}