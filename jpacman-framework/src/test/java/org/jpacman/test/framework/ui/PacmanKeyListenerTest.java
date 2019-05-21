package org.jpacman.test.framework.ui;

import static org.junit.Assert.fail;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.jpacman.framework.factory.FactoryException;
import org.jpacman.framework.ui.IPacmanInteraction;
import org.jpacman.framework.ui.MainUI;
import org.jpacman.framework.ui.PacmanKeyListener;
import org.junit.Before;
import org.junit.Test;

public class PacmanKeyListenerTest {
	KeyEvent up;
	KeyEvent down;
	KeyEvent left;
	KeyEvent right;
	MainUI ui = new MainUI();
	@Before
	public void setUp(){
		up = new KeyEvent(ui, 0, 0, 0, KeyEvent.VK_UP, 'a');
		down = new KeyEvent(ui, 0, 0, 0, KeyEvent.VK_DOWN, 'b');
		left = new KeyEvent(ui, 0, 0, 0, KeyEvent.VK_LEFT, 'c');
		right = new KeyEvent(ui, 0, 0, 0, KeyEvent.VK_RIGHT, 'd');
		}
	@Test
	public void testUIActions()  {

		try {
		Robot robot = new Robot();
		ui.initialize();
		ui.start();
		robot.keyPress(KeyEvent.VK_K);
		robot.keyPress(KeyEvent.VK_J);
		robot.keyPress(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_Q);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_X);
		} catch (Exception e) {fail("Keytype failed!");}
	}
}