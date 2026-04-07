package terminalPKG;

import javax.swing.*;
import java.util.*;

import mainPKG.*;

import constantsPKG.*;
import getPKG.*;
import inputPKG.*;

public class TermWin extends JFrame {
	private static int windowWidthPx = (int)Math.floor(Constants.SCREEN_WIDTH/2);
	private static int windowHeightPx = (int)Math.floor(Constants.SCREEN_HEIGHT/2);
	private static int windowWidthGrid = (int)Math.floor(windowWidthPx/12);
	private static int windowHeightGrid = (int)Math.floor(windowHeightPx/12);
	
	protected static JPanel logPanel = new JPanel();
	protected static JPanel enterPanel = new JPanel();
	protected static JTextField termEnter = new JTextField(windowWidthGrid);
	
	private static int txtRows = (windowHeightPx - 32) / 20;
	private static int txtColumns = (windowWidthPx - 16) / 8;
	
	private static String enterTxt = termEnter.getText();
	protected static JTextArea termLog = new JTextArea(txtRows, txtColumns);
	
	public static String getEnterTxt() {
		enterTxt = termEnter.getText();
		return enterTxt;
	}
	
	private static void recordGet() {
		GetClass.getMethods.put("enterTxt", TermWin::getEnterTxt);
	}
	
	private static void recordSet() {
		;
	}
	
	public TermWin() {
		recordGet();
		recordSet();
		
		setTitle("Java Access Terminal");
		setSize(windowWidthPx,windowHeightPx);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		termEnter.addKeyListener(new KeyInput());
		termEnter.setFocusable(true);
		enterPanel.add(termEnter);
		
		termLog.setFocusable(false);
		termLog.setEditable(false);
		termLog.setLineWrap(true);
		termLog.setWrapStyleWord(true);
		
		logPanel.add(termLog);
		
		add(logPanel);
		add(enterPanel);
		
		setVisible(true);
	}
	
	public static Runnable updateFields() {
		TermWin.windowWidthPx = Main.WINDOW.getWidth();
		TermWin.windowHeightPx = Main.WINDOW.getHeight();
		TermWin.windowWidthGrid = (int)Math.floor(TermWin.windowWidthPx/12);
		TermWin.windowHeightGrid = (int)Math.floor(TermWin.windowHeightPx/12);
		
		TermWin.txtRows = (TermWin.windowHeightPx - 32) / 20;
		TermWin.txtColumns = (TermWin.windowWidthPx - 16) / 8;
		
		TermWin.enterTxt = TermWin.termEnter.getText();
		
		TermWin.termEnter.setColumns(TermWin.windowWidthGrid);
		
		return null;
	}
}
