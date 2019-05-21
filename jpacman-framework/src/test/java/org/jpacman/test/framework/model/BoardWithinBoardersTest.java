package org.jpacman.test.framework.model;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import org.jpacman.framework.model.Board;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class BoardWithinBoardersTest {
	
	private Board board;
	private final int height = 10;
	private final int width = 10;
	private int tx;
	private int ty;
	private boolean flag;
	
	/**
	 * Initialize a board with default height and width,
	 * and create x, y, expected flag from parameters
	 */
	public BoardWithinBoardersTest(int x, int y, boolean f){
		board = new Board(width, height);
		tx = x;
		ty = y;
		flag = f;
	}
	
	
	/**
	 * Test WithinBoarders
	 */
	@Test
	public void testWithinBoarders(){
		assertEquals(board.withinBorders(tx, ty), flag);
	}
	
	
	/**
	 * Provide parameters to constructor of class
	 */
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] values = new Object[][] {
			//on point
			{0, 1, true},
			//off point
			{-1, 2, false},
			//off point
			{10, 3, false},
			//on point
			{9 ,4, true},
			//on point
			{5, 0, true},
			//off point
			{6, -1, false},
			//off point
			{7, 10, false},
			//on point
			{8, 9, true},
			//in point
			{4, 5, true},
			//out point
			{20, 20, false}
		};
		return Arrays.asList(values);
	}


}
