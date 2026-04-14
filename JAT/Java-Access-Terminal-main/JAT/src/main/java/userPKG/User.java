package userPKG;

import getPKG.GetClass;
import setPKG.SetClass;
import terminalPKG.TermWin;

public class User {
	private static String username;
	private static int userage;
	private static String password;
	
	public static String getUsername() {
		return username;
	}
	public static String setUsername(String nameN) {
		username = nameN;
		return username;
	}
	
	public static String getUserage() {
		return String.valueOf(userage);
	}
	public static String setUserage(String ageN) {
		int intAge = Integer.parseInt(ageN);
		userage = intAge;
		return String.valueOf(userage);
	}
	
	public static String getPassword() {
		return password;
	}
	public static String setPassword(String passN) {
		password = passN;
		return password;
	}
	
	private static void recordGet() {
		GetClass.getMethods.put("username", User::getUsername);
		GetClass.getMethods.put("userage", User::getUserage);
		GetClass.getMethods.put("password", User::getPassword);
	}
	
	private static void recordSet() {
		SetClass.setMethods.put("username", User::setUsername);
		SetClass.setMethods.put("username", User::setUsername);
		SetClass.setMethods.put("username", User::setUsername);
	}
	
	private User() {
		recordGet();
		recordSet();
	}
}