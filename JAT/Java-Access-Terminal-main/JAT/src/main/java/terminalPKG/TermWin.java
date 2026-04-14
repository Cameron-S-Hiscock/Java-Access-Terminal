package terminalPKG;

import javax.swing.*;

import java.awt.*;
import java.util.*;

import mainPKG.*;

import constantsPKG.*;
import getPKG.*;
import inputPKG.*;

public class TermWin extends JFrame {
	private static GridBagConstraints gbc = new GridBagConstraints();
	
	private static int windowWidthPx = Math.floorDiv(Constants.SCREEN_WIDTH, 2);
	private static int windowHeightPx = Math.floorDiv(Constants.SCREEN_HEIGHT, 2);
	private static int windowWidthGrid = Math.floorDiv(windowWidthPx, 12);
	private static int windowHeightGrid = Math.floorDiv(windowHeightPx, 12);
	private static int txtRows = Math.floorDiv((windowHeightPx - 32), 20);
	private static int txtColumns = Math.floorDiv((windowWidthPx - 16), 8);
	
	protected static JPanel logPanel = new JPanel();
	protected static JPanel enterPanel = new JPanel();
	protected static JTextField termEnter = new JTextField(windowWidthGrid);
	private static String enterTxt = termEnter.getText();
	protected static JTextArea termLog = new JTextArea();
	private static JScrollPane logScr = new JScrollPane(logPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	
	public static String getEnterTxt() {
		return termEnter.getText();
	}
	
	public static String getWindowHeightPx() {
		return String.valueOf(windowHeightPx);
	}
	
	public static String getWindowWidthPx() {
		return String.valueOf(windowWidthPx);
	}
	
	public static String getWindowHeightGrid() {
		return String.valueOf(windowHeightGrid);
	}
	
	public static String getWindowWidthGrid() {
		return String.valueOf(windowWidthGrid);
	}
	
	private static void recordGet() {
		GetClass.getMethods.put("enterTxt", TermWin::getEnterTxt);
		GetClass.getMethods.put("windowHeightPx", TermWin::getWindowHeightPx);
		GetClass.getMethods.put("windowWidthPx", TermWin::getWindowWidthPx);
		GetClass.getMethods.put("windowHeightGrid", TermWin::getWindowHeightGrid);
		GetClass.getMethods.put("windowWidthGrid", TermWin::getWindowWidthGrid);
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
		gbc.fill = GridBagConstraints.BOTH;
		logPanel.add(termLog, gbc);
		
		add(logScr, BorderLayout.CENTER);
		add(enterPanel, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	public static Runnable updateFields() {
		TermWin.windowWidthPx = Main.WINDOW.getWidth();
		TermWin.windowHeightPx = Main.WINDOW.getHeight();
		TermWin.windowWidthGrid = Math.floorDiv(TermWin.windowWidthPx, 12);
		TermWin.windowHeightGrid = Math.floorDiv(TermWin.windowHeightPx, 12);
		
		TermWin.txtRows = Math.floorDiv((TermWin.windowHeightPx - 32), 20);
		TermWin.txtColumns = Math.floorDiv((TermWin.windowWidthPx - 16), 8);
		
		TermWin.enterTxt = TermWin.termEnter.getText();
		
		TermWin.termEnter.setColumns(TermWin.windowWidthGrid);
		
		return null;
	}
}