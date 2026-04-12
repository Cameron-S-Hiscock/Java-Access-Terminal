package terminalPKG;

import java.util.*;

import javax.swing.JOptionPane;

public class TermLog extends TermWin {
	private static ArrayList<String> txtLog = new ArrayList<String>();
	
	public static ArrayList<String> logTxt(String txt) {
		String[] brokenTxtWords = txt.trim().split("\\s+");
		for(String word : brokenTxtWords) {
			txtLog.add(word);
			txtLog.add(" ");
		}
		txtLog.add("\n");
		for(String word : txtLog) {
			TermWin.termLog.append(word);
		}
		
		TermWin.termEnter.setText(null);
		txtLog.clear();
		return txtLog;
	}
}
