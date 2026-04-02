package inputPKG;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import mainPKG.*;

import terminalPKG.*;

public class KeyInput implements KeyListener {
	public static KeyEvent e;
	public static int keyCode = e.getKeyCode();
	public static char keyChar = e.getKeyChar();
	
	
	//@Override
	
	public void keyPressed(KeyEvent e) {
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
		;
	}
	
	public void keyTyped(KeyEvent e) {
		;
	}
}
