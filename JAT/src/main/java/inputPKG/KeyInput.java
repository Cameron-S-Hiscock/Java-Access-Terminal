package inputPKG;

import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

import mainPKG.*;

import terminalPKG.*;

public class KeyInput {
	//@Override
	
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		switch(keyCode) {
			case KeyEvent.VK_ENTER:
				JOptionPane.showMessageDialog(null, "Text Logged", "Text Log", JOptionPane.INFORMATION_MESSAGE);
				TermLog.logTxt(TermLog.enterTxt);
				TermLog.enterTxt = null;
			default:
				;
		}
	}
	
	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();
	}
	
	public void keyTyped(KeyEvent e) {
		int keyCode = e.getKeyCode();
	}
}