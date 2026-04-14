package inputPKG;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

import terminalPKG.*;
import getPKG.*;

public class KeyInput implements KeyListener {
	private static int keyCode;
	private static char keyChar;
	
	
	//@Override
	
	public void keyPressed(KeyEvent e) {
		keyCode = e.getKeyCode();
		keyChar = e.getKeyChar();
		switch(keyCode) {
			case KeyEvent.VK_ENTER:
				TermLog.logTxt(GetClass.getMethods.getOrDefault("enterTxt", null).get());
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
