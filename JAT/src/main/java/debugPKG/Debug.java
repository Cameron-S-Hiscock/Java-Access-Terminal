package debugPKG;

import java.awt.event.*;

import javax.swing.*;

import constantPKG.*;
import terminalPKG.*;

public class Debug {
	public static JPanel debugPanel = new JPanel();
	
	public static void showKeyInput() {
		JTextField keyListen = new JTextField();
		
		keyListen.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				int keyChar = e.getKeyChar();
				System.out.println("Key Pressed Code: " + keyCode + ", Character: " + keyChar);
			}
		});
		keyListen.setFocusable(true);
		
		debugPanel.add(keyListen);
	}
}
