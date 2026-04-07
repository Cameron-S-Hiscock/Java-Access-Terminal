package terminalPKG;

import java.util.*;

import javax.swing.JOptionPane;

public class TermLog extends TermWin {
	private static ArrayList<String> txtLog = new ArrayList<String>();
	
	public static ArrayList<String> logTxt(String txt) {
		String[] brokenTxtWords = txt.trim().split("\\s+");
		for(String word : brokenTxtWords) {
			txtLog.add(word);
		}
		for(String word : txtLog) {
			TermWin.termLog.append(word);
		}
		JOptionPane.showMessageDialog(null, "Text Logged: " + txt, "Text Logged", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, TermLog.txtLog, "Text Log", JOptionPane.INFORMATION_MESSAGE);
		TermWin.termLog.setText(null);
		return txtLog;
	}
}
