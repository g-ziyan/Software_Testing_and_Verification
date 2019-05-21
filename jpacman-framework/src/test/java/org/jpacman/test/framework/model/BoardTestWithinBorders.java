package org.jpacman.test.framework.model;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.jpacman.framework.model.Board;
import org.jpacman.framework.model.Direction;
import org.jpacman.framework.model.Tile;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BoardTestWithinBorders {
	private final int ix, iy;
	private final Board board;
	
	private static final int WIDTH = 10;
	private static final int HEIGHT = 10;
	
	/**
	 * Create a new test case obtaining the tile
	 * from starting point (x, y)
	 * @param x Start x
	 * @param y Start y
	 */
	public BoardTestWithinBorders(int x, int y) {
		ix = x;
		iy = y;
		board = new Board(WIDTH, HEIGHT);
	}
	
	@Test
	public void testWithinBorders() {
		
		assertEquals(ix >= 0 && ix < WIDTH 
				&& iy >= 0 && iy < HEIGHT, board.withinBorders(ix, iy));
	}
	
	/**
	 * List of (x,y)/Direction/(newx,newy) data points.
	 * @return Test data to be fed to constructor.
	 */
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] values = new Object[][] {
				//on
				{ 0, 5},
				//off
				{ -1, 5},
				//in
				{ 5, 5},
				//out
				{ -1, -1}
		};
		return Arrays.asList(values);
	}
}
