package constantsPKG;

import java.awt.*;
import java.util.*;
import java.util.regex.*;

import mainPKG.Main;

import terminalPKG.*;

public class Constants {
	public static final Random RANDOM = new Random();
	public static final int SEED = RANDOM.nextInt(Integer.MAX_VALUE);
	
	public static final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
	public static final int SCREEN_WIDTH = SCREEN_SIZE.width;
	public static final int SCREEN_HEIGHT = SCREEN_SIZE.height;
	
	public static final int CHAR_HEIGHT_PX = 20;
	public static final int CHAR_HEIGHT_GRID = (int)Math.floorDiv(CHAR_HEIGHT_PX,12);
	
	public static ArrayList<Runnable> updates = new ArrayList<>();
}