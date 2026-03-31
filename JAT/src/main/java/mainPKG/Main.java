package mainPKG;

import java.awt.*;
import java.util.*;
import javax.swing.*;

import constantPKG.*;
import terminalPKG.*;
import userPKG.*;
import debugPKG.*;
import inputPKG.*;

public class Main extends Thread{
	public static final TermWin WINDOW = new TermWin();
	
	public void run() {
		TermWin.updateFields();
		Debug.showKeyInput();
	}
	
    public static void main(String[] args) {
    	
    }
}
