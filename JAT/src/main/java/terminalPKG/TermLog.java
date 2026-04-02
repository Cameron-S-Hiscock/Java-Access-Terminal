package terminalPKG;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.util.regex.*;

import mainPKG.*;
import constantPKG.*;
import userPKG.*;

public class TermLog extends TermWin {
	public static String enterTxt = termEnter.getText();
	private static ArrayList<String> txtLog = new ArrayList<String>();
	
	public static ArrayList<String> logTxt(String txt) {
		String newTxtLine = null;
		String[] brokenTxtWords = txt.trim().split("\\s+");
		
		for(String word : brokenTxtWords) {
			int wordi = 0;
			do {
				do {
					newTxtLine += word + " ";
					wordi++;
				} while(newTxtLine.length() < TermWin.txtColumns);
				txtLog.add(newTxtLine);
				newTxtLine = null;
			} while(wordi <= brokenTxtWords.length);
		}
		
		return txtLog;
	}
}
