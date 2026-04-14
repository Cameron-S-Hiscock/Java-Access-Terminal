package terminalPKG;

import javax.swing.*;
import java.awt.*;
import java.util.*;

import mainPKG.*;

import constantPKG.*;
import inputPKG.*;
import debugPKG.*;

public class TermWin extends JFrame {
	public static int windowWidthPx = (int)Math.floor(Constants.SCREEN_WIDTH/2);
	public static int windowHeightPx = (int)Math.floor(Constants.SCREEN_HEIGHT/2);
	public static int windowWidthGrid = (int)Math.floor(windowWidthPx/12);
	public static int windowHeightGrid = (int)Math.floor(windowHeightPx/12);
	
	protected static JPanel logPanel = new JPanel();
	protected static JPanel enterPanel = new JPanel();
	protected static JTextField termEnter = new JTextField(windowWidthGrid);
	
	protected static int txtRows = (windowHeightPx - 32) / 20;
	protected static int txtColumns = (windowWidthPx - 16) / 8;
	
	protected static JList<String> termLog = new JList<String>();
	protected static DefaultListModel<String> termLogList = new DefaultListModel<String>();
	
	public TermWin() {
		setTitle("Java Accessd Terminal");
		setSize(windowWidthPx,windowHeightPx);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		termEnter.setFocusable(true);
		enterPanel.add(termEnter);
		
		//add(Debug.debugPanel);
		add(logPanel);
		add(enterPanel);
		
		termLog.setFocusable(false);
		
		logPanel.add(termLog);
		
		setVisible(true);
	}
	
	public static void createGrid() {
		for (int i = 0; i <= txtRows; i++) {
			termLogList.add(i, "Blank");
		}
	}
	
	public static void updateFields() {
		TermWin.windowWidthPx = Main.WINDOW.getWidth();
		TermWin.windowHeightPx = Main.WINDOW.getHeight();
		TermWin.windowWidthGrid = (int)Math.floor(TermWin.windowWidthPx/12);
		TermWin.windowHeightGrid = (int)Math.floor(TermWin.windowHeightPx/12);
		
		TermWin.txtRows = (TermWin.windowHeightPx - 32) / 20;
		TermWin.txtColumns = (TermWin.windowWidthPx - 16) / 8;
	}
}