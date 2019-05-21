package org.jpacman.test.framework;

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
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        boolean boolean1 = game0.died();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.jpacman.framework.view.ImageLoader imageLoader2 = new org.jpacman.framework.view.ImageLoader(7, (int) (short) 10);
        int int3 = imageLoader2.playerAnimationCount();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Food food1 = defaultGameFactory0.makeFood();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.jpacman.framework.view.ImageLoader imageLoader2 = new org.jpacman.framework.view.ImageLoader(7, (int) (short) 10);
        int int3 = imageLoader2.monsterAnimationCount();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.jpacman.framework.model.Wall wall0 = new org.jpacman.framework.model.Wall();
        wall0.deoccupy();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        org.jpacman.framework.model.Direction direction2 = org.jpacman.framework.model.Direction.RIGHT;
        game0.movePlayer(direction2);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Board board3 = defaultGameFactory0.makeBoard((int) (byte) 1, 64);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.jpacman.framework.view.ImageLoader imageLoader0 = new org.jpacman.framework.view.ImageLoader();
        int int1 = imageLoader0.monsterAnimationCount();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.jpacman.framework.view.ImageLoader imageLoader2 = new org.jpacman.framework.view.ImageLoader(7, (int) (short) 10);
        org.jpacman.framework.model.Direction direction3 = org.jpacman.framework.model.Direction.RIGHT;
        int int4 = direction3.getDx();
        java.awt.Image image6 = imageLoader2.player(direction3, (int) '#');
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory1 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game2 = defaultGameFactory1.makeGame();
        level0.setFactory((org.jpacman.framework.factory.IGameFactory) defaultGameFactory1);
        org.jpacman.framework.model.Player player4 = defaultGameFactory1.makePlayer();
        player4.resurrect();
        player4.deoccupy();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory1 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game2 = defaultGameFactory1.makeGame();
        level0.setFactory((org.jpacman.framework.factory.IGameFactory) defaultGameFactory1);
        org.jpacman.framework.model.Player player4 = defaultGameFactory1.makePlayer();
        player4.deoccupy();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Board board3 = defaultGameFactory0.makeBoard(128, (int) (byte) 100);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.jpacman.framework.view.ImageLoader imageLoader2 = new org.jpacman.framework.view.ImageLoader(7, (int) (short) 10);
        java.awt.Image image4 = imageLoader2.monster(4);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.jpacman.framework.view.ImageLoader imageLoader0 = new org.jpacman.framework.view.ImageLoader();
        java.awt.Image image2 = imageLoader0.monster((int) '#');
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.jpacman.framework.view.ImageLoader imageLoader2 = new org.jpacman.framework.view.ImageLoader((int) (byte) 10, (int) (short) 1);
        int int3 = imageLoader2.playerAnimationCount();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile((int) ' ', (int) '4');
        java.lang.String str3 = tile2.toString();
        java.lang.String str4 = tile2.toString();
        org.jpacman.framework.model.Food food5 = new org.jpacman.framework.model.Food();
        boolean boolean6 = tile2.containsSprite((org.jpacman.framework.model.Sprite) food5);
        int int7 = food5.getPoints();
        food5.deoccupy();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        boolean boolean1 = mainUI0.isFocused();
        boolean boolean2 = mainUI0.isFocusableWindow();
        mainUI0.start();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.jpacman.framework.view.ImageLoader imageLoader2 = new org.jpacman.framework.view.ImageLoader((int) (byte) 10, (int) (short) 1);
        int int3 = imageLoader2.monsterAnimationCount();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        boolean boolean2 = game0.won();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover3 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game0);
        randomGhostMover3.doTick();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        org.jpacman.framework.model.Direction direction2 = org.jpacman.framework.model.Direction.RIGHT;
        int int3 = direction2.getDx();
        int int4 = direction2.getDy();
        game0.movePlayer(direction2);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.jpacman.framework.view.ImageLoader imageLoader0 = new org.jpacman.framework.view.ImageLoader();
        java.awt.Image image2 = imageLoader0.monster(52);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.jpacman.framework.view.ImageLoader imageLoader0 = new org.jpacman.framework.view.ImageLoader();
        org.jpacman.framework.model.Level level1 = new org.jpacman.framework.model.Level();
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory2 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game3 = defaultGameFactory2.makeGame();
        level1.setFactory((org.jpacman.framework.factory.IGameFactory) defaultGameFactory2);
        org.jpacman.framework.model.Player player5 = defaultGameFactory2.makePlayer();
        player5.resurrect();
        org.jpacman.framework.model.Direction direction7 = player5.getDirection();
        java.awt.Image image9 = imageLoader0.player(direction7, (int) (byte) 10);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.exit();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.jpacman.framework.view.ImageLoader imageLoader2 = new org.jpacman.framework.view.ImageLoader((int) (byte) 10, (int) (short) 1);
        java.awt.Image image4 = imageLoader2.monster(7);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        org.jpacman.framework.ui.PacmanInteraction.MatchState matchState1 = pacmanInteraction0.getCurrentState();
        pacmanInteraction0.exit();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.jpacman.framework.view.ImageLoader imageLoader2 = new org.jpacman.framework.view.ImageLoader(5, 32);
        java.awt.Image image4 = imageLoader2.monster((int) '.');
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList2 = game0.getGhosts();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        boolean boolean4 = game0.died();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Food food2 = defaultGameFactory0.makeFood();
        food2.deoccupy();
    }
}

