import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Player player1 = defaultGameFactory0.makePlayer();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Food food1 = defaultGameFactory0.makeFood();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover2 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game1);
        randomGhostMover2.doTick();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover6 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game5);
        randomGhostMover6.stop();
        randomGhostMover6.doTick();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover8 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game7);
        randomGhostMover8.stop();
        randomGhostMover8.doTick();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Wall wall1 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser2 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) (short) 0, 100);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game6 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover7 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game6);
        randomGhostMover7.doTick();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Game game10 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover11 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game10);
        java.lang.Class<?> wildcardClass12 = randomGhostMover11.getClass();
        randomGhostMover11.doTick();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover6 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game5);
        randomGhostMover6.stop();
        java.lang.Class<?> wildcardClass8 = randomGhostMover6.getClass();
        randomGhostMover6.doTick();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover2 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game1);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover3 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game1);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover4 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game1);
        randomGhostMover4.doTick();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) (byte) 0, (int) (byte) 10);
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover10 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game9);
        randomGhostMover10.doTick();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game4 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover5 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game4);
        randomGhostMover5.doTick();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        java.lang.Class<?> wildcardClass1 = defaultGameFactory0.getClass();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard((int) (byte) 100, 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food2 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game3 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover4 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game3);
        randomGhostMover4.doTick();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Wall wall1 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser2 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser3 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Board board6 = defaultGameFactory0.makeBoard((int) 'P', (int) (short) 1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover10 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game9);
        randomGhostMover10.doTick();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Wall wall1 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser2 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser3 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Player player4 = defaultGameFactory0.makePlayer();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Wall wall1 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard((int) (short) 100, 10);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        org.jpacman.framework.model.Wall wall5 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover8 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game7);
        randomGhostMover8.doTick();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover2 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game1);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover3 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game1);
        randomGhostMover3.doTick();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Wall wall1 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser2 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        java.lang.Class<?> wildcardClass3 = defaultGameFactory0.getClass();
        org.jpacman.framework.model.Food food4 = defaultGameFactory0.makeFood();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Ghost ghost1 = defaultGameFactory0.makeGhost();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        java.lang.Class<?> wildcardClass1 = defaultGameFactory0.getClass();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover9 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game8);
        randomGhostMover9.doTick();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game6 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover7 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game6);
        randomGhostMover7.stop();
        randomGhostMover7.stop();
        randomGhostMover7.doTick();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) (byte) 0, (int) (byte) 10);
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover10 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game9);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover11 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game9);
        randomGhostMover11.doTick();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        java.lang.Class<?> wildcardClass1 = defaultGameFactory0.getClass();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(40, (int) 'P');
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser3 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall4 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover6 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game5);
        randomGhostMover6.doTick();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover8 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game7);
        randomGhostMover8.stop();
        randomGhostMover8.stop();
        randomGhostMover8.doTick();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover9 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game8);
        randomGhostMover9.doTick();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Wall wall6 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover8 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game7);
        randomGhostMover8.doTick();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        org.jpacman.framework.model.Wall wall5 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover8 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game7);
        randomGhostMover8.stop();
        randomGhostMover8.doTick();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover6 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game5);
        randomGhostMover6.doTick();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Wall wall1 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser2 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Ghost ghost3 = defaultGameFactory0.makeGhost();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover6 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game5);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover7 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game5);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover8 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game5);
        randomGhostMover8.doTick();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food7 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game10 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover11 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game10);
        randomGhostMover11.doTick();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        org.jpacman.framework.model.Wall wall5 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover8 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game7);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover9 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game7);
        randomGhostMover9.doTick();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food2 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game3 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover4 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game3);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover5 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game3);
        randomGhostMover5.doTick();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game6 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover9 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game8);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover10 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game8);
        randomGhostMover10.doTick();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover6 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game5);
        randomGhostMover6.stop();
        java.lang.Class<?> wildcardClass8 = randomGhostMover6.getClass();
        java.lang.Class<?> wildcardClass9 = randomGhostMover6.getClass();
        randomGhostMover6.doTick();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food2 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game3 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall4 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        java.lang.Class<?> wildcardClass6 = game5.getClass();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover7 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game5);
        randomGhostMover7.doTick();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Wall wall1 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Player player2 = defaultGameFactory0.makePlayer();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
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
        randomGhostMover8.doTick();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
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
        randomGhostMover11.doTick();
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover2 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game1);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover3 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game1);
        randomGhostMover3.stop();
        randomGhostMover3.doTick();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover9 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game8);
        randomGhostMover9.doTick();
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Wall wall6 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover8 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game7);
        java.lang.Class<?> wildcardClass9 = randomGhostMover8.getClass();
        randomGhostMover8.doTick();
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover10 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game9);
        randomGhostMover10.doTick();
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game2 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost3 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board6 = defaultGameFactory0.makeBoard((int) '.', (int) ' ');
        org.jpacman.framework.factory.MapParser mapParser7 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover9 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game8);
        randomGhostMover9.doTick();
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        org.jpacman.framework.model.Wall wall5 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Board board10 = defaultGameFactory0.makeBoard(40, (int) (short) 1);
        org.jpacman.framework.model.Game game11 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover12 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game11);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover13 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game11);
        randomGhostMover13.doTick();
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover9 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game8);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover10 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game8);
        randomGhostMover10.stop();
        randomGhostMover10.doTick();
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover9 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game8);
        randomGhostMover9.stop();
        randomGhostMover9.doTick();
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food2 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game3 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall4 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        java.lang.Class<?> wildcardClass6 = game5.getClass();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover7 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game5);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover8 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game5);
        randomGhostMover8.stop();
        randomGhostMover8.doTick();
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall3 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game4 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover5 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game4);
        randomGhostMover5.stop();
        randomGhostMover5.doTick();
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover9 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game8);
        randomGhostMover9.stop();
        randomGhostMover9.doTick();
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover10 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game9);
        randomGhostMover10.stop();
        randomGhostMover10.doTick();
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game3 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover4 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game3);
        randomGhostMover4.doTick();
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Food food8 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game10 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover11 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game10);
        randomGhostMover11.doTick();
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Board board3 = defaultGameFactory0.makeBoard((int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food2 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game3 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board6 = defaultGameFactory0.makeBoard((int) ' ', (int) '.');
        org.jpacman.framework.factory.MapParser mapParser7 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover9 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game8);
        randomGhostMover9.doTick();
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover9 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game8);
        randomGhostMover9.doTick();
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Player player8 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover10 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game9);
        randomGhostMover10.stop();
        randomGhostMover10.doTick();
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Game game6 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover7 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game6);
        randomGhostMover7.stop();
        randomGhostMover7.doTick();
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'a', (int) ' ');
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Food food7 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Ghost ghost8 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Player player9 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Game game10 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost11 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Wall wall12 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Board board15 = defaultGameFactory0.makeBoard(100, (int) '4');
        org.jpacman.framework.model.Wall wall16 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game17 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover18 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game17);
        randomGhostMover18.doTick();
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Player player8 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Game game9 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover10 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game9);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover11 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game9);
        randomGhostMover11.doTick();
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(100, (int) 'P');
        java.lang.Class<?> wildcardClass5 = defaultGameFactory0.getClass();
        org.jpacman.framework.factory.MapParser mapParser6 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Wall wall8 = defaultGameFactory0.makeWall();
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Game game10 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover11 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game10);
        randomGhostMover11.doTick();
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost7 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Player player8 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Ghost ghost9 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Wall wall10 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game11 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover12 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game11);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover13 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game11);
        randomGhostMover13.doTick();
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Game game5 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover6 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game5);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover7 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game5);
        randomGhostMover7.doTick();
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Food food6 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game7 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover9 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game8);
        randomGhostMover9.stop();
        randomGhostMover9.doTick();
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Player player6 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover9 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game8);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover10 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game8);
        randomGhostMover10.doTick();
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game6 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall8 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Board board11 = defaultGameFactory0.makeBoard(1, (int) 'G');
        org.jpacman.framework.model.Ghost ghost12 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser13 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Game game14 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game15 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall16 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game17 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover18 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game17);
        randomGhostMover18.doTick();
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Game game10 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover11 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game10);
        randomGhostMover11.doTick();
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game6 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall7 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game8 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover9 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game8);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover10 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game8);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover11 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game8);
        randomGhostMover11.doTick();
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food2 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game3 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover4 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game3);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover5 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game3);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover6 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game3);
        randomGhostMover6.doTick();
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Ghost ghost3 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Game game4 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover5 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game4);
        randomGhostMover5.doTick();
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        java.lang.Class<?> wildcardClass1 = defaultGameFactory0.getClass();
        org.jpacman.framework.model.Wall wall2 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard(10, (int) 'P');
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard(0, 10);
        org.jpacman.framework.factory.MapParser mapParser9 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.factory.MapParser mapParser10 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Game game11 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover12 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game11);
        randomGhostMover12.doTick();
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.model.Board board5 = defaultGameFactory0.makeBoard((int) 'G', (int) (byte) 10);
        org.jpacman.framework.model.Board board8 = defaultGameFactory0.makeBoard((int) (byte) 0, (int) (byte) 10);
        org.jpacman.framework.model.Board board11 = defaultGameFactory0.makeBoard(100, (int) (byte) 100);
        org.jpacman.framework.model.Ghost ghost12 = defaultGameFactory0.makeGhost();
        java.lang.Class<?> wildcardClass13 = defaultGameFactory0.getClass();
        org.jpacman.framework.model.Wall wall14 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Game game15 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover16 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game15);
        randomGhostMover16.doTick();
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Board board4 = defaultGameFactory0.makeBoard(0, 40);
        org.jpacman.framework.model.Food food5 = defaultGameFactory0.makeFood();
        org.jpacman.framework.model.Game game6 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Player player7 = defaultGameFactory0.makePlayer();
        org.jpacman.framework.model.Wall wall8 = defaultGameFactory0.makeWall();
        org.jpacman.framework.model.Board board11 = defaultGameFactory0.makeBoard(1, (int) 'G');
        org.jpacman.framework.model.Ghost ghost12 = defaultGameFactory0.makeGhost();
        org.jpacman.framework.factory.MapParser mapParser13 = new org.jpacman.framework.factory.MapParser((org.jpacman.framework.factory.IGameFactory) defaultGameFactory0);
        org.jpacman.framework.model.Game game14 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game15 = defaultGameFactory0.makeGame();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover16 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game15);
        randomGhostMover16.doTick();
    }
}

