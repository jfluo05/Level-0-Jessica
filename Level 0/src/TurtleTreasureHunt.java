import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.MalformedURLException;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.ImageBackground;
import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.Tortoise;

/** Note: You will need the latest version of the TKP jar: http://school.wintrisstech.org/jars/TeachingKidsProgramming.jar **/

public class TurtleTreasureHunt implements KeyListener, KeyEventDispatcher {

	int tortoiseSpeed = 5;

	private void goUp() {
		// 1. Make the tortoise move up the screen
			Tortoise.move(tortoiseSpeed);
		
	}

	private void goDown() {
		// 2. make the tortoise move down the screen
Tortoise.move(-10);
	}

	private void goLeft() {
		// 3. make the tortoise move left (3 lines of code)
		// Hint: the turn() method lags more than setAngle()

		Tortoise.turn(-90);
		Tortoise.move(10);
		Tortoise.turn(90);
	
	}

	private void goRight() {
		// 4. make the tortoise move right
		Tortoise.turn(90);
		Tortoise.move(10);
		Tortoise.turn(-90);
	}

	private void spaceBarWasPressed() {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		// 5. Print out the variables for tortoiseLocationX and tortoiseLocationY
System.out.println( "x"+ tortoiseLocationX);
System.out.println("y"+ tortoiseLocationY);
		// 6. If tortoise is at same location as the little girl,
		// 			make a pop-up tell the Tortoise where to go next
if(tortoiseLocationX==500 && tortoiseLocationY==300){
	JOptionPane.showMessageDialog(null, "Doog boj! Won og ot eht yob dna ksa mih rof eht yek. Kcilc ecaps rof mih ot llet uoy erehw eht yek si (drawkcab)  ");
	
}

		// 7. Give the user subsequent clues at different locations on the image
		// (pirate robot, swamp, parrots, etc.)

	if(tortoiseLocationX==140 && tortoiseLocationY==290){
		JOptionPane.showMessageDialog(null, "I swallowed the key and it is giving me a stomach ache. Press the space key to help me get it out.  ");}
		
		
		
	}

	

	private void go() {
	
		/*
		 * If you want to use your own background, download the image you want, and change the following line to point to it like: new
		 * ImageBackground("file:/Users/joonspoon/Desktop/dinosaurLand.jpg");
		 */
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		
		
		Tortoise.penUp();
		Tortoise.setSpeed(10);
		Paintable backgroundImage = new ImageBackground("file:/Users/League/Google Drive/league-images/treasure_hunt.jpg");
		Tortoise.getBackgroundWindow().addPaintable(backgroundImage);
		Tortoise.getBackgroundWindow().addKeyListener(this);
		Tortoise.penUp();
	
		Tortoise.getBackgroundWindow().getParent().addKeyListener(this);
		JOptionPane.showMessageDialog(null, "Ask the little girl for help with your quest. Crawl on her head where her flower is, then press the space bar to ask.");
	}

	
	public static void main(String[] args) throws MalformedURLException {
		new TurtleTreasureHunt().go();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		 
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			else if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			else if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			else if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();
			else if (e.getKeyCode() == KeyEvent.VK_SPACE)
				spaceBarWasPressed();
			if (e.getKeyCode() == KeyEvent.VK_S)
				sKeyWasPressed();
			if (e.getKeyCode() == KeyEvent.VK_U)
				uKeyWasPressed();
			}
	

	private void uKeyWasPressed() {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();
if (tortoiseLocationX==500 && tortoiseLocationY==300){
JOptionPane.showMessageDialog(null, "You have unlocked the girl!");
}
	}
	
	private void sKeyWasPressed() {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();
				if(tortoiseLocationX==480 && tortoiseLocationY==185){
					JOptionPane.showMessageDialog(null, "Congratulations! You have the key! Go to the girl's head and press the u key to unlock the girl from the ropes.");
				}
				
		JOptionPane.showMessageDialog(null, "Okay. It is out of my body now, but I don't know where it went. I am pretty sure it is inside the cannon.");
	
	}
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean dispatchKeyEvent(KeyEvent e) {
		// TODO Auto-generated method stub

		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			goRight();
		else if (e.getKeyCode() == KeyEvent.VK_LEFT)
			goLeft();
		else if (e.getKeyCode() == KeyEvent.VK_UP)
			goUp();
		else if (e.getKeyCode() == KeyEvent.VK_DOWN)
			goDown();
		else if (e.getKeyCode() == KeyEvent.VK_SPACE)
			spaceBarWasPressed();
		else if (e.getKeyCode() == KeyEvent.VK_S)
			sKeyWasPressed();
		

		return false;
	}
}

