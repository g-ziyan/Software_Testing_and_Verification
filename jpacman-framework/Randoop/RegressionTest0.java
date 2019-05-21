import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        char char0 = org.jpacman.framework.factory.MapParser.EMPTY;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + ' ' + "'", char0 == ' ');
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int0 = org.jpacman.framework.controller.AbstractGhostMover.DELAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 40 + "'", int0 == 40);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        char char0 = org.jpacman.framework.factory.MapParser.FOOD;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '.' + "'", char0 == '.');
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        char char0 = org.jpacman.framework.factory.MapParser.GHOST;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'G' + "'", char0 == 'G');
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException1.addSuppressed((java.lang.Throwable) factoryException3);
        java.lang.Throwable throwable5 = null;
        try {
            factoryException3.addSuppressed(throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        char char0 = org.jpacman.framework.factory.MapParser.PLAYER;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'P' + "'", char0 == 'P');
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover2 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game1);
        java.awt.event.ActionEvent actionEvent3 = null;
        try {
            randomGhostMover2.actionPerformed(actionEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.jpacman.framework.model.IGameInteractor iGameInteractor0 = null;
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover1 = new org.jpacman.framework.controller.RandomGhostMover(iGameInteractor0);
        try {
            randomGhostMover1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        java.lang.Class<?> wildcardClass8 = ghost7.getClass();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader6 = null;
        try {
            java.lang.String[] strArray7 = mapParser5.getMap(bufferedReader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game7 = mapParser5.parseFromFile("org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game7 = mapParser5.parseFromFile("");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code D");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        char char0 = org.jpacman.framework.factory.MapParser.WALL;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '#' + "'", char0 == '#');
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.jpacman.framework.factory.IGameFactory iGameFactory0 = null;
        org.jpacman.framework.factory.MapParser mapParser1 = new org.jpacman.framework.factory.MapParser(iGameFactory0);
        java.io.BufferedReader bufferedReader2 = null;
        try {
            java.lang.String[] strArray3 = mapParser1.getMap(bufferedReader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.jpacman.framework.factory.IGameFactory iGameFactory0 = null;
        org.jpacman.framework.factory.MapParser mapParser1 = new org.jpacman.framework.factory.MapParser(iGameFactory0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: hi!", "", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game8 = mapParser1.parseMap(strArray7);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty row encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.jpacman.framework.model.IGameInteractor iGameInteractor0 = null;
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover1 = new org.jpacman.framework.controller.RandomGhostMover(iGameInteractor0);
        randomGhostMover1.stop();
        try {
            randomGhostMover1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game7 = mapParser5.parseFromFile("hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.jpacman.framework.model.IGameInteractor iGameInteractor0 = null;
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover1 = new org.jpacman.framework.controller.RandomGhostMover(iGameInteractor0);
        java.awt.event.ActionEvent actionEvent2 = null;
        try {
            randomGhostMover1.actionPerformed(actionEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        java.lang.Class<?> wildcardClass8 = player7.getClass();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.jpacman.framework.factory.IGameFactory iGameFactory0 = null;
        org.jpacman.framework.factory.MapParser mapParser1 = new org.jpacman.framework.factory.MapParser(iGameFactory0);
        java.lang.String[] strArray8 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "", "org.jpacman.framework.factory.FactoryException: hi!", "", "org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game9 = mapParser1.parseMap(strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser4 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader5 = null;
        try {
            java.lang.String[] strArray6 = mapParser4.getMap(bufferedReader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game7 = mapParser5.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray8 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game9 = mapParser5.parseMap(strArray8);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray11 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: hi!", "", "", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game12 = mapParser5.parseMap(strArray11);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover2 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game1);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover3 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game1);
        java.awt.event.ActionEvent actionEvent4 = null;
        try {
            randomGhostMover3.actionPerformed(actionEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover6 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game5);
        java.awt.event.ActionEvent actionEvent7 = null;
        try {
            randomGhostMover6.actionPerformed(actionEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(game5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.jpacman.framework.factory.IGameFactory iGameFactory0 = null;
        org.jpacman.framework.factory.MapParser mapParser1 = new org.jpacman.framework.factory.MapParser(iGameFactory0);
        try {
            org.jpacman.framework.model.Game game3 = mapParser1.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser4 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "", "", "", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game12 = mapParser4.parseMap(strArray11);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code h");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray11 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game12 = mapParser6.parseMap(strArray11);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException1.addSuppressed((java.lang.Throwable) factoryException3);
        java.lang.String str5 = factoryException3.toString();
        java.lang.Throwable[] throwableArray6 = factoryException3.getSuppressed();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str5.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        java.lang.Class<?> wildcardClass8 = wall7.getClass();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        try {
            org.jpacman.framework.model.Board board11 = defaultGameFactory0.makeBoard((int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover2 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game1);
        randomGhostMover2.stop();
        java.awt.event.ActionEvent actionEvent4 = null;
        try {
            randomGhostMover2.actionPerformed(actionEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover8 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game7);
        java.awt.event.ActionEvent actionEvent9 = null;
        try {
            randomGhostMover8.actionPerformed(actionEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(game7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray8 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game9 = mapParser5.parseMap(strArray8);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser3 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser4 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader5 = null;
        try {
            java.lang.String[] strArray6 = mapParser4.getMap(bufferedReader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser4 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Board board7 = defaultGameFactory0.makeBoard((int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser3 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray9 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "hi!", "", "org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game10 = mapParser3.parseMap(strArray9);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover6 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game5);
        randomGhostMover6.stop();
        java.lang.Class<?> wildcardClass8 = randomGhostMover6.getClass();
        java.awt.event.ActionEvent actionEvent9 = null;
        try {
            randomGhostMover6.actionPerformed(actionEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(game5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.jpacman.framework.model.IGameInteractor iGameInteractor0 = null;
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover1 = new org.jpacman.framework.controller.RandomGhostMover(iGameInteractor0);
        try {
            randomGhostMover1.doTick();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game11 = mapParser9.parseFromFile("");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code D");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        try {
            org.jpacman.framework.model.Board board11 = defaultGameFactory0.makeBoard((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(game8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader7 = null;
        try {
            java.lang.String[] strArray8 = mapParser6.getMap(bufferedReader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.jpacman.framework.model.IGameInteractor iGameInteractor0 = null;
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover1 = new org.jpacman.framework.controller.RandomGhostMover(iGameInteractor0);
        randomGhostMover1.stop();
        randomGhostMover1.stop();
        try {
            randomGhostMover1.doTick();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard(0, (int) 'G');
        try {
            org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game8 = mapParser6.parseFromFile("org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser4 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray7 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game8 = mapParser4.parseMap(strArray7);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser4 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game9 = mapParser4.parseMap(strArray8);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty row encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser3 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser4 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game6 = mapParser4.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.jpacman.framework.factory.IGameFactory iGameFactory0 = null;
        org.jpacman.framework.factory.MapParser mapParser1 = new org.jpacman.framework.factory.MapParser(iGameFactory0);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game5 = mapParser1.parseMap(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game6 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover7 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game6);
        java.awt.event.ActionEvent actionEvent8 = null;
        try {
            randomGhostMover7.actionPerformed(actionEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(game6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.jpacman.framework.model.IGameInteractor iGameInteractor0 = null;
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover1 = new org.jpacman.framework.controller.RandomGhostMover(iGameInteractor0);
        randomGhostMover1.stop();
        randomGhostMover1.stop();
        java.awt.event.ActionEvent actionEvent4 = null;
        try {
            randomGhostMover1.actionPerformed(actionEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader7 = null;
        try {
            java.lang.String[] strArray8 = mapParser6.getMap(bufferedReader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.jpacman.framework.factory.FactoryException factoryException2 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass3 = factoryException2.getClass();
        org.jpacman.framework.factory.FactoryException factoryException5 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass6 = factoryException5.getClass();
        factoryException2.addSuppressed((java.lang.Throwable) factoryException5);
        java.lang.Throwable[] throwableArray8 = factoryException2.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException10 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException12 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass13 = factoryException12.getClass();
        factoryException10.addSuppressed((java.lang.Throwable) factoryException12);
        java.lang.Throwable[] throwableArray15 = factoryException10.getSuppressed();
        java.lang.Throwable[] throwableArray16 = factoryException10.getSuppressed();
        java.lang.Throwable[] throwableArray17 = factoryException10.getSuppressed();
        factoryException2.addSuppressed((java.lang.Throwable) factoryException10);
        org.jpacman.framework.factory.FactoryException factoryException20 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass21 = factoryException20.getClass();
        org.jpacman.framework.factory.FactoryException factoryException23 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass24 = factoryException23.getClass();
        factoryException20.addSuppressed((java.lang.Throwable) factoryException23);
        org.jpacman.framework.factory.FactoryException factoryException27 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass28 = factoryException27.getClass();
        org.jpacman.framework.factory.FactoryException factoryException30 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass31 = factoryException30.getClass();
        factoryException27.addSuppressed((java.lang.Throwable) factoryException30);
        factoryException20.addSuppressed((java.lang.Throwable) factoryException30);
        java.lang.Throwable[] throwableArray34 = factoryException20.getSuppressed();
        factoryException10.addSuppressed((java.lang.Throwable) factoryException20);
        org.jpacman.framework.factory.FactoryException factoryException36 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException20);
        java.lang.String str37 = factoryException20.toString();
        java.lang.String str38 = factoryException20.toString();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str37.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str38.equals("org.jpacman.framework.factory.FactoryException: hi!"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser4 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game6 = mapParser4.parseFromFile("");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code D");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player9 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost10 = defaultGameFactory0.makeGhost();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(player9);
        org.junit.Assert.assertNotNull(ghost10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game8 = mapParser6.parseFromFile("");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code D");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser3 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser4 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray8 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: hi!", "hi!", "hi!" };
        try {
            org.jpacman.framework.model.Game game9 = mapParser4.parseMap(strArray8);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game8 = mapParser6.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader7 = null;
        try {
            java.lang.String[] strArray8 = mapParser6.getMap(bufferedReader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader10 = null;
        try {
            java.lang.String[] strArray11 = mapParser9.getMap(bufferedReader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(food8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game14 = mapParser6.parseMap(strArray13);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code h");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray16 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: hi!", "hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game17 = mapParser9.parseMap(strArray16);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass4 = factoryException3.getClass();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException3);
        java.lang.String str6 = factoryException1.toString();
        java.lang.Throwable[] throwableArray7 = factoryException1.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str6.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser3 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader4 = null;
        try {
            java.lang.String[] strArray5 = mapParser3.getMap(bufferedReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost6 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        java.lang.Class<?> wildcardClass8 = player7.getClass();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(ghost6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser3 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser4 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game6 = mapParser4.parseFromFile("hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray9 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game10 = mapParser6.parseMap(strArray9);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser7 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader8 = null;
        try {
            java.lang.String[] strArray9 = mapParser7.getMap(bufferedReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Game game10 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover11 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game10);
        java.lang.Class<?> wildcardClass12 = randomGhostMover11.getClass();
        java.awt.event.ActionEvent actionEvent13 = null;
        try {
            randomGhostMover11.actionPerformed(actionEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(game10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost6 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        try {
            org.jpacman.framework.model.Board board10 = defaultGameFactory0.makeBoard((int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(ghost6);
        org.junit.Assert.assertNotNull(game7);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray10 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "" };
        try {
            org.jpacman.framework.model.Game game11 = mapParser6.parseMap(strArray10);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Game game10 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser11 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game13 = mapParser11.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(game10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Wall wall6 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader9 = null;
        try {
            java.lang.String[] strArray10 = mapParser8.getMap(bufferedReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(wall6);
        org.junit.Assert.assertNotNull(game7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Game game10 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser11 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray13 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game14 = mapParser11.parseMap(strArray13);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(game10);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader10 = null;
        try {
            java.lang.String[] strArray11 = mapParser9.getMap(bufferedReader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.Class<?> wildcardClass7 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game10 = mapParser8.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass4 = factoryException3.getClass();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException3);
        java.lang.Throwable[] throwableArray6 = factoryException1.getSuppressed();
        java.lang.Throwable[] throwableArray7 = factoryException1.getSuppressed();
        java.lang.Throwable[] throwableArray8 = factoryException1.getSuppressed();
        java.lang.Class<?> wildcardClass9 = throwableArray8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        java.lang.Class<?> wildcardClass9 = food8.getClass();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.model.Wall wall6 = defaultGameFactory0.makeWall();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wall6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray13 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: hi!", "hi!", "hi!" };
        try {
            org.jpacman.framework.model.Game game14 = mapParser6.parseMap(strArray13);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food2 = defaultGameFactory0.makeFood();
        java.lang.Class<?> wildcardClass3 = food2.getClass();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(food2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException5 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass6 = factoryException5.getClass();
        factoryException3.addSuppressed((java.lang.Throwable) factoryException5);
        java.lang.String str8 = factoryException3.toString();
        java.lang.Class<?> wildcardClass9 = factoryException3.getClass();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException3);
        java.lang.Throwable[] throwableArray11 = factoryException3.getSuppressed();
        java.lang.Throwable throwable12 = null;
        try {
            factoryException3.addSuppressed(throwable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str8.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: hi!", "hi!" };
        try {
            org.jpacman.framework.model.Game game17 = mapParser10.parseMap(strArray16);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty row encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(ghost9);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game8 = mapParser6.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Game game10 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser11 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "hi!" };
        try {
            org.jpacman.framework.model.Game game19 = mapParser11.parseMap(strArray18);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty row encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(game10);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.jpacman.framework.factory.IGameFactory iGameFactory0 = null;
        org.jpacman.framework.factory.MapParser mapParser1 = new org.jpacman.framework.factory.MapParser(iGameFactory0);
        try {
            org.jpacman.framework.model.Game game3 = mapParser1.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser3 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game5 = mapParser3.parseFromFile("");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code D");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.model.Board board11 = defaultGameFactory0.makeBoard((int) (byte) 1, (int) '.');
        org.jpacman.framework.model.Food food12 = defaultGameFactory0.makeFood();
        java.lang.Class<?> wildcardClass13 = food12.getClass();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(board11);
        org.junit.Assert.assertNotNull(food12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass4 = factoryException3.getClass();
        org.jpacman.framework.factory.FactoryException factoryException6 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass7 = factoryException6.getClass();
        factoryException3.addSuppressed((java.lang.Throwable) factoryException6);
        org.jpacman.framework.factory.FactoryException factoryException10 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass11 = factoryException10.getClass();
        org.jpacman.framework.factory.FactoryException factoryException13 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass14 = factoryException13.getClass();
        factoryException10.addSuppressed((java.lang.Throwable) factoryException13);
        factoryException3.addSuppressed((java.lang.Throwable) factoryException13);
        java.lang.Throwable[] throwableArray17 = factoryException3.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException18 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException3);
        org.jpacman.framework.factory.FactoryException factoryException19 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException18);
        java.lang.Throwable[] throwableArray20 = factoryException19.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board10 = defaultGameFactory0.makeBoard((int) (short) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass11 = board10.getClass();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(board10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.Class<?> wildcardClass7 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        try {
            org.jpacman.framework.model.Game game12 = mapParser8.parseMap(strArray11);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty row encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        java.lang.Class<?> wildcardClass9 = ghost8.getClass();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Wall wall6 = defaultGameFactory0.makeWall();
        java.lang.Class<?> wildcardClass7 = wall6.getClass();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(wall6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Game game10 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser11 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader12 = null;
        try {
            java.lang.String[] strArray13 = mapParser11.getMap(bufferedReader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(game10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass2 = factoryException1.getClass();
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass5 = factoryException4.getClass();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException4);
        java.lang.Throwable[] throwableArray7 = factoryException1.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException9 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException11 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass12 = factoryException11.getClass();
        factoryException9.addSuppressed((java.lang.Throwable) factoryException11);
        java.lang.Throwable[] throwableArray14 = factoryException9.getSuppressed();
        java.lang.Throwable[] throwableArray15 = factoryException9.getSuppressed();
        java.lang.Throwable[] throwableArray16 = factoryException9.getSuppressed();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException9);
        org.jpacman.framework.factory.FactoryException factoryException19 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass20 = factoryException19.getClass();
        org.jpacman.framework.factory.FactoryException factoryException22 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass23 = factoryException22.getClass();
        factoryException19.addSuppressed((java.lang.Throwable) factoryException22);
        org.jpacman.framework.factory.FactoryException factoryException26 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass27 = factoryException26.getClass();
        org.jpacman.framework.factory.FactoryException factoryException29 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass30 = factoryException29.getClass();
        factoryException26.addSuppressed((java.lang.Throwable) factoryException29);
        factoryException19.addSuppressed((java.lang.Throwable) factoryException29);
        java.lang.Throwable[] throwableArray33 = factoryException19.getSuppressed();
        factoryException9.addSuppressed((java.lang.Throwable) factoryException19);
        java.lang.Throwable[] throwableArray35 = factoryException9.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "org.jpacman.framework.factory.FactoryException: hi!", "" };
        try {
            org.jpacman.framework.model.Game game14 = mapParser6.parseMap(strArray13);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code h");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(game5);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        try {
            org.jpacman.framework.model.Game game8 = mapParser6.parseMap(strArray7);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty map encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(game5);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Wall wall6 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game10 = mapParser8.parseFromFile("");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code D");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(wall6);
        org.junit.Assert.assertNotNull(game7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass4 = factoryException3.getClass();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException3);
        java.lang.String str6 = factoryException3.toString();
        org.jpacman.framework.factory.FactoryException factoryException10 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass11 = factoryException10.getClass();
        org.jpacman.framework.factory.FactoryException factoryException13 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass14 = factoryException13.getClass();
        factoryException10.addSuppressed((java.lang.Throwable) factoryException13);
        org.jpacman.framework.factory.FactoryException factoryException16 = new org.jpacman.framework.factory.FactoryException("", (java.lang.Throwable) factoryException10);
        org.jpacman.framework.factory.FactoryException factoryException17 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException10);
        factoryException3.addSuppressed((java.lang.Throwable) factoryException17);
        org.jpacman.framework.factory.FactoryException factoryException20 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass21 = factoryException20.getClass();
        org.jpacman.framework.factory.FactoryException factoryException23 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass24 = factoryException23.getClass();
        factoryException20.addSuppressed((java.lang.Throwable) factoryException23);
        java.lang.Throwable[] throwableArray26 = factoryException20.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException28 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException30 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass31 = factoryException30.getClass();
        factoryException28.addSuppressed((java.lang.Throwable) factoryException30);
        java.lang.Throwable[] throwableArray33 = factoryException28.getSuppressed();
        java.lang.Throwable[] throwableArray34 = factoryException28.getSuppressed();
        java.lang.Throwable[] throwableArray35 = factoryException28.getSuppressed();
        factoryException20.addSuppressed((java.lang.Throwable) factoryException28);
        org.jpacman.framework.factory.FactoryException factoryException38 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass39 = factoryException38.getClass();
        org.jpacman.framework.factory.FactoryException factoryException41 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass42 = factoryException41.getClass();
        factoryException38.addSuppressed((java.lang.Throwable) factoryException41);
        org.jpacman.framework.factory.FactoryException factoryException45 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass46 = factoryException45.getClass();
        org.jpacman.framework.factory.FactoryException factoryException48 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass49 = factoryException48.getClass();
        factoryException45.addSuppressed((java.lang.Throwable) factoryException48);
        factoryException38.addSuppressed((java.lang.Throwable) factoryException48);
        java.lang.Throwable[] throwableArray52 = factoryException38.getSuppressed();
        factoryException28.addSuppressed((java.lang.Throwable) factoryException38);
        org.jpacman.framework.factory.FactoryException factoryException55 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!");
        factoryException28.addSuppressed((java.lang.Throwable) factoryException55);
        factoryException17.addSuppressed((java.lang.Throwable) factoryException28);
        org.jpacman.framework.factory.FactoryException factoryException59 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException61 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass62 = factoryException61.getClass();
        factoryException59.addSuppressed((java.lang.Throwable) factoryException61);
        java.lang.Throwable[] throwableArray64 = factoryException59.getSuppressed();
        factoryException28.addSuppressed((java.lang.Throwable) factoryException59);
        java.lang.Throwable[] throwableArray66 = factoryException28.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str6.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray66);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader10 = null;
        try {
            java.lang.String[] strArray11 = mapParser9.getMap(bufferedReader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(game7);
        org.junit.Assert.assertNotNull(game8);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) (byte) 0, (int) (byte) 10);
        org.jpacman.framework.model.Food food9 = defaultGameFactory0.makeFood();
        try {
            org.jpacman.framework.model.Board board12 = defaultGameFactory0.makeBoard((int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(food9);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game8 = mapParser6.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(game5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.jpacman.framework.factory.FactoryException factoryException2 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass3 = factoryException2.getClass();
        org.jpacman.framework.factory.FactoryException factoryException5 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass6 = factoryException5.getClass();
        factoryException2.addSuppressed((java.lang.Throwable) factoryException5);
        java.lang.Throwable[] throwableArray8 = factoryException5.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException9 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException5);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game8 = mapParser6.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(game5);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game10 = mapParser8.parseFromFile("org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wall7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser4 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray5 = null;
        try {
            org.jpacman.framework.model.Game game6 = mapParser4.parseMap(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass4 = factoryException3.getClass();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException3);
        java.lang.Class<?> wildcardClass6 = factoryException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.jpacman.framework.factory.FactoryException factoryException2 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass5 = factoryException4.getClass();
        factoryException2.addSuppressed((java.lang.Throwable) factoryException4);
        java.lang.Throwable[] throwableArray7 = factoryException2.getSuppressed();
        java.lang.Throwable[] throwableArray8 = factoryException2.getSuppressed();
        java.lang.Class<?> wildcardClass9 = factoryException2.getClass();
        org.jpacman.framework.factory.FactoryException factoryException10 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException2);
        java.lang.Throwable throwable11 = null;
        try {
            factoryException2.addSuppressed(throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game8 = mapParser6.parseFromFile("org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser4 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game6 = mapParser4.parseFromFile("org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray12 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: hi!", "", "hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "hi!" };
        try {
            org.jpacman.framework.model.Game game13 = mapParser6.parseMap(strArray12);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover2 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game1);
        randomGhostMover2.start();
        randomGhostMover2.doTick();
        org.junit.Assert.assertNotNull(game1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board12 = defaultGameFactory0.makeBoard(0, (int) 'a');
        org.jpacman.framework.factory.MapParser mapParser13 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader14 = null;
        try {
            java.lang.String[] strArray15 = mapParser13.getMap(bufferedReader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(ghost9);
        org.junit.Assert.assertNotNull(board12);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover9 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game8);
        java.awt.event.ActionEvent actionEvent10 = null;
        try {
            randomGhostMover9.actionPerformed(actionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(game8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game8 = mapParser6.parseFromFile("hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall11 = defaultGameFactory0.makeWall();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(ghost9);
        org.junit.Assert.assertNotNull(wall11);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board12 = defaultGameFactory0.makeBoard(0, (int) 'a');
        org.jpacman.framework.model.Food food13 = defaultGameFactory0.makeFood();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(ghost9);
        org.junit.Assert.assertNotNull(board12);
        org.junit.Assert.assertNotNull(food13);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader9 = null;
        try {
            java.lang.String[] strArray10 = mapParser8.getMap(bufferedReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wall7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: ", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game17 = mapParser10.parseMap(strArray16);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty row encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Wall wall6 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Wall wall10 = defaultGameFactory0.makeWall();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(wall6);
        org.junit.Assert.assertNotNull(game7);
        org.junit.Assert.assertNotNull(ghost9);
        org.junit.Assert.assertNotNull(wall10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall8 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game11 = mapParser9.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(wall8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall8 = defaultGameFactory0.makeWall();
        java.lang.Class<?> wildcardClass9 = wall8.getClass();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(game5);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(wall8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(player6);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover2 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game1);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover3 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game1);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover4 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game1);
        randomGhostMover4.stop();
        randomGhostMover4.stop();
        java.awt.event.ActionEvent actionEvent7 = null;
        try {
            randomGhostMover4.actionPerformed(actionEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser3 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser4 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray10 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: ", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: " };
        try {
            org.jpacman.framework.model.Game game11 = mapParser4.parseMap(strArray10);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray16 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: ", "hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: " };
        try {
            org.jpacman.framework.model.Game game17 = mapParser10.parseMap(strArray16);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(ghost9);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player9 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Board board12 = defaultGameFactory0.makeBoard((int) (byte) 10, (int) ' ');
        org.jpacman.framework.model.Game game13 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board16 = defaultGameFactory0.makeBoard((int) (short) 1, (int) (short) 10);
        org.jpacman.framework.model.Food food17 = defaultGameFactory0.makeFood();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(player9);
        org.junit.Assert.assertNotNull(board12);
        org.junit.Assert.assertNotNull(game13);
        org.junit.Assert.assertNotNull(board16);
        org.junit.Assert.assertNotNull(food17);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Player player10 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Board board13 = defaultGameFactory0.makeBoard((int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(game9);
        org.junit.Assert.assertNotNull(player10);
        org.junit.Assert.assertNotNull(board13);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "org.jpacman.framework.factory.FactoryException: ", "org.jpacman.framework.factory.FactoryException: ", "org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "" };
        try {
            org.jpacman.framework.model.Game game14 = mapParser6.parseMap(strArray13);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty row encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall8 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader10 = null;
        try {
            java.lang.String[] strArray11 = mapParser9.getMap(bufferedReader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(wall8);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        org.jpacman.framework.model.Wall wall5 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover8 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game7);
        randomGhostMover8.stop();
        java.awt.event.ActionEvent actionEvent10 = null;
        try {
            randomGhostMover8.actionPerformed(actionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wall5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(game7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader11 = null;
        try {
            java.lang.String[] strArray12 = mapParser10.getMap(bufferedReader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall8 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader11 = null;
        try {
            java.lang.String[] strArray12 = mapParser10.getMap(bufferedReader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(wall8);
        org.junit.Assert.assertNotNull(game9);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game11 = mapParser9.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(ghost8);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray13 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: hi!", "", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game14 = mapParser9.parseMap(strArray13);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(game7);
        org.junit.Assert.assertNotNull(game8);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.jpacman.framework.factory.FactoryException factoryException2 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException2.addSuppressed((java.lang.Throwable) factoryException4);
        org.jpacman.framework.factory.FactoryException factoryException6 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException4);
        org.jpacman.framework.factory.FactoryException factoryException8 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException10 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass11 = factoryException10.getClass();
        factoryException8.addSuppressed((java.lang.Throwable) factoryException10);
        factoryException6.addSuppressed((java.lang.Throwable) factoryException8);
        java.lang.Throwable[] throwableArray14 = factoryException6.getSuppressed();
        java.lang.Throwable[] throwableArray15 = factoryException6.getSuppressed();
        java.lang.Throwable[] throwableArray16 = factoryException6.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException19 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException21 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException19.addSuppressed((java.lang.Throwable) factoryException21);
        org.jpacman.framework.factory.FactoryException factoryException23 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException21);
        org.jpacman.framework.factory.FactoryException factoryException25 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException27 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass28 = factoryException27.getClass();
        factoryException25.addSuppressed((java.lang.Throwable) factoryException27);
        factoryException23.addSuppressed((java.lang.Throwable) factoryException25);
        org.jpacman.framework.factory.FactoryException factoryException35 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException37 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException35.addSuppressed((java.lang.Throwable) factoryException37);
        org.jpacman.framework.factory.FactoryException factoryException39 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException37);
        org.jpacman.framework.factory.FactoryException factoryException40 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException37);
        org.jpacman.framework.factory.FactoryException factoryException41 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException40);
        factoryException25.addSuppressed((java.lang.Throwable) factoryException40);
        factoryException6.addSuppressed((java.lang.Throwable) factoryException40);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(game5);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(food8);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser4 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game6 = mapParser4.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall8 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game12 = mapParser10.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(wall8);
        org.junit.Assert.assertNotNull(game9);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game11 = mapParser9.parseFromFile("org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(ghost8);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: ", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game18 = mapParser10.parseMap(strArray17);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty row encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.jpacman.framework.model.IGameInteractor iGameInteractor0 = null;
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover1 = new org.jpacman.framework.controller.RandomGhostMover(iGameInteractor0);
        randomGhostMover1.stop();
        try {
            randomGhostMover1.doTick();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.Class<?> wildcardClass7 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader9 = null;
        try {
            java.lang.String[] strArray10 = mapParser8.getMap(bufferedReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser3 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser4 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        try {
            org.jpacman.framework.model.Game game6 = mapParser4.parseMap(strArray5);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty map encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        java.lang.Class<?> wildcardClass8 = wall7.getClass();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(game5);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Wall wall1 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser2 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser3 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game5 = mapParser3.parseFromFile("hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(wall1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray13 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: hi!", "hi!" };
        try {
            org.jpacman.framework.model.Game game14 = mapParser10.parseMap(strArray13);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food2 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game3 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover4 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game3);
        java.awt.event.ActionEvent actionEvent5 = null;
        try {
            randomGhostMover4.actionPerformed(actionEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(food2);
        org.junit.Assert.assertNotNull(game3);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game10 = mapParser8.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wall7);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass4 = factoryException3.getClass();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException3);
        java.lang.String str6 = factoryException3.toString();
        org.jpacman.framework.factory.FactoryException factoryException10 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass11 = factoryException10.getClass();
        org.jpacman.framework.factory.FactoryException factoryException13 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass14 = factoryException13.getClass();
        factoryException10.addSuppressed((java.lang.Throwable) factoryException13);
        org.jpacman.framework.factory.FactoryException factoryException16 = new org.jpacman.framework.factory.FactoryException("", (java.lang.Throwable) factoryException10);
        org.jpacman.framework.factory.FactoryException factoryException17 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException10);
        factoryException3.addSuppressed((java.lang.Throwable) factoryException17);
        org.jpacman.framework.factory.FactoryException factoryException20 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass21 = factoryException20.getClass();
        org.jpacman.framework.factory.FactoryException factoryException23 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass24 = factoryException23.getClass();
        factoryException20.addSuppressed((java.lang.Throwable) factoryException23);
        java.lang.Throwable[] throwableArray26 = factoryException20.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException28 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException30 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass31 = factoryException30.getClass();
        factoryException28.addSuppressed((java.lang.Throwable) factoryException30);
        java.lang.Throwable[] throwableArray33 = factoryException28.getSuppressed();
        java.lang.Throwable[] throwableArray34 = factoryException28.getSuppressed();
        java.lang.Throwable[] throwableArray35 = factoryException28.getSuppressed();
        factoryException20.addSuppressed((java.lang.Throwable) factoryException28);
        org.jpacman.framework.factory.FactoryException factoryException38 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass39 = factoryException38.getClass();
        org.jpacman.framework.factory.FactoryException factoryException41 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass42 = factoryException41.getClass();
        factoryException38.addSuppressed((java.lang.Throwable) factoryException41);
        org.jpacman.framework.factory.FactoryException factoryException45 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass46 = factoryException45.getClass();
        org.jpacman.framework.factory.FactoryException factoryException48 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass49 = factoryException48.getClass();
        factoryException45.addSuppressed((java.lang.Throwable) factoryException48);
        factoryException38.addSuppressed((java.lang.Throwable) factoryException48);
        java.lang.Throwable[] throwableArray52 = factoryException38.getSuppressed();
        factoryException28.addSuppressed((java.lang.Throwable) factoryException38);
        org.jpacman.framework.factory.FactoryException factoryException55 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!");
        factoryException28.addSuppressed((java.lang.Throwable) factoryException55);
        factoryException17.addSuppressed((java.lang.Throwable) factoryException28);
        org.jpacman.framework.factory.FactoryException factoryException59 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException61 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass62 = factoryException61.getClass();
        factoryException59.addSuppressed((java.lang.Throwable) factoryException61);
        java.lang.Throwable[] throwableArray64 = factoryException59.getSuppressed();
        factoryException28.addSuppressed((java.lang.Throwable) factoryException59);
        java.lang.String str66 = factoryException59.toString();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str6.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str66.equals("org.jpacman.framework.factory.FactoryException: hi!"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover6 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game5);
        randomGhostMover6.stop();
        java.awt.event.ActionEvent actionEvent8 = null;
        try {
            randomGhostMover6.actionPerformed(actionEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(game5);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray8 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: ", "org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game9 = mapParser5.parseMap(strArray8);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game12 = mapParser10.parseFromFile("org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(ghost9);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game8 = mapParser6.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray10 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game11 = mapParser8.parseMap(strArray10);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food9 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost10 = defaultGameFactory0.makeGhost();
        try {
            org.jpacman.framework.model.Board board13 = defaultGameFactory0.makeBoard((int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(game8);
        org.junit.Assert.assertNotNull(food9);
        org.junit.Assert.assertNotNull(ghost10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException5 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException7 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass8 = factoryException7.getClass();
        factoryException5.addSuppressed((java.lang.Throwable) factoryException7);
        java.lang.String str10 = factoryException5.toString();
        java.lang.Class<?> wildcardClass11 = factoryException5.getClass();
        factoryException3.addSuppressed((java.lang.Throwable) factoryException5);
        java.lang.Throwable[] throwableArray13 = factoryException5.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException18 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException20 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException18.addSuppressed((java.lang.Throwable) factoryException20);
        org.jpacman.framework.factory.FactoryException factoryException22 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException20);
        org.jpacman.framework.factory.FactoryException factoryException23 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException20);
        org.jpacman.framework.factory.FactoryException factoryException24 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException20);
        factoryException5.addSuppressed((java.lang.Throwable) factoryException20);
        factoryException1.addSuppressed((java.lang.Throwable) factoryException5);
        java.lang.Throwable[] throwableArray27 = factoryException5.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str10.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray27);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player9 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Board board12 = defaultGameFactory0.makeBoard((int) (byte) 10, (int) ' ');
        org.jpacman.framework.model.Ghost ghost13 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser14 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game20 = mapParser14.parseMap(strArray19);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code h");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(player9);
        org.junit.Assert.assertNotNull(board12);
        org.junit.Assert.assertNotNull(ghost13);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.jpacman.framework.factory.FactoryException factoryException2 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass5 = factoryException4.getClass();
        factoryException2.addSuppressed((java.lang.Throwable) factoryException4);
        org.jpacman.framework.factory.FactoryException factoryException8 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException10 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException8.addSuppressed((java.lang.Throwable) factoryException10);
        org.jpacman.framework.factory.FactoryException factoryException13 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException15 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException17 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass18 = factoryException17.getClass();
        factoryException15.addSuppressed((java.lang.Throwable) factoryException17);
        java.lang.String str20 = factoryException15.toString();
        java.lang.Class<?> wildcardClass21 = factoryException15.getClass();
        factoryException13.addSuppressed((java.lang.Throwable) factoryException15);
        java.lang.Throwable[] throwableArray23 = factoryException15.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException28 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException30 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException28.addSuppressed((java.lang.Throwable) factoryException30);
        org.jpacman.framework.factory.FactoryException factoryException32 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException30);
        org.jpacman.framework.factory.FactoryException factoryException33 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException30);
        org.jpacman.framework.factory.FactoryException factoryException34 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException30);
        factoryException15.addSuppressed((java.lang.Throwable) factoryException30);
        factoryException8.addSuppressed((java.lang.Throwable) factoryException30);
        factoryException4.addSuppressed((java.lang.Throwable) factoryException30);
        org.jpacman.framework.factory.FactoryException factoryException38 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException30);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str20.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food7 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food9 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game12 = mapParser10.parseFromFile("org.jpacman.framework.factory.FactoryException: ");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException:  not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(food7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(food9);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        java.lang.Class<?> wildcardClass6 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser7 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader8 = null;
        try {
            java.lang.String[] strArray9 = mapParser7.getMap(bufferedReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game4 = defaultGameFactory0.makeGame();
        java.lang.Class<?> wildcardClass5 = game4.getClass();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
        org.junit.Assert.assertNotNull(game4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser3 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game8 = mapParser3.parseMap(strArray7);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code h");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game10 = mapParser8.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(wall7);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.Class<?> wildcardClass7 = defaultGameFactory0.getClass();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(food8);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Wall wall1 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser2 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game4 = mapParser2.parseFromFile("");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code D");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(wall1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray13 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: hi!", "hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game14 = mapParser9.parseMap(strArray13);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.jpacman.framework.model.IGameInteractor iGameInteractor0 = null;
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover1 = new org.jpacman.framework.controller.RandomGhostMover(iGameInteractor0);
        randomGhostMover1.stop();
        java.awt.event.ActionEvent actionEvent3 = null;
        try {
            randomGhostMover1.actionPerformed(actionEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Wall wall1 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser2 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.Class<?> wildcardClass3 = mapParser2.getClass();
        java.lang.String[] strArray4 = new java.lang.String[] {};
        try {
            org.jpacman.framework.model.Game game5 = mapParser2.parseMap(strArray4);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty map encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(wall1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Game game10 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser11 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game13 = mapParser11.parseFromFile("org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(game10);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game3 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game4 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover5 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game4);
        java.awt.event.ActionEvent actionEvent6 = null;
        try {
            randomGhostMover5.actionPerformed(actionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertNotNull(game4);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Wall wall1 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser2 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game4 = mapParser2.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(wall1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Player player8 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game11 = mapParser9.parseFromFile("");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code D");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(player8);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray10 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game11 = mapParser6.parseMap(strArray10);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food9 = defaultGameFactory0.makeFood();
        java.lang.Class<?> wildcardClass10 = food9.getClass();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(game8);
        org.junit.Assert.assertNotNull(food9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game4 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover5 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game4);
        java.awt.event.ActionEvent actionEvent6 = null;
        try {
            randomGhostMover5.actionPerformed(actionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
        org.junit.Assert.assertNotNull(game4);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray12 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: ", "org.jpacman.framework.factory.FactoryException: ", "", "hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game13 = mapParser6.parseMap(strArray12);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food2 = defaultGameFactory0.makeFood();
        try {
            org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(food2);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Game game10 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser11 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "org.jpacman.framework.factory.FactoryException: ", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game17 = mapParser11.parseMap(strArray16);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code h");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(game10);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException6 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException4.addSuppressed((java.lang.Throwable) factoryException6);
        org.jpacman.framework.factory.FactoryException factoryException8 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException6);
        org.jpacman.framework.factory.FactoryException factoryException9 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException6);
        org.jpacman.framework.factory.FactoryException factoryException11 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException13 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass14 = factoryException13.getClass();
        factoryException11.addSuppressed((java.lang.Throwable) factoryException13);
        java.lang.Throwable[] throwableArray16 = factoryException11.getSuppressed();
        java.lang.Throwable[] throwableArray17 = factoryException11.getSuppressed();
        factoryException9.addSuppressed((java.lang.Throwable) factoryException11);
        java.lang.String str19 = factoryException11.toString();
        org.jpacman.framework.factory.FactoryException factoryException20 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException11);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str19.equals("org.jpacman.framework.factory.FactoryException: hi!"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser4 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        try {
            org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game12 = mapParser10.parseFromFile("org.jpacman.framework.factory.FactoryException: ");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException:  not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(food8);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Wall wall1 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser2 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.Class<?> wildcardClass3 = mapParser2.getClass();
        try {
            org.jpacman.framework.model.Game game5 = mapParser2.parseFromFile("");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code D");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(wall1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser7 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray12 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: ", "org.jpacman.framework.factory.FactoryException: " };
        try {
            org.jpacman.framework.model.Game game13 = mapParser7.parseMap(strArray12);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover10 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game9);
        java.awt.event.ActionEvent actionEvent11 = null;
        try {
            randomGhostMover10.actionPerformed(actionEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(game8);
        org.junit.Assert.assertNotNull(game9);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game11 = mapParser9.parseFromFile("");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code D");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(ghost8);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Game game10 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser11 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game13 = mapParser11.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(game10);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall8 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray12 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game13 = mapParser10.parseMap(strArray12);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(wall8);
        org.junit.Assert.assertNotNull(game9);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.Class<?> wildcardClass6 = mapParser5.getClass();
        try {
            org.jpacman.framework.model.Game game8 = mapParser5.parseFromFile("org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover8 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game7);
        randomGhostMover8.stop();
        randomGhostMover8.start();
        randomGhostMover8.doTick();
        java.awt.event.ActionEvent actionEvent12 = null;
        randomGhostMover8.actionPerformed(actionEvent12);
        java.lang.Class<?> wildcardClass14 = randomGhostMover8.getClass();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(game7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board10 = defaultGameFactory0.makeBoard((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(board10);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Wall wall1 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser2 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader3 = null;
        try {
            java.lang.String[] strArray4 = mapParser2.getMap(bufferedReader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wall1);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass4 = factoryException3.getClass();
        org.jpacman.framework.factory.FactoryException factoryException6 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass7 = factoryException6.getClass();
        factoryException3.addSuppressed((java.lang.Throwable) factoryException6);
        java.lang.Throwable[] throwableArray9 = factoryException3.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException11 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException13 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass14 = factoryException13.getClass();
        factoryException11.addSuppressed((java.lang.Throwable) factoryException13);
        java.lang.Throwable[] throwableArray16 = factoryException11.getSuppressed();
        java.lang.Throwable[] throwableArray17 = factoryException11.getSuppressed();
        java.lang.Throwable[] throwableArray18 = factoryException11.getSuppressed();
        factoryException3.addSuppressed((java.lang.Throwable) factoryException11);
        org.jpacman.framework.factory.FactoryException factoryException21 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass22 = factoryException21.getClass();
        org.jpacman.framework.factory.FactoryException factoryException24 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass25 = factoryException24.getClass();
        factoryException21.addSuppressed((java.lang.Throwable) factoryException24);
        org.jpacman.framework.factory.FactoryException factoryException28 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass29 = factoryException28.getClass();
        org.jpacman.framework.factory.FactoryException factoryException31 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass32 = factoryException31.getClass();
        factoryException28.addSuppressed((java.lang.Throwable) factoryException31);
        factoryException21.addSuppressed((java.lang.Throwable) factoryException31);
        java.lang.Throwable[] throwableArray35 = factoryException21.getSuppressed();
        factoryException11.addSuppressed((java.lang.Throwable) factoryException21);
        org.jpacman.framework.factory.FactoryException factoryException37 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException21);
        org.jpacman.framework.factory.FactoryException factoryException38 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException21);
        org.jpacman.framework.factory.FactoryException factoryException41 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass42 = factoryException41.getClass();
        org.jpacman.framework.factory.FactoryException factoryException44 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass45 = factoryException44.getClass();
        factoryException41.addSuppressed((java.lang.Throwable) factoryException44);
        org.jpacman.framework.factory.FactoryException factoryException48 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass49 = factoryException48.getClass();
        org.jpacman.framework.factory.FactoryException factoryException51 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass52 = factoryException51.getClass();
        factoryException48.addSuppressed((java.lang.Throwable) factoryException51);
        factoryException41.addSuppressed((java.lang.Throwable) factoryException51);
        org.jpacman.framework.factory.FactoryException factoryException55 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException41);
        factoryException21.addSuppressed((java.lang.Throwable) factoryException55);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board11 = defaultGameFactory0.makeBoard((int) '4', (int) (byte) 10);
        org.jpacman.framework.factory.MapParser mapParser12 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game14 = mapParser12.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(board11);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Wall wall1 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser2 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser3 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader4 = null;
        try {
            java.lang.String[] strArray5 = mapParser3.getMap(bufferedReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wall1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food7 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food9 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray13 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "" };
        try {
            org.jpacman.framework.model.Game game14 = mapParser10.parseMap(strArray13);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(food7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(food9);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.jpacman.framework.factory.IGameFactory iGameFactory0 = null;
        org.jpacman.framework.factory.MapParser mapParser1 = new org.jpacman.framework.factory.MapParser(iGameFactory0);
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        try {
            org.jpacman.framework.model.Game game4 = mapParser1.parseMap(strArray3);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty row encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray12 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "hi!", "org.jpacman.framework.factory.FactoryException: ", "org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: " };
        try {
            org.jpacman.framework.model.Game game13 = mapParser6.parseMap(strArray12);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray12 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game13 = mapParser6.parseMap(strArray12);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Wall wall6 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game10 = mapParser8.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(wall6);
        org.junit.Assert.assertNotNull(game7);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass4 = factoryException3.getClass();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException3);
        java.lang.String str6 = factoryException1.toString();
        java.lang.String str7 = factoryException1.toString();
        java.lang.Throwable[] throwableArray8 = factoryException1.getSuppressed();
        java.lang.String str9 = factoryException1.toString();
        java.lang.String str10 = factoryException1.toString();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str6.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str7.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str9.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str10.equals("org.jpacman.framework.factory.FactoryException: hi!"));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.Class<?> wildcardClass7 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game10 = mapParser8.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        try {
            org.jpacman.framework.model.Game game8 = mapParser6.parseMap(strArray7);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty map encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall8 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game11 = mapParser9.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(wall8);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Player player9 = defaultGameFactory0.makePlayer();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(game7);
        org.junit.Assert.assertNotNull(game8);
        org.junit.Assert.assertNotNull(player9);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall4 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Player player5 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        try {
            org.jpacman.framework.model.Game game8 = mapParser6.parseMap(strArray7);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty map encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
        org.junit.Assert.assertNotNull(wall4);
        org.junit.Assert.assertNotNull(player5);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall8 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray13 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game14 = mapParser10.parseMap(strArray13);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(wall8);
        org.junit.Assert.assertNotNull(game9);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "" };
        try {
            org.jpacman.framework.model.Game game15 = mapParser10.parseMap(strArray14);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty row encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover8 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game7);
        randomGhostMover8.stop();
        randomGhostMover8.stop();
        randomGhostMover8.stop();
        java.awt.event.ActionEvent actionEvent12 = null;
        try {
            randomGhostMover8.actionPerformed(actionEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(game7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser4 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game10 = mapParser4.parseMap(strArray9);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code h");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game3 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game4 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader6 = null;
        try {
            java.lang.String[] strArray7 = mapParser5.getMap(bufferedReader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertNotNull(game4);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser7 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game9 = mapParser7.parseFromFile("org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game3 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game4 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game7 = mapParser5.parseFromFile("org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertNotNull(game4);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) (byte) 0, (int) (byte) 10);
        org.jpacman.framework.model.Board board11 = defaultGameFactory0.makeBoard(100, (int) (byte) 100);
        org.jpacman.framework.model.Wall wall12 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Board board15 = defaultGameFactory0.makeBoard((int) '.', 0);
        org.jpacman.framework.model.Player player16 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall17 = defaultGameFactory0.makeWall();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(board11);
        org.junit.Assert.assertNotNull(wall12);
        org.junit.Assert.assertNotNull(board15);
        org.junit.Assert.assertNotNull(player16);
        org.junit.Assert.assertNotNull(wall17);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board12 = defaultGameFactory0.makeBoard(0, (int) 'a');
        org.jpacman.framework.factory.MapParser mapParser13 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Board board16 = defaultGameFactory0.makeBoard((int) (byte) 0, (int) '4');
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(ghost9);
        org.junit.Assert.assertNotNull(board12);
        org.junit.Assert.assertNotNull(board16);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Player player10 = defaultGameFactory0.makePlayer();
        try {
            org.jpacman.framework.model.Board board13 = defaultGameFactory0.makeBoard((int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(game9);
        org.junit.Assert.assertNotNull(player10);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        java.lang.Throwable[] throwableArray2 = factoryException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game3 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game4 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray11 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "hi!" };
        try {
            org.jpacman.framework.model.Game game12 = mapParser5.parseMap(strArray11);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertNotNull(game4);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.Class<?> wildcardClass7 = mapParser6.getClass();
        try {
            org.jpacman.framework.model.Game game9 = mapParser6.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.jpacman.framework.factory.FactoryException factoryException2 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass5 = factoryException4.getClass();
        factoryException2.addSuppressed((java.lang.Throwable) factoryException4);
        java.lang.Throwable[] throwableArray7 = factoryException2.getSuppressed();
        java.lang.Throwable[] throwableArray8 = factoryException2.getSuppressed();
        java.lang.Class<?> wildcardClass9 = factoryException2.getClass();
        org.jpacman.framework.factory.FactoryException factoryException10 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException2);
        java.lang.String str11 = factoryException2.toString();
        java.lang.String str12 = factoryException2.toString();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str11.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str12.equals("org.jpacman.framework.factory.FactoryException: hi!"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        java.lang.Class<?> wildcardClass6 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser7 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game9 = mapParser7.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game12 = mapParser10.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(ghost9);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food7 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food10 = defaultGameFactory0.makeFood();
        try {
            org.jpacman.framework.model.Board board13 = defaultGameFactory0.makeBoard((int) 'G', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(food7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(game9);
        org.junit.Assert.assertNotNull(food10);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall9 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader11 = null;
        try {
            java.lang.String[] strArray12 = mapParser10.getMap(bufferedReader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(game8);
        org.junit.Assert.assertNotNull(wall9);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray9 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game10 = mapParser6.parseMap(strArray9);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(game5);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food7 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food10 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Wall wall11 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Player player12 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food13 = defaultGameFactory0.makeFood();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(food7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(game9);
        org.junit.Assert.assertNotNull(food10);
        org.junit.Assert.assertNotNull(wall11);
        org.junit.Assert.assertNotNull(player12);
        org.junit.Assert.assertNotNull(food13);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Player player8 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray16 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: hi!", "hi!", "", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "", "" };
        try {
            org.jpacman.framework.model.Game game17 = mapParser9.parseMap(strArray16);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(player8);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover8 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game7);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover9 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game7);
        java.awt.event.ActionEvent actionEvent10 = null;
        try {
            randomGhostMover9.actionPerformed(actionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(game7);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Player player5 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall6 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Board board9 = defaultGameFactory0.makeBoard((int) '.', (int) (byte) 10);
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(player5);
        org.junit.Assert.assertNotNull(wall6);
        org.junit.Assert.assertNotNull(board9);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        try {
            org.jpacman.framework.model.Board board3 = defaultGameFactory0.makeBoard((int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Player player8 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game12 = mapParser10.parseFromFile("org.jpacman.framework.factory.FactoryException: ");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException:  not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(player8);
        org.junit.Assert.assertNotNull(ghost9);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall4 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Player player5 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Food food7 = defaultGameFactory0.makeFood();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
        org.junit.Assert.assertNotNull(wall4);
        org.junit.Assert.assertNotNull(player5);
        org.junit.Assert.assertNotNull(food7);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.jpacman.framework.factory.FactoryException factoryException2 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass3 = factoryException2.getClass();
        org.jpacman.framework.factory.FactoryException factoryException5 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass6 = factoryException5.getClass();
        factoryException2.addSuppressed((java.lang.Throwable) factoryException5);
        org.jpacman.framework.factory.FactoryException factoryException9 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass10 = factoryException9.getClass();
        org.jpacman.framework.factory.FactoryException factoryException12 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass13 = factoryException12.getClass();
        factoryException9.addSuppressed((java.lang.Throwable) factoryException12);
        factoryException2.addSuppressed((java.lang.Throwable) factoryException12);
        java.lang.Throwable[] throwableArray16 = factoryException2.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException17 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException2);
        java.lang.Throwable[] throwableArray18 = factoryException2.getSuppressed();
        java.lang.String str19 = factoryException2.toString();
        java.lang.Throwable[] throwableArray20 = factoryException2.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str19.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall4 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Player player5 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Game game6 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
        org.junit.Assert.assertNotNull(wall4);
        org.junit.Assert.assertNotNull(player5);
        org.junit.Assert.assertNotNull(game6);
        org.junit.Assert.assertNotNull(wall7);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game11 = mapParser9.parseFromFile("org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(game7);
        org.junit.Assert.assertNotNull(game8);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        try {
            org.jpacman.framework.model.Board board11 = defaultGameFactory0.makeBoard((int) (byte) -1, 40);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(game8);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Wall wall1 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser2 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.Class<?> wildcardClass3 = mapParser2.getClass();
        java.io.BufferedReader bufferedReader4 = null;
        try {
            java.lang.String[] strArray5 = mapParser2.getMap(bufferedReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wall1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall4 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Player player5 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
        org.junit.Assert.assertNotNull(wall4);
        org.junit.Assert.assertNotNull(player5);
        org.junit.Assert.assertNotNull(player6);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.jpacman.framework.factory.FactoryException factoryException6 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass7 = factoryException6.getClass();
        org.jpacman.framework.factory.FactoryException factoryException9 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass10 = factoryException9.getClass();
        factoryException6.addSuppressed((java.lang.Throwable) factoryException9);
        org.jpacman.framework.factory.FactoryException factoryException13 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass14 = factoryException13.getClass();
        org.jpacman.framework.factory.FactoryException factoryException16 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass17 = factoryException16.getClass();
        factoryException13.addSuppressed((java.lang.Throwable) factoryException16);
        factoryException6.addSuppressed((java.lang.Throwable) factoryException16);
        java.lang.Throwable[] throwableArray20 = factoryException6.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException21 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException6);
        org.jpacman.framework.factory.FactoryException factoryException22 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException21);
        java.lang.String str23 = factoryException21.toString();
        java.lang.Throwable[] throwableArray24 = factoryException21.getSuppressed();
        java.lang.Throwable[] throwableArray25 = factoryException21.getSuppressed();
        java.lang.Throwable[] throwableArray26 = factoryException21.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException27 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException21);
        org.jpacman.framework.factory.FactoryException factoryException28 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException21);
        org.jpacman.framework.factory.FactoryException factoryException29 = new org.jpacman.framework.factory.FactoryException("", (java.lang.Throwable) factoryException28);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str23.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        java.lang.Class<?> wildcardClass6 = food5.getClass();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser3 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall4 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover6 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game5);
        java.awt.event.ActionEvent actionEvent7 = null;
        try {
            randomGhostMover6.actionPerformed(actionEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall4);
        org.junit.Assert.assertNotNull(game5);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) (byte) 0, (int) (byte) 10);
        org.jpacman.framework.model.Board board11 = defaultGameFactory0.makeBoard(100, (int) (byte) 100);
        org.jpacman.framework.model.Board board14 = defaultGameFactory0.makeBoard(1, (int) (byte) 100);
        org.jpacman.framework.model.Food food15 = defaultGameFactory0.makeFood();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(board11);
        org.junit.Assert.assertNotNull(board14);
        org.junit.Assert.assertNotNull(food15);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game8 = mapParser6.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        java.lang.Class<?> wildcardClass6 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser7 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray15 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: hi!", "", "org.jpacman.framework.factory.FactoryException: " };
        try {
            org.jpacman.framework.model.Game game16 = mapParser9.parseMap(strArray15);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser4 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.model.Wall wall6 = defaultGameFactory0.makeWall();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wall6);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game3 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game4 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray10 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: ", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game11 = mapParser5.parseMap(strArray10);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertNotNull(game4);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board11 = defaultGameFactory0.makeBoard((int) '4', (int) (byte) 10);
        org.jpacman.framework.factory.MapParser mapParser12 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray13 = null;
        try {
            org.jpacman.framework.model.Game game14 = mapParser12.parseMap(strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(board11);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass4 = factoryException3.getClass();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException3);
        java.lang.Throwable[] throwableArray6 = factoryException1.getSuppressed();
        java.lang.Throwable[] throwableArray7 = factoryException1.getSuppressed();
        java.lang.String str8 = factoryException1.toString();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str8.equals("org.jpacman.framework.factory.FactoryException: hi!"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass4 = factoryException3.getClass();
        org.jpacman.framework.factory.FactoryException factoryException6 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass7 = factoryException6.getClass();
        factoryException3.addSuppressed((java.lang.Throwable) factoryException6);
        org.jpacman.framework.factory.FactoryException factoryException10 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass11 = factoryException10.getClass();
        org.jpacman.framework.factory.FactoryException factoryException13 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass14 = factoryException13.getClass();
        factoryException10.addSuppressed((java.lang.Throwable) factoryException13);
        factoryException3.addSuppressed((java.lang.Throwable) factoryException13);
        java.lang.Throwable[] throwableArray17 = factoryException3.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException18 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException3);
        org.jpacman.framework.factory.FactoryException factoryException19 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException18);
        java.lang.String str20 = factoryException18.toString();
        java.lang.Throwable[] throwableArray21 = factoryException18.getSuppressed();
        java.lang.String str22 = factoryException18.toString();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str20.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str22.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.Class<?> wildcardClass6 = mapParser5.getClass();
        try {
            org.jpacman.framework.model.Game game8 = mapParser5.parseFromFile("hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food7 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food9 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray14 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game15 = mapParser10.parseMap(strArray14);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(food7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(food9);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board11 = defaultGameFactory0.makeBoard((int) '4', (int) (byte) 10);
        org.jpacman.framework.factory.MapParser mapParser12 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray18 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game19 = mapParser12.parseMap(strArray18);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(board11);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game2 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) (short) 10, (int) (short) 1);
        org.jpacman.framework.model.Ghost ghost6 = defaultGameFactory0.makeGhost();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(game2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(ghost6);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Wall wall6 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Food food9 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food10 = defaultGameFactory0.makeFood();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(wall6);
        org.junit.Assert.assertNotNull(game7);
        org.junit.Assert.assertNotNull(food9);
        org.junit.Assert.assertNotNull(food10);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass2 = factoryException1.getClass();
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass5 = factoryException4.getClass();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException4);
        java.lang.Throwable[] throwableArray7 = factoryException1.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException9 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException11 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass12 = factoryException11.getClass();
        factoryException9.addSuppressed((java.lang.Throwable) factoryException11);
        java.lang.Throwable[] throwableArray14 = factoryException9.getSuppressed();
        java.lang.Throwable[] throwableArray15 = factoryException9.getSuppressed();
        java.lang.Throwable[] throwableArray16 = factoryException9.getSuppressed();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException9);
        org.jpacman.framework.factory.FactoryException factoryException19 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass20 = factoryException19.getClass();
        org.jpacman.framework.factory.FactoryException factoryException22 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass23 = factoryException22.getClass();
        factoryException19.addSuppressed((java.lang.Throwable) factoryException22);
        org.jpacman.framework.factory.FactoryException factoryException26 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass27 = factoryException26.getClass();
        org.jpacman.framework.factory.FactoryException factoryException29 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass30 = factoryException29.getClass();
        factoryException26.addSuppressed((java.lang.Throwable) factoryException29);
        factoryException19.addSuppressed((java.lang.Throwable) factoryException29);
        java.lang.Throwable[] throwableArray33 = factoryException19.getSuppressed();
        factoryException9.addSuppressed((java.lang.Throwable) factoryException19);
        org.jpacman.framework.factory.FactoryException factoryException36 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!");
        factoryException9.addSuppressed((java.lang.Throwable) factoryException36);
        java.lang.Throwable[] throwableArray38 = factoryException36.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray38);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover8 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game7);
        randomGhostMover8.start();
        randomGhostMover8.start();
        randomGhostMover8.stop();
        java.awt.event.ActionEvent actionEvent12 = null;
        randomGhostMover8.actionPerformed(actionEvent12);
        randomGhostMover8.stop();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(game7);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException3);
        java.lang.Throwable[] throwableArray5 = factoryException3.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException6 = new org.jpacman.framework.factory.FactoryException("", (java.lang.Throwable) factoryException3);
        java.lang.Class<?> wildcardClass7 = factoryException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover2 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game1);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover3 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game1);
        randomGhostMover3.stop();
        randomGhostMover3.stop();
        org.junit.Assert.assertNotNull(game1);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food7 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food9 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Wall wall10 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser11 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game17 = mapParser11.parseMap(strArray16);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty row encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(food7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(food9);
        org.junit.Assert.assertNotNull(wall10);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game4 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray7 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game8 = mapParser5.parseMap(strArray7);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
        org.junit.Assert.assertNotNull(game4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass4 = factoryException3.getClass();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException3);
        java.lang.String str6 = factoryException1.toString();
        java.lang.String str7 = factoryException1.toString();
        java.lang.Throwable[] throwableArray8 = factoryException1.getSuppressed();
        java.lang.String str9 = factoryException1.toString();
        java.lang.Throwable[] throwableArray10 = factoryException1.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str6.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str7.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str9.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board11 = defaultGameFactory0.makeBoard((int) '4', (int) (byte) 10);
        org.jpacman.framework.factory.MapParser mapParser12 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader13 = null;
        try {
            java.lang.String[] strArray14 = mapParser12.getMap(bufferedReader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(board11);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Player player3 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food4 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost5 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game8 = mapParser6.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(player3);
        org.junit.Assert.assertNotNull(food4);
        org.junit.Assert.assertNotNull(ghost5);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) (byte) 0, (int) (byte) 10);
        org.jpacman.framework.model.Board board11 = defaultGameFactory0.makeBoard(100, (int) (byte) 100);
        org.jpacman.framework.model.Wall wall12 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Board board15 = defaultGameFactory0.makeBoard((int) 'P', 10);
        org.jpacman.framework.factory.MapParser mapParser16 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader17 = null;
        try {
            java.lang.String[] strArray18 = mapParser16.getMap(bufferedReader17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(board11);
        org.junit.Assert.assertNotNull(wall12);
        org.junit.Assert.assertNotNull(board15);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray11 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "" };
        try {
            org.jpacman.framework.model.Game game12 = mapParser8.parseMap(strArray11);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.jpacman.framework.factory.FactoryException factoryException2 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass3 = factoryException2.getClass();
        org.jpacman.framework.factory.FactoryException factoryException5 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass6 = factoryException5.getClass();
        factoryException2.addSuppressed((java.lang.Throwable) factoryException5);
        org.jpacman.framework.factory.FactoryException factoryException9 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass10 = factoryException9.getClass();
        org.jpacman.framework.factory.FactoryException factoryException12 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass13 = factoryException12.getClass();
        factoryException9.addSuppressed((java.lang.Throwable) factoryException12);
        factoryException2.addSuppressed((java.lang.Throwable) factoryException12);
        java.lang.Throwable[] throwableArray16 = factoryException2.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException17 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException2);
        java.lang.Throwable[] throwableArray18 = factoryException2.getSuppressed();
        java.lang.String str19 = factoryException2.toString();
        java.lang.String str20 = factoryException2.toString();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str19.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str20.equals("org.jpacman.framework.factory.FactoryException: hi!"));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass4 = factoryException3.getClass();
        org.jpacman.framework.factory.FactoryException factoryException6 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass7 = factoryException6.getClass();
        factoryException3.addSuppressed((java.lang.Throwable) factoryException6);
        org.jpacman.framework.factory.FactoryException factoryException10 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass11 = factoryException10.getClass();
        org.jpacman.framework.factory.FactoryException factoryException13 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass14 = factoryException13.getClass();
        factoryException10.addSuppressed((java.lang.Throwable) factoryException13);
        factoryException3.addSuppressed((java.lang.Throwable) factoryException13);
        org.jpacman.framework.factory.FactoryException factoryException17 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException3);
        org.jpacman.framework.factory.FactoryException factoryException18 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException17);
        java.lang.Throwable throwable19 = null;
        try {
            factoryException17.addSuppressed(throwable19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray12 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game13 = mapParser5.parseMap(strArray12);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Player player5 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) '4', 0);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        try {
            org.jpacman.framework.model.Game game11 = mapParser9.parseMap(strArray10);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty map encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(player5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game12 = mapParser10.parseFromFile("org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) (byte) 0, (int) (byte) 10);
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover10 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game9);
        java.awt.event.ActionEvent actionEvent11 = null;
        try {
            randomGhostMover10.actionPerformed(actionEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(game9);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) (byte) 0, (int) (byte) 10);
        org.jpacman.framework.model.Board board11 = defaultGameFactory0.makeBoard(100, (int) (byte) 100);
        org.jpacman.framework.model.Wall wall12 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Player player13 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Board board16 = defaultGameFactory0.makeBoard((int) 'P', (int) (short) 10);
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(board11);
        org.junit.Assert.assertNotNull(wall12);
        org.junit.Assert.assertNotNull(player13);
        org.junit.Assert.assertNotNull(board16);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board12 = defaultGameFactory0.makeBoard(0, (int) 'a');
        org.jpacman.framework.factory.MapParser mapParser13 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall14 = defaultGameFactory0.makeWall();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(ghost9);
        org.junit.Assert.assertNotNull(board12);
        org.junit.Assert.assertNotNull(wall14);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Game game10 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food11 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser12 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game14 = mapParser12.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(game10);
        org.junit.Assert.assertNotNull(food11);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass4 = factoryException3.getClass();
        org.jpacman.framework.factory.FactoryException factoryException6 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass7 = factoryException6.getClass();
        factoryException3.addSuppressed((java.lang.Throwable) factoryException6);
        java.lang.Throwable[] throwableArray9 = factoryException3.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException11 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException13 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass14 = factoryException13.getClass();
        factoryException11.addSuppressed((java.lang.Throwable) factoryException13);
        java.lang.Throwable[] throwableArray16 = factoryException11.getSuppressed();
        java.lang.Throwable[] throwableArray17 = factoryException11.getSuppressed();
        java.lang.Throwable[] throwableArray18 = factoryException11.getSuppressed();
        factoryException3.addSuppressed((java.lang.Throwable) factoryException11);
        org.jpacman.framework.factory.FactoryException factoryException21 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass22 = factoryException21.getClass();
        org.jpacman.framework.factory.FactoryException factoryException24 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass25 = factoryException24.getClass();
        factoryException21.addSuppressed((java.lang.Throwable) factoryException24);
        org.jpacman.framework.factory.FactoryException factoryException28 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass29 = factoryException28.getClass();
        org.jpacman.framework.factory.FactoryException factoryException31 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass32 = factoryException31.getClass();
        factoryException28.addSuppressed((java.lang.Throwable) factoryException31);
        factoryException21.addSuppressed((java.lang.Throwable) factoryException31);
        java.lang.Throwable[] throwableArray35 = factoryException21.getSuppressed();
        factoryException11.addSuppressed((java.lang.Throwable) factoryException21);
        org.jpacman.framework.factory.FactoryException factoryException37 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException21);
        org.jpacman.framework.factory.FactoryException factoryException38 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException21);
        java.lang.String str39 = factoryException38.toString();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str39.equals("org.jpacman.framework.factory.FactoryException: hi!"));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Player player9 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food10 = defaultGameFactory0.makeFood();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(game7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(player9);
        org.junit.Assert.assertNotNull(food10);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Player player3 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food4 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost5 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game8 = mapParser6.parseFromFile("org.jpacman.framework.factory.FactoryException: ");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException:  not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(player3);
        org.junit.Assert.assertNotNull(food4);
        org.junit.Assert.assertNotNull(ghost5);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        java.lang.Class<?> wildcardClass6 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser7 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        try {
            org.jpacman.framework.model.Board board11 = defaultGameFactory0.makeBoard((int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(ghost8);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass2 = factoryException1.getClass();
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass5 = factoryException4.getClass();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException4);
        java.lang.Throwable[] throwableArray7 = factoryException1.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException9 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException11 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass12 = factoryException11.getClass();
        factoryException9.addSuppressed((java.lang.Throwable) factoryException11);
        java.lang.Throwable[] throwableArray14 = factoryException9.getSuppressed();
        java.lang.Throwable[] throwableArray15 = factoryException9.getSuppressed();
        java.lang.Throwable[] throwableArray16 = factoryException9.getSuppressed();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException9);
        org.jpacman.framework.factory.FactoryException factoryException19 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass20 = factoryException19.getClass();
        org.jpacman.framework.factory.FactoryException factoryException22 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass23 = factoryException22.getClass();
        factoryException19.addSuppressed((java.lang.Throwable) factoryException22);
        org.jpacman.framework.factory.FactoryException factoryException26 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass27 = factoryException26.getClass();
        org.jpacman.framework.factory.FactoryException factoryException29 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass30 = factoryException29.getClass();
        factoryException26.addSuppressed((java.lang.Throwable) factoryException29);
        factoryException19.addSuppressed((java.lang.Throwable) factoryException29);
        java.lang.Throwable[] throwableArray33 = factoryException19.getSuppressed();
        factoryException9.addSuppressed((java.lang.Throwable) factoryException19);
        java.lang.String str35 = factoryException9.toString();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str35.equals("org.jpacman.framework.factory.FactoryException: hi!"));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game6 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover9 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game8);
        java.awt.event.ActionEvent actionEvent10 = null;
        try {
            randomGhostMover9.actionPerformed(actionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(game6);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(game8);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game12 = mapParser10.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(ghost9);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        try {
            org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) (byte) 0, (int) (byte) 10);
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray15 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: ", "hi!" };
        try {
            org.jpacman.framework.model.Game game16 = mapParser10.parseMap(strArray15);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(game9);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray15 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "hi!", "org.jpacman.framework.factory.FactoryException: ", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game16 = mapParser10.parseMap(strArray15);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.jpacman.framework.factory.FactoryException factoryException2 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException2.addSuppressed((java.lang.Throwable) factoryException4);
        org.jpacman.framework.factory.FactoryException factoryException6 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException4);
        org.jpacman.framework.factory.FactoryException factoryException8 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException10 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass11 = factoryException10.getClass();
        factoryException8.addSuppressed((java.lang.Throwable) factoryException10);
        factoryException6.addSuppressed((java.lang.Throwable) factoryException8);
        java.lang.Throwable[] throwableArray14 = factoryException8.getSuppressed();
        java.lang.Class<?> wildcardClass15 = throwableArray14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser7 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game9 = mapParser7.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser4 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray6 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: " };
        try {
            org.jpacman.framework.model.Game game7 = mapParser4.parseMap(strArray6);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Game game10 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food11 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser12 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        try {
            org.jpacman.framework.model.Game game15 = mapParser12.parseMap(strArray14);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty row encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(game10);
        org.junit.Assert.assertNotNull(food11);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        java.lang.Class<?> wildcardClass10 = defaultGameFactory0.getClass();
        org.jpacman.framework.model.Player player11 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Board board14 = defaultGameFactory0.makeBoard(10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(game8);
        org.junit.Assert.assertNotNull(ghost9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(player11);
        org.junit.Assert.assertNotNull(board14);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game6 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader10 = null;
        try {
            java.lang.String[] strArray11 = mapParser9.getMap(bufferedReader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(game6);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(game8);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall8 = defaultGameFactory0.makeWall();
        java.lang.Class<?> wildcardClass9 = defaultGameFactory0.getClass();
        org.jpacman.framework.model.Player player10 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Game game11 = defaultGameFactory0.makeGame();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(wall8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(player10);
        org.junit.Assert.assertNotNull(game11);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Game game10 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover11 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game10);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover12 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game10);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover13 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game10);
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(game10);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game3 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game4 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray6 = null;
        try {
            org.jpacman.framework.model.Game game7 = mapParser5.parseMap(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertNotNull(game4);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall9 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Player player10 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food11 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food12 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game13 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game14 = defaultGameFactory0.makeGame();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(game8);
        org.junit.Assert.assertNotNull(wall9);
        org.junit.Assert.assertNotNull(player10);
        org.junit.Assert.assertNotNull(food11);
        org.junit.Assert.assertNotNull(food12);
        org.junit.Assert.assertNotNull(game13);
        org.junit.Assert.assertNotNull(game14);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game2 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost3 = defaultGameFactory0.makeGhost();
        java.lang.Class<?> wildcardClass4 = ghost3.getClass();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(game2);
        org.junit.Assert.assertNotNull(ghost3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player9 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Board board12 = defaultGameFactory0.makeBoard((int) (byte) 10, (int) ' ');
        org.jpacman.framework.model.Ghost ghost13 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser14 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall15 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall16 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser17 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray19 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: " };
        try {
            org.jpacman.framework.model.Game game20 = mapParser17.parseMap(strArray19);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(player9);
        org.junit.Assert.assertNotNull(board12);
        org.junit.Assert.assertNotNull(ghost13);
        org.junit.Assert.assertNotNull(wall15);
        org.junit.Assert.assertNotNull(wall16);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game3 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game4 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover5 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game4);
        randomGhostMover5.stop();
        java.awt.event.ActionEvent actionEvent7 = null;
        try {
            randomGhostMover5.actionPerformed(actionEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertNotNull(game4);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game12 = mapParser10.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(ghost8);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall10 = defaultGameFactory0.makeWall();
        java.lang.Class<?> wildcardClass11 = defaultGameFactory0.getClass();
        org.jpacman.framework.model.Player player12 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall13 = defaultGameFactory0.makeWall();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(game9);
        org.junit.Assert.assertNotNull(wall10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(player12);
        org.junit.Assert.assertNotNull(wall13);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException5 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException3.addSuppressed((java.lang.Throwable) factoryException5);
        org.jpacman.framework.factory.FactoryException factoryException7 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException5);
        org.jpacman.framework.factory.FactoryException factoryException8 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException5);
        org.jpacman.framework.factory.FactoryException factoryException10 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException12 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass13 = factoryException12.getClass();
        factoryException10.addSuppressed((java.lang.Throwable) factoryException12);
        java.lang.Throwable[] throwableArray15 = factoryException10.getSuppressed();
        java.lang.Throwable[] throwableArray16 = factoryException10.getSuppressed();
        factoryException8.addSuppressed((java.lang.Throwable) factoryException10);
        org.jpacman.framework.factory.FactoryException factoryException19 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass20 = factoryException19.getClass();
        org.jpacman.framework.factory.FactoryException factoryException22 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass23 = factoryException22.getClass();
        factoryException19.addSuppressed((java.lang.Throwable) factoryException22);
        java.lang.Throwable[] throwableArray25 = factoryException19.getSuppressed();
        java.lang.Throwable[] throwableArray26 = factoryException19.getSuppressed();
        java.lang.String str27 = factoryException19.toString();
        factoryException10.addSuppressed((java.lang.Throwable) factoryException19);
        java.lang.Throwable[] throwableArray29 = factoryException10.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str27.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray29);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Board board9 = defaultGameFactory0.makeBoard((int) (byte) 1, (int) 'a');
        org.jpacman.framework.model.Food food10 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player11 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Game game12 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover13 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game12);
        java.awt.event.ActionEvent actionEvent14 = null;
        try {
            randomGhostMover13.actionPerformed(actionEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(board9);
        org.junit.Assert.assertNotNull(food10);
        org.junit.Assert.assertNotNull(player11);
        org.junit.Assert.assertNotNull(game12);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game6 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board9 = defaultGameFactory0.makeBoard((int) (byte) 0, (int) (byte) 100);
        org.jpacman.framework.model.Board board12 = defaultGameFactory0.makeBoard((int) (short) 1, (int) (short) 1);
        org.jpacman.framework.model.Board board15 = defaultGameFactory0.makeBoard(40, (int) (short) 0);
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(game6);
        org.junit.Assert.assertNotNull(board9);
        org.junit.Assert.assertNotNull(board12);
        org.junit.Assert.assertNotNull(board15);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Game game10 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser11 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game13 = mapParser11.parseFromFile("hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(game10);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass4 = factoryException3.getClass();
        org.jpacman.framework.factory.FactoryException factoryException6 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass7 = factoryException6.getClass();
        factoryException3.addSuppressed((java.lang.Throwable) factoryException6);
        org.jpacman.framework.factory.FactoryException factoryException10 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass11 = factoryException10.getClass();
        org.jpacman.framework.factory.FactoryException factoryException13 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass14 = factoryException13.getClass();
        factoryException10.addSuppressed((java.lang.Throwable) factoryException13);
        factoryException3.addSuppressed((java.lang.Throwable) factoryException13);
        org.jpacman.framework.factory.FactoryException factoryException17 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException3);
        org.jpacman.framework.factory.FactoryException factoryException18 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException3);
        java.lang.String str19 = factoryException18.toString();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str19.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game6 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall8 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game11 = mapParser9.parseFromFile("org.jpacman.framework.factory.FactoryException: ");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException:  not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(game6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(wall8);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game6 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall8 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray12 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game13 = mapParser9.parseMap(strArray12);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(game6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(wall8);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game10 = mapParser8.parseFromFile("");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code D");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wall7);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food7 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food9 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game12 = mapParser10.parseFromFile("");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code D");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(food7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(food9);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Player player8 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        java.lang.Class<?> wildcardClass10 = defaultGameFactory0.getClass();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(player8);
        org.junit.Assert.assertNotNull(ghost9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        org.jpacman.framework.model.Wall wall5 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game12 = mapParser8.parseMap(strArray11);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty row encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wall5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass2 = factoryException1.getClass();
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass5 = factoryException4.getClass();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException4);
        org.jpacman.framework.factory.FactoryException factoryException8 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass9 = factoryException8.getClass();
        org.jpacman.framework.factory.FactoryException factoryException11 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass12 = factoryException11.getClass();
        factoryException8.addSuppressed((java.lang.Throwable) factoryException11);
        factoryException1.addSuppressed((java.lang.Throwable) factoryException11);
        java.lang.String str15 = factoryException1.toString();
        java.lang.String str16 = factoryException1.toString();
        java.lang.String str17 = factoryException1.toString();
        java.lang.Throwable[] throwableArray18 = factoryException1.getSuppressed();
        java.lang.String str19 = factoryException1.toString();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str15.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str16.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str17.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str19.equals("org.jpacman.framework.factory.FactoryException: hi!"));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game11 = mapParser9.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(game7);
        org.junit.Assert.assertNotNull(game8);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) (byte) 0, (int) (byte) 10);
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game10 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Player player11 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player12 = defaultGameFactory0.makePlayer();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(game9);
        org.junit.Assert.assertNotNull(game10);
        org.junit.Assert.assertNotNull(player11);
        org.junit.Assert.assertNotNull(player12);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game6 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover7 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game6);
        randomGhostMover7.stop();
        java.awt.event.ActionEvent actionEvent9 = null;
        try {
            randomGhostMover7.actionPerformed(actionEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(game6);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser4 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) '#', 10);
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
        org.junit.Assert.assertNotNull(board8);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall9 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Player player10 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food11 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food12 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food13 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser14 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader15 = null;
        try {
            java.lang.String[] strArray16 = mapParser14.getMap(bufferedReader15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(game8);
        org.junit.Assert.assertNotNull(wall9);
        org.junit.Assert.assertNotNull(player10);
        org.junit.Assert.assertNotNull(food11);
        org.junit.Assert.assertNotNull(food12);
        org.junit.Assert.assertNotNull(food13);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food2 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game3 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board6 = defaultGameFactory0.makeBoard((int) ' ', (int) '.');
        org.jpacman.framework.factory.MapParser mapParser7 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game11 = mapParser7.parseMap(strArray10);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty row encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(food2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertNotNull(board6);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover10 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game9);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover11 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game9);
        randomGhostMover11.stop();
        java.awt.event.ActionEvent actionEvent13 = null;
        try {
            randomGhostMover11.actionPerformed(actionEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(game9);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food2 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard(100, 0);
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser7 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray14 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game15 = mapParser7.parseMap(strArray14);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(food2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost6 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(ghost6);
        org.junit.Assert.assertNotNull(wall7);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Player player10 = defaultGameFactory0.makePlayer();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(ghost9);
        org.junit.Assert.assertNotNull(player10);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) (byte) 0, (int) (byte) 10);
        org.jpacman.framework.model.Board board11 = defaultGameFactory0.makeBoard(100, (int) (byte) 100);
        org.jpacman.framework.model.Wall wall12 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Player player13 = defaultGameFactory0.makePlayer();
        try {
            org.jpacman.framework.model.Board board16 = defaultGameFactory0.makeBoard((int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(board11);
        org.junit.Assert.assertNotNull(wall12);
        org.junit.Assert.assertNotNull(player13);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        try {
            org.jpacman.framework.model.Game game12 = mapParser10.parseMap(strArray11);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty map encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game2 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) (short) 10, (int) (short) 1);
        try {
            org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(game2);
        org.junit.Assert.assertNotNull(board5);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser3 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser4 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray9 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "", "org.jpacman.framework.factory.FactoryException: ", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game10 = mapParser4.parseMap(strArray9);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board11 = defaultGameFactory0.makeBoard((int) '4', (int) (byte) 10);
        org.jpacman.framework.factory.MapParser mapParser12 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Ghost ghost13 = defaultGameFactory0.makeGhost();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(board11);
        org.junit.Assert.assertNotNull(ghost13);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.Class<?> wildcardClass7 = defaultGameFactory0.getClass();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover10 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game9);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover11 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game9);
        java.awt.event.ActionEvent actionEvent12 = null;
        try {
            randomGhostMover11.actionPerformed(actionEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(game9);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray9 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game10 = mapParser6.parseMap(strArray9);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass2 = factoryException1.getClass();
        java.lang.Class<?> wildcardClass3 = factoryException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Wall wall1 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser2 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray8 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: ", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game9 = mapParser2.parseMap(strArray8);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(wall1);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        java.lang.Class<?> wildcardClass6 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser7 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game9 = mapParser7.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall9 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Player player10 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food11 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food12 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food13 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser14 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.Class<?> wildcardClass15 = defaultGameFactory0.getClass();
        org.jpacman.framework.model.Game game16 = defaultGameFactory0.makeGame();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(game8);
        org.junit.Assert.assertNotNull(wall9);
        org.junit.Assert.assertNotNull(player10);
        org.junit.Assert.assertNotNull(food11);
        org.junit.Assert.assertNotNull(food12);
        org.junit.Assert.assertNotNull(food13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(game16);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game11 = mapParser9.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser2 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game4 = mapParser2.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game2 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) (short) 10, (int) (short) 1);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) 'P', (int) (byte) 1);
        org.jpacman.framework.model.Board board11 = defaultGameFactory0.makeBoard((int) 'G', 0);
        try {
            org.jpacman.framework.model.Board board14 = defaultGameFactory0.makeBoard((-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(game2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(board11);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food7 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board12 = defaultGameFactory0.makeBoard((int) '.', 1);
        org.jpacman.framework.model.Game game13 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover14 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game13);
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(food7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(ghost9);
        org.junit.Assert.assertNotNull(board12);
        org.junit.Assert.assertNotNull(game13);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food7 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food9 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Wall wall10 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Ghost ghost11 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game12 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food13 = defaultGameFactory0.makeFood();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(food7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(food9);
        org.junit.Assert.assertNotNull(wall10);
        org.junit.Assert.assertNotNull(ghost11);
        org.junit.Assert.assertNotNull(game12);
        org.junit.Assert.assertNotNull(food13);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.jpacman.framework.factory.FactoryException factoryException2 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException2.addSuppressed((java.lang.Throwable) factoryException4);
        org.jpacman.framework.factory.FactoryException factoryException7 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException9 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException11 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass12 = factoryException11.getClass();
        factoryException9.addSuppressed((java.lang.Throwable) factoryException11);
        java.lang.String str14 = factoryException9.toString();
        java.lang.Class<?> wildcardClass15 = factoryException9.getClass();
        factoryException7.addSuppressed((java.lang.Throwable) factoryException9);
        java.lang.Throwable[] throwableArray17 = factoryException9.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException22 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException24 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException22.addSuppressed((java.lang.Throwable) factoryException24);
        org.jpacman.framework.factory.FactoryException factoryException26 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException24);
        org.jpacman.framework.factory.FactoryException factoryException27 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException24);
        org.jpacman.framework.factory.FactoryException factoryException28 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException24);
        factoryException9.addSuppressed((java.lang.Throwable) factoryException24);
        factoryException2.addSuppressed((java.lang.Throwable) factoryException24);
        org.jpacman.framework.factory.FactoryException factoryException31 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: ", (java.lang.Throwable) factoryException2);
        org.jpacman.framework.factory.FactoryException factoryException37 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException39 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException37.addSuppressed((java.lang.Throwable) factoryException39);
        org.jpacman.framework.factory.FactoryException factoryException41 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException39);
        org.jpacman.framework.factory.FactoryException factoryException42 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException39);
        org.jpacman.framework.factory.FactoryException factoryException43 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException42);
        org.jpacman.framework.factory.FactoryException factoryException46 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException48 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException46.addSuppressed((java.lang.Throwable) factoryException48);
        org.jpacman.framework.factory.FactoryException factoryException50 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException48);
        factoryException42.addSuppressed((java.lang.Throwable) factoryException48);
        java.lang.String str52 = factoryException48.toString();
        java.lang.Class<?> wildcardClass53 = factoryException48.getClass();
        org.jpacman.framework.factory.FactoryException factoryException54 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException48);
        factoryException2.addSuppressed((java.lang.Throwable) factoryException54);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str14.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str52.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray9 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: hi!", "" };
        try {
            org.jpacman.framework.model.Game game10 = mapParser6.parseMap(strArray9);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass4 = factoryException3.getClass();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException3);
        java.lang.Throwable[] throwableArray6 = factoryException1.getSuppressed();
        java.lang.Throwable[] throwableArray7 = factoryException1.getSuppressed();
        java.lang.Class<?> wildcardClass8 = throwableArray7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass5 = factoryException4.getClass();
        org.jpacman.framework.factory.FactoryException factoryException7 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass8 = factoryException7.getClass();
        factoryException4.addSuppressed((java.lang.Throwable) factoryException7);
        org.jpacman.framework.factory.FactoryException factoryException11 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass12 = factoryException11.getClass();
        org.jpacman.framework.factory.FactoryException factoryException14 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass15 = factoryException14.getClass();
        factoryException11.addSuppressed((java.lang.Throwable) factoryException14);
        factoryException4.addSuppressed((java.lang.Throwable) factoryException14);
        java.lang.Throwable[] throwableArray18 = factoryException4.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException19 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException4);
        org.jpacman.framework.factory.FactoryException factoryException20 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException19);
        java.lang.String str21 = factoryException19.toString();
        java.lang.Throwable[] throwableArray22 = factoryException19.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException23 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException19);
        java.lang.Throwable[] throwableArray24 = factoryException23.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str21.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall9 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Player player10 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food11 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food12 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food13 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser14 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game16 = mapParser14.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(game8);
        org.junit.Assert.assertNotNull(wall9);
        org.junit.Assert.assertNotNull(player10);
        org.junit.Assert.assertNotNull(food11);
        org.junit.Assert.assertNotNull(food12);
        org.junit.Assert.assertNotNull(food13);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Player player3 = defaultGameFactory0.makePlayer();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(player3);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food7 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Wall wall9 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray15 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game16 = mapParser10.parseMap(strArray15);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(food7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(wall9);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser4 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game7 = mapParser5.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.Class<?> wildcardClass10 = mapParser9.getClass();
        try {
            org.jpacman.framework.model.Game game12 = mapParser9.parseFromFile("hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover2 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game1);
        java.lang.Class<?> wildcardClass3 = game1.getClass();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover4 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game1);
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game8 = mapParser6.parseFromFile("org.jpacman.framework.factory.FactoryException: ");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException:  not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player9 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Board board12 = defaultGameFactory0.makeBoard((int) (byte) 10, (int) ' ');
        org.jpacman.framework.model.Ghost ghost13 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser14 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall15 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall16 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser17 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game19 = mapParser17.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(player9);
        org.junit.Assert.assertNotNull(board12);
        org.junit.Assert.assertNotNull(ghost13);
        org.junit.Assert.assertNotNull(wall15);
        org.junit.Assert.assertNotNull(wall16);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game4 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader7 = null;
        try {
            java.lang.String[] strArray8 = mapParser6.getMap(bufferedReader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
        org.junit.Assert.assertNotNull(game4);
        org.junit.Assert.assertNotNull(food5);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost6 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray14 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: ", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game15 = mapParser9.parseMap(strArray14);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(ghost6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall8 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray11 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game12 = mapParser9.parseMap(strArray11);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(wall8);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player9 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Board board12 = defaultGameFactory0.makeBoard((int) (byte) 10, (int) ' ');
        org.jpacman.framework.model.Ghost ghost13 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser14 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall15 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall16 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser17 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Board board20 = defaultGameFactory0.makeBoard((int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(player9);
        org.junit.Assert.assertNotNull(board12);
        org.junit.Assert.assertNotNull(ghost13);
        org.junit.Assert.assertNotNull(wall15);
        org.junit.Assert.assertNotNull(wall16);
        org.junit.Assert.assertNotNull(board20);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food7 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Wall wall9 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray16 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: ", "org.jpacman.framework.factory.FactoryException: " };
        try {
            org.jpacman.framework.model.Game game17 = mapParser10.parseMap(strArray16);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(food7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(wall9);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.jpacman.framework.factory.FactoryException factoryException2 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass5 = factoryException4.getClass();
        factoryException2.addSuppressed((java.lang.Throwable) factoryException4);
        java.lang.Throwable[] throwableArray7 = factoryException2.getSuppressed();
        java.lang.Throwable[] throwableArray8 = factoryException2.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException9 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException2);
        java.lang.Throwable[] throwableArray10 = factoryException9.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover9 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game8);
        java.awt.event.ActionEvent actionEvent10 = null;
        try {
            randomGhostMover9.actionPerformed(actionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(game8);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass5 = factoryException4.getClass();
        org.jpacman.framework.factory.FactoryException factoryException7 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass8 = factoryException7.getClass();
        factoryException4.addSuppressed((java.lang.Throwable) factoryException7);
        org.jpacman.framework.factory.FactoryException factoryException11 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass12 = factoryException11.getClass();
        org.jpacman.framework.factory.FactoryException factoryException14 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass15 = factoryException14.getClass();
        factoryException11.addSuppressed((java.lang.Throwable) factoryException14);
        factoryException4.addSuppressed((java.lang.Throwable) factoryException14);
        java.lang.Throwable[] throwableArray18 = factoryException4.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException19 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException4);
        org.jpacman.framework.factory.FactoryException factoryException20 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException19);
        java.lang.String str21 = factoryException19.toString();
        java.lang.Throwable[] throwableArray22 = factoryException19.getSuppressed();
        java.lang.Throwable[] throwableArray23 = factoryException19.getSuppressed();
        java.lang.Throwable[] throwableArray24 = factoryException19.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException25 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException19);
        org.jpacman.framework.factory.FactoryException factoryException30 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass31 = factoryException30.getClass();
        org.jpacman.framework.factory.FactoryException factoryException33 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass34 = factoryException33.getClass();
        factoryException30.addSuppressed((java.lang.Throwable) factoryException33);
        org.jpacman.framework.factory.FactoryException factoryException37 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass38 = factoryException37.getClass();
        org.jpacman.framework.factory.FactoryException factoryException40 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass41 = factoryException40.getClass();
        factoryException37.addSuppressed((java.lang.Throwable) factoryException40);
        factoryException30.addSuppressed((java.lang.Throwable) factoryException40);
        java.lang.Throwable[] throwableArray44 = factoryException30.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException45 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException30);
        org.jpacman.framework.factory.FactoryException factoryException46 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException45);
        java.lang.String str47 = factoryException45.toString();
        java.lang.Throwable[] throwableArray48 = factoryException45.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException49 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException45);
        factoryException19.addSuppressed((java.lang.Throwable) factoryException49);
        java.lang.Throwable[] throwableArray51 = factoryException49.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str21.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str47.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray51);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game12 = mapParser10.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(food8);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException6 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException4.addSuppressed((java.lang.Throwable) factoryException6);
        org.jpacman.framework.factory.FactoryException factoryException8 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException6);
        org.jpacman.framework.factory.FactoryException factoryException10 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException12 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass13 = factoryException12.getClass();
        factoryException10.addSuppressed((java.lang.Throwable) factoryException12);
        factoryException8.addSuppressed((java.lang.Throwable) factoryException10);
        java.lang.String str16 = factoryException10.toString();
        org.jpacman.framework.factory.FactoryException factoryException17 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException10);
        org.jpacman.framework.factory.FactoryException factoryException18 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException17);
        java.lang.Throwable[] throwableArray19 = factoryException17.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str16.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException6 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException4.addSuppressed((java.lang.Throwable) factoryException6);
        org.jpacman.framework.factory.FactoryException factoryException8 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException6);
        org.jpacman.framework.factory.FactoryException factoryException9 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException6);
        org.jpacman.framework.factory.FactoryException factoryException10 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException9);
        org.jpacman.framework.factory.FactoryException factoryException13 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException15 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException13.addSuppressed((java.lang.Throwable) factoryException15);
        org.jpacman.framework.factory.FactoryException factoryException17 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException15);
        factoryException9.addSuppressed((java.lang.Throwable) factoryException15);
        org.jpacman.framework.factory.FactoryException factoryException21 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException23 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException21.addSuppressed((java.lang.Throwable) factoryException23);
        org.jpacman.framework.factory.FactoryException factoryException25 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException23);
        org.jpacman.framework.factory.FactoryException factoryException27 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException29 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass30 = factoryException29.getClass();
        factoryException27.addSuppressed((java.lang.Throwable) factoryException29);
        factoryException25.addSuppressed((java.lang.Throwable) factoryException27);
        org.jpacman.framework.factory.FactoryException factoryException37 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException39 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException37.addSuppressed((java.lang.Throwable) factoryException39);
        org.jpacman.framework.factory.FactoryException factoryException41 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException39);
        org.jpacman.framework.factory.FactoryException factoryException42 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException39);
        org.jpacman.framework.factory.FactoryException factoryException43 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException42);
        factoryException27.addSuppressed((java.lang.Throwable) factoryException42);
        org.jpacman.framework.factory.FactoryException factoryException46 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException48 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass49 = factoryException48.getClass();
        factoryException46.addSuppressed((java.lang.Throwable) factoryException48);
        org.jpacman.framework.factory.FactoryException factoryException52 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException54 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException52.addSuppressed((java.lang.Throwable) factoryException54);
        org.jpacman.framework.factory.FactoryException factoryException57 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException59 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException61 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass62 = factoryException61.getClass();
        factoryException59.addSuppressed((java.lang.Throwable) factoryException61);
        java.lang.String str64 = factoryException59.toString();
        java.lang.Class<?> wildcardClass65 = factoryException59.getClass();
        factoryException57.addSuppressed((java.lang.Throwable) factoryException59);
        java.lang.Throwable[] throwableArray67 = factoryException59.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException72 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException74 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException72.addSuppressed((java.lang.Throwable) factoryException74);
        org.jpacman.framework.factory.FactoryException factoryException76 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException74);
        org.jpacman.framework.factory.FactoryException factoryException77 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException74);
        org.jpacman.framework.factory.FactoryException factoryException78 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException74);
        factoryException59.addSuppressed((java.lang.Throwable) factoryException74);
        factoryException52.addSuppressed((java.lang.Throwable) factoryException74);
        factoryException48.addSuppressed((java.lang.Throwable) factoryException74);
        factoryException27.addSuppressed((java.lang.Throwable) factoryException74);
        factoryException15.addSuppressed((java.lang.Throwable) factoryException27);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str64.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(throwableArray67);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board11 = defaultGameFactory0.makeBoard((int) '4', (int) (byte) 10);
        org.jpacman.framework.factory.MapParser mapParser12 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game18 = mapParser12.parseMap(strArray17);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty row encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(board11);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Game game10 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food11 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser12 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader13 = null;
        try {
            java.lang.String[] strArray14 = mapParser12.getMap(bufferedReader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(game10);
        org.junit.Assert.assertNotNull(food11);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) (byte) 0, (int) (byte) 10);
        org.jpacman.framework.model.Board board11 = defaultGameFactory0.makeBoard(100, (int) (byte) 100);
        org.jpacman.framework.model.Wall wall12 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Board board15 = defaultGameFactory0.makeBoard((int) 'P', 10);
        org.jpacman.framework.factory.MapParser mapParser16 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray17 = new java.lang.String[] {};
        try {
            org.jpacman.framework.model.Game game18 = mapParser16.parseMap(strArray17);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty map encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(board11);
        org.junit.Assert.assertNotNull(wall12);
        org.junit.Assert.assertNotNull(board15);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Throwable[] throwableArray2 = factoryException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game11 = mapParser9.parseFromFile("hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(ghost8);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        try {
            org.jpacman.framework.model.Board board12 = defaultGameFactory0.makeBoard((-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(game8);
        org.junit.Assert.assertNotNull(ghost9);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.jpacman.framework.factory.FactoryException factoryException2 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass3 = factoryException2.getClass();
        org.jpacman.framework.factory.FactoryException factoryException5 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass6 = factoryException5.getClass();
        factoryException2.addSuppressed((java.lang.Throwable) factoryException5);
        java.lang.Throwable[] throwableArray8 = factoryException2.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException10 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException12 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass13 = factoryException12.getClass();
        factoryException10.addSuppressed((java.lang.Throwable) factoryException12);
        java.lang.Throwable[] throwableArray15 = factoryException10.getSuppressed();
        java.lang.Throwable[] throwableArray16 = factoryException10.getSuppressed();
        java.lang.Throwable[] throwableArray17 = factoryException10.getSuppressed();
        factoryException2.addSuppressed((java.lang.Throwable) factoryException10);
        org.jpacman.framework.factory.FactoryException factoryException20 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass21 = factoryException20.getClass();
        org.jpacman.framework.factory.FactoryException factoryException23 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass24 = factoryException23.getClass();
        factoryException20.addSuppressed((java.lang.Throwable) factoryException23);
        org.jpacman.framework.factory.FactoryException factoryException27 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass28 = factoryException27.getClass();
        org.jpacman.framework.factory.FactoryException factoryException30 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass31 = factoryException30.getClass();
        factoryException27.addSuppressed((java.lang.Throwable) factoryException30);
        factoryException20.addSuppressed((java.lang.Throwable) factoryException30);
        java.lang.Throwable[] throwableArray34 = factoryException20.getSuppressed();
        factoryException10.addSuppressed((java.lang.Throwable) factoryException20);
        org.jpacman.framework.factory.FactoryException factoryException36 = new org.jpacman.framework.factory.FactoryException("", (java.lang.Throwable) factoryException20);
        java.lang.String str37 = factoryException36.toString();
        org.jpacman.framework.factory.FactoryException factoryException40 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass41 = factoryException40.getClass();
        org.jpacman.framework.factory.FactoryException factoryException43 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass44 = factoryException43.getClass();
        factoryException40.addSuppressed((java.lang.Throwable) factoryException43);
        org.jpacman.framework.factory.FactoryException factoryException47 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass48 = factoryException47.getClass();
        org.jpacman.framework.factory.FactoryException factoryException50 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass51 = factoryException50.getClass();
        factoryException47.addSuppressed((java.lang.Throwable) factoryException50);
        factoryException40.addSuppressed((java.lang.Throwable) factoryException50);
        java.lang.Throwable[] throwableArray54 = factoryException40.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException55 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException40);
        java.lang.String str56 = factoryException40.toString();
        org.jpacman.framework.factory.FactoryException factoryException59 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass60 = factoryException59.getClass();
        org.jpacman.framework.factory.FactoryException factoryException62 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass63 = factoryException62.getClass();
        factoryException59.addSuppressed((java.lang.Throwable) factoryException62);
        java.lang.Throwable[] throwableArray65 = factoryException59.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException67 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException69 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass70 = factoryException69.getClass();
        factoryException67.addSuppressed((java.lang.Throwable) factoryException69);
        java.lang.Throwable[] throwableArray72 = factoryException67.getSuppressed();
        java.lang.Throwable[] throwableArray73 = factoryException67.getSuppressed();
        java.lang.Throwable[] throwableArray74 = factoryException67.getSuppressed();
        factoryException59.addSuppressed((java.lang.Throwable) factoryException67);
        java.lang.Class<?> wildcardClass76 = factoryException67.getClass();
        org.jpacman.framework.factory.FactoryException factoryException77 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException67);
        factoryException40.addSuppressed((java.lang.Throwable) factoryException77);
        factoryException36.addSuppressed((java.lang.Throwable) factoryException40);
        org.jpacman.framework.factory.FactoryException factoryException84 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass85 = factoryException84.getClass();
        org.jpacman.framework.factory.FactoryException factoryException87 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass88 = factoryException87.getClass();
        factoryException84.addSuppressed((java.lang.Throwable) factoryException87);
        org.jpacman.framework.factory.FactoryException factoryException90 = new org.jpacman.framework.factory.FactoryException("", (java.lang.Throwable) factoryException84);
        org.jpacman.framework.factory.FactoryException factoryException91 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException84);
        org.jpacman.framework.factory.FactoryException factoryException92 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException84);
        factoryException36.addSuppressed((java.lang.Throwable) factoryException84);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "org.jpacman.framework.factory.FactoryException: " + "'", str37.equals("org.jpacman.framework.factory.FactoryException: "));
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str56.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food2 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game3 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Player player4 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game6 = defaultGameFactory0.makeGame();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(food2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertNotNull(player4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(game6);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food2 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game3 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Player player4 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        try {
            org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(food2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertNotNull(player4);
        org.junit.Assert.assertNotNull(food5);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover2 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game1);
        randomGhostMover2.start();
        randomGhostMover2.stop();
        java.awt.event.ActionEvent actionEvent5 = null;
        randomGhostMover2.actionPerformed(actionEvent5);
        randomGhostMover2.start();
        randomGhostMover2.doTick();
        java.lang.Class<?> wildcardClass9 = randomGhostMover2.getClass();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game4 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game12 = mapParser6.parseMap(strArray11);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty row encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
        org.junit.Assert.assertNotNull(game4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover8 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game7);
        randomGhostMover8.stop();
        randomGhostMover8.start();
        randomGhostMover8.doTick();
        randomGhostMover8.start();
        java.awt.event.ActionEvent actionEvent13 = null;
        randomGhostMover8.actionPerformed(actionEvent13);
        java.awt.event.ActionEvent actionEvent15 = null;
        randomGhostMover8.actionPerformed(actionEvent15);
        java.awt.event.ActionEvent actionEvent17 = null;
        randomGhostMover8.actionPerformed(actionEvent17);
        randomGhostMover8.start();
        java.awt.event.ActionEvent actionEvent20 = null;
        randomGhostMover8.actionPerformed(actionEvent20);
        randomGhostMover8.stop();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(game7);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException5 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException3.addSuppressed((java.lang.Throwable) factoryException5);
        org.jpacman.framework.factory.FactoryException factoryException7 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException5);
        org.jpacman.framework.factory.FactoryException factoryException9 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException11 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass12 = factoryException11.getClass();
        factoryException9.addSuppressed((java.lang.Throwable) factoryException11);
        factoryException7.addSuppressed((java.lang.Throwable) factoryException9);
        java.lang.String str15 = factoryException9.toString();
        org.jpacman.framework.factory.FactoryException factoryException16 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException9);
        org.jpacman.framework.factory.FactoryException factoryException18 = new org.jpacman.framework.factory.FactoryException("");
        factoryException9.addSuppressed((java.lang.Throwable) factoryException18);
        java.lang.Throwable[] throwableArray20 = factoryException9.getSuppressed();
        java.lang.Class<?> wildcardClass21 = factoryException9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str15.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food10 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Wall wall11 = defaultGameFactory0.makeWall();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(game8);
        org.junit.Assert.assertNotNull(ghost9);
        org.junit.Assert.assertNotNull(food10);
        org.junit.Assert.assertNotNull(wall11);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game14 = mapParser10.parseMap(strArray13);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty row encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(ghost9);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover9 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game8);
        randomGhostMover9.stop();
        randomGhostMover9.start();
        java.awt.event.ActionEvent actionEvent12 = null;
        randomGhostMover9.actionPerformed(actionEvent12);
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(game8);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.Class<?> wildcardClass10 = mapParser9.getClass();
        try {
            org.jpacman.framework.model.Game game12 = mapParser9.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Wall wall6 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover8 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game7);
        randomGhostMover8.stop();
        randomGhostMover8.stop();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(wall6);
        org.junit.Assert.assertNotNull(game7);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food7 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Ghost ghost10 = defaultGameFactory0.makeGhost();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(food7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(ghost9);
        org.junit.Assert.assertNotNull(ghost10);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        java.lang.Class<?> wildcardClass6 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser7 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game11 = mapParser9.parseFromFile("");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code D");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(ghost8);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Player player8 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: " };
        try {
            org.jpacman.framework.model.Game game16 = mapParser9.parseMap(strArray15);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code h");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(player8);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game6 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray15 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "hi!", "org.jpacman.framework.factory.FactoryException: ", "org.jpacman.framework.factory.FactoryException: ", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game16 = mapParser8.parseMap(strArray15);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(game6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food7 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Wall wall9 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game12 = mapParser10.parseFromFile("org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(food7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(wall9);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player9 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Board board12 = defaultGameFactory0.makeBoard((int) (byte) 10, (int) ' ');
        org.jpacman.framework.model.Ghost ghost13 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser14 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader15 = null;
        try {
            java.lang.String[] strArray16 = mapParser14.getMap(bufferedReader15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(player9);
        org.junit.Assert.assertNotNull(board12);
        org.junit.Assert.assertNotNull(ghost13);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall9 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Player player10 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food11 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food12 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food13 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser14 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game16 = mapParser14.parseFromFile("");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code D");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(game8);
        org.junit.Assert.assertNotNull(wall9);
        org.junit.Assert.assertNotNull(player10);
        org.junit.Assert.assertNotNull(food11);
        org.junit.Assert.assertNotNull(food12);
        org.junit.Assert.assertNotNull(food13);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException5 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException3.addSuppressed((java.lang.Throwable) factoryException5);
        org.jpacman.framework.factory.FactoryException factoryException7 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException5);
        org.jpacman.framework.factory.FactoryException factoryException9 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException11 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass12 = factoryException11.getClass();
        factoryException9.addSuppressed((java.lang.Throwable) factoryException11);
        factoryException7.addSuppressed((java.lang.Throwable) factoryException9);
        java.lang.String str15 = factoryException9.toString();
        org.jpacman.framework.factory.FactoryException factoryException16 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException9);
        org.jpacman.framework.factory.FactoryException factoryException20 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass21 = factoryException20.getClass();
        org.jpacman.framework.factory.FactoryException factoryException23 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass24 = factoryException23.getClass();
        factoryException20.addSuppressed((java.lang.Throwable) factoryException23);
        org.jpacman.framework.factory.FactoryException factoryException27 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass28 = factoryException27.getClass();
        org.jpacman.framework.factory.FactoryException factoryException30 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass31 = factoryException30.getClass();
        factoryException27.addSuppressed((java.lang.Throwable) factoryException30);
        factoryException20.addSuppressed((java.lang.Throwable) factoryException30);
        java.lang.Throwable[] throwableArray34 = factoryException20.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException35 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException20);
        org.jpacman.framework.factory.FactoryException factoryException36 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException35);
        factoryException16.addSuppressed((java.lang.Throwable) factoryException35);
        java.lang.String str38 = factoryException35.toString();
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str15.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str38.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover6 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game5);
        randomGhostMover6.stop();
        java.lang.Class<?> wildcardClass8 = randomGhostMover6.getClass();
        java.lang.Class<?> wildcardClass9 = randomGhostMover6.getClass();
        randomGhostMover6.start();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(game5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost6 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader9 = null;
        try {
            java.lang.String[] strArray10 = mapParser8.getMap(bufferedReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(ghost6);
        org.junit.Assert.assertNotNull(player7);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException5 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException3.addSuppressed((java.lang.Throwable) factoryException5);
        org.jpacman.framework.factory.FactoryException factoryException7 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException5);
        org.jpacman.framework.factory.FactoryException factoryException9 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException11 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass12 = factoryException11.getClass();
        factoryException9.addSuppressed((java.lang.Throwable) factoryException11);
        factoryException7.addSuppressed((java.lang.Throwable) factoryException9);
        org.jpacman.framework.factory.FactoryException factoryException17 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException19 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass20 = factoryException19.getClass();
        factoryException17.addSuppressed((java.lang.Throwable) factoryException19);
        java.lang.Throwable[] throwableArray22 = factoryException17.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException23 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException17);
        java.lang.Throwable[] throwableArray24 = factoryException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = factoryException23.getSuppressed();
        factoryException9.addSuppressed((java.lang.Throwable) factoryException23);
        org.jpacman.framework.factory.FactoryException factoryException27 = new org.jpacman.framework.factory.FactoryException("", (java.lang.Throwable) factoryException23);
        org.jpacman.framework.factory.FactoryException factoryException31 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException33 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException31.addSuppressed((java.lang.Throwable) factoryException33);
        org.jpacman.framework.factory.FactoryException factoryException35 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException33);
        org.jpacman.framework.factory.FactoryException factoryException37 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException39 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass40 = factoryException39.getClass();
        factoryException37.addSuppressed((java.lang.Throwable) factoryException39);
        factoryException35.addSuppressed((java.lang.Throwable) factoryException37);
        java.lang.Throwable[] throwableArray43 = factoryException35.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException44 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException35);
        factoryException23.addSuppressed((java.lang.Throwable) factoryException44);
        java.lang.String str46 = factoryException23.toString();
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str46.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass4 = factoryException3.getClass();
        org.jpacman.framework.factory.FactoryException factoryException6 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass7 = factoryException6.getClass();
        factoryException3.addSuppressed((java.lang.Throwable) factoryException6);
        org.jpacman.framework.factory.FactoryException factoryException10 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass11 = factoryException10.getClass();
        org.jpacman.framework.factory.FactoryException factoryException13 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass14 = factoryException13.getClass();
        factoryException10.addSuppressed((java.lang.Throwable) factoryException13);
        factoryException3.addSuppressed((java.lang.Throwable) factoryException13);
        java.lang.Throwable[] throwableArray17 = factoryException3.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException18 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException3);
        org.jpacman.framework.factory.FactoryException factoryException19 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException18);
        java.lang.Throwable[] throwableArray20 = factoryException18.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        try {
            org.jpacman.framework.model.Game game11 = mapParser9.parseMap(strArray10);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty map encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) (byte) 0, (int) (byte) 10);
        org.jpacman.framework.model.Food food9 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Wall wall10 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game11 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser12 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader13 = null;
        try {
            java.lang.String[] strArray14 = mapParser12.getMap(bufferedReader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(food9);
        org.junit.Assert.assertNotNull(wall10);
        org.junit.Assert.assertNotNull(game11);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) (byte) 0, (int) (byte) 10);
        org.jpacman.framework.model.Board board11 = defaultGameFactory0.makeBoard(100, (int) (byte) 100);
        org.jpacman.framework.model.Wall wall12 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser13 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader14 = null;
        try {
            java.lang.String[] strArray15 = mapParser13.getMap(bufferedReader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(board11);
        org.junit.Assert.assertNotNull(wall12);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.Class<?> wildcardClass7 = mapParser6.getClass();
        java.io.BufferedReader bufferedReader8 = null;
        try {
            java.lang.String[] strArray9 = mapParser6.getMap(bufferedReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Player player5 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) '4', 0);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader10 = null;
        try {
            java.lang.String[] strArray11 = mapParser9.getMap(bufferedReader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(player5);
        org.junit.Assert.assertNotNull(board8);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall10 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Ghost ghost11 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game12 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game13 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall14 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall15 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall16 = defaultGameFactory0.makeWall();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(wall10);
        org.junit.Assert.assertNotNull(ghost11);
        org.junit.Assert.assertNotNull(game12);
        org.junit.Assert.assertNotNull(game13);
        org.junit.Assert.assertNotNull(wall14);
        org.junit.Assert.assertNotNull(wall15);
        org.junit.Assert.assertNotNull(wall16);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board11 = defaultGameFactory0.makeBoard((int) '4', (int) (byte) 10);
        org.jpacman.framework.factory.MapParser mapParser12 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray18 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: ", "", "org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game19 = mapParser12.parseMap(strArray18);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(board11);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food7 = defaultGameFactory0.makeFood();
        try {
            org.jpacman.framework.model.Board board10 = defaultGameFactory0.makeBoard((int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(game5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(food7);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover6 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game5);
        randomGhostMover6.start();
        randomGhostMover6.start();
        java.awt.event.ActionEvent actionEvent9 = null;
        randomGhostMover6.actionPerformed(actionEvent9);
        randomGhostMover6.doTick();
        randomGhostMover6.stop();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(game5);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException5 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException3.addSuppressed((java.lang.Throwable) factoryException5);
        org.jpacman.framework.factory.FactoryException factoryException7 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException5);
        org.jpacman.framework.factory.FactoryException factoryException9 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException11 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass12 = factoryException11.getClass();
        factoryException9.addSuppressed((java.lang.Throwable) factoryException11);
        factoryException7.addSuppressed((java.lang.Throwable) factoryException9);
        java.lang.String str15 = factoryException9.toString();
        org.jpacman.framework.factory.FactoryException factoryException16 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException9);
        org.jpacman.framework.factory.FactoryException factoryException20 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass21 = factoryException20.getClass();
        org.jpacman.framework.factory.FactoryException factoryException23 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass24 = factoryException23.getClass();
        factoryException20.addSuppressed((java.lang.Throwable) factoryException23);
        org.jpacman.framework.factory.FactoryException factoryException27 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass28 = factoryException27.getClass();
        org.jpacman.framework.factory.FactoryException factoryException30 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass31 = factoryException30.getClass();
        factoryException27.addSuppressed((java.lang.Throwable) factoryException30);
        factoryException20.addSuppressed((java.lang.Throwable) factoryException30);
        java.lang.Throwable[] throwableArray34 = factoryException20.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException35 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException20);
        org.jpacman.framework.factory.FactoryException factoryException36 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException35);
        factoryException16.addSuppressed((java.lang.Throwable) factoryException35);
        org.jpacman.framework.factory.FactoryException factoryException39 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        factoryException16.addSuppressed((java.lang.Throwable) factoryException39);
        org.jpacman.framework.factory.FactoryException factoryException42 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!");
        factoryException16.addSuppressed((java.lang.Throwable) factoryException42);
        java.lang.String str44 = factoryException16.toString();
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str15.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str44.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray8 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game9 = mapParser5.parseMap(strArray8);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food2 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food3 = defaultGameFactory0.makeFood();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(food2);
        org.junit.Assert.assertNotNull(food3);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game11 = mapParser9.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(game7);
        org.junit.Assert.assertNotNull(game8);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass2 = factoryException1.getClass();
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass5 = factoryException4.getClass();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException4);
        java.lang.Throwable[] throwableArray7 = factoryException1.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException9 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException11 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass12 = factoryException11.getClass();
        factoryException9.addSuppressed((java.lang.Throwable) factoryException11);
        java.lang.Throwable[] throwableArray14 = factoryException9.getSuppressed();
        java.lang.Throwable[] throwableArray15 = factoryException9.getSuppressed();
        java.lang.Throwable[] throwableArray16 = factoryException9.getSuppressed();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException9);
        java.lang.String str18 = factoryException9.toString();
        java.lang.Throwable[] throwableArray19 = factoryException9.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException21 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException23 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException25 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException27 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass28 = factoryException27.getClass();
        factoryException25.addSuppressed((java.lang.Throwable) factoryException27);
        java.lang.String str30 = factoryException25.toString();
        java.lang.Class<?> wildcardClass31 = factoryException25.getClass();
        factoryException23.addSuppressed((java.lang.Throwable) factoryException25);
        java.lang.Throwable[] throwableArray33 = factoryException25.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException38 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException40 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException38.addSuppressed((java.lang.Throwable) factoryException40);
        org.jpacman.framework.factory.FactoryException factoryException42 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException40);
        org.jpacman.framework.factory.FactoryException factoryException43 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException40);
        org.jpacman.framework.factory.FactoryException factoryException44 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException40);
        factoryException25.addSuppressed((java.lang.Throwable) factoryException40);
        factoryException21.addSuppressed((java.lang.Throwable) factoryException25);
        org.jpacman.framework.factory.FactoryException factoryException48 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException50 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass51 = factoryException50.getClass();
        factoryException48.addSuppressed((java.lang.Throwable) factoryException50);
        org.jpacman.framework.factory.FactoryException factoryException54 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException56 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException54.addSuppressed((java.lang.Throwable) factoryException56);
        org.jpacman.framework.factory.FactoryException factoryException59 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException61 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException63 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass64 = factoryException63.getClass();
        factoryException61.addSuppressed((java.lang.Throwable) factoryException63);
        java.lang.String str66 = factoryException61.toString();
        java.lang.Class<?> wildcardClass67 = factoryException61.getClass();
        factoryException59.addSuppressed((java.lang.Throwable) factoryException61);
        java.lang.Throwable[] throwableArray69 = factoryException61.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException74 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException76 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException74.addSuppressed((java.lang.Throwable) factoryException76);
        org.jpacman.framework.factory.FactoryException factoryException78 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException76);
        org.jpacman.framework.factory.FactoryException factoryException79 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException76);
        org.jpacman.framework.factory.FactoryException factoryException80 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException76);
        factoryException61.addSuppressed((java.lang.Throwable) factoryException76);
        factoryException54.addSuppressed((java.lang.Throwable) factoryException76);
        factoryException50.addSuppressed((java.lang.Throwable) factoryException76);
        factoryException21.addSuppressed((java.lang.Throwable) factoryException50);
        factoryException9.addSuppressed((java.lang.Throwable) factoryException21);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str18.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str30.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str66.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(throwableArray69);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException3);
        java.lang.Throwable[] throwableArray5 = factoryException3.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException6 = new org.jpacman.framework.factory.FactoryException("", (java.lang.Throwable) factoryException3);
        org.jpacman.framework.factory.FactoryException factoryException9 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException11 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException9.addSuppressed((java.lang.Throwable) factoryException11);
        java.lang.String str13 = factoryException11.toString();
        org.jpacman.framework.factory.FactoryException factoryException14 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException11);
        factoryException3.addSuppressed((java.lang.Throwable) factoryException11);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str13.equals("org.jpacman.framework.factory.FactoryException: hi!"));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall9 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray16 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "hi!", "", "hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game17 = mapParser10.parseMap(strArray16);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(game8);
        org.junit.Assert.assertNotNull(wall9);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover2 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game1);
        randomGhostMover2.start();
        randomGhostMover2.stop();
        java.awt.event.ActionEvent actionEvent5 = null;
        randomGhostMover2.actionPerformed(actionEvent5);
        randomGhostMover2.start();
        java.awt.event.ActionEvent actionEvent8 = null;
        randomGhostMover2.actionPerformed(actionEvent8);
        org.junit.Assert.assertNotNull(game1);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass2 = factoryException1.getClass();
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass5 = factoryException4.getClass();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException4);
        java.lang.Throwable[] throwableArray7 = factoryException1.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException9 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException11 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass12 = factoryException11.getClass();
        factoryException9.addSuppressed((java.lang.Throwable) factoryException11);
        java.lang.Throwable[] throwableArray14 = factoryException9.getSuppressed();
        java.lang.Throwable[] throwableArray15 = factoryException9.getSuppressed();
        java.lang.Throwable[] throwableArray16 = factoryException9.getSuppressed();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException9);
        org.jpacman.framework.factory.FactoryException factoryException19 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass20 = factoryException19.getClass();
        org.jpacman.framework.factory.FactoryException factoryException22 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass23 = factoryException22.getClass();
        factoryException19.addSuppressed((java.lang.Throwable) factoryException22);
        org.jpacman.framework.factory.FactoryException factoryException26 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass27 = factoryException26.getClass();
        org.jpacman.framework.factory.FactoryException factoryException29 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass30 = factoryException29.getClass();
        factoryException26.addSuppressed((java.lang.Throwable) factoryException29);
        factoryException19.addSuppressed((java.lang.Throwable) factoryException29);
        java.lang.Throwable[] throwableArray33 = factoryException19.getSuppressed();
        factoryException9.addSuppressed((java.lang.Throwable) factoryException19);
        org.jpacman.framework.factory.FactoryException factoryException36 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException38 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException36.addSuppressed((java.lang.Throwable) factoryException38);
        factoryException19.addSuppressed((java.lang.Throwable) factoryException38);
        java.lang.String str41 = factoryException19.toString();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str41.equals("org.jpacman.framework.factory.FactoryException: hi!"));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board12 = defaultGameFactory0.makeBoard(0, (int) 'a');
        org.jpacman.framework.factory.MapParser mapParser13 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game15 = mapParser13.parseFromFile("org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(ghost9);
        org.junit.Assert.assertNotNull(board12);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Board board9 = defaultGameFactory0.makeBoard((int) '#', (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = board9.getClass();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(game5);
        org.junit.Assert.assertNotNull(board9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food7 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover10 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game9);
        java.awt.event.ActionEvent actionEvent11 = null;
        try {
            randomGhostMover10.actionPerformed(actionEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(food7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(game9);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover8 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game7);
        randomGhostMover8.start();
        randomGhostMover8.start();
        randomGhostMover8.stop();
        java.awt.event.ActionEvent actionEvent12 = null;
        randomGhostMover8.actionPerformed(actionEvent12);
        java.awt.event.ActionEvent actionEvent14 = null;
        randomGhostMover8.actionPerformed(actionEvent14);
        java.awt.event.ActionEvent actionEvent16 = null;
        randomGhostMover8.actionPerformed(actionEvent16);
        java.awt.event.ActionEvent actionEvent18 = null;
        randomGhostMover8.actionPerformed(actionEvent18);
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(game7);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover8 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game7);
        randomGhostMover8.stop();
        randomGhostMover8.start();
        randomGhostMover8.doTick();
        java.awt.event.ActionEvent actionEvent12 = null;
        randomGhostMover8.actionPerformed(actionEvent12);
        randomGhostMover8.start();
        randomGhostMover8.start();
        randomGhostMover8.doTick();
        randomGhostMover8.doTick();
        randomGhostMover8.stop();
        randomGhostMover8.start();
        java.awt.event.ActionEvent actionEvent20 = null;
        randomGhostMover8.actionPerformed(actionEvent20);
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(game7);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost6 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game10 = mapParser8.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(ghost6);
        org.junit.Assert.assertNotNull(player7);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser3 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall4 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        java.lang.Class<?> wildcardClass7 = defaultGameFactory0.getClass();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Player player9 = defaultGameFactory0.makePlayer();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall4);
        org.junit.Assert.assertNotNull(game5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(game8);
        org.junit.Assert.assertNotNull(player9);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board11 = defaultGameFactory0.makeBoard((int) (short) 100, (int) 'G');
        java.lang.Class<?> wildcardClass12 = defaultGameFactory0.getClass();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(board11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Player player3 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.factory.MapParser mapParser4 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game6 = mapParser4.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(player3);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game6 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader9 = null;
        try {
            java.lang.String[] strArray10 = mapParser8.getMap(bufferedReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(game6);
        org.junit.Assert.assertNotNull(ghost7);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray14 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game15 = mapParser9.parseMap(strArray14);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Wall wall1 = defaultGameFactory0.makeWall();
        try {
            org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(wall1);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Game game10 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food11 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser12 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Game game13 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game14 = defaultGameFactory0.makeGame();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(game10);
        org.junit.Assert.assertNotNull(food11);
        org.junit.Assert.assertNotNull(game13);
        org.junit.Assert.assertNotNull(game14);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        org.jpacman.framework.model.Wall wall5 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader9 = null;
        try {
            java.lang.String[] strArray10 = mapParser8.getMap(bufferedReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wall5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(wall7);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player9 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food10 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost11 = defaultGameFactory0.makeGhost();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(player9);
        org.junit.Assert.assertNotNull(food10);
        org.junit.Assert.assertNotNull(ghost11);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game6 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall8 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        try {
            org.jpacman.framework.model.Game game11 = mapParser9.parseMap(strArray10);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty map encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(game6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(wall8);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover8 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game7);
        randomGhostMover8.stop();
        randomGhostMover8.start();
        randomGhostMover8.doTick();
        randomGhostMover8.start();
        java.awt.event.ActionEvent actionEvent13 = null;
        randomGhostMover8.actionPerformed(actionEvent13);
        java.awt.event.ActionEvent actionEvent15 = null;
        randomGhostMover8.actionPerformed(actionEvent15);
        randomGhostMover8.stop();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(game7);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        java.lang.Class<?> wildcardClass6 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser7 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray10 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: ", "hi!" };
        try {
            org.jpacman.framework.model.Game game11 = mapParser7.parseMap(strArray10);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game10 = mapParser8.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wall7);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover8 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game7);
        randomGhostMover8.stop();
        randomGhostMover8.start();
        randomGhostMover8.doTick();
        randomGhostMover8.start();
        java.awt.event.ActionEvent actionEvent13 = null;
        randomGhostMover8.actionPerformed(actionEvent13);
        java.lang.Class<?> wildcardClass15 = randomGhostMover8.getClass();
        java.awt.event.ActionEvent actionEvent16 = null;
        randomGhostMover8.actionPerformed(actionEvent16);
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(game7);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game2 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost3 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Ghost ghost4 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(game2);
        org.junit.Assert.assertNotNull(ghost3);
        org.junit.Assert.assertNotNull(ghost4);
        org.junit.Assert.assertNotNull(game5);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game3 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Player player4 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader6 = null;
        try {
            java.lang.String[] strArray7 = mapParser5.getMap(bufferedReader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertNotNull(player4);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game12 = mapParser10.parseFromFile("org.jpacman.framework.factory.FactoryException: ");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException:  not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Board board9 = defaultGameFactory0.makeBoard((int) (byte) 1, (int) 'a');
        org.jpacman.framework.model.Food food10 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player11 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Game game12 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser13 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray15 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game16 = mapParser13.parseMap(strArray15);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(board9);
        org.junit.Assert.assertNotNull(food10);
        org.junit.Assert.assertNotNull(player11);
        org.junit.Assert.assertNotNull(game12);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover6 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game5);
        randomGhostMover6.stop();
        randomGhostMover6.start();
        randomGhostMover6.doTick();
        randomGhostMover6.stop();
        java.awt.event.ActionEvent actionEvent11 = null;
        randomGhostMover6.actionPerformed(actionEvent11);
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(game5);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        java.lang.Class<?> wildcardClass6 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser7 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall8 = defaultGameFactory0.makeWall();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wall8);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost6 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game10 = mapParser8.parseFromFile("");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code D");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(ghost6);
        org.junit.Assert.assertNotNull(player7);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) (byte) 0, (int) (byte) 10);
        org.jpacman.framework.model.Board board11 = defaultGameFactory0.makeBoard(100, (int) (byte) 100);
        org.jpacman.framework.model.Wall wall12 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser13 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser14 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader15 = null;
        try {
            java.lang.String[] strArray16 = mapParser14.getMap(bufferedReader15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(board11);
        org.junit.Assert.assertNotNull(wall12);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass4 = factoryException3.getClass();
        org.jpacman.framework.factory.FactoryException factoryException6 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass7 = factoryException6.getClass();
        factoryException3.addSuppressed((java.lang.Throwable) factoryException6);
        org.jpacman.framework.factory.FactoryException factoryException10 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass11 = factoryException10.getClass();
        org.jpacman.framework.factory.FactoryException factoryException13 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass14 = factoryException13.getClass();
        factoryException10.addSuppressed((java.lang.Throwable) factoryException13);
        factoryException3.addSuppressed((java.lang.Throwable) factoryException13);
        org.jpacman.framework.factory.FactoryException factoryException17 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException3);
        java.lang.Class<?> wildcardClass18 = factoryException3.getClass();
        java.lang.Throwable[] throwableArray19 = factoryException3.getSuppressed();
        java.lang.Throwable[] throwableArray20 = factoryException3.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException21 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: ", (java.lang.Throwable) factoryException3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        try {
            org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((-1), (int) 'P');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall9 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Board board12 = defaultGameFactory0.makeBoard((int) '4', (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = defaultGameFactory0.getClass();
        org.jpacman.framework.model.Game game14 = defaultGameFactory0.makeGame();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(game8);
        org.junit.Assert.assertNotNull(wall9);
        org.junit.Assert.assertNotNull(board12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(game14);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.jpacman.framework.factory.FactoryException factoryException2 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass5 = factoryException4.getClass();
        factoryException2.addSuppressed((java.lang.Throwable) factoryException4);
        java.lang.Throwable[] throwableArray7 = factoryException2.getSuppressed();
        java.lang.Throwable[] throwableArray8 = factoryException2.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException9 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException2);
        org.jpacman.framework.factory.FactoryException factoryException12 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException14 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException12.addSuppressed((java.lang.Throwable) factoryException14);
        org.jpacman.framework.factory.FactoryException factoryException16 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException14);
        org.jpacman.framework.factory.FactoryException factoryException18 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException20 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass21 = factoryException20.getClass();
        factoryException18.addSuppressed((java.lang.Throwable) factoryException20);
        factoryException16.addSuppressed((java.lang.Throwable) factoryException18);
        java.lang.Throwable[] throwableArray24 = factoryException16.getSuppressed();
        factoryException2.addSuppressed((java.lang.Throwable) factoryException16);
        org.jpacman.framework.factory.FactoryException factoryException30 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException32 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException30.addSuppressed((java.lang.Throwable) factoryException32);
        org.jpacman.framework.factory.FactoryException factoryException34 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException32);
        org.jpacman.framework.factory.FactoryException factoryException36 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException38 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass39 = factoryException38.getClass();
        factoryException36.addSuppressed((java.lang.Throwable) factoryException38);
        factoryException34.addSuppressed((java.lang.Throwable) factoryException36);
        java.lang.Throwable[] throwableArray42 = factoryException34.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException43 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException34);
        org.jpacman.framework.factory.FactoryException factoryException44 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException34);
        factoryException2.addSuppressed((java.lang.Throwable) factoryException34);
        org.jpacman.framework.factory.FactoryException factoryException50 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass51 = factoryException50.getClass();
        org.jpacman.framework.factory.FactoryException factoryException53 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass54 = factoryException53.getClass();
        factoryException50.addSuppressed((java.lang.Throwable) factoryException53);
        org.jpacman.framework.factory.FactoryException factoryException57 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass58 = factoryException57.getClass();
        org.jpacman.framework.factory.FactoryException factoryException60 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass61 = factoryException60.getClass();
        factoryException57.addSuppressed((java.lang.Throwable) factoryException60);
        factoryException50.addSuppressed((java.lang.Throwable) factoryException60);
        java.lang.Throwable[] throwableArray64 = factoryException50.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException65 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException50);
        org.jpacman.framework.factory.FactoryException factoryException66 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException65);
        java.lang.String str67 = factoryException65.toString();
        java.lang.Throwable[] throwableArray68 = factoryException65.getSuppressed();
        java.lang.Throwable[] throwableArray69 = factoryException65.getSuppressed();
        java.lang.Throwable[] throwableArray70 = factoryException65.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException71 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException65);
        org.jpacman.framework.factory.FactoryException factoryException76 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass77 = factoryException76.getClass();
        org.jpacman.framework.factory.FactoryException factoryException79 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass80 = factoryException79.getClass();
        factoryException76.addSuppressed((java.lang.Throwable) factoryException79);
        org.jpacman.framework.factory.FactoryException factoryException83 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass84 = factoryException83.getClass();
        org.jpacman.framework.factory.FactoryException factoryException86 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass87 = factoryException86.getClass();
        factoryException83.addSuppressed((java.lang.Throwable) factoryException86);
        factoryException76.addSuppressed((java.lang.Throwable) factoryException86);
        java.lang.Throwable[] throwableArray90 = factoryException76.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException91 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException76);
        org.jpacman.framework.factory.FactoryException factoryException92 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException91);
        java.lang.String str93 = factoryException91.toString();
        java.lang.Throwable[] throwableArray94 = factoryException91.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException95 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException91);
        factoryException65.addSuppressed((java.lang.Throwable) factoryException95);
        factoryException34.addSuppressed((java.lang.Throwable) factoryException95);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str67.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertNotNull(throwableArray90);
        org.junit.Assert.assertTrue("'" + str93 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str93.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray94);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Ghost ghost11 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Wall wall12 = defaultGameFactory0.makeWall();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(ghost9);
        org.junit.Assert.assertNotNull(ghost11);
        org.junit.Assert.assertNotNull(wall12);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser4 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader6 = null;
        try {
            java.lang.String[] strArray7 = mapParser5.getMap(bufferedReader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Player player3 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food4 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost5 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray10 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game11 = mapParser6.parseMap(strArray10);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(player3);
        org.junit.Assert.assertNotNull(food4);
        org.junit.Assert.assertNotNull(ghost5);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) (byte) 0, (int) (byte) 10);
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game10 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Player player11 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.factory.MapParser mapParser12 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray14 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game15 = mapParser12.parseMap(strArray14);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(game9);
        org.junit.Assert.assertNotNull(game10);
        org.junit.Assert.assertNotNull(player11);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food7 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food9 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Wall wall10 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser11 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Board board14 = defaultGameFactory0.makeBoard((int) (short) 0, (int) (byte) 10);
        org.jpacman.framework.model.Board board17 = defaultGameFactory0.makeBoard(1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(food7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(food9);
        org.junit.Assert.assertNotNull(wall10);
        org.junit.Assert.assertNotNull(board14);
        org.junit.Assert.assertNotNull(board17);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game6 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray16 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game17 = mapParser9.parseMap(strArray16);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(game6);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(game8);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.Class<?> wildcardClass7 = defaultGameFactory0.getClass();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall9 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Player player10 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.factory.MapParser mapParser11 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game13 = mapParser11.parseFromFile("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi! not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(game8);
        org.junit.Assert.assertNotNull(wall9);
        org.junit.Assert.assertNotNull(player10);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) (byte) 0, (int) (byte) 10);
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover10 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game9);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover11 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game9);
        java.awt.event.ActionEvent actionEvent12 = null;
        try {
            randomGhostMover11.actionPerformed(actionEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(game9);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Player player5 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall6 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser7 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        java.lang.Class<?> wildcardClass9 = food8.getClass();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(player5);
        org.junit.Assert.assertNotNull(wall6);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game4 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Ghost ghost6 = defaultGameFactory0.makeGhost();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
        org.junit.Assert.assertNotNull(game4);
        org.junit.Assert.assertNotNull(ghost6);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException5 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException3.addSuppressed((java.lang.Throwable) factoryException5);
        org.jpacman.framework.factory.FactoryException factoryException7 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException5);
        org.jpacman.framework.factory.FactoryException factoryException9 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException11 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass12 = factoryException11.getClass();
        factoryException9.addSuppressed((java.lang.Throwable) factoryException11);
        factoryException7.addSuppressed((java.lang.Throwable) factoryException9);
        org.jpacman.framework.factory.FactoryException factoryException19 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException21 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException19.addSuppressed((java.lang.Throwable) factoryException21);
        org.jpacman.framework.factory.FactoryException factoryException23 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException21);
        org.jpacman.framework.factory.FactoryException factoryException24 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException21);
        org.jpacman.framework.factory.FactoryException factoryException25 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException24);
        factoryException9.addSuppressed((java.lang.Throwable) factoryException24);
        java.lang.Class<?> wildcardClass27 = factoryException9.getClass();
        org.jpacman.framework.factory.FactoryException factoryException28 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException9);
        java.lang.Throwable throwable29 = null;
        try {
            factoryException28.addSuppressed(throwable29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass2 = factoryException1.getClass();
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass5 = factoryException4.getClass();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException4);
        java.lang.Throwable[] throwableArray7 = factoryException1.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException9 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException11 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass12 = factoryException11.getClass();
        factoryException9.addSuppressed((java.lang.Throwable) factoryException11);
        java.lang.Throwable[] throwableArray14 = factoryException9.getSuppressed();
        java.lang.Throwable[] throwableArray15 = factoryException9.getSuppressed();
        java.lang.Throwable[] throwableArray16 = factoryException9.getSuppressed();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException9);
        java.lang.Throwable[] throwableArray18 = factoryException1.getSuppressed();
        java.lang.Throwable[] throwableArray19 = factoryException1.getSuppressed();
        java.lang.Class<?> wildcardClass20 = factoryException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game10 = mapParser8.parseFromFile("");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code D");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(wall7);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException6 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException4.addSuppressed((java.lang.Throwable) factoryException6);
        org.jpacman.framework.factory.FactoryException factoryException8 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException6);
        org.jpacman.framework.factory.FactoryException factoryException10 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException12 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass13 = factoryException12.getClass();
        factoryException10.addSuppressed((java.lang.Throwable) factoryException12);
        factoryException8.addSuppressed((java.lang.Throwable) factoryException10);
        java.lang.String str16 = factoryException8.toString();
        org.jpacman.framework.factory.FactoryException factoryException17 = new org.jpacman.framework.factory.FactoryException("", (java.lang.Throwable) factoryException8);
        org.jpacman.framework.factory.FactoryException factoryException18 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException17);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str16.equals("org.jpacman.framework.factory.FactoryException: hi!"));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover9 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game8);
        randomGhostMover9.stop();
        java.awt.event.ActionEvent actionEvent11 = null;
        try {
            randomGhostMover9.actionPerformed(actionEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(game8);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Game game8 = mapParser6.parseFromFile("");
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code D");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(game5);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException5 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException3.addSuppressed((java.lang.Throwable) factoryException5);
        org.jpacman.framework.factory.FactoryException factoryException7 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException5);
        org.jpacman.framework.factory.FactoryException factoryException8 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException5);
        org.jpacman.framework.factory.FactoryException factoryException10 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException12 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass13 = factoryException12.getClass();
        factoryException10.addSuppressed((java.lang.Throwable) factoryException12);
        java.lang.Throwable[] throwableArray15 = factoryException10.getSuppressed();
        java.lang.Throwable[] throwableArray16 = factoryException10.getSuppressed();
        factoryException8.addSuppressed((java.lang.Throwable) factoryException10);
        org.jpacman.framework.factory.FactoryException factoryException19 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException21 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass22 = factoryException21.getClass();
        factoryException19.addSuppressed((java.lang.Throwable) factoryException21);
        java.lang.Throwable[] throwableArray24 = factoryException19.getSuppressed();
        factoryException8.addSuppressed((java.lang.Throwable) factoryException19);
        java.lang.Class<?> wildcardClass26 = factoryException8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall9 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Player player10 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food11 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food12 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food13 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser14 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser15 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader16 = null;
        try {
            java.lang.String[] strArray17 = mapParser15.getMap(bufferedReader16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(game8);
        org.junit.Assert.assertNotNull(wall9);
        org.junit.Assert.assertNotNull(player10);
        org.junit.Assert.assertNotNull(food11);
        org.junit.Assert.assertNotNull(food12);
        org.junit.Assert.assertNotNull(food13);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.Class<?> wildcardClass7 = defaultGameFactory0.getClass();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Player player10 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall11 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Player player12 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.factory.MapParser mapParser13 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        try {
            org.jpacman.framework.model.Board board16 = defaultGameFactory0.makeBoard((int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(game9);
        org.junit.Assert.assertNotNull(player10);
        org.junit.Assert.assertNotNull(wall11);
        org.junit.Assert.assertNotNull(player12);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Player player5 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall6 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        try {
            org.jpacman.framework.model.Board board10 = defaultGameFactory0.makeBoard(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(player5);
        org.junit.Assert.assertNotNull(wall6);
        org.junit.Assert.assertNotNull(game7);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food7 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board12 = defaultGameFactory0.makeBoard((int) '.', 1);
        org.jpacman.framework.model.Game game13 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall14 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Board board17 = defaultGameFactory0.makeBoard((int) (byte) 100, 0);
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(food7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(ghost9);
        org.junit.Assert.assertNotNull(board12);
        org.junit.Assert.assertNotNull(game13);
        org.junit.Assert.assertNotNull(wall14);
        org.junit.Assert.assertNotNull(board17);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser4 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(wall3);
        org.junit.Assert.assertNotNull(food5);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass5 = factoryException4.getClass();
        org.jpacman.framework.factory.FactoryException factoryException7 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass8 = factoryException7.getClass();
        factoryException4.addSuppressed((java.lang.Throwable) factoryException7);
        java.lang.Throwable[] throwableArray10 = factoryException4.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException12 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException14 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass15 = factoryException14.getClass();
        factoryException12.addSuppressed((java.lang.Throwable) factoryException14);
        java.lang.Throwable[] throwableArray17 = factoryException12.getSuppressed();
        java.lang.Throwable[] throwableArray18 = factoryException12.getSuppressed();
        java.lang.Throwable[] throwableArray19 = factoryException12.getSuppressed();
        factoryException4.addSuppressed((java.lang.Throwable) factoryException12);
        org.jpacman.framework.factory.FactoryException factoryException22 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass23 = factoryException22.getClass();
        org.jpacman.framework.factory.FactoryException factoryException25 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass26 = factoryException25.getClass();
        factoryException22.addSuppressed((java.lang.Throwable) factoryException25);
        org.jpacman.framework.factory.FactoryException factoryException29 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass30 = factoryException29.getClass();
        org.jpacman.framework.factory.FactoryException factoryException32 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass33 = factoryException32.getClass();
        factoryException29.addSuppressed((java.lang.Throwable) factoryException32);
        factoryException22.addSuppressed((java.lang.Throwable) factoryException32);
        java.lang.Throwable[] throwableArray36 = factoryException22.getSuppressed();
        factoryException12.addSuppressed((java.lang.Throwable) factoryException22);
        org.jpacman.framework.factory.FactoryException factoryException38 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException22);
        org.jpacman.framework.factory.FactoryException factoryException39 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException22);
        org.jpacman.framework.factory.FactoryException factoryException40 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException22);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(throwableArray36);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.jpacman.framework.factory.FactoryException factoryException2 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass5 = factoryException4.getClass();
        factoryException2.addSuppressed((java.lang.Throwable) factoryException4);
        java.lang.Throwable[] throwableArray7 = factoryException2.getSuppressed();
        java.lang.Throwable[] throwableArray8 = factoryException2.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException9 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException2);
        java.lang.String str10 = factoryException9.toString();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str10.equals("org.jpacman.framework.factory.FactoryException: hi!"));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food2 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game3 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board6 = defaultGameFactory0.makeBoard((int) '.', (int) ' ');
        org.jpacman.framework.model.Food food7 = defaultGameFactory0.makeFood();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(food2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertNotNull(board6);
        org.junit.Assert.assertNotNull(food7);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game6 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board9 = defaultGameFactory0.makeBoard((int) (byte) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser11 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader12 = null;
        try {
            java.lang.String[] strArray13 = mapParser11.getMap(bufferedReader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(game6);
        org.junit.Assert.assertNotNull(board9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board12 = defaultGameFactory0.makeBoard(0, (int) 'a');
        org.jpacman.framework.factory.MapParser mapParser13 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray17 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game18 = mapParser13.parseMap(strArray17);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(ghost9);
        org.junit.Assert.assertNotNull(board12);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.Class<?> wildcardClass6 = mapParser5.getClass();
        java.io.BufferedReader bufferedReader7 = null;
        try {
            java.lang.String[] strArray8 = mapParser5.getMap(bufferedReader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass2 = factoryException1.getClass();
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass5 = factoryException4.getClass();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException4);
        org.jpacman.framework.factory.FactoryException factoryException8 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass9 = factoryException8.getClass();
        org.jpacman.framework.factory.FactoryException factoryException11 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass12 = factoryException11.getClass();
        factoryException8.addSuppressed((java.lang.Throwable) factoryException11);
        factoryException1.addSuppressed((java.lang.Throwable) factoryException11);
        java.lang.String str15 = factoryException1.toString();
        java.lang.String str16 = factoryException1.toString();
        org.jpacman.framework.factory.FactoryException factoryException20 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException22 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException20.addSuppressed((java.lang.Throwable) factoryException22);
        org.jpacman.framework.factory.FactoryException factoryException24 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException22);
        org.jpacman.framework.factory.FactoryException factoryException26 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException28 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass29 = factoryException28.getClass();
        factoryException26.addSuppressed((java.lang.Throwable) factoryException28);
        factoryException24.addSuppressed((java.lang.Throwable) factoryException26);
        java.lang.Throwable[] throwableArray32 = factoryException24.getSuppressed();
        java.lang.Throwable[] throwableArray33 = factoryException24.getSuppressed();
        java.lang.Throwable[] throwableArray34 = factoryException24.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException35 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException24);
        factoryException1.addSuppressed((java.lang.Throwable) factoryException24);
        org.jpacman.framework.factory.FactoryException factoryException39 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException41 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException43 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass44 = factoryException43.getClass();
        factoryException41.addSuppressed((java.lang.Throwable) factoryException43);
        java.lang.String str46 = factoryException41.toString();
        java.lang.Class<?> wildcardClass47 = factoryException41.getClass();
        factoryException39.addSuppressed((java.lang.Throwable) factoryException41);
        java.lang.Throwable[] throwableArray49 = factoryException41.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException54 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException56 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException54.addSuppressed((java.lang.Throwable) factoryException56);
        org.jpacman.framework.factory.FactoryException factoryException58 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException56);
        org.jpacman.framework.factory.FactoryException factoryException59 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException56);
        org.jpacman.framework.factory.FactoryException factoryException60 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException56);
        factoryException41.addSuppressed((java.lang.Throwable) factoryException56);
        org.jpacman.framework.factory.FactoryException factoryException63 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass64 = factoryException63.getClass();
        org.jpacman.framework.factory.FactoryException factoryException66 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass67 = factoryException66.getClass();
        factoryException63.addSuppressed((java.lang.Throwable) factoryException66);
        java.lang.Throwable[] throwableArray69 = factoryException63.getSuppressed();
        java.lang.Throwable[] throwableArray70 = factoryException63.getSuppressed();
        java.lang.String str71 = factoryException63.toString();
        factoryException56.addSuppressed((java.lang.Throwable) factoryException63);
        org.jpacman.framework.factory.FactoryException factoryException73 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException56);
        org.jpacman.framework.factory.FactoryException factoryException77 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass78 = factoryException77.getClass();
        org.jpacman.framework.factory.FactoryException factoryException80 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass81 = factoryException80.getClass();
        factoryException77.addSuppressed((java.lang.Throwable) factoryException80);
        org.jpacman.framework.factory.FactoryException factoryException83 = new org.jpacman.framework.factory.FactoryException("", (java.lang.Throwable) factoryException77);
        java.lang.String str84 = factoryException83.toString();
        java.lang.String str85 = factoryException83.toString();
        org.jpacman.framework.factory.FactoryException factoryException86 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: ", (java.lang.Throwable) factoryException83);
        factoryException56.addSuppressed((java.lang.Throwable) factoryException86);
        factoryException24.addSuppressed((java.lang.Throwable) factoryException86);
        java.lang.String str89 = factoryException24.toString();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str15.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str16.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str46.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str71.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "org.jpacman.framework.factory.FactoryException: " + "'", str84.equals("org.jpacman.framework.factory.FactoryException: "));
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "org.jpacman.framework.factory.FactoryException: " + "'", str85.equals("org.jpacman.framework.factory.FactoryException: "));
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str89.equals("org.jpacman.framework.factory.FactoryException: hi!"));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) (byte) 0, (int) (byte) 10);
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray15 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: " };
        try {
            org.jpacman.framework.model.Game game16 = mapParser10.parseMap(strArray15);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(game9);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover2 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game1);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover3 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game1);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover4 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game1);
        randomGhostMover4.stop();
        java.awt.event.ActionEvent actionEvent6 = null;
        try {
            randomGhostMover4.actionPerformed(actionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        java.lang.Class<?> wildcardClass6 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser7 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader10 = null;
        try {
            java.lang.String[] strArray11 = mapParser9.getMap(bufferedReader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(ghost8);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Wall wall6 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover8 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game7);
        randomGhostMover8.start();
        java.awt.event.ActionEvent actionEvent10 = null;
        randomGhostMover8.actionPerformed(actionEvent10);
        randomGhostMover8.start();
        randomGhostMover8.doTick();
        randomGhostMover8.stop();
        randomGhostMover8.start();
        java.awt.event.ActionEvent actionEvent16 = null;
        randomGhostMover8.actionPerformed(actionEvent16);
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(wall6);
        org.junit.Assert.assertNotNull(game7);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board12 = defaultGameFactory0.makeBoard(0, (int) 'a');
        org.jpacman.framework.factory.MapParser mapParser13 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray14 = null;
        try {
            org.jpacman.framework.model.Game game15 = mapParser13.parseMap(strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(ghost9);
        org.junit.Assert.assertNotNull(board12);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass4 = factoryException3.getClass();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException3);
        java.lang.String str6 = factoryException3.toString();
        org.jpacman.framework.factory.FactoryException factoryException10 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass11 = factoryException10.getClass();
        org.jpacman.framework.factory.FactoryException factoryException13 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass14 = factoryException13.getClass();
        factoryException10.addSuppressed((java.lang.Throwable) factoryException13);
        org.jpacman.framework.factory.FactoryException factoryException16 = new org.jpacman.framework.factory.FactoryException("", (java.lang.Throwable) factoryException10);
        org.jpacman.framework.factory.FactoryException factoryException17 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException10);
        factoryException3.addSuppressed((java.lang.Throwable) factoryException17);
        org.jpacman.framework.factory.FactoryException factoryException20 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass21 = factoryException20.getClass();
        org.jpacman.framework.factory.FactoryException factoryException23 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass24 = factoryException23.getClass();
        factoryException20.addSuppressed((java.lang.Throwable) factoryException23);
        java.lang.Throwable[] throwableArray26 = factoryException20.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException28 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException30 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass31 = factoryException30.getClass();
        factoryException28.addSuppressed((java.lang.Throwable) factoryException30);
        java.lang.Throwable[] throwableArray33 = factoryException28.getSuppressed();
        java.lang.Throwable[] throwableArray34 = factoryException28.getSuppressed();
        java.lang.Throwable[] throwableArray35 = factoryException28.getSuppressed();
        factoryException20.addSuppressed((java.lang.Throwable) factoryException28);
        org.jpacman.framework.factory.FactoryException factoryException38 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass39 = factoryException38.getClass();
        org.jpacman.framework.factory.FactoryException factoryException41 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass42 = factoryException41.getClass();
        factoryException38.addSuppressed((java.lang.Throwable) factoryException41);
        org.jpacman.framework.factory.FactoryException factoryException45 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass46 = factoryException45.getClass();
        org.jpacman.framework.factory.FactoryException factoryException48 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass49 = factoryException48.getClass();
        factoryException45.addSuppressed((java.lang.Throwable) factoryException48);
        factoryException38.addSuppressed((java.lang.Throwable) factoryException48);
        java.lang.Throwable[] throwableArray52 = factoryException38.getSuppressed();
        factoryException28.addSuppressed((java.lang.Throwable) factoryException38);
        org.jpacman.framework.factory.FactoryException factoryException55 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!");
        factoryException28.addSuppressed((java.lang.Throwable) factoryException55);
        factoryException17.addSuppressed((java.lang.Throwable) factoryException28);
        org.jpacman.framework.factory.FactoryException factoryException59 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException61 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass62 = factoryException61.getClass();
        factoryException59.addSuppressed((java.lang.Throwable) factoryException61);
        java.lang.Throwable[] throwableArray64 = factoryException59.getSuppressed();
        factoryException28.addSuppressed((java.lang.Throwable) factoryException59);
        org.jpacman.framework.factory.FactoryException factoryException69 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException71 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException69.addSuppressed((java.lang.Throwable) factoryException71);
        org.jpacman.framework.factory.FactoryException factoryException73 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException71);
        org.jpacman.framework.factory.FactoryException factoryException75 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException77 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass78 = factoryException77.getClass();
        factoryException75.addSuppressed((java.lang.Throwable) factoryException77);
        factoryException73.addSuppressed((java.lang.Throwable) factoryException75);
        java.lang.String str81 = factoryException73.toString();
        org.jpacman.framework.factory.FactoryException factoryException82 = new org.jpacman.framework.factory.FactoryException("", (java.lang.Throwable) factoryException73);
        java.lang.Throwable[] throwableArray83 = factoryException73.getSuppressed();
        factoryException59.addSuppressed((java.lang.Throwable) factoryException73);
        java.lang.Class<?> wildcardClass85 = factoryException73.getClass();
        java.lang.Throwable[] throwableArray86 = factoryException73.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str6.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str81.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray83);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(throwableArray86);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Player player5 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) '4', 0);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall10 = defaultGameFactory0.makeWall();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(player5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertNotNull(wall10);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass4 = factoryException3.getClass();
        factoryException1.addSuppressed((java.lang.Throwable) factoryException3);
        org.jpacman.framework.factory.FactoryException factoryException8 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException10 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!");
        org.jpacman.framework.factory.FactoryException factoryException12 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass13 = factoryException12.getClass();
        factoryException10.addSuppressed((java.lang.Throwable) factoryException12);
        java.lang.String str15 = factoryException10.toString();
        java.lang.Class<?> wildcardClass16 = factoryException10.getClass();
        factoryException8.addSuppressed((java.lang.Throwable) factoryException10);
        java.lang.Throwable[] throwableArray18 = factoryException10.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException23 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException25 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException23.addSuppressed((java.lang.Throwable) factoryException25);
        org.jpacman.framework.factory.FactoryException factoryException27 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException25);
        org.jpacman.framework.factory.FactoryException factoryException28 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException25);
        org.jpacman.framework.factory.FactoryException factoryException29 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException25);
        factoryException10.addSuppressed((java.lang.Throwable) factoryException25);
        org.jpacman.framework.factory.FactoryException factoryException32 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass33 = factoryException32.getClass();
        org.jpacman.framework.factory.FactoryException factoryException35 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass36 = factoryException35.getClass();
        factoryException32.addSuppressed((java.lang.Throwable) factoryException35);
        java.lang.Throwable[] throwableArray38 = factoryException32.getSuppressed();
        java.lang.Throwable[] throwableArray39 = factoryException32.getSuppressed();
        java.lang.String str40 = factoryException32.toString();
        factoryException25.addSuppressed((java.lang.Throwable) factoryException32);
        org.jpacman.framework.factory.FactoryException factoryException42 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException25);
        factoryException3.addSuppressed((java.lang.Throwable) factoryException42);
        org.jpacman.framework.factory.FactoryException factoryException45 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: ");
        org.jpacman.framework.factory.FactoryException factoryException47 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass48 = factoryException47.getClass();
        org.jpacman.framework.factory.FactoryException factoryException50 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass51 = factoryException50.getClass();
        factoryException47.addSuppressed((java.lang.Throwable) factoryException50);
        org.jpacman.framework.factory.FactoryException factoryException54 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass55 = factoryException54.getClass();
        org.jpacman.framework.factory.FactoryException factoryException57 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass58 = factoryException57.getClass();
        factoryException54.addSuppressed((java.lang.Throwable) factoryException57);
        factoryException47.addSuppressed((java.lang.Throwable) factoryException57);
        java.lang.Throwable[] throwableArray61 = factoryException47.getSuppressed();
        factoryException45.addSuppressed((java.lang.Throwable) factoryException47);
        org.jpacman.framework.factory.FactoryException factoryException68 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException70 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException68.addSuppressed((java.lang.Throwable) factoryException70);
        org.jpacman.framework.factory.FactoryException factoryException72 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException70);
        org.jpacman.framework.factory.FactoryException factoryException73 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException70);
        org.jpacman.framework.factory.FactoryException factoryException74 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException70);
        java.lang.String str75 = factoryException74.toString();
        java.lang.String str76 = factoryException74.toString();
        org.jpacman.framework.factory.FactoryException factoryException77 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException74);
        java.lang.Throwable[] throwableArray78 = factoryException77.getSuppressed();
        factoryException45.addSuppressed((java.lang.Throwable) factoryException77);
        factoryException3.addSuppressed((java.lang.Throwable) factoryException77);
        java.lang.String str81 = factoryException3.toString();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str15.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str40.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str75.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str76.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str81.equals("org.jpacman.framework.factory.FactoryException: hi!"));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.Class<?> wildcardClass7 = defaultGameFactory0.getClass();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Ghost ghost10 = defaultGameFactory0.makeGhost();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(ghost9);
        org.junit.Assert.assertNotNull(ghost10);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass4 = factoryException3.getClass();
        org.jpacman.framework.factory.FactoryException factoryException6 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass7 = factoryException6.getClass();
        factoryException3.addSuppressed((java.lang.Throwable) factoryException6);
        org.jpacman.framework.factory.FactoryException factoryException10 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass11 = factoryException10.getClass();
        org.jpacman.framework.factory.FactoryException factoryException13 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass14 = factoryException13.getClass();
        factoryException10.addSuppressed((java.lang.Throwable) factoryException13);
        factoryException3.addSuppressed((java.lang.Throwable) factoryException13);
        java.lang.Throwable[] throwableArray17 = factoryException3.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException18 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException3);
        org.jpacman.framework.factory.FactoryException factoryException19 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException18);
        java.lang.String str20 = factoryException18.toString();
        java.lang.Throwable[] throwableArray21 = factoryException18.getSuppressed();
        java.lang.Throwable[] throwableArray22 = factoryException18.getSuppressed();
        java.lang.Throwable[] throwableArray23 = factoryException18.getSuppressed();
        java.lang.Class<?> wildcardClass24 = throwableArray23.getClass();
        java.lang.Class<?> wildcardClass25 = throwableArray23.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str20.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader10 = null;
        try {
            java.lang.String[] strArray11 = mapParser9.getMap(bufferedReader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(food8);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader11 = null;
        try {
            java.lang.String[] strArray12 = mapParser10.getMap(bufferedReader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(ghost9);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game3 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game4 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser5 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        try {
            org.jpacman.framework.model.Game game8 = mapParser5.parseMap(strArray7);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code h");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertNotNull(game4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game6 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game13 = mapParser9.parseMap(strArray12);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code h");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(game6);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(game8);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board12 = defaultGameFactory0.makeBoard(0, (int) 'a');
        org.jpacman.framework.factory.MapParser mapParser13 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.Class<?> wildcardClass14 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser15 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader16 = null;
        try {
            java.lang.String[] strArray17 = mapParser15.getMap(bufferedReader16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(ghost9);
        org.junit.Assert.assertNotNull(board12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader7 = null;
        try {
            java.lang.String[] strArray8 = mapParser6.getMap(bufferedReader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(wall2);
        org.junit.Assert.assertNotNull(board5);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass5 = factoryException4.getClass();
        org.jpacman.framework.factory.FactoryException factoryException7 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass8 = factoryException7.getClass();
        factoryException4.addSuppressed((java.lang.Throwable) factoryException7);
        org.jpacman.framework.factory.FactoryException factoryException11 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass12 = factoryException11.getClass();
        org.jpacman.framework.factory.FactoryException factoryException14 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass15 = factoryException14.getClass();
        factoryException11.addSuppressed((java.lang.Throwable) factoryException14);
        factoryException4.addSuppressed((java.lang.Throwable) factoryException14);
        java.lang.Throwable[] throwableArray18 = factoryException4.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException19 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException4);
        org.jpacman.framework.factory.FactoryException factoryException20 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException19);
        java.lang.String str21 = factoryException19.toString();
        java.lang.Throwable[] throwableArray22 = factoryException19.getSuppressed();
        java.lang.Throwable[] throwableArray23 = factoryException19.getSuppressed();
        java.lang.Throwable[] throwableArray24 = factoryException19.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException25 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException19);
        org.jpacman.framework.factory.FactoryException factoryException30 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass31 = factoryException30.getClass();
        org.jpacman.framework.factory.FactoryException factoryException33 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass34 = factoryException33.getClass();
        factoryException30.addSuppressed((java.lang.Throwable) factoryException33);
        org.jpacman.framework.factory.FactoryException factoryException37 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass38 = factoryException37.getClass();
        org.jpacman.framework.factory.FactoryException factoryException40 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass41 = factoryException40.getClass();
        factoryException37.addSuppressed((java.lang.Throwable) factoryException40);
        factoryException30.addSuppressed((java.lang.Throwable) factoryException40);
        java.lang.Throwable[] throwableArray44 = factoryException30.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException45 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException30);
        org.jpacman.framework.factory.FactoryException factoryException46 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException45);
        java.lang.String str47 = factoryException45.toString();
        java.lang.Throwable[] throwableArray48 = factoryException45.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException49 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException45);
        factoryException19.addSuppressed((java.lang.Throwable) factoryException49);
        java.lang.String str51 = factoryException19.toString();
        java.lang.Throwable[] throwableArray52 = factoryException19.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str21.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str47.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str51.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray52);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game6 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray14 = new java.lang.String[] { "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" };
        try {
            org.jpacman.framework.model.Game game15 = mapParser9.parseMap(strArray14);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code o");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(game6);
        org.junit.Assert.assertNotNull(wall7);
        org.junit.Assert.assertNotNull(game8);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food7 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food9 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Wall wall10 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser11 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader12 = null;
        try {
            java.lang.String[] strArray13 = mapParser11.getMap(bufferedReader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(food7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(food9);
        org.junit.Assert.assertNotNull(wall10);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        try {
            org.jpacman.framework.model.Game game13 = mapParser10.parseMap(strArray12);
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Empty row encountered.");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(food6);
        org.junit.Assert.assertNotNull(ghost7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(ghost9);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser8 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader9 = null;
        try {
            java.lang.String[] strArray10 = mapParser8.getMap(bufferedReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(wall7);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover6 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game5);
        randomGhostMover6.start();
        java.awt.event.ActionEvent actionEvent8 = null;
        randomGhostMover6.actionPerformed(actionEvent8);
        randomGhostMover6.stop();
        randomGhostMover6.start();
        randomGhostMover6.start();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(game5);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.jpacman.framework.factory.FactoryException factoryException3 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass4 = factoryException3.getClass();
        org.jpacman.framework.factory.FactoryException factoryException6 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass7 = factoryException6.getClass();
        factoryException3.addSuppressed((java.lang.Throwable) factoryException6);
        org.jpacman.framework.factory.FactoryException factoryException9 = new org.jpacman.framework.factory.FactoryException("", (java.lang.Throwable) factoryException3);
        java.lang.String str10 = factoryException9.toString();
        java.lang.String str11 = factoryException9.toString();
        java.lang.String str12 = factoryException9.toString();
        org.jpacman.framework.factory.FactoryException factoryException14 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass15 = factoryException14.getClass();
        org.jpacman.framework.factory.FactoryException factoryException17 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass18 = factoryException17.getClass();
        factoryException14.addSuppressed((java.lang.Throwable) factoryException17);
        java.lang.Throwable[] throwableArray20 = factoryException14.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException22 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException24 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass25 = factoryException24.getClass();
        factoryException22.addSuppressed((java.lang.Throwable) factoryException24);
        java.lang.Throwable[] throwableArray27 = factoryException22.getSuppressed();
        java.lang.Throwable[] throwableArray28 = factoryException22.getSuppressed();
        java.lang.Throwable[] throwableArray29 = factoryException22.getSuppressed();
        factoryException14.addSuppressed((java.lang.Throwable) factoryException22);
        java.lang.Throwable[] throwableArray31 = factoryException14.getSuppressed();
        java.lang.Throwable[] throwableArray32 = factoryException14.getSuppressed();
        factoryException9.addSuppressed((java.lang.Throwable) factoryException14);
        org.jpacman.framework.factory.FactoryException factoryException37 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException39 = new org.jpacman.framework.factory.FactoryException("hi!");
        factoryException37.addSuppressed((java.lang.Throwable) factoryException39);
        org.jpacman.framework.factory.FactoryException factoryException41 = new org.jpacman.framework.factory.FactoryException("hi!", (java.lang.Throwable) factoryException39);
        org.jpacman.framework.factory.FactoryException factoryException43 = new org.jpacman.framework.factory.FactoryException("hi!");
        org.jpacman.framework.factory.FactoryException factoryException45 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass46 = factoryException45.getClass();
        factoryException43.addSuppressed((java.lang.Throwable) factoryException45);
        factoryException41.addSuppressed((java.lang.Throwable) factoryException43);
        java.lang.Throwable[] throwableArray49 = factoryException41.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException50 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException41);
        factoryException14.addSuppressed((java.lang.Throwable) factoryException50);
        org.jpacman.framework.factory.FactoryException factoryException52 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException50);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "org.jpacman.framework.factory.FactoryException: " + "'", str10.equals("org.jpacman.framework.factory.FactoryException: "));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "org.jpacman.framework.factory.FactoryException: " + "'", str11.equals("org.jpacman.framework.factory.FactoryException: "));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "org.jpacman.framework.factory.FactoryException: " + "'", str12.equals("org.jpacman.framework.factory.FactoryException: "));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(throwableArray49);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food7 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Wall wall9 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader11 = null;
        try {
            java.lang.String[] strArray12 = mapParser10.getMap(bufferedReader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(food7);
        org.junit.Assert.assertNotNull(food8);
        org.junit.Assert.assertNotNull(wall9);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.jpacman.framework.factory.FactoryException factoryException4 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass5 = factoryException4.getClass();
        org.jpacman.framework.factory.FactoryException factoryException7 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass8 = factoryException7.getClass();
        factoryException4.addSuppressed((java.lang.Throwable) factoryException7);
        org.jpacman.framework.factory.FactoryException factoryException11 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass12 = factoryException11.getClass();
        org.jpacman.framework.factory.FactoryException factoryException14 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass15 = factoryException14.getClass();
        factoryException11.addSuppressed((java.lang.Throwable) factoryException14);
        factoryException4.addSuppressed((java.lang.Throwable) factoryException14);
        java.lang.Throwable[] throwableArray18 = factoryException4.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException19 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException4);
        org.jpacman.framework.factory.FactoryException factoryException20 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException19);
        java.lang.String str21 = factoryException19.toString();
        java.lang.Throwable[] throwableArray22 = factoryException19.getSuppressed();
        java.lang.Throwable[] throwableArray23 = factoryException19.getSuppressed();
        java.lang.Throwable[] throwableArray24 = factoryException19.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException25 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException19);
        org.jpacman.framework.factory.FactoryException factoryException30 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass31 = factoryException30.getClass();
        org.jpacman.framework.factory.FactoryException factoryException33 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass34 = factoryException33.getClass();
        factoryException30.addSuppressed((java.lang.Throwable) factoryException33);
        org.jpacman.framework.factory.FactoryException factoryException37 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass38 = factoryException37.getClass();
        org.jpacman.framework.factory.FactoryException factoryException40 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass41 = factoryException40.getClass();
        factoryException37.addSuppressed((java.lang.Throwable) factoryException40);
        factoryException30.addSuppressed((java.lang.Throwable) factoryException40);
        java.lang.Throwable[] throwableArray44 = factoryException30.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException45 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException30);
        org.jpacman.framework.factory.FactoryException factoryException46 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException45);
        java.lang.String str47 = factoryException45.toString();
        java.lang.Throwable[] throwableArray48 = factoryException45.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException49 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!", (java.lang.Throwable) factoryException45);
        factoryException19.addSuppressed((java.lang.Throwable) factoryException49);
        org.jpacman.framework.factory.FactoryException factoryException52 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass53 = factoryException52.getClass();
        org.jpacman.framework.factory.FactoryException factoryException55 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass56 = factoryException55.getClass();
        factoryException52.addSuppressed((java.lang.Throwable) factoryException55);
        org.jpacman.framework.factory.FactoryException factoryException59 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass60 = factoryException59.getClass();
        org.jpacman.framework.factory.FactoryException factoryException62 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass63 = factoryException62.getClass();
        factoryException59.addSuppressed((java.lang.Throwable) factoryException62);
        factoryException52.addSuppressed((java.lang.Throwable) factoryException62);
        java.lang.Throwable[] throwableArray66 = factoryException52.getSuppressed();
        org.jpacman.framework.factory.FactoryException factoryException68 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass69 = factoryException68.getClass();
        org.jpacman.framework.factory.FactoryException factoryException71 = new org.jpacman.framework.factory.FactoryException("hi!");
        java.lang.Class<?> wildcardClass72 = factoryException71.getClass();
        factoryException68.addSuppressed((java.lang.Throwable) factoryException71);
        java.lang.String str74 = factoryException68.toString();
        java.lang.Throwable[] throwableArray75 = factoryException68.getSuppressed();
        factoryException52.addSuppressed((java.lang.Throwable) factoryException68);
        factoryException49.addSuppressed((java.lang.Throwable) factoryException68);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str21.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!" + "'", str47.equals("org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "org.jpacman.framework.factory.FactoryException: hi!" + "'", str74.equals("org.jpacman.framework.factory.FactoryException: hi!"));
        org.junit.Assert.assertNotNull(throwableArray75);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Board board9 = defaultGameFactory0.makeBoard((int) (byte) 1, (int) 'a');
        org.jpacman.framework.model.Food food10 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player11 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Game game12 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover13 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game12);
        java.lang.Class<?> wildcardClass14 = game12.getClass();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(board9);
        org.junit.Assert.assertNotNull(food10);
        org.junit.Assert.assertNotNull(player11);
        org.junit.Assert.assertNotNull(game12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser7 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.io.BufferedReader bufferedReader8 = null;
        try {
            java.lang.String[] strArray9 = mapParser7.getMap(bufferedReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
        org.junit.Assert.assertNotNull(board5);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Wall wall9 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Ghost ghost10 = defaultGameFactory0.makeGhost();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNotNull(food5);
        org.junit.Assert.assertNotNull(player6);
        org.junit.Assert.assertNotNull(player7);
        org.junit.Assert.assertNotNull(ghost8);
        org.junit.Assert.assertNotNull(wall9);
        org.junit.Assert.assertNotNull(ghost10);
    }
}

