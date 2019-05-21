package org.jpacman.test.framework.factory;

import static org.junit.Assert.*;

import org.jpacman.framework.factory.DefaultGameFactory;
import org.jpacman.framework.factory.FactoryException;
import org.jpacman.framework.factory.IGameFactory;
import org.jpacman.framework.factory.MapParser;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FactoryExceptionTest {
	
	private MapParser parser;
	private String[] map = {};
	
	/**
     * Initialization
     */
	@Before
	public void setUp() {
		IGameFactory factory = new DefaultGameFactory();
		parser = new MapParser(factory);
	}
	
	/**
     * Common FactoryException testing without cause
	 * @throws FactoryException 
     */
	@Test(expected=FactoryException.class)
	public void testFactoryException() throws FactoryException {
		parser.parseMap(map);
	}
	
	/**
     * Common FactoryException constructor testing without cause
     */
	@Test
	public void testFactoryExceptionConstructorWithoutCause() {
		String message = "Problem reading file ";
		try {
		FactoryException f = new FactoryException(message);
		} catch (Exception e) {assertEquals(e.getMessage(),message);}
	}
	
	/**
     * Common FactoryException constructor testing with cause
     */
	@Test
	public void testFactoryExceptionConstructorWithCause() {
		String message = "Problem reading file ";
		Throwable t = new Throwable();
		try {
		FactoryException f = new FactoryException(message, t);
		} catch(Exception e) {
			assertEquals(e.getMessage(),message);
			assertEquals(e.getCause(),t);
			}
	}
	
}
