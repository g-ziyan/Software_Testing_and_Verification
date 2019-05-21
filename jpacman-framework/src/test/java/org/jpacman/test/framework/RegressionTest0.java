package org.jpacman.test.framework;

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
        int int0 = java.awt.image.ImageObserver.PROPERTIES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int0 = javax.swing.JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int int0 = javax.swing.JComponent.WHEN_FOCUSED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        float float0 = java.awt.Component.RIGHT_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        javax.swing.JFrame.setDefaultLookAndFeelDecorated(false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        int int0 = java.awt.Frame.NE_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int int0 = javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        int int0 = org.jpacman.framework.model.Food.DEFAULT_POINTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        float float0 = java.awt.Component.TOP_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int int0 = org.jpacman.framework.controller.AbstractGhostMover.DELAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 40 + "'", int0 == 40);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        int int0 = java.awt.Frame.MOVE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Food food1 = null;
        try {
            game0.addFood(food1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        int int0 = java.awt.Frame.E_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        int int0 = java.awt.Frame.MAXIMIZED_HORIZ;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        int int0 = java.awt.Frame.DEFAULT_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        char char0 = org.jpacman.framework.factory.MapParser.GHOST;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'G' + "'", char0 == 'G');
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.jpacman.framework.ui.PacmanInteraction.MatchState matchState0 = org.jpacman.framework.ui.PacmanInteraction.MatchState.PAUSING;
        org.junit.Assert.assertTrue("'" + matchState0 + "' != '" + org.jpacman.framework.ui.PacmanInteraction.MatchState.PAUSING + "'", matchState0.equals(org.jpacman.framework.ui.PacmanInteraction.MatchState.PAUSING));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        int int0 = javax.swing.JComponent.UNDEFINED_CONDITION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        int int0 = java.awt.image.ImageObserver.SOMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile((int) ' ', (int) '4');
        int int3 = tile2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        int int0 = javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        int int0 = org.jpacman.framework.view.BoardView.CELL_HGAP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        boolean boolean0 = javax.swing.JFrame.isDefaultLookAndFeelDecorated();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.Locale locale0 = null;
        javax.swing.JComponent.setDefaultLocale(locale0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        int int0 = javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        int int0 = java.awt.image.ImageObserver.ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Ghost ghost1 = null;
        org.jpacman.framework.model.Direction direction2 = org.jpacman.framework.model.Direction.RIGHT;
        try {
            game0.moveGhost(ghost1, direction2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction2 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction2.equals(org.jpacman.framework.model.Direction.RIGHT));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        org.jpacman.framework.model.Ghost ghost2 = null;
        org.jpacman.framework.model.Direction direction3 = org.jpacman.framework.model.Direction.RIGHT;
        int int4 = direction3.getDx();
        try {
            game0.moveGhost(ghost2, direction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + direction3 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction3.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        char char0 = org.jpacman.framework.factory.MapParser.FOOD;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '.' + "'", char0 == '.');
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        int int0 = java.awt.Frame.TEXT_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.awt.Window[] windowArray0 = java.awt.Window.getWindows();
        org.junit.Assert.assertNotNull(windowArray0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        int int0 = java.awt.Frame.NW_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        int int0 = java.awt.Frame.SE_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        pacmanInteraction0.start();
        try {
            pacmanInteraction0.up();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pacmanInteraction4);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        int int0 = java.awt.image.ImageObserver.WIDTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction5.notifyObservers();
        org.jpacman.framework.view.BoardView boardView7 = null;
        org.jpacman.framework.view.Animator animator8 = new org.jpacman.framework.view.Animator(boardView7);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction9 = pacmanInteraction5.controlling((org.jpacman.framework.controller.IController) animator8);
        pacmanInteraction4.deleteObserver((java.util.Observer) pacmanInteraction5);
        pacmanInteraction5.up();
        try {
            pacmanInteraction5.exit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pacmanInteraction4);
        org.junit.Assert.assertNotNull(pacmanInteraction9);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        java.awt.Image image5 = buttonPanel0.createImage((int) (byte) -1, 32);
        java.awt.Component component8 = buttonPanel0.locate((int) (byte) 100, (int) (short) 1);
        try {
            java.awt.Component component10 = buttonPanel0.getComponent(13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(component8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        component7.setName("hi!");
        org.junit.Assert.assertNotNull(component7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        int int0 = java.awt.image.ImageObserver.ALLBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        java.awt.Image image5 = buttonPanel0.createImage((int) (byte) -1, 32);
        java.awt.Component component8 = buttonPanel0.locate((int) (byte) 100, (int) (short) 1);
        java.awt.event.HierarchyListener hierarchyListener9 = null;
        try {
            component8.removeHierarchyListener(hierarchyListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(component8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        java.awt.Rectangle rectangle8 = null;
        try {
            buttonPanel0.computeVisibleRect(rectangle8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        boolean boolean4 = buttonPanel0.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray5 = buttonPanel0.getContainerListeners();
        try {
            javax.swing.InputMap inputMap7 = buttonPanel0.getInputMap(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(containerListenerArray5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        boolean boolean4 = buttonPanel0.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray5 = buttonPanel0.getContainerListeners();
        java.awt.Dimension dimension6 = null;
        try {
            buttonPanel0.resize(dimension6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(containerListenerArray5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.awt.Font font14 = null;
        try {
            java.awt.FontMetrics fontMetrics15 = buttonPanel1.getFontMetrics(font14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        int int0 = javax.swing.WindowConstants.HIDE_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.jpacman.framework.model.IBoardInspector iBoardInspector0 = null;
        try {
            org.jpacman.framework.view.BoardView boardView1 = new org.jpacman.framework.view.BoardView(iBoardInspector0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        java.awt.Image image5 = buttonPanel0.createImage((int) (byte) -1, 32);
        try {
            java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet7 = buttonPanel0.getFocusTraversalKeys(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(image5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.jpacman.framework.ui.PacmanInteraction.MatchState matchState0 = org.jpacman.framework.ui.PacmanInteraction.MatchState.WON;
        java.lang.Class<?> wildcardClass1 = matchState0.getClass();
        org.junit.Assert.assertTrue("'" + matchState0 + "' != '" + org.jpacman.framework.ui.PacmanInteraction.MatchState.WON + "'", matchState0.equals(org.jpacman.framework.ui.PacmanInteraction.MatchState.WON));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        int int0 = java.awt.Frame.N_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        int int0 = java.awt.Frame.WAIT_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        float float0 = java.awt.Component.BOTTOM_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.jpacman.framework.model.Wall wall0 = new org.jpacman.framework.model.Wall();
        org.jpacman.framework.model.Tile tile1 = wall0.getTile();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType2 = wall0.getSpriteType();
        org.junit.Assert.assertNull(tile1);
        org.junit.Assert.assertTrue("'" + spriteType2 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.WALL + "'", spriteType2.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.WALL));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        int int0 = java.awt.image.ImageObserver.ABORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.awt.Container container14 = buttonPanel0.getFocusCycleRootAncestor();
        try {
            container14.setFocusTraversalPolicyProvider(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNull(container14);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        int int0 = java.awt.image.ImageObserver.HEIGHT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        int int0 = java.awt.Frame.NORMAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.awt.event.ComponentListener[] componentListenerArray14 = buttonPanel0.getComponentListeners();
        buttonPanel0.setEnabled(true);
        java.awt.Dimension dimension17 = buttonPanel0.getMinimumSize();
        org.jpacman.framework.ui.ButtonPanel buttonPanel18 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics19 = null;
        buttonPanel18.printComponents(graphics19);
        org.jpacman.framework.ui.ButtonPanel buttonPanel22 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics23 = null;
        buttonPanel22.printComponents(graphics23);
        java.awt.Component component25 = buttonPanel18.add("[32,52]", (java.awt.Component) buttonPanel22);
        java.awt.Graphics graphics26 = null;
        buttonPanel18.update(graphics26);
        org.jpacman.framework.ui.ButtonPanel buttonPanel28 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel29 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics30 = null;
        buttonPanel29.printComponents(graphics30);
        org.jpacman.framework.ui.ButtonPanel buttonPanel33 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics34 = null;
        buttonPanel33.printComponents(graphics34);
        java.awt.Component component36 = buttonPanel29.add("[32,52]", (java.awt.Component) buttonPanel33);
        java.awt.Graphics graphics37 = null;
        buttonPanel29.update(graphics37);
        org.jpacman.framework.view.BoardView boardView39 = null;
        org.jpacman.framework.view.Animator animator40 = new org.jpacman.framework.view.Animator(boardView39);
        buttonPanel28.add((java.awt.Component) buttonPanel29, (java.lang.Object) animator40);
        java.awt.event.ComponentListener[] componentListenerArray42 = buttonPanel28.getComponentListeners();
        buttonPanel28.setEnabled(true);
        java.awt.Dimension dimension45 = buttonPanel28.getMinimumSize();
        buttonPanel18.setMinimumSize(dimension45);
        buttonPanel0.setPreferredSize(dimension45);
        buttonPanel0.setLocation((int) (short) 1, (int) '#');
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(componentListenerArray14);
        org.junit.Assert.assertNotNull(dimension17);
        org.junit.Assert.assertNotNull(component25);
        org.junit.Assert.assertNotNull(component36);
        org.junit.Assert.assertNotNull(componentListenerArray42);
        org.junit.Assert.assertNotNull(dimension45);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.awt.Window[] windowArray0 = java.awt.Window.getOwnerlessWindows();
        org.junit.Assert.assertNotNull(windowArray0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        int int14 = buttonPanel0.getDebugGraphicsOptions();
        java.awt.event.ContainerListener[] containerListenerArray15 = buttonPanel0.getContainerListeners();
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        buttonPanel0.addInputMethodListener(inputMethodListener16);
        java.awt.Insets insets18 = buttonPanel0.insets();
        try {
            buttonPanel0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(containerListenerArray15);
        org.junit.Assert.assertNotNull(insets18);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        int int0 = java.awt.Frame.S_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        int int14 = buttonPanel0.getDebugGraphicsOptions();
        java.awt.event.ContainerListener[] containerListenerArray15 = buttonPanel0.getContainerListeners();
        javax.swing.KeyStroke[] keyStrokeArray16 = buttonPanel0.getRegisteredKeyStrokes();
        java.awt.Point point17 = null;
        try {
            java.awt.Component component18 = buttonPanel0.getComponentAt(point17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(containerListenerArray15);
        org.junit.Assert.assertNotNull(keyStrokeArray16);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        boolean boolean4 = buttonPanel0.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray5 = buttonPanel0.getContainerListeners();
        java.awt.Event event6 = null;
        boolean boolean8 = buttonPanel0.gotFocus(event6, (java.lang.Object) 100.0d);
        java.awt.Point point9 = null;
        try {
            java.awt.Component component10 = buttonPanel0.findComponentAt(point9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(containerListenerArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        int int14 = buttonPanel0.getDebugGraphicsOptions();
        java.awt.event.ContainerListener[] containerListenerArray15 = buttonPanel0.getContainerListeners();
        java.awt.Event event16 = null;
        try {
            boolean boolean17 = buttonPanel0.postEvent(event16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(containerListenerArray15);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        java.awt.Graphics graphics8 = null;
        buttonPanel0.update(graphics8);
        javax.swing.KeyStroke keyStroke10 = null;
        buttonPanel0.unregisterKeyboardAction(keyStroke10);
        buttonPanel0.setDoubleBuffered(false);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray14 = buttonPanel0.getPropertyChangeListeners();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray14);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        boolean boolean4 = buttonPanel0.hasFocus();
        float float5 = buttonPanel0.getAlignmentY();
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior7 = buttonPanel6.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray8 = buttonPanel6.getContainerListeners();
        boolean boolean10 = buttonPanel6.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray11 = buttonPanel6.getContainerListeners();
        java.awt.Rectangle rectangle12 = null;
        java.awt.Rectangle rectangle13 = buttonPanel6.getBounds(rectangle12);
        buttonPanel0.paintImmediately(rectangle13);
        java.awt.event.ContainerListener containerListener15 = null;
        buttonPanel0.addContainerListener(containerListener15);
        java.awt.Font font17 = null;
        try {
            java.awt.FontMetrics fontMetrics18 = buttonPanel0.getFontMetrics(font17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior7 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior7.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(containerListenerArray11);
        org.junit.Assert.assertNotNull(rectangle13);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        java.awt.Insets insets8 = buttonPanel0.getInsets();
        java.awt.Component component9 = buttonPanel0.getNextFocusableComponent();
        java.awt.Point point10 = null;
        try {
            java.awt.Component component11 = buttonPanel0.getComponentAt(point10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNotNull(insets8);
        org.junit.Assert.assertNull(component9);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        java.awt.Image image5 = buttonPanel0.createImage((int) (byte) -1, 32);
        java.awt.Component component8 = buttonPanel0.locate((int) (byte) 100, (int) (short) 1);
        javax.accessibility.AccessibleContext accessibleContext9 = buttonPanel0.getAccessibleContext();
        javax.swing.plaf.PanelUI panelUI10 = null;
        buttonPanel0.setUI(panelUI10);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(component8);
        org.junit.Assert.assertNotNull(accessibleContext9);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        int int14 = buttonPanel0.getDebugGraphicsOptions();
        java.awt.Point point15 = null;
        try {
            java.awt.Component component16 = buttonPanel0.getComponentAt(point15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isFocusable();
        java.awt.MenuComponent menuComponent9 = null;
        buttonPanel4.remove(menuComponent9);
        buttonPanel4.enable();
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics13 = null;
        buttonPanel12.printComponents(graphics13);
        org.jpacman.framework.ui.ButtonPanel buttonPanel16 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics17 = null;
        buttonPanel16.printComponents(graphics17);
        java.awt.Component component19 = buttonPanel12.add("[32,52]", (java.awt.Component) buttonPanel16);
        java.awt.Graphics graphics20 = null;
        buttonPanel12.update(graphics20);
        boolean boolean22 = buttonPanel12.requestFocusInWindow();
        boolean boolean23 = buttonPanel4.isAncestorOf((java.awt.Component) buttonPanel12);
        buttonPanel4.setAlignmentX((float) (short) 100);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(component19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        pacmanInteraction0.start();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction6 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction6.notifyObservers();
        org.jpacman.framework.view.BoardView boardView8 = null;
        org.jpacman.framework.view.Animator animator9 = new org.jpacman.framework.view.Animator(boardView8);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction10 = pacmanInteraction6.controlling((org.jpacman.framework.controller.IController) animator9);
        pacmanInteraction0.addObserver((java.util.Observer) pacmanInteraction6);
        pacmanInteraction0.deleteObservers();
        pacmanInteraction0.start();
        try {
            pacmanInteraction0.updateState();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pacmanInteraction4);
        org.junit.Assert.assertNotNull(pacmanInteraction10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.awt.event.ComponentListener[] componentListenerArray14 = buttonPanel0.getComponentListeners();
        javax.swing.InputMap inputMap16 = null;
        try {
            buttonPanel0.setInputMap(8, inputMap16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(componentListenerArray14);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        int int14 = buttonPanel0.getDebugGraphicsOptions();
        java.awt.event.ContainerListener[] containerListenerArray15 = buttonPanel0.getContainerListeners();
        javax.swing.KeyStroke[] keyStrokeArray16 = buttonPanel0.getRegisteredKeyStrokes();
        buttonPanel0.enable(false);
        buttonPanel0.revalidate();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(containerListenerArray15);
        org.junit.Assert.assertNotNull(keyStrokeArray16);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        java.awt.Graphics graphics8 = null;
        buttonPanel0.update(graphics8);
        javax.swing.KeyStroke keyStroke10 = null;
        buttonPanel0.unregisterKeyboardAction(keyStroke10);
        java.awt.AWTEvent aWTEvent12 = null;
        try {
            buttonPanel0.dispatchEvent(aWTEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.String str0 = javax.swing.JComponent.TOOL_TIP_TEXT_KEY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ToolTipText" + "'", str0.equals("ToolTipText"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = new org.jpacman.framework.ui.PacmanInteraction();
        org.jpacman.framework.ui.PacmanInteraction.MatchState matchState6 = pacmanInteraction5.getCurrentState();
        pacmanInteraction5.stop();
        pacmanInteraction5.updateState();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction9 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction9.notifyObservers();
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction13 = pacmanInteraction9.controlling((org.jpacman.framework.controller.IController) animator12);
        pacmanInteraction9.start();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction15 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction15.notifyObservers();
        org.jpacman.framework.view.BoardView boardView17 = null;
        org.jpacman.framework.view.Animator animator18 = new org.jpacman.framework.view.Animator(boardView17);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction19 = pacmanInteraction15.controlling((org.jpacman.framework.controller.IController) animator18);
        pacmanInteraction9.addObserver((java.util.Observer) pacmanInteraction15);
        pacmanInteraction0.update((java.util.Observable) pacmanInteraction5, (java.lang.Object) pacmanInteraction9);
        pacmanInteraction0.down();
        org.junit.Assert.assertNotNull(pacmanInteraction4);
        org.junit.Assert.assertTrue("'" + matchState6 + "' != '" + org.jpacman.framework.ui.PacmanInteraction.MatchState.PAUSING + "'", matchState6.equals(org.jpacman.framework.ui.PacmanInteraction.MatchState.PAUSING));
        org.junit.Assert.assertNotNull(pacmanInteraction13);
        org.junit.Assert.assertNotNull(pacmanInteraction19);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        int int0 = java.awt.Frame.ICONIFIED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        boolean boolean4 = buttonPanel0.hasFocus();
        float float5 = buttonPanel0.getAlignmentY();
        java.awt.Graphics graphics6 = null;
        buttonPanel0.update(graphics6);
        buttonPanel0.reshape(8, 32, 64, (int) '.');
        java.awt.Cursor cursor13 = buttonPanel0.getCursor();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNotNull(cursor13);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray4 = buttonPanel0.getKeyListeners();
        java.awt.Rectangle rectangle5 = buttonPanel0.bounds();
        java.awt.Point point6 = null;
        try {
            buttonPanel0.setLocation(point6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray4);
        org.junit.Assert.assertNotNull(rectangle5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction1 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction1.notifyObservers();
        org.jpacman.framework.view.BoardView boardView3 = null;
        org.jpacman.framework.view.Animator animator4 = new org.jpacman.framework.view.Animator(boardView3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = pacmanInteraction1.controlling((org.jpacman.framework.controller.IController) animator4);
        animator4.stop();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction7 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator4);
        java.util.Observable observable8 = null;
        org.jpacman.framework.ui.ButtonPanel buttonPanel9 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics10 = null;
        buttonPanel9.printComponents(graphics10);
        org.jpacman.framework.ui.ButtonPanel buttonPanel13 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics14 = null;
        buttonPanel13.printComponents(graphics14);
        java.awt.Component component16 = buttonPanel9.add("[32,52]", (java.awt.Component) buttonPanel13);
        boolean boolean17 = buttonPanel13.isFocusable();
        pacmanInteraction0.update(observable8, (java.lang.Object) boolean17);
        org.junit.Assert.assertNotNull(pacmanInteraction5);
        org.junit.Assert.assertNotNull(pacmanInteraction7);
        org.junit.Assert.assertNotNull(component16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        javax.swing.event.AncestorListener[] ancestorListenerArray4 = buttonPanel0.getAncestorListeners();
        java.awt.Insets insets5 = buttonPanel0.getInsets();
        java.awt.Event event6 = null;
        try {
            boolean boolean7 = buttonPanel0.postEvent(event6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(ancestorListenerArray4);
        org.junit.Assert.assertNotNull(insets5);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        boolean boolean4 = buttonPanel0.requestFocus(false);
        buttonPanel0.doLayout();
        buttonPanel0.setEnabled(true);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        int int14 = buttonPanel0.getDebugGraphicsOptions();
        java.awt.event.ContainerListener[] containerListenerArray15 = buttonPanel0.getContainerListeners();
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        buttonPanel0.addInputMethodListener(inputMethodListener16);
        boolean boolean18 = buttonPanel0.getIgnoreRepaint();
        float float19 = buttonPanel0.getAlignmentX();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(containerListenerArray15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isFocusable();
        java.awt.MenuComponent menuComponent9 = null;
        buttonPanel4.remove(menuComponent9);
        buttonPanel4.enable();
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics13 = null;
        buttonPanel12.printComponents(graphics13);
        org.jpacman.framework.ui.ButtonPanel buttonPanel16 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics17 = null;
        buttonPanel16.printComponents(graphics17);
        java.awt.Component component19 = buttonPanel12.add("[32,52]", (java.awt.Component) buttonPanel16);
        java.awt.Graphics graphics20 = null;
        buttonPanel12.update(graphics20);
        boolean boolean22 = buttonPanel12.requestFocusInWindow();
        boolean boolean23 = buttonPanel4.isAncestorOf((java.awt.Component) buttonPanel12);
        java.awt.ComponentOrientation componentOrientation24 = null;
        try {
            buttonPanel4.applyComponentOrientation(componentOrientation24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(component19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction1 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction1.notifyObservers();
        org.jpacman.framework.view.BoardView boardView3 = null;
        org.jpacman.framework.view.Animator animator4 = new org.jpacman.framework.view.Animator(boardView3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = pacmanInteraction1.controlling((org.jpacman.framework.controller.IController) animator4);
        animator4.stop();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction7 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator4);
        pacmanInteraction7.deleteObservers();
        org.junit.Assert.assertNotNull(pacmanInteraction5);
        org.junit.Assert.assertNotNull(pacmanInteraction7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        boolean boolean2 = game0.won();
        org.jpacman.framework.ui.ButtonPanel buttonPanel3 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics4 = null;
        buttonPanel3.printComponents(graphics4);
        org.jpacman.framework.ui.ButtonPanel buttonPanel7 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics8 = null;
        buttonPanel7.printComponents(graphics8);
        java.awt.Component component10 = buttonPanel3.add("[32,52]", (java.awt.Component) buttonPanel7);
        boolean boolean11 = buttonPanel7.isFocusable();
        java.awt.MenuComponent menuComponent12 = null;
        buttonPanel7.remove(menuComponent12);
        buttonPanel7.enable();
        game0.attach((java.util.Observer) buttonPanel7);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover16 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game0);
        java.awt.event.ActionEvent actionEvent17 = null;
        try {
            randomGhostMover16.actionPerformed(actionEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        java.awt.Graphics graphics8 = null;
        buttonPanel0.update(graphics8);
        boolean boolean10 = buttonPanel0.requestFocusInWindow();
        java.awt.Dimension dimension11 = buttonPanel0.getPreferredSize();
        org.jpacman.framework.ui.ButtonPanel buttonPanel13 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics14 = null;
        buttonPanel13.printComponents(graphics14);
        org.jpacman.framework.ui.ButtonPanel buttonPanel17 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics18 = null;
        buttonPanel17.printComponents(graphics18);
        java.awt.Component component20 = buttonPanel13.add("[32,52]", (java.awt.Component) buttonPanel17);
        boolean boolean21 = buttonPanel17.isRequestFocusEnabled();
        boolean boolean22 = buttonPanel17.isEnabled();
        buttonPanel17.setDebugGraphicsOptions((int) (byte) -1);
        java.awt.Color color25 = null;
        buttonPanel17.setForeground(color25);
        javax.swing.JPopupMenu jPopupMenu27 = buttonPanel17.getComponentPopupMenu();
        java.awt.Component component28 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel17);
        buttonPanel0.paintImmediately(5, 5, (int) '#', 32);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertNotNull(component20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(jPopupMenu27);
        org.junit.Assert.assertNotNull(component28);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        buttonPanel0.setRequestFocusEnabled(true);
        java.awt.Container container5 = buttonPanel0.getParent();
        java.awt.Graphics graphics6 = null;
        try {
            container5.printComponents(graphics6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertNull(container5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        int int14 = buttonPanel0.getDebugGraphicsOptions();
        java.awt.event.ContainerListener[] containerListenerArray15 = buttonPanel0.getContainerListeners();
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        buttonPanel0.addInputMethodListener(inputMethodListener16);
        boolean boolean18 = buttonPanel0.getIgnoreRepaint();
        java.awt.event.ContainerListener containerListener19 = null;
        buttonPanel0.removeContainerListener(containerListener19);
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(containerListenerArray15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory1 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game2 = defaultGameFactory1.makeGame();
        level0.setFactory((org.jpacman.framework.factory.IGameFactory) defaultGameFactory1);
        org.jpacman.framework.model.Player player4 = defaultGameFactory1.makePlayer();
        try {
            org.jpacman.framework.model.Board board7 = defaultGameFactory1.makeBoard((int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(game2);
        org.junit.Assert.assertNotNull(player4);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isRequestFocusEnabled();
        boolean boolean9 = buttonPanel4.isValid();
        int int10 = buttonPanel4.getHeight();
        java.awt.Font font11 = null;
        try {
            java.awt.FontMetrics fontMetrics12 = buttonPanel4.getFontMetrics(font11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction5.notifyObservers();
        org.jpacman.framework.view.BoardView boardView7 = null;
        org.jpacman.framework.view.Animator animator8 = new org.jpacman.framework.view.Animator(boardView7);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction9 = pacmanInteraction5.controlling((org.jpacman.framework.controller.IController) animator8);
        pacmanInteraction4.deleteObserver((java.util.Observer) pacmanInteraction5);
        pacmanInteraction5.up();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction12 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction12.notifyObservers();
        org.jpacman.framework.view.BoardView boardView14 = null;
        org.jpacman.framework.view.Animator animator15 = new org.jpacman.framework.view.Animator(boardView14);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction16 = pacmanInteraction12.controlling((org.jpacman.framework.controller.IController) animator15);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction17 = pacmanInteraction5.controlling((org.jpacman.framework.controller.IController) animator15);
        pacmanInteraction5.start();
        org.junit.Assert.assertNotNull(pacmanInteraction4);
        org.junit.Assert.assertNotNull(pacmanInteraction9);
        org.junit.Assert.assertNotNull(pacmanInteraction16);
        org.junit.Assert.assertNotNull(pacmanInteraction17);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        buttonPanel0.setRequestFocusEnabled(true);
        boolean boolean5 = buttonPanel0.isValidateRoot();
        org.jpacman.framework.ui.ButtonPanel buttonPanel7 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel9 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener10 = null;
        buttonPanel9.removeMouseWheelListener(mouseWheelListener10);
        java.awt.Component component12 = buttonPanel7.add("[32,52]", (java.awt.Component) buttonPanel9);
        int int15 = buttonPanel7.getBaseline(8, 1);
        boolean boolean17 = buttonPanel7.requestFocus(false);
        buttonPanel7.enableInputMethods(true);
        javax.swing.InputMap inputMap20 = buttonPanel7.getInputMap();
        try {
            buttonPanel0.setInputMap(40, inputMap20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(inputMap20);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        boolean boolean4 = buttonPanel0.hasFocus();
        float float5 = buttonPanel0.getAlignmentY();
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior7 = buttonPanel6.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray8 = buttonPanel6.getContainerListeners();
        boolean boolean10 = buttonPanel6.requestFocus(false);
        boolean boolean11 = buttonPanel6.isVisible();
        java.awt.event.MouseListener[] mouseListenerArray12 = buttonPanel6.getMouseListeners();
        java.awt.Color color13 = buttonPanel6.getBackground();
        buttonPanel0.setBackground(color13);
        java.awt.ImageCapabilities imageCapabilities17 = null;
        java.awt.image.VolatileImage volatileImage18 = buttonPanel0.createVolatileImage(8, (int) (short) 1, imageCapabilities17);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior7 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior7.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(mouseListenerArray12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNull(volatileImage18);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        java.awt.Graphics graphics8 = null;
        buttonPanel0.update(graphics8);
        boolean boolean10 = buttonPanel0.requestFocusInWindow();
        java.awt.Dimension dimension11 = buttonPanel0.getPreferredSize();
        org.jpacman.framework.ui.ButtonPanel buttonPanel13 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics14 = null;
        buttonPanel13.printComponents(graphics14);
        org.jpacman.framework.ui.ButtonPanel buttonPanel17 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics18 = null;
        buttonPanel17.printComponents(graphics18);
        java.awt.Component component20 = buttonPanel13.add("[32,52]", (java.awt.Component) buttonPanel17);
        boolean boolean21 = buttonPanel17.isRequestFocusEnabled();
        boolean boolean22 = buttonPanel17.isEnabled();
        buttonPanel17.setDebugGraphicsOptions((int) (byte) -1);
        java.awt.Color color25 = null;
        buttonPanel17.setForeground(color25);
        javax.swing.JPopupMenu jPopupMenu27 = buttonPanel17.getComponentPopupMenu();
        java.awt.Component component28 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel17);
        java.awt.Event event29 = null;
        try {
            boolean boolean30 = buttonPanel17.handleEvent(event29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertNotNull(component20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(jPopupMenu27);
        org.junit.Assert.assertNotNull(component28);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel0.isManagingFocus();
        java.awt.Font font9 = null;
        try {
            java.awt.FontMetrics fontMetrics10 = buttonPanel0.getFontMetrics(font9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        int int0 = org.jpacman.framework.view.BoardView.CELL_VGAP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        buttonPanel0.transferFocusBackward();
        java.awt.Container container4 = buttonPanel0.getParent();
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel7 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener8 = null;
        buttonPanel7.removeMouseWheelListener(mouseWheelListener8);
        java.awt.Component component10 = buttonPanel5.add("[32,52]", (java.awt.Component) buttonPanel7);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        buttonPanel5.removePropertyChangeListener(propertyChangeListener11);
        try {
            container4.setComponentZOrder((java.awt.Component) buttonPanel5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNotNull(component10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        buttonPanel0.firePropertyChange("ToolTipText", ' ', ' ');
        boolean boolean18 = buttonPanel0.isFocusCycleRoot();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isRequestFocusEnabled();
        boolean boolean9 = buttonPanel4.isEnabled();
        buttonPanel4.setDebugGraphicsOptions((int) (byte) -1);
        float float12 = buttonPanel4.getAlignmentY();
        java.lang.String str13 = buttonPanel4.getToolTipText();
        java.awt.Component[] componentArray14 = buttonPanel4.getComponents();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(componentArray14);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isRequestFocusEnabled();
        boolean boolean9 = buttonPanel4.isEnabled();
        java.io.PrintStream printStream10 = null;
        try {
            buttonPanel4.list(printStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isRequestFocusEnabled();
        java.awt.Image image9 = null;
        org.jpacman.framework.ui.ButtonPanel buttonPanel10 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel11 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics12 = null;
        buttonPanel11.printComponents(graphics12);
        org.jpacman.framework.ui.ButtonPanel buttonPanel15 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics16 = null;
        buttonPanel15.printComponents(graphics16);
        java.awt.Component component18 = buttonPanel11.add("[32,52]", (java.awt.Component) buttonPanel15);
        java.awt.Graphics graphics19 = null;
        buttonPanel11.update(graphics19);
        org.jpacman.framework.view.BoardView boardView21 = null;
        org.jpacman.framework.view.Animator animator22 = new org.jpacman.framework.view.Animator(boardView21);
        buttonPanel10.add((java.awt.Component) buttonPanel11, (java.lang.Object) animator22);
        java.awt.event.ComponentListener[] componentListenerArray24 = buttonPanel10.getComponentListeners();
        buttonPanel10.setEnabled(true);
        java.awt.Dimension dimension27 = buttonPanel10.getMinimumSize();
        java.awt.Color color28 = null;
        buttonPanel10.setForeground(color28);
        boolean boolean30 = buttonPanel4.prepareImage(image9, (java.awt.image.ImageObserver) buttonPanel10);
        buttonPanel10.revalidate();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(component18);
        org.junit.Assert.assertNotNull(componentListenerArray24);
        org.junit.Assert.assertNotNull(dimension27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.awt.event.ComponentListener[] componentListenerArray14 = buttonPanel0.getComponentListeners();
        buttonPanel0.setEnabled(true);
        java.awt.Dimension dimension17 = buttonPanel0.getMinimumSize();
        buttonPanel0.addNotify();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(componentListenerArray14);
        org.junit.Assert.assertNotNull(dimension17);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.jpacman.framework.model.Direction direction0 = org.jpacman.framework.model.Direction.DOWN;
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + org.jpacman.framework.model.Direction.DOWN + "'", direction0.equals(org.jpacman.framework.model.Direction.DOWN));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        try {
            mainUI0.setCursor((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal cursor type");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.lang.String str14 = buttonPanel1.toString();
        java.awt.Event event15 = null;
        boolean boolean17 = buttonPanel1.lostFocus(event15, (java.lang.Object) (short) 100);
        java.awt.Container container18 = buttonPanel1.getTopLevelAncestor();
        java.awt.Event event19 = null;
        try {
            boolean boolean22 = container18.mouseMove(event19, 64, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "org.jpacman.framework.ui.ButtonPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str14.equals("org.jpacman.framework.ui.ButtonPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(container18);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(13, (int) (short) 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        buttonPanel0.setFocusTraversalKeysEnabled(false);
        org.jpacman.framework.ui.ButtonPanel buttonPanel16 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior17 = buttonPanel16.getBaselineResizeBehavior();
        int int18 = buttonPanel16.getWidth();
        float float19 = buttonPanel16.getAlignmentY();
        boolean boolean20 = buttonPanel16.hasFocus();
        float float21 = buttonPanel16.getAlignmentY();
        boolean boolean22 = buttonPanel16.isValid();
        buttonPanel0.remove((java.awt.Component) buttonPanel16);
        org.jpacman.framework.ui.ButtonPanel buttonPanel24 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel26 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener27 = null;
        buttonPanel26.removeMouseWheelListener(mouseWheelListener27);
        java.awt.Component component29 = buttonPanel24.add("[32,52]", (java.awt.Component) buttonPanel26);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        buttonPanel26.removePropertyChangeListener("[32,52]", propertyChangeListener31);
        org.jpacman.framework.ui.ButtonPanel buttonPanel33 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior34 = buttonPanel33.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray35 = buttonPanel33.getContainerListeners();
        boolean boolean37 = buttonPanel33.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray38 = buttonPanel33.getContainerListeners();
        java.awt.image.ImageProducer imageProducer39 = null;
        java.awt.Image image40 = buttonPanel33.createImage(imageProducer39);
        org.jpacman.framework.ui.ButtonPanel buttonPanel41 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior42 = buttonPanel41.getBaselineResizeBehavior();
        int int43 = buttonPanel41.getWidth();
        float float44 = buttonPanel41.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray45 = buttonPanel41.getKeyListeners();
        int int46 = buttonPanel26.checkImage(image40, (java.awt.image.ImageObserver) buttonPanel41);
        org.jpacman.framework.ui.ButtonPanel buttonPanel47 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel49 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener50 = null;
        buttonPanel49.removeMouseWheelListener(mouseWheelListener50);
        java.awt.Component component52 = buttonPanel47.add("[32,52]", (java.awt.Component) buttonPanel49);
        boolean boolean53 = buttonPanel47.isFocusOwner();
        java.lang.String str54 = buttonPanel47.getUIClassID();
        org.jpacman.framework.ui.ButtonPanel buttonPanel55 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior56 = buttonPanel55.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray57 = buttonPanel55.getContainerListeners();
        boolean boolean59 = buttonPanel55.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray60 = buttonPanel55.getContainerListeners();
        java.awt.Rectangle rectangle61 = null;
        java.awt.Rectangle rectangle62 = buttonPanel55.getBounds(rectangle61);
        java.awt.Rectangle rectangle63 = buttonPanel47.getBounds(rectangle62);
        org.jpacman.framework.ui.ButtonPanel buttonPanel65 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics66 = null;
        buttonPanel65.printComponents(graphics66);
        org.jpacman.framework.ui.ButtonPanel buttonPanel69 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics70 = null;
        buttonPanel69.printComponents(graphics70);
        java.awt.Component component72 = buttonPanel65.add("[32,52]", (java.awt.Component) buttonPanel69);
        java.awt.Graphics graphics73 = null;
        buttonPanel65.update(graphics73);
        javax.swing.KeyStroke keyStroke75 = null;
        buttonPanel65.unregisterKeyboardAction(keyStroke75);
        java.awt.Component component77 = buttonPanel47.add("[32,52]", (java.awt.Component) buttonPanel65);
        try {
            boolean boolean78 = buttonPanel0.prepareImage(image40, (java.awt.image.ImageObserver) component77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior17 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior17.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(component29);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior34 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior34.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(containerListenerArray38);
        org.junit.Assert.assertNotNull(image40);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior42 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior42.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.5f + "'", float44 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(component52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "PanelUI" + "'", str54.equals("PanelUI"));
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior56 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior56.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(containerListenerArray60);
        org.junit.Assert.assertNotNull(rectangle62);
        org.junit.Assert.assertNotNull(rectangle63);
        org.junit.Assert.assertNotNull(component72);
        org.junit.Assert.assertNotNull(component77);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray4 = buttonPanel0.getKeyListeners();
        boolean boolean5 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) buttonPanel0);
        buttonPanel0.updateUI();
        javax.swing.event.AncestorListener ancestorListener7 = null;
        buttonPanel0.removeAncestorListener(ancestorListener7);
        try {
            buttonPanel0.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        buttonPanel0.setRequestFocusEnabled(true);
        boolean boolean5 = buttonPanel0.isValidateRoot();
        javax.swing.ActionMap actionMap6 = buttonPanel0.getActionMap();
        java.util.Observable observable7 = null;
        try {
            buttonPanel0.update(observable7, (java.lang.Object) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(actionMap6);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        boolean boolean6 = buttonPanel0.isFocusOwner();
        java.lang.String str7 = buttonPanel0.getUIClassID();
        org.jpacman.framework.ui.ButtonPanel buttonPanel8 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior9 = buttonPanel8.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray10 = buttonPanel8.getContainerListeners();
        boolean boolean12 = buttonPanel8.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray13 = buttonPanel8.getContainerListeners();
        java.awt.Rectangle rectangle14 = null;
        java.awt.Rectangle rectangle15 = buttonPanel8.getBounds(rectangle14);
        java.awt.Rectangle rectangle16 = buttonPanel0.getBounds(rectangle15);
        org.jpacman.framework.ui.ButtonPanel buttonPanel18 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics19 = null;
        buttonPanel18.printComponents(graphics19);
        org.jpacman.framework.ui.ButtonPanel buttonPanel22 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics23 = null;
        buttonPanel22.printComponents(graphics23);
        java.awt.Component component25 = buttonPanel18.add("[32,52]", (java.awt.Component) buttonPanel22);
        java.awt.Graphics graphics26 = null;
        buttonPanel18.update(graphics26);
        javax.swing.KeyStroke keyStroke28 = null;
        buttonPanel18.unregisterKeyboardAction(keyStroke28);
        java.awt.Component component30 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel18);
        java.io.PrintStream printStream31 = null;
        try {
            buttonPanel18.list(printStream31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "PanelUI" + "'", str7.equals("PanelUI"));
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior9 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior9.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(containerListenerArray13);
        org.junit.Assert.assertNotNull(rectangle15);
        org.junit.Assert.assertNotNull(rectangle16);
        org.junit.Assert.assertNotNull(component25);
        org.junit.Assert.assertNotNull(component30);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        boolean boolean4 = buttonPanel0.hasFocus();
        float float5 = buttonPanel0.getAlignmentY();
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior7 = buttonPanel6.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray8 = buttonPanel6.getContainerListeners();
        boolean boolean10 = buttonPanel6.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray11 = buttonPanel6.getContainerListeners();
        java.awt.Rectangle rectangle12 = null;
        java.awt.Rectangle rectangle13 = buttonPanel6.getBounds(rectangle12);
        buttonPanel0.paintImmediately(rectangle13);
        buttonPanel0.firePropertyChange("org.jpacman.framework.ui.ButtonPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (short) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior7 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior7.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(containerListenerArray11);
        org.junit.Assert.assertNotNull(rectangle13);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        java.awt.BufferCapabilities bufferCapabilities3 = null;
        try {
            mainUI0.createBufferStrategy(4, bufferCapabilities3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No capabilities specified");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior2 = buttonPanel1.getBaselineResizeBehavior();
        int int3 = buttonPanel1.getWidth();
        float float4 = buttonPanel1.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray5 = buttonPanel1.getKeyListeners();
        boolean boolean6 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) buttonPanel1);
        buttonPanel1.updateUI();
        int int8 = buttonPanel0.getComponentZOrder((java.awt.Component) buttonPanel1);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior2 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior2.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        boolean boolean2 = game0.won();
        org.jpacman.framework.ui.ButtonPanel buttonPanel3 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics4 = null;
        buttonPanel3.printComponents(graphics4);
        org.jpacman.framework.ui.ButtonPanel buttonPanel7 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics8 = null;
        buttonPanel7.printComponents(graphics8);
        java.awt.Component component10 = buttonPanel3.add("[32,52]", (java.awt.Component) buttonPanel7);
        boolean boolean11 = buttonPanel7.isFocusable();
        java.awt.MenuComponent menuComponent12 = null;
        buttonPanel7.remove(menuComponent12);
        buttonPanel7.enable();
        game0.attach((java.util.Observer) buttonPanel7);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover16 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game0);
        org.jpacman.framework.model.Ghost ghost17 = null;
        org.jpacman.framework.model.Direction direction18 = org.jpacman.framework.model.Direction.UP;
        try {
            game0.moveGhost(ghost17, direction18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + direction18 + "' != '" + org.jpacman.framework.model.Direction.UP + "'", direction18.equals(org.jpacman.framework.model.Direction.UP));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isRequestFocusEnabled();
        boolean boolean9 = buttonPanel4.isEnabled();
        buttonPanel4.setDebugGraphicsOptions((int) (byte) -1);
        java.awt.Color color12 = null;
        buttonPanel4.setForeground(color12);
        int int14 = buttonPanel4.getY();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = component7.isMinimumSizeSet();
        component7.enable(false);
        component7.show(false);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.awt.event.ComponentListener[] componentListenerArray14 = buttonPanel0.getComponentListeners();
        buttonPanel0.setEnabled(true);
        java.awt.event.ContainerListener containerListener17 = null;
        buttonPanel0.removeContainerListener(containerListener17);
        try {
            javax.swing.InputMap inputMap20 = buttonPanel0.getInputMap((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(componentListenerArray14);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics7 = null;
        buttonPanel6.printComponents(graphics7);
        java.awt.Dimension dimension9 = buttonPanel6.minimumSize();
        buttonPanel2.resize(dimension9);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray12 = buttonPanel2.getPropertyChangeListeners("");
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray12);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        buttonPanel1.firePropertyChange("hi!", (double) ' ', (double) 4);
        java.util.Locale locale18 = buttonPanel1.getLocale();
        javax.swing.JComponent.setDefaultLocale(locale18);
        javax.swing.JComponent.setDefaultLocale(locale18);
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(locale18);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction5.notifyObservers();
        org.jpacman.framework.view.BoardView boardView7 = null;
        org.jpacman.framework.view.Animator animator8 = new org.jpacman.framework.view.Animator(boardView7);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction9 = pacmanInteraction5.controlling((org.jpacman.framework.controller.IController) animator8);
        pacmanInteraction4.deleteObserver((java.util.Observer) pacmanInteraction5);
        org.jpacman.framework.ui.MainUI mainUI11 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray12 = mainUI11.getWindowStateListeners();
        java.awt.Graphics graphics13 = null;
        mainUI11.paint(graphics13);
        java.awt.MenuBar menuBar15 = null;
        mainUI11.setMenuBar(menuBar15);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction17 = pacmanInteraction4.withDisposable((org.jpacman.framework.ui.IDisposable) mainUI11);
        pacmanInteraction4.stop();
        org.junit.Assert.assertNotNull(pacmanInteraction4);
        org.junit.Assert.assertNotNull(pacmanInteraction9);
        org.junit.Assert.assertNotNull(windowStateListenerArray12);
        org.junit.Assert.assertNotNull(pacmanInteraction17);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction1 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction1.notifyObservers();
        org.jpacman.framework.view.BoardView boardView3 = null;
        org.jpacman.framework.view.Animator animator4 = new org.jpacman.framework.view.Animator(boardView3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = pacmanInteraction1.controlling((org.jpacman.framework.controller.IController) animator4);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction6 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction6.notifyObservers();
        org.jpacman.framework.view.BoardView boardView8 = null;
        org.jpacman.framework.view.Animator animator9 = new org.jpacman.framework.view.Animator(boardView8);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction10 = pacmanInteraction6.controlling((org.jpacman.framework.controller.IController) animator9);
        pacmanInteraction5.deleteObserver((java.util.Observer) pacmanInteraction6);
        pacmanInteraction6.up();
        game0.addObserver((java.util.Observer) pacmanInteraction6);
        boolean boolean14 = game0.won();
        org.jpacman.framework.model.Player player15 = null;
        game0.addPlayer(player15);
        org.jpacman.framework.model.Player player17 = new org.jpacman.framework.model.Player();
        player17.die();
        org.jpacman.framework.model.Direction direction19 = player17.getDirection();
        try {
            game0.movePlayer(direction19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pacmanInteraction5);
        org.junit.Assert.assertNotNull(pacmanInteraction10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + direction19 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction19.equals(org.jpacman.framework.model.Direction.LEFT));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        float float0 = java.awt.Component.CENTER_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.5f + "'", float0 == 0.5f);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        javax.swing.event.AncestorListener[] ancestorListenerArray4 = buttonPanel0.getAncestorListeners();
        java.awt.event.ContainerListener containerListener5 = null;
        buttonPanel0.addContainerListener(containerListener5);
        int int7 = buttonPanel0.getDebugGraphicsOptions();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(ancestorListenerArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory1 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game2 = defaultGameFactory1.makeGame();
        level0.setFactory((org.jpacman.framework.factory.IGameFactory) defaultGameFactory1);
        level0.setMapFile("PanelUI");
        level0.setMapFile("WALL occupying null");
        org.junit.Assert.assertNotNull(game2);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(128, 1);
        org.jpacman.framework.model.Level level3 = new org.jpacman.framework.model.Level();
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory4 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game5 = defaultGameFactory4.makeGame();
        level3.setFactory((org.jpacman.framework.factory.IGameFactory) defaultGameFactory4);
        org.jpacman.framework.model.Food food7 = defaultGameFactory4.makeFood();
        try {
            board2.put((org.jpacman.framework.model.Sprite) food7, 13, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(game5);
        org.junit.Assert.assertNotNull(food7);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isRequestFocusEnabled();
        boolean boolean9 = buttonPanel4.isValid();
        int int10 = buttonPanel4.getHeight();
        boolean boolean11 = buttonPanel4.isValidateRoot();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isFocusable();
        java.awt.MenuComponent menuComponent9 = null;
        buttonPanel4.remove(menuComponent9);
        buttonPanel4.enable();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction12 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction12.notifyObservers();
        org.jpacman.framework.view.BoardView boardView14 = null;
        org.jpacman.framework.view.Animator animator15 = new org.jpacman.framework.view.Animator(boardView14);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction16 = pacmanInteraction12.controlling((org.jpacman.framework.controller.IController) animator15);
        pacmanInteraction12.up();
        org.jpacman.framework.view.ImageLoader imageLoader18 = new org.jpacman.framework.view.ImageLoader();
        try {
            buttonPanel4.update((java.util.Observable) pacmanInteraction12, (java.lang.Object) imageLoader18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(pacmanInteraction16);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        try {
            buttonPanel0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component8);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        int int8 = buttonPanel0.getBaseline(8, 1);
        boolean boolean10 = buttonPanel0.requestFocus(false);
        buttonPanel0.enableInputMethods(true);
        buttonPanel0.enable(true);
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isFocusable();
        buttonPanel4.repaint();
        javax.swing.JRootPane jRootPane10 = buttonPanel4.getRootPane();
        try {
            int int13 = jRootPane10.getBaseline(4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jRootPane10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        java.awt.Graphics graphics8 = null;
        buttonPanel0.update(graphics8);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        buttonPanel0.addPropertyChangeListener("", propertyChangeListener11);
        org.junit.Assert.assertNotNull(component7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        boolean boolean2 = game0.won();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover3 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game0);
        java.awt.event.ActionEvent actionEvent4 = null;
        try {
            randomGhostMover3.actionPerformed(actionEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.ui.ButtonPanel buttonPanel11 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics13 = null;
        buttonPanel12.printComponents(graphics13);
        org.jpacman.framework.ui.ButtonPanel buttonPanel16 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics17 = null;
        buttonPanel16.printComponents(graphics17);
        java.awt.Component component19 = buttonPanel12.add("[32,52]", (java.awt.Component) buttonPanel16);
        java.awt.Graphics graphics20 = null;
        buttonPanel12.update(graphics20);
        org.jpacman.framework.view.BoardView boardView22 = null;
        org.jpacman.framework.view.Animator animator23 = new org.jpacman.framework.view.Animator(boardView22);
        buttonPanel11.add((java.awt.Component) buttonPanel12, (java.lang.Object) animator23);
        java.awt.event.ComponentListener[] componentListenerArray25 = buttonPanel11.getComponentListeners();
        buttonPanel11.setEnabled(true);
        java.awt.Dimension dimension28 = buttonPanel11.getMinimumSize();
        buttonPanel1.setMinimumSize(dimension28);
        buttonPanel0.setPreferredSize(dimension28);
        java.awt.Component component33 = buttonPanel0.locate((int) '4', 10);
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(component19);
        org.junit.Assert.assertNotNull(componentListenerArray25);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertNull(component33);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        boolean boolean6 = buttonPanel0.isFocusOwner();
        java.lang.String str7 = buttonPanel0.getUIClassID();
        org.jpacman.framework.ui.ButtonPanel buttonPanel8 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior9 = buttonPanel8.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray10 = buttonPanel8.getContainerListeners();
        boolean boolean12 = buttonPanel8.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray13 = buttonPanel8.getContainerListeners();
        java.awt.Rectangle rectangle14 = null;
        java.awt.Rectangle rectangle15 = buttonPanel8.getBounds(rectangle14);
        java.awt.Rectangle rectangle16 = buttonPanel0.getBounds(rectangle15);
        org.jpacman.framework.ui.ButtonPanel buttonPanel18 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics19 = null;
        buttonPanel18.printComponents(graphics19);
        org.jpacman.framework.ui.ButtonPanel buttonPanel22 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics23 = null;
        buttonPanel22.printComponents(graphics23);
        java.awt.Component component25 = buttonPanel18.add("[32,52]", (java.awt.Component) buttonPanel22);
        java.awt.Graphics graphics26 = null;
        buttonPanel18.update(graphics26);
        javax.swing.KeyStroke keyStroke28 = null;
        buttonPanel18.unregisterKeyboardAction(keyStroke28);
        java.awt.Component component30 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel18);
        boolean boolean31 = component30.isMinimumSizeSet();
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "PanelUI" + "'", str7.equals("PanelUI"));
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior9 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior9.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(containerListenerArray13);
        org.junit.Assert.assertNotNull(rectangle15);
        org.junit.Assert.assertNotNull(rectangle16);
        org.junit.Assert.assertNotNull(component25);
        org.junit.Assert.assertNotNull(component30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isRequestFocusEnabled();
        javax.swing.ActionMap actionMap9 = buttonPanel4.getActionMap();
        boolean boolean10 = buttonPanel4.requestFocusInWindow();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(actionMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        buttonPanel0.setRequestFocusEnabled(true);
        boolean boolean5 = buttonPanel0.isValidateRoot();
        buttonPanel0.resize((int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        buttonPanel1.repaint(7, 13, 4, (int) (short) 100);
        int int19 = buttonPanel1.getHeight();
        buttonPanel1.setInheritsPopupMenu(false);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction22 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction22.notifyObservers();
        org.jpacman.framework.view.BoardView boardView24 = null;
        org.jpacman.framework.view.Animator animator25 = new org.jpacman.framework.view.Animator(boardView24);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction26 = pacmanInteraction22.controlling((org.jpacman.framework.controller.IController) animator25);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction27 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction27.notifyObservers();
        org.jpacman.framework.view.BoardView boardView29 = null;
        org.jpacman.framework.view.Animator animator30 = new org.jpacman.framework.view.Animator(boardView29);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction31 = pacmanInteraction27.controlling((org.jpacman.framework.controller.IController) animator30);
        pacmanInteraction27.start();
        org.jpacman.framework.ui.ButtonPanel buttonPanel33 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior34 = buttonPanel33.getBaselineResizeBehavior();
        int int35 = buttonPanel33.getWidth();
        float float36 = buttonPanel33.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray37 = buttonPanel33.getKeyListeners();
        java.awt.Rectangle rectangle38 = buttonPanel33.bounds();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray39 = buttonPanel33.getPropertyChangeListeners();
        pacmanInteraction22.update((java.util.Observable) pacmanInteraction27, (java.lang.Object) propertyChangeListenerArray39);
        org.jpacman.framework.ui.ButtonPanel buttonPanel41 = buttonPanel1.withInteractor(pacmanInteraction22);
        java.awt.peer.ComponentPeer componentPeer42 = buttonPanel41.getPeer();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(pacmanInteraction26);
        org.junit.Assert.assertNotNull(pacmanInteraction31);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior34 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior34.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray37);
        org.junit.Assert.assertNotNull(rectangle38);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray39);
        org.junit.Assert.assertNotNull(buttonPanel41);
        org.junit.Assert.assertNull(componentPeer42);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isFocusable();
        buttonPanel4.repaint();
        org.jpacman.framework.ui.ButtonPanel buttonPanel10 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics11 = null;
        buttonPanel10.printComponents(graphics11);
        org.jpacman.framework.ui.ButtonPanel buttonPanel14 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics15 = null;
        buttonPanel14.printComponents(graphics15);
        java.awt.Component component17 = buttonPanel10.add("[32,52]", (java.awt.Component) buttonPanel14);
        java.awt.Insets insets18 = buttonPanel10.getInsets();
        java.awt.Insets insets19 = buttonPanel4.getInsets(insets18);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(component17);
        org.junit.Assert.assertNotNull(insets18);
        org.junit.Assert.assertNotNull(insets19);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        boolean boolean4 = buttonPanel0.hasFocus();
        java.awt.FocusTraversalPolicy focusTraversalPolicy5 = null;
        buttonPanel0.setFocusTraversalPolicy(focusTraversalPolicy5);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isRequestFocusEnabled();
        boolean boolean9 = buttonPanel4.isEnabled();
        buttonPanel4.setDebugGraphicsOptions((int) (byte) -1);
        float float12 = buttonPanel4.getAlignmentY();
        java.lang.String str13 = buttonPanel4.getToolTipText();
        java.awt.Color color14 = buttonPanel4.getForeground();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        buttonPanel1.repaint(7, 13, 4, (int) (short) 100);
        java.awt.Graphics graphics19 = null;
        buttonPanel1.printAll(graphics19);
        buttonPanel1.enable(true);
        java.awt.Cursor cursor23 = buttonPanel1.getCursor();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(cursor23);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isRequestFocusEnabled();
        boolean boolean9 = buttonPanel4.isEnabled();
        buttonPanel4.setDebugGraphicsOptions((int) (byte) -1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior13 = buttonPanel12.getBaselineResizeBehavior();
        int int14 = buttonPanel12.getWidth();
        float float15 = buttonPanel12.getAlignmentY();
        boolean boolean16 = buttonPanel12.hasFocus();
        float float17 = buttonPanel12.getAlignmentY();
        java.awt.Graphics graphics18 = null;
        buttonPanel12.update(graphics18);
        buttonPanel12.reshape(8, 32, 64, (int) '.');
        java.awt.Color color25 = buttonPanel12.getForeground();
        buttonPanel4.setForeground(color25);
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray27 = buttonPanel4.getMouseWheelListeners();
        buttonPanel4.enable();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior13 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior13.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray27);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        boolean boolean4 = buttonPanel0.hasFocus();
        float float5 = buttonPanel0.getAlignmentY();
        java.awt.Graphics graphics6 = null;
        buttonPanel0.update(graphics6);
        buttonPanel0.setIgnoreRepaint(false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.awt.Container container14 = buttonPanel0.getFocusCycleRootAncestor();
        java.lang.String str15 = buttonPanel0.getToolTipText();
        javax.accessibility.AccessibleContext accessibleContext16 = buttonPanel0.getAccessibleContext();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNull(container14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(accessibleContext16);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.awt.event.ComponentListener[] componentListenerArray14 = buttonPanel0.getComponentListeners();
        buttonPanel0.setEnabled(true);
        java.awt.Dimension dimension17 = buttonPanel0.getMinimumSize();
        org.jpacman.framework.ui.ButtonPanel buttonPanel18 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics19 = null;
        buttonPanel18.printComponents(graphics19);
        org.jpacman.framework.ui.ButtonPanel buttonPanel22 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics23 = null;
        buttonPanel22.printComponents(graphics23);
        java.awt.Component component25 = buttonPanel18.add("[32,52]", (java.awt.Component) buttonPanel22);
        java.awt.Graphics graphics26 = null;
        buttonPanel18.update(graphics26);
        org.jpacman.framework.ui.ButtonPanel buttonPanel28 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel29 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics30 = null;
        buttonPanel29.printComponents(graphics30);
        org.jpacman.framework.ui.ButtonPanel buttonPanel33 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics34 = null;
        buttonPanel33.printComponents(graphics34);
        java.awt.Component component36 = buttonPanel29.add("[32,52]", (java.awt.Component) buttonPanel33);
        java.awt.Graphics graphics37 = null;
        buttonPanel29.update(graphics37);
        org.jpacman.framework.view.BoardView boardView39 = null;
        org.jpacman.framework.view.Animator animator40 = new org.jpacman.framework.view.Animator(boardView39);
        buttonPanel28.add((java.awt.Component) buttonPanel29, (java.lang.Object) animator40);
        java.awt.event.ComponentListener[] componentListenerArray42 = buttonPanel28.getComponentListeners();
        buttonPanel28.setEnabled(true);
        java.awt.Dimension dimension45 = buttonPanel28.getMinimumSize();
        buttonPanel18.setMinimumSize(dimension45);
        buttonPanel0.setPreferredSize(dimension45);
        int int48 = buttonPanel0.getY();
        java.awt.Event event49 = null;
        try {
            buttonPanel0.deliverEvent(event49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(componentListenerArray14);
        org.junit.Assert.assertNotNull(dimension17);
        org.junit.Assert.assertNotNull(component25);
        org.junit.Assert.assertNotNull(component36);
        org.junit.Assert.assertNotNull(componentListenerArray42);
        org.junit.Assert.assertNotNull(dimension45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        boolean boolean1 = mainUI0.isFocused();
        javax.swing.TransferHandler transferHandler2 = null;
        mainUI0.setTransferHandler(transferHandler2);
        try {
            java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet5 = mainUI0.getFocusTraversalKeys((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        java.awt.Graphics graphics2 = null;
        mainUI0.paint(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        org.jpacman.framework.ui.ButtonPanel buttonPanel9 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics10 = null;
        buttonPanel9.printComponents(graphics10);
        java.awt.Component component12 = buttonPanel5.add("[32,52]", (java.awt.Component) buttonPanel9);
        java.awt.Graphics graphics13 = null;
        buttonPanel5.update(graphics13);
        org.jpacman.framework.view.BoardView boardView15 = null;
        org.jpacman.framework.view.Animator animator16 = new org.jpacman.framework.view.Animator(boardView15);
        buttonPanel4.add((java.awt.Component) buttonPanel5, (java.lang.Object) animator16);
        int int18 = buttonPanel4.getDebugGraphicsOptions();
        java.awt.event.ContainerListener[] containerListenerArray19 = buttonPanel4.getContainerListeners();
        java.awt.event.InputMethodListener inputMethodListener20 = null;
        buttonPanel4.addInputMethodListener(inputMethodListener20);
        int int22 = buttonPanel4.getWidth();
        java.awt.Container container23 = buttonPanel4.getTopLevelAncestor();
        try {
            mainUI0.setGlassPane((java.awt.Component) container23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: glassPane cannot be set to null.");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(containerListenerArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(container23);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        boolean boolean4 = buttonPanel0.requestFocus(false);
        boolean boolean5 = buttonPanel0.isVisible();
        java.awt.event.MouseListener[] mouseListenerArray6 = buttonPanel0.getMouseListeners();
        int int7 = buttonPanel0.getHeight();
        buttonPanel0.setEnabled(true);
        boolean boolean10 = buttonPanel0.isMinimumSizeSet();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(mouseListenerArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction5.notifyObservers();
        org.jpacman.framework.view.BoardView boardView7 = null;
        org.jpacman.framework.view.Animator animator8 = new org.jpacman.framework.view.Animator(boardView7);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction9 = pacmanInteraction5.controlling((org.jpacman.framework.controller.IController) animator8);
        pacmanInteraction4.deleteObserver((java.util.Observer) pacmanInteraction5);
        org.jpacman.framework.ui.MainUI mainUI11 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray12 = mainUI11.getWindowStateListeners();
        java.awt.Graphics graphics13 = null;
        mainUI11.paint(graphics13);
        java.awt.MenuBar menuBar15 = null;
        mainUI11.setMenuBar(menuBar15);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction17 = pacmanInteraction4.withDisposable((org.jpacman.framework.ui.IDisposable) mainUI11);
        java.awt.Dialog.ModalExclusionType modalExclusionType18 = null;
        mainUI11.setModalExclusionType(modalExclusionType18);
        java.awt.Event event20 = null;
        try {
            boolean boolean21 = mainUI11.postEvent(event20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pacmanInteraction4);
        org.junit.Assert.assertNotNull(pacmanInteraction9);
        org.junit.Assert.assertNotNull(windowStateListenerArray12);
        org.junit.Assert.assertNotNull(pacmanInteraction17);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction1 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction1.notifyObservers();
        org.jpacman.framework.view.BoardView boardView3 = null;
        org.jpacman.framework.view.Animator animator4 = new org.jpacman.framework.view.Animator(boardView3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = pacmanInteraction1.controlling((org.jpacman.framework.controller.IController) animator4);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction6 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction6.notifyObservers();
        org.jpacman.framework.view.BoardView boardView8 = null;
        org.jpacman.framework.view.Animator animator9 = new org.jpacman.framework.view.Animator(boardView8);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction10 = pacmanInteraction6.controlling((org.jpacman.framework.controller.IController) animator9);
        pacmanInteraction5.deleteObserver((java.util.Observer) pacmanInteraction6);
        pacmanInteraction6.up();
        game0.addObserver((java.util.Observer) pacmanInteraction6);
        boolean boolean14 = game0.won();
        int int15 = game0.countObservers();
        org.jpacman.framework.model.IBoardInspector iBoardInspector16 = game0.getBoardInspector();
        org.jpacman.framework.model.Direction direction17 = org.jpacman.framework.model.Direction.RIGHT;
        try {
            game0.movePlayer(direction17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pacmanInteraction5);
        org.junit.Assert.assertNotNull(pacmanInteraction10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(iBoardInspector16);
        org.junit.Assert.assertTrue("'" + direction17 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction17.equals(org.jpacman.framework.model.Direction.RIGHT));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        buttonPanel2.removePropertyChangeListener("[32,52]", propertyChangeListener7);
        org.jpacman.framework.ui.ButtonPanel buttonPanel9 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior10 = buttonPanel9.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray11 = buttonPanel9.getContainerListeners();
        boolean boolean13 = buttonPanel9.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray14 = buttonPanel9.getContainerListeners();
        java.awt.image.ImageProducer imageProducer15 = null;
        java.awt.Image image16 = buttonPanel9.createImage(imageProducer15);
        org.jpacman.framework.ui.ButtonPanel buttonPanel17 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior18 = buttonPanel17.getBaselineResizeBehavior();
        int int19 = buttonPanel17.getWidth();
        float float20 = buttonPanel17.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray21 = buttonPanel17.getKeyListeners();
        int int22 = buttonPanel2.checkImage(image16, (java.awt.image.ImageObserver) buttonPanel17);
        java.awt.event.MouseListener[] mouseListenerArray23 = buttonPanel2.getMouseListeners();
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior10 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior10.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(containerListenerArray14);
        org.junit.Assert.assertNotNull(image16);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior18 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior18.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(mouseListenerArray23);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.IPacmanInteraction iPacmanInteraction3 = buttonPanel0.getPacmanInteractor();
        java.awt.Container container4 = buttonPanel0.getTopLevelAncestor();
        try {
            java.awt.Dimension dimension5 = container4.minimumSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iPacmanInteraction3);
        org.junit.Assert.assertNull(container4);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.IPacmanInteraction iPacmanInteraction3 = buttonPanel0.getPacmanInteractor();
        java.awt.FocusTraversalPolicy focusTraversalPolicy4 = null;
        buttonPanel0.setFocusTraversalPolicy(focusTraversalPolicy4);
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior7 = buttonPanel6.getBaselineResizeBehavior();
        int int8 = buttonPanel6.getWidth();
        float float9 = buttonPanel6.getAlignmentY();
        javax.swing.event.AncestorListener[] ancestorListenerArray10 = buttonPanel6.getAncestorListeners();
        buttonPanel6.validate();
        java.awt.Component component12 = buttonPanel0.add((java.awt.Component) buttonPanel6);
        java.awt.MenuComponent menuComponent13 = null;
        buttonPanel6.remove(menuComponent13);
        org.junit.Assert.assertNull(iPacmanInteraction3);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior7 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior7.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(ancestorListenerArray10);
        org.junit.Assert.assertNotNull(component12);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        int int0 = java.awt.image.ImageObserver.FRAMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        boolean boolean2 = mainUI0.isResizable();
        java.awt.Component component3 = mainUI0.getGlassPane();
        boolean boolean4 = component3.isEnabled();
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(component3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        pacmanInteraction0.start();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction6 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction6.notifyObservers();
        org.jpacman.framework.view.BoardView boardView8 = null;
        org.jpacman.framework.view.Animator animator9 = new org.jpacman.framework.view.Animator(boardView8);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction10 = pacmanInteraction6.controlling((org.jpacman.framework.controller.IController) animator9);
        pacmanInteraction0.addObserver((java.util.Observer) pacmanInteraction6);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction12 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction12.notifyObservers();
        org.jpacman.framework.view.BoardView boardView14 = null;
        org.jpacman.framework.view.Animator animator15 = new org.jpacman.framework.view.Animator(boardView14);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction16 = pacmanInteraction12.controlling((org.jpacman.framework.controller.IController) animator15);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction17 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction17.notifyObservers();
        org.jpacman.framework.view.BoardView boardView19 = null;
        org.jpacman.framework.view.Animator animator20 = new org.jpacman.framework.view.Animator(boardView19);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction21 = pacmanInteraction17.controlling((org.jpacman.framework.controller.IController) animator20);
        pacmanInteraction16.deleteObserver((java.util.Observer) pacmanInteraction17);
        pacmanInteraction17.up();
        org.jpacman.framework.ui.ButtonPanel buttonPanel24 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel25 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics26 = null;
        buttonPanel25.printComponents(graphics26);
        org.jpacman.framework.ui.ButtonPanel buttonPanel29 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics30 = null;
        buttonPanel29.printComponents(graphics30);
        java.awt.Component component32 = buttonPanel25.add("[32,52]", (java.awt.Component) buttonPanel29);
        java.awt.Graphics graphics33 = null;
        buttonPanel25.update(graphics33);
        org.jpacman.framework.view.BoardView boardView35 = null;
        org.jpacman.framework.view.Animator animator36 = new org.jpacman.framework.view.Animator(boardView35);
        buttonPanel24.add((java.awt.Component) buttonPanel25, (java.lang.Object) animator36);
        org.jpacman.framework.ui.ButtonPanel buttonPanel38 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior39 = buttonPanel38.getBaselineResizeBehavior();
        int int40 = buttonPanel38.getWidth();
        float float41 = buttonPanel38.getAlignmentY();
        boolean boolean42 = buttonPanel38.hasFocus();
        float float43 = buttonPanel38.getAlignmentY();
        org.jpacman.framework.ui.ButtonPanel buttonPanel44 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior45 = buttonPanel44.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray46 = buttonPanel44.getContainerListeners();
        boolean boolean48 = buttonPanel44.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray49 = buttonPanel44.getContainerListeners();
        java.awt.Rectangle rectangle50 = null;
        java.awt.Rectangle rectangle51 = buttonPanel44.getBounds(rectangle50);
        buttonPanel38.paintImmediately(rectangle51);
        javax.swing.border.Border border53 = null;
        buttonPanel38.setBorder(border53);
        java.awt.Point point55 = buttonPanel38.location();
        java.awt.Point point56 = buttonPanel24.getLocation(point55);
        try {
            pacmanInteraction0.update((java.util.Observable) pacmanInteraction17, (java.lang.Object) point56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pacmanInteraction4);
        org.junit.Assert.assertNotNull(pacmanInteraction10);
        org.junit.Assert.assertNotNull(pacmanInteraction16);
        org.junit.Assert.assertNotNull(pacmanInteraction21);
        org.junit.Assert.assertNotNull(component32);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior39 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior39.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 0.5f + "'", float41 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.5f + "'", float43 == 0.5f);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior45 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior45.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(containerListenerArray49);
        org.junit.Assert.assertNotNull(rectangle51);
        org.junit.Assert.assertNotNull(point55);
        org.junit.Assert.assertNotNull(point56);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        boolean boolean4 = buttonPanel0.requestFocus(false);
        buttonPanel0.doLayout();
        boolean boolean6 = buttonPanel0.isCursorSet();
        buttonPanel0.setOpaque(true);
        buttonPanel0.revalidate();
        org.jpacman.framework.ui.IPacmanInteraction iPacmanInteraction10 = buttonPanel0.getPacmanInteractor();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(iPacmanInteraction10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile((int) ' ', (int) '4');
        java.lang.String str3 = tile2.toString();
        org.jpacman.framework.model.Sprite sprite4 = null;
        boolean boolean5 = tile2.containsSprite(sprite4);
        org.jpacman.framework.model.Wall wall6 = new org.jpacman.framework.model.Wall();
        boolean boolean7 = tile2.containsSprite((org.jpacman.framework.model.Sprite) wall6);
        org.jpacman.framework.model.Tile tile8 = wall6.getTile();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = wall6.getSpriteType();
        org.jpacman.framework.model.Tile tile10 = wall6.getTile();
        java.lang.String str11 = wall6.toString();
        org.jpacman.framework.model.Tile tile14 = new org.jpacman.framework.model.Tile((int) ' ', (int) '4');
        java.lang.String str15 = tile14.toString();
        java.lang.String str16 = tile14.toString();
        wall6.occupy(tile14);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[32,52]" + "'", str3.equals("[32,52]"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(tile8);
        org.junit.Assert.assertTrue("'" + spriteType9 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.WALL + "'", spriteType9.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.WALL));
        org.junit.Assert.assertNull(tile10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "WALL occupying null" + "'", str11.equals("WALL occupying null"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[32,52]" + "'", str15.equals("[32,52]"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[32,52]" + "'", str16.equals("[32,52]"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray4 = buttonPanel0.getKeyListeners();
        boolean boolean5 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) buttonPanel0);
        java.awt.event.MouseWheelListener mouseWheelListener6 = null;
        buttonPanel0.addMouseWheelListener(mouseWheelListener6);
        java.awt.Event event8 = null;
        boolean boolean11 = buttonPanel0.mouseDrag(event8, 0, 13);
        buttonPanel0.setDoubleBuffered(false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        buttonPanel0.setFocusTraversalKeysEnabled(false);
        org.jpacman.framework.ui.ButtonPanel buttonPanel16 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior17 = buttonPanel16.getBaselineResizeBehavior();
        int int18 = buttonPanel16.getWidth();
        float float19 = buttonPanel16.getAlignmentY();
        boolean boolean20 = buttonPanel16.hasFocus();
        float float21 = buttonPanel16.getAlignmentY();
        boolean boolean22 = buttonPanel16.isValid();
        buttonPanel0.remove((java.awt.Component) buttonPanel16);
        java.awt.Graphics graphics24 = null;
        buttonPanel16.printAll(graphics24);
        buttonPanel16.paintImmediately((int) (short) 0, (int) (byte) 100, (int) (byte) 100, (int) 'G');
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        buttonPanel16.removePropertyChangeListener(propertyChangeListener31);
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior17 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior17.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        int int14 = buttonPanel0.getDebugGraphicsOptions();
        java.awt.event.ContainerListener[] containerListenerArray15 = buttonPanel0.getContainerListeners();
        javax.swing.KeyStroke[] keyStrokeArray16 = buttonPanel0.getRegisteredKeyStrokes();
        buttonPanel0.enable(false);
        javax.swing.border.Border border19 = buttonPanel0.getBorder();
        org.jpacman.framework.ui.ButtonPanel buttonPanel20 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel21 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics22 = null;
        buttonPanel21.printComponents(graphics22);
        org.jpacman.framework.ui.ButtonPanel buttonPanel25 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics26 = null;
        buttonPanel25.printComponents(graphics26);
        java.awt.Component component28 = buttonPanel21.add("[32,52]", (java.awt.Component) buttonPanel25);
        java.awt.Graphics graphics29 = null;
        buttonPanel21.update(graphics29);
        org.jpacman.framework.view.BoardView boardView31 = null;
        org.jpacman.framework.view.Animator animator32 = new org.jpacman.framework.view.Animator(boardView31);
        buttonPanel20.add((java.awt.Component) buttonPanel21, (java.lang.Object) animator32);
        org.jpacman.framework.ui.ButtonPanel buttonPanel34 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior35 = buttonPanel34.getBaselineResizeBehavior();
        int int36 = buttonPanel34.getWidth();
        float float37 = buttonPanel34.getAlignmentY();
        boolean boolean38 = buttonPanel34.hasFocus();
        float float39 = buttonPanel34.getAlignmentY();
        org.jpacman.framework.ui.ButtonPanel buttonPanel40 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior41 = buttonPanel40.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray42 = buttonPanel40.getContainerListeners();
        boolean boolean44 = buttonPanel40.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray45 = buttonPanel40.getContainerListeners();
        java.awt.Rectangle rectangle46 = null;
        java.awt.Rectangle rectangle47 = buttonPanel40.getBounds(rectangle46);
        buttonPanel34.paintImmediately(rectangle47);
        javax.swing.border.Border border49 = null;
        buttonPanel34.setBorder(border49);
        java.awt.Point point51 = buttonPanel34.location();
        java.awt.Point point52 = buttonPanel20.getLocation(point51);
        boolean boolean53 = buttonPanel0.contains(point51);
        try {
            boolean boolean55 = buttonPanel0.areFocusTraversalKeysSet((int) '.');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(containerListenerArray15);
        org.junit.Assert.assertNotNull(keyStrokeArray16);
        org.junit.Assert.assertNull(border19);
        org.junit.Assert.assertNotNull(component28);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior35 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior35.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.5f + "'", float37 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.5f + "'", float39 == 0.5f);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior41 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior41.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(containerListenerArray45);
        org.junit.Assert.assertNotNull(rectangle47);
        org.junit.Assert.assertNotNull(point51);
        org.junit.Assert.assertNotNull(point52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        java.awt.Graphics graphics8 = null;
        buttonPanel0.update(graphics8);
        try {
            buttonPanel0.pause();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component7);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        buttonPanel0.setVisible(true);
        try {
            boolean boolean7 = buttonPanel0.areFocusTraversalKeysSet((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        buttonPanel1.repaint(7, 13, 4, (int) (short) 100);
        java.awt.Graphics graphics19 = null;
        buttonPanel1.printAll(graphics19);
        buttonPanel1.setFocusTraversalPolicyProvider(true);
        org.junit.Assert.assertNotNull(component8);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        int int14 = buttonPanel0.getDebugGraphicsOptions();
        java.awt.event.ContainerListener[] containerListenerArray15 = buttonPanel0.getContainerListeners();
        javax.swing.KeyStroke[] keyStrokeArray16 = buttonPanel0.getRegisteredKeyStrokes();
        buttonPanel0.enable(false);
        javax.swing.JButton jButton19 = null;
        try {
            buttonPanel0.addButton(jButton19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(containerListenerArray15);
        org.junit.Assert.assertNotNull(keyStrokeArray16);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        char char0 = org.jpacman.framework.factory.MapParser.WALL;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '#' + "'", char0 == '#');
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(128, 1);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = board2.spriteTypeAt(3, (int) (byte) 0);
        try {
            org.jpacman.framework.model.Sprite sprite8 = board2.spriteAt(3, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + spriteType5 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.EMPTY + "'", spriteType5.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.EMPTY));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        boolean boolean1 = mainUI0.isFocused();
        java.awt.event.WindowFocusListener windowFocusListener2 = null;
        mainUI0.removeWindowFocusListener(windowFocusListener2);
        boolean boolean4 = mainUI0.isOpaque();
        try {
            mainUI0.applyResourceBundle("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Can't find bundle for base name hi!, locale en_CA");
        } catch (java.util.MissingResourceException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        boolean boolean6 = buttonPanel0.isFocusOwner();
        java.lang.String str7 = buttonPanel0.getUIClassID();
        org.jpacman.framework.ui.ButtonPanel buttonPanel8 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior9 = buttonPanel8.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray10 = buttonPanel8.getContainerListeners();
        boolean boolean12 = buttonPanel8.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray13 = buttonPanel8.getContainerListeners();
        java.awt.Rectangle rectangle14 = null;
        java.awt.Rectangle rectangle15 = buttonPanel8.getBounds(rectangle14);
        java.awt.Rectangle rectangle16 = buttonPanel0.getBounds(rectangle15);
        org.jpacman.framework.ui.MainUI mainUI17 = new org.jpacman.framework.ui.MainUI();
        org.jpacman.framework.ui.ButtonPanel buttonPanel18 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel19 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics20 = null;
        buttonPanel19.printComponents(graphics20);
        org.jpacman.framework.ui.ButtonPanel buttonPanel23 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics24 = null;
        buttonPanel23.printComponents(graphics24);
        java.awt.Component component26 = buttonPanel19.add("[32,52]", (java.awt.Component) buttonPanel23);
        java.awt.Graphics graphics27 = null;
        buttonPanel19.update(graphics27);
        org.jpacman.framework.view.BoardView boardView29 = null;
        org.jpacman.framework.view.Animator animator30 = new org.jpacman.framework.view.Animator(boardView29);
        buttonPanel18.add((java.awt.Component) buttonPanel19, (java.lang.Object) animator30);
        java.awt.event.ComponentListener[] componentListenerArray32 = buttonPanel18.getComponentListeners();
        buttonPanel18.setEnabled(true);
        java.awt.event.ContainerListener containerListener35 = null;
        buttonPanel18.removeContainerListener(containerListener35);
        java.awt.LayoutManager layoutManager37 = buttonPanel18.getLayout();
        mainUI17.setLayout(layoutManager37);
        org.jpacman.framework.ui.ButtonPanel buttonPanel39 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior40 = buttonPanel39.getBaselineResizeBehavior();
        int int41 = buttonPanel39.getWidth();
        float float42 = buttonPanel39.getAlignmentY();
        java.awt.ImageCapabilities imageCapabilities45 = null;
        java.awt.image.VolatileImage volatileImage46 = buttonPanel39.createVolatileImage((int) 'a', (int) (byte) 10, imageCapabilities45);
        java.awt.LayoutManager layoutManager47 = null;
        buttonPanel39.setLayout(layoutManager47);
        java.awt.ComponentOrientation componentOrientation49 = buttonPanel39.getComponentOrientation();
        mainUI17.applyComponentOrientation(componentOrientation49);
        buttonPanel0.applyComponentOrientation(componentOrientation49);
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "PanelUI" + "'", str7.equals("PanelUI"));
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior9 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior9.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(containerListenerArray13);
        org.junit.Assert.assertNotNull(rectangle15);
        org.junit.Assert.assertNotNull(rectangle16);
        org.junit.Assert.assertNotNull(component26);
        org.junit.Assert.assertNotNull(componentListenerArray32);
        org.junit.Assert.assertNotNull(layoutManager37);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior40 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior40.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.5f + "'", float42 == 0.5f);
        org.junit.Assert.assertNull(volatileImage46);
        org.junit.Assert.assertNotNull(componentOrientation49);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray4 = buttonPanel0.getKeyListeners();
        boolean boolean5 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) buttonPanel0);
        buttonPanel0.updateUI();
        javax.swing.event.AncestorListener ancestorListener7 = null;
        buttonPanel0.removeAncestorListener(ancestorListener7);
        java.awt.Event event9 = null;
        boolean boolean11 = buttonPanel0.keyUp(event9, 40);
        java.awt.event.MouseMotionListener mouseMotionListener12 = null;
        buttonPanel0.removeMouseMotionListener(mouseMotionListener12);
        java.awt.event.MouseWheelListener mouseWheelListener14 = null;
        buttonPanel0.addMouseWheelListener(mouseWheelListener14);
        java.awt.Event event16 = null;
        boolean boolean19 = buttonPanel0.mouseEnter(event16, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        int int0 = javax.swing.WindowConstants.EXIT_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.awt.event.ComponentListener[] componentListenerArray14 = buttonPanel0.getComponentListeners();
        buttonPanel0.setEnabled(true);
        java.awt.event.ContainerListener containerListener17 = null;
        buttonPanel0.removeContainerListener(containerListener17);
        buttonPanel0.reshape((int) 'G', (int) (short) 10, 6, (-1));
        buttonPanel0.setLocation((int) (byte) 100, 4);
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(componentListenerArray14);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isFocusTraversable();
        java.awt.event.ComponentListener componentListener9 = null;
        buttonPanel4.removeComponentListener(componentListener9);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        buttonPanel1.repaint(7, 13, 4, (int) (short) 100);
        int int19 = buttonPanel1.getHeight();
        buttonPanel1.setRequestFocusEnabled(false);
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        boolean boolean4 = buttonPanel0.hasFocus();
        float float5 = buttonPanel0.getAlignmentY();
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior7 = buttonPanel6.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray8 = buttonPanel6.getContainerListeners();
        boolean boolean10 = buttonPanel6.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray11 = buttonPanel6.getContainerListeners();
        java.awt.Rectangle rectangle12 = null;
        java.awt.Rectangle rectangle13 = buttonPanel6.getBounds(rectangle12);
        buttonPanel0.paintImmediately(rectangle13);
        boolean boolean15 = buttonPanel0.isFocusTraversalPolicyProvider();
        buttonPanel0.setVerifyInputWhenFocusTarget(false);
        boolean boolean18 = buttonPanel0.isDoubleBuffered();
        java.lang.Class<?> wildcardClass19 = buttonPanel0.getClass();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior7 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior7.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(containerListenerArray11);
        org.junit.Assert.assertNotNull(rectangle13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        char char0 = org.jpacman.framework.factory.MapParser.PLAYER;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'P' + "'", char0 == 'P');
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile((int) ' ', (int) '4');
        java.lang.String str3 = tile2.toString();
        org.jpacman.framework.model.Sprite sprite4 = null;
        boolean boolean5 = tile2.containsSprite(sprite4);
        org.jpacman.framework.model.Wall wall6 = new org.jpacman.framework.model.Wall();
        boolean boolean7 = tile2.containsSprite((org.jpacman.framework.model.Sprite) wall6);
        org.jpacman.framework.model.Tile tile8 = wall6.getTile();
        org.jpacman.framework.model.Tile tile9 = wall6.getTile();
        org.jpacman.framework.model.Tile tile10 = wall6.getTile();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[32,52]" + "'", str3.equals("[32,52]"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(tile8);
        org.junit.Assert.assertNull(tile9);
        org.junit.Assert.assertNull(tile10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        pacmanInteraction0.start();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction6 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction6.notifyObservers();
        org.jpacman.framework.view.BoardView boardView8 = null;
        org.jpacman.framework.view.Animator animator9 = new org.jpacman.framework.view.Animator(boardView8);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction10 = pacmanInteraction6.controlling((org.jpacman.framework.controller.IController) animator9);
        pacmanInteraction0.addObserver((java.util.Observer) pacmanInteraction6);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction12 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction12.notifyObservers();
        org.jpacman.framework.view.BoardView boardView14 = null;
        org.jpacman.framework.view.Animator animator15 = new org.jpacman.framework.view.Animator(boardView14);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction16 = pacmanInteraction12.controlling((org.jpacman.framework.controller.IController) animator15);
        pacmanInteraction12.start();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction18 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction18.notifyObservers();
        org.jpacman.framework.view.BoardView boardView20 = null;
        org.jpacman.framework.view.Animator animator21 = new org.jpacman.framework.view.Animator(boardView20);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction22 = pacmanInteraction18.controlling((org.jpacman.framework.controller.IController) animator21);
        pacmanInteraction12.addObserver((java.util.Observer) pacmanInteraction18);
        pacmanInteraction0.addObserver((java.util.Observer) pacmanInteraction18);
        try {
            pacmanInteraction18.exit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pacmanInteraction4);
        org.junit.Assert.assertNotNull(pacmanInteraction10);
        org.junit.Assert.assertNotNull(pacmanInteraction16);
        org.junit.Assert.assertNotNull(pacmanInteraction22);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        java.awt.event.MouseWheelListener mouseWheelListener4 = null;
        buttonPanel0.addMouseWheelListener(mouseWheelListener4);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction6 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction6.notifyObservers();
        org.jpacman.framework.view.BoardView boardView8 = null;
        org.jpacman.framework.view.Animator animator9 = new org.jpacman.framework.view.Animator(boardView8);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction10 = pacmanInteraction6.controlling((org.jpacman.framework.controller.IController) animator9);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction11 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction11.notifyObservers();
        org.jpacman.framework.view.BoardView boardView13 = null;
        org.jpacman.framework.view.Animator animator14 = new org.jpacman.framework.view.Animator(boardView13);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction15 = pacmanInteraction11.controlling((org.jpacman.framework.controller.IController) animator14);
        pacmanInteraction10.deleteObserver((java.util.Observer) pacmanInteraction11);
        org.jpacman.framework.ui.MainUI mainUI17 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray18 = mainUI17.getWindowStateListeners();
        java.awt.Graphics graphics19 = null;
        mainUI17.paint(graphics19);
        java.awt.MenuBar menuBar21 = null;
        mainUI17.setMenuBar(menuBar21);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction23 = pacmanInteraction10.withDisposable((org.jpacman.framework.ui.IDisposable) mainUI17);
        java.awt.Dialog.ModalExclusionType modalExclusionType24 = null;
        mainUI17.setModalExclusionType(modalExclusionType24);
        java.awt.Event event26 = null;
        boolean boolean29 = mainUI17.mouseEnter(event26, (int) (short) 0, (int) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        mainUI17.addPropertyChangeListener(propertyChangeListener30);
        java.awt.ComponentOrientation componentOrientation32 = mainUI17.getComponentOrientation();
        buttonPanel0.applyComponentOrientation(componentOrientation32);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(pacmanInteraction10);
        org.junit.Assert.assertNotNull(pacmanInteraction15);
        org.junit.Assert.assertNotNull(windowStateListenerArray18);
        org.junit.Assert.assertNotNull(pacmanInteraction23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(componentOrientation32);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.awt.Point point15 = buttonPanel1.getMousePosition(true);
        org.jpacman.framework.ui.ButtonPanel buttonPanel16 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior17 = buttonPanel16.getBaselineResizeBehavior();
        int int18 = buttonPanel16.getWidth();
        float float19 = buttonPanel16.getAlignmentY();
        boolean boolean20 = buttonPanel16.hasFocus();
        float float21 = buttonPanel16.getAlignmentY();
        org.jpacman.framework.ui.ButtonPanel buttonPanel22 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior23 = buttonPanel22.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray24 = buttonPanel22.getContainerListeners();
        boolean boolean26 = buttonPanel22.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray27 = buttonPanel22.getContainerListeners();
        java.awt.Rectangle rectangle28 = null;
        java.awt.Rectangle rectangle29 = buttonPanel22.getBounds(rectangle28);
        buttonPanel16.paintImmediately(rectangle29);
        java.awt.Rectangle rectangle31 = buttonPanel1.getBounds(rectangle29);
        java.awt.Graphics graphics32 = null;
        buttonPanel1.paint(graphics32);
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNull(point15);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior17 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior17.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior23 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior23.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(containerListenerArray27);
        org.junit.Assert.assertNotNull(rectangle29);
        org.junit.Assert.assertNotNull(rectangle31);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        buttonPanel2.removePropertyChangeListener("[32,52]", propertyChangeListener7);
        org.jpacman.framework.ui.ButtonPanel buttonPanel9 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior10 = buttonPanel9.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray11 = buttonPanel9.getContainerListeners();
        boolean boolean13 = buttonPanel9.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray14 = buttonPanel9.getContainerListeners();
        java.awt.image.ImageProducer imageProducer15 = null;
        java.awt.Image image16 = buttonPanel9.createImage(imageProducer15);
        org.jpacman.framework.ui.ButtonPanel buttonPanel17 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior18 = buttonPanel17.getBaselineResizeBehavior();
        int int19 = buttonPanel17.getWidth();
        float float20 = buttonPanel17.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray21 = buttonPanel17.getKeyListeners();
        int int22 = buttonPanel2.checkImage(image16, (java.awt.image.ImageObserver) buttonPanel17);
        java.awt.event.HierarchyListener hierarchyListener23 = null;
        buttonPanel17.addHierarchyListener(hierarchyListener23);
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior10 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior10.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(containerListenerArray14);
        org.junit.Assert.assertNotNull(image16);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior18 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior18.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        java.awt.Image image5 = buttonPanel0.createImage((int) (byte) -1, 32);
        java.awt.Component component8 = buttonPanel0.locate((int) (byte) 100, (int) (short) 1);
        javax.swing.JPopupMenu jPopupMenu9 = null;
        buttonPanel0.setComponentPopupMenu(jPopupMenu9);
        javax.swing.JPopupMenu jPopupMenu11 = null;
        buttonPanel0.setComponentPopupMenu(jPopupMenu11);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(component8);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        java.awt.Graphics graphics8 = null;
        buttonPanel0.update(graphics8);
        javax.swing.KeyStroke keyStroke10 = null;
        buttonPanel0.unregisterKeyboardAction(keyStroke10);
        java.awt.Dimension dimension12 = buttonPanel0.getMaximumSize();
        java.awt.Component component13 = null;
        buttonPanel0.setNextFocusableComponent(component13);
        buttonPanel0.revalidate();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNotNull(dimension12);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        float float0 = java.awt.Component.LEFT_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        int int8 = buttonPanel0.getBaseline(8, 1);
        boolean boolean10 = buttonPanel0.requestFocus(false);
        org.jpacman.framework.model.Game game11 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList12 = game11.getGhosts();
        boolean boolean13 = game11.won();
        org.jpacman.framework.ui.ButtonPanel buttonPanel14 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics15 = null;
        buttonPanel14.printComponents(graphics15);
        org.jpacman.framework.ui.ButtonPanel buttonPanel18 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics19 = null;
        buttonPanel18.printComponents(graphics19);
        java.awt.Component component21 = buttonPanel14.add("[32,52]", (java.awt.Component) buttonPanel18);
        boolean boolean22 = buttonPanel18.isFocusable();
        java.awt.MenuComponent menuComponent23 = null;
        buttonPanel18.remove(menuComponent23);
        buttonPanel18.enable();
        game11.attach((java.util.Observer) buttonPanel18);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover27 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game11);
        javax.swing.KeyStroke keyStroke29 = null;
        try {
            buttonPanel0.registerKeyboardAction((java.awt.event.ActionListener) randomGhostMover27, "[32,52]", keyStroke29, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(ghostList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(component21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        boolean boolean4 = buttonPanel0.requestFocus(false);
        java.awt.Graphics graphics5 = null;
        buttonPanel0.paintAll(graphics5);
        java.io.PrintWriter printWriter7 = null;
        try {
            buttonPanel0.list(printWriter7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        boolean boolean4 = buttonPanel0.requestFocus(false);
        buttonPanel0.doLayout();
        buttonPanel0.setDebugGraphicsOptions((int) (byte) 1);
        buttonPanel0.list();
        java.awt.Dimension dimension9 = buttonPanel0.minimumSize();
        buttonPanel0.removeNotify();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dimension9);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = component7.isMinimumSizeSet();
        java.awt.im.InputMethodRequests inputMethodRequests9 = component7.getInputMethodRequests();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputMethodRequests9);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        buttonPanel0.firePropertyChange("ToolTipText", ' ', ' ');
        javax.swing.TransferHandler transferHandler18 = null;
        buttonPanel0.setTransferHandler(transferHandler18);
        boolean boolean20 = buttonPanel0.isDoubleBuffered();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.awt.event.ComponentListener[] componentListenerArray14 = buttonPanel0.getComponentListeners();
        buttonPanel0.setEnabled(true);
        java.awt.Dimension dimension17 = buttonPanel0.getMinimumSize();
        org.jpacman.framework.ui.ButtonPanel buttonPanel18 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics19 = null;
        buttonPanel18.printComponents(graphics19);
        org.jpacman.framework.ui.ButtonPanel buttonPanel22 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics23 = null;
        buttonPanel22.printComponents(graphics23);
        java.awt.Component component25 = buttonPanel18.add("[32,52]", (java.awt.Component) buttonPanel22);
        java.awt.Graphics graphics26 = null;
        buttonPanel18.update(graphics26);
        org.jpacman.framework.ui.ButtonPanel buttonPanel28 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel29 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics30 = null;
        buttonPanel29.printComponents(graphics30);
        org.jpacman.framework.ui.ButtonPanel buttonPanel33 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics34 = null;
        buttonPanel33.printComponents(graphics34);
        java.awt.Component component36 = buttonPanel29.add("[32,52]", (java.awt.Component) buttonPanel33);
        java.awt.Graphics graphics37 = null;
        buttonPanel29.update(graphics37);
        org.jpacman.framework.view.BoardView boardView39 = null;
        org.jpacman.framework.view.Animator animator40 = new org.jpacman.framework.view.Animator(boardView39);
        buttonPanel28.add((java.awt.Component) buttonPanel29, (java.lang.Object) animator40);
        java.awt.event.ComponentListener[] componentListenerArray42 = buttonPanel28.getComponentListeners();
        buttonPanel28.setEnabled(true);
        java.awt.Dimension dimension45 = buttonPanel28.getMinimumSize();
        buttonPanel18.setMinimumSize(dimension45);
        buttonPanel0.setPreferredSize(dimension45);
        javax.swing.InputVerifier inputVerifier48 = buttonPanel0.getInputVerifier();
        java.awt.Rectangle rectangle49 = buttonPanel0.bounds();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(componentListenerArray14);
        org.junit.Assert.assertNotNull(dimension17);
        org.junit.Assert.assertNotNull(component25);
        org.junit.Assert.assertNotNull(component36);
        org.junit.Assert.assertNotNull(componentListenerArray42);
        org.junit.Assert.assertNotNull(dimension45);
        org.junit.Assert.assertNull(inputVerifier48);
        org.junit.Assert.assertNotNull(rectangle49);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        int int0 = java.awt.Frame.SW_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isRequestFocusEnabled();
        boolean boolean9 = buttonPanel4.isEnabled();
        buttonPanel4.setDebugGraphicsOptions((int) (byte) -1);
        int int12 = buttonPanel4.getDebugGraphicsOptions();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Ghost ghost2 = defaultGameFactory0.makeGhost();
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(ghost2);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction5.notifyObservers();
        org.jpacman.framework.view.BoardView boardView7 = null;
        org.jpacman.framework.view.Animator animator8 = new org.jpacman.framework.view.Animator(boardView7);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction9 = pacmanInteraction5.controlling((org.jpacman.framework.controller.IController) animator8);
        pacmanInteraction4.deleteObserver((java.util.Observer) pacmanInteraction5);
        pacmanInteraction4.left();
        pacmanInteraction4.start();
        org.jpacman.framework.ui.PacmanInteraction.MatchState matchState13 = pacmanInteraction4.getCurrentState();
        org.junit.Assert.assertNotNull(pacmanInteraction4);
        org.junit.Assert.assertNotNull(pacmanInteraction9);
        org.junit.Assert.assertTrue("'" + matchState13 + "' != '" + org.jpacman.framework.ui.PacmanInteraction.MatchState.PLAYING + "'", matchState13.equals(org.jpacman.framework.ui.PacmanInteraction.MatchState.PLAYING));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray4 = buttonPanel0.getKeyListeners();
        boolean boolean5 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) buttonPanel0);
        buttonPanel0.updateUI();
        javax.swing.event.AncestorListener ancestorListener7 = null;
        buttonPanel0.removeAncestorListener(ancestorListener7);
        boolean boolean9 = buttonPanel0.requestFocusInWindow();
        buttonPanel0.disable();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isRequestFocusEnabled();
        boolean boolean9 = buttonPanel4.isEnabled();
        buttonPanel4.setDebugGraphicsOptions((int) (byte) -1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior13 = buttonPanel12.getBaselineResizeBehavior();
        int int14 = buttonPanel12.getWidth();
        float float15 = buttonPanel12.getAlignmentY();
        boolean boolean16 = buttonPanel12.hasFocus();
        float float17 = buttonPanel12.getAlignmentY();
        java.awt.Graphics graphics18 = null;
        buttonPanel12.update(graphics18);
        buttonPanel12.reshape(8, 32, 64, (int) '.');
        java.awt.Color color25 = buttonPanel12.getForeground();
        buttonPanel4.setForeground(color25);
        buttonPanel4.setFocusCycleRoot(false);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior13 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior13.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNotNull(color25);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        java.awt.Graphics graphics2 = null;
        mainUI0.paint(graphics2);
        mainUI0.setBounds((int) 'G', 10, 11, 3);
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        int int8 = buttonPanel0.getBaseline(8, 1);
        boolean boolean10 = buttonPanel0.requestFocus(false);
        boolean boolean11 = buttonPanel0.requestFocusInWindow();
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isRequestFocusEnabled();
        boolean boolean9 = buttonPanel4.isEnabled();
        buttonPanel4.setDebugGraphicsOptions((int) (byte) -1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior13 = buttonPanel12.getBaselineResizeBehavior();
        int int14 = buttonPanel12.getWidth();
        float float15 = buttonPanel12.getAlignmentY();
        boolean boolean16 = buttonPanel12.hasFocus();
        float float17 = buttonPanel12.getAlignmentY();
        java.awt.Graphics graphics18 = null;
        buttonPanel12.update(graphics18);
        buttonPanel12.reshape(8, 32, 64, (int) '.');
        java.awt.Color color25 = buttonPanel12.getForeground();
        buttonPanel4.setForeground(color25);
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray27 = buttonPanel4.getMouseWheelListeners();
        java.awt.event.MouseMotionListener mouseMotionListener28 = null;
        buttonPanel4.addMouseMotionListener(mouseMotionListener28);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior13 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior13.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray27);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.IPacmanInteraction iPacmanInteraction3 = buttonPanel0.getPacmanInteractor();
        java.awt.Container container4 = buttonPanel0.getTopLevelAncestor();
        javax.swing.event.AncestorListener[] ancestorListenerArray5 = buttonPanel0.getAncestorListeners();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray7 = buttonPanel0.getPropertyChangeListeners("board.txt");
        org.junit.Assert.assertNull(iPacmanInteraction3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNotNull(ancestorListenerArray5);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray7);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction5.notifyObservers();
        org.jpacman.framework.view.BoardView boardView7 = null;
        org.jpacman.framework.view.Animator animator8 = new org.jpacman.framework.view.Animator(boardView7);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction9 = pacmanInteraction5.controlling((org.jpacman.framework.controller.IController) animator8);
        pacmanInteraction4.deleteObserver((java.util.Observer) pacmanInteraction5);
        org.jpacman.framework.ui.MainUI mainUI11 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray12 = mainUI11.getWindowStateListeners();
        java.awt.Graphics graphics13 = null;
        mainUI11.paint(graphics13);
        java.awt.MenuBar menuBar15 = null;
        mainUI11.setMenuBar(menuBar15);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction17 = pacmanInteraction4.withDisposable((org.jpacman.framework.ui.IDisposable) mainUI11);
        java.awt.Dialog.ModalExclusionType modalExclusionType18 = null;
        mainUI11.setModalExclusionType(modalExclusionType18);
        java.awt.image.BufferStrategy bufferStrategy20 = mainUI11.getBufferStrategy();
        java.awt.Event event21 = null;
        boolean boolean23 = mainUI11.keyDown(event21, 16);
        org.junit.Assert.assertNotNull(pacmanInteraction4);
        org.junit.Assert.assertNotNull(pacmanInteraction9);
        org.junit.Assert.assertNotNull(windowStateListenerArray12);
        org.junit.Assert.assertNotNull(pacmanInteraction17);
        org.junit.Assert.assertNull(bufferStrategy20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        boolean boolean1 = mainUI0.isFocused();
        java.awt.event.WindowFocusListener windowFocusListener2 = null;
        mainUI0.removeWindowFocusListener(windowFocusListener2);
        boolean boolean4 = mainUI0.isOpaque();
        boolean boolean5 = mainUI0.isFocused();
        java.awt.BufferCapabilities bufferCapabilities7 = null;
        try {
            mainUI0.createBufferStrategy((int) 'P', bufferCapabilities7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No capabilities specified");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        int int14 = buttonPanel0.getDebugGraphicsOptions();
        java.awt.event.ContainerListener[] containerListenerArray15 = buttonPanel0.getContainerListeners();
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        buttonPanel0.addInputMethodListener(inputMethodListener16);
        int int18 = buttonPanel0.getWidth();
        java.awt.Image image21 = buttonPanel0.createImage((int) (byte) 0, 13);
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(containerListenerArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(image21);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        boolean boolean4 = buttonPanel0.hasFocus();
        float float5 = buttonPanel0.getAlignmentY();
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior7 = buttonPanel6.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray8 = buttonPanel6.getContainerListeners();
        boolean boolean10 = buttonPanel6.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray11 = buttonPanel6.getContainerListeners();
        java.awt.Rectangle rectangle12 = null;
        java.awt.Rectangle rectangle13 = buttonPanel6.getBounds(rectangle12);
        buttonPanel0.paintImmediately(rectangle13);
        javax.swing.border.Border border15 = null;
        buttonPanel0.setBorder(border15);
        java.awt.Container container17 = buttonPanel0.getTopLevelAncestor();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior7 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior7.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(containerListenerArray11);
        org.junit.Assert.assertNotNull(rectangle13);
        org.junit.Assert.assertNull(container17);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        java.awt.Graphics graphics8 = null;
        buttonPanel0.update(graphics8);
        javax.swing.KeyStroke keyStroke10 = null;
        buttonPanel0.unregisterKeyboardAction(keyStroke10);
        java.awt.Container container12 = buttonPanel0.getFocusCycleRootAncestor();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNull(container12);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile((int) ' ', (int) '4');
        java.lang.String str3 = tile2.toString();
        org.jpacman.framework.model.Sprite sprite4 = null;
        boolean boolean5 = tile2.containsSprite(sprite4);
        org.jpacman.framework.model.Wall wall6 = new org.jpacman.framework.model.Wall();
        boolean boolean7 = tile2.containsSprite((org.jpacman.framework.model.Sprite) wall6);
        org.jpacman.framework.model.Tile tile8 = wall6.getTile();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = wall6.getSpriteType();
        try {
            wall6.deoccupy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[32,52]" + "'", str3.equals("[32,52]"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(tile8);
        org.junit.Assert.assertTrue("'" + spriteType9 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.WALL + "'", spriteType9.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.WALL));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        boolean boolean1 = mainUI0.isFocused();
        javax.swing.TransferHandler transferHandler2 = null;
        mainUI0.setTransferHandler(transferHandler2);
        try {
            java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet5 = mainUI0.getFocusTraversalKeys((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        int int8 = buttonPanel0.getBaseline(8, 1);
        boolean boolean9 = buttonPanel0.isPaintingForPrint();
        java.awt.Component component12 = buttonPanel0.findComponentAt(8, 40);
        buttonPanel0.setDoubleBuffered(false);
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(component12);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        boolean boolean4 = buttonPanel0.hasFocus();
        float float5 = buttonPanel0.getAlignmentY();
        java.awt.Graphics graphics6 = null;
        buttonPanel0.update(graphics6);
        buttonPanel0.reshape(8, 32, 64, (int) '.');
        java.beans.PropertyChangeListener[] propertyChangeListenerArray14 = buttonPanel0.getPropertyChangeListeners("");
        javax.swing.border.Border border15 = buttonPanel0.getBorder();
        java.awt.event.FocusListener focusListener16 = null;
        buttonPanel0.removeFocusListener(focusListener16);
        java.awt.Insets insets18 = buttonPanel0.getInsets();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray14);
        org.junit.Assert.assertNull(border15);
        org.junit.Assert.assertNotNull(insets18);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        java.awt.Graphics graphics8 = null;
        buttonPanel0.update(graphics8);
        javax.swing.KeyStroke keyStroke10 = null;
        buttonPanel0.unregisterKeyboardAction(keyStroke10);
        int int12 = buttonPanel0.getHeight();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        buttonPanel0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseEvent mouseEvent3 = null;
        java.awt.Point point4 = buttonPanel0.getPopupLocation(mouseEvent3);
        javax.swing.border.Border border5 = null;
        buttonPanel0.setBorder(border5);
        org.junit.Assert.assertNull(point4);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isRequestFocusEnabled();
        java.awt.Image image9 = null;
        org.jpacman.framework.ui.ButtonPanel buttonPanel10 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel11 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics12 = null;
        buttonPanel11.printComponents(graphics12);
        org.jpacman.framework.ui.ButtonPanel buttonPanel15 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics16 = null;
        buttonPanel15.printComponents(graphics16);
        java.awt.Component component18 = buttonPanel11.add("[32,52]", (java.awt.Component) buttonPanel15);
        java.awt.Graphics graphics19 = null;
        buttonPanel11.update(graphics19);
        org.jpacman.framework.view.BoardView boardView21 = null;
        org.jpacman.framework.view.Animator animator22 = new org.jpacman.framework.view.Animator(boardView21);
        buttonPanel10.add((java.awt.Component) buttonPanel11, (java.lang.Object) animator22);
        java.awt.event.ComponentListener[] componentListenerArray24 = buttonPanel10.getComponentListeners();
        buttonPanel10.setEnabled(true);
        java.awt.Dimension dimension27 = buttonPanel10.getMinimumSize();
        java.awt.Color color28 = null;
        buttonPanel10.setForeground(color28);
        boolean boolean30 = buttonPanel4.prepareImage(image9, (java.awt.image.ImageObserver) buttonPanel10);
        java.awt.Dimension dimension31 = buttonPanel4.getMinimumSize();
        org.jpacman.framework.ui.ButtonPanel buttonPanel32 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel34 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener35 = null;
        buttonPanel34.removeMouseWheelListener(mouseWheelListener35);
        java.awt.Component component37 = buttonPanel32.add("[32,52]", (java.awt.Component) buttonPanel34);
        boolean boolean38 = buttonPanel32.isFocusOwner();
        java.lang.String str39 = buttonPanel32.getUIClassID();
        org.jpacman.framework.ui.ButtonPanel buttonPanel40 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior41 = buttonPanel40.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray42 = buttonPanel40.getContainerListeners();
        boolean boolean44 = buttonPanel40.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray45 = buttonPanel40.getContainerListeners();
        java.awt.Rectangle rectangle46 = null;
        java.awt.Rectangle rectangle47 = buttonPanel40.getBounds(rectangle46);
        java.awt.Rectangle rectangle48 = buttonPanel32.getBounds(rectangle47);
        org.jpacman.framework.ui.ButtonPanel buttonPanel49 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel50 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics51 = null;
        buttonPanel50.printComponents(graphics51);
        org.jpacman.framework.ui.ButtonPanel buttonPanel54 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics55 = null;
        buttonPanel54.printComponents(graphics55);
        java.awt.Component component57 = buttonPanel50.add("[32,52]", (java.awt.Component) buttonPanel54);
        java.awt.Graphics graphics58 = null;
        buttonPanel50.update(graphics58);
        org.jpacman.framework.view.BoardView boardView60 = null;
        org.jpacman.framework.view.Animator animator61 = new org.jpacman.framework.view.Animator(boardView60);
        buttonPanel49.add((java.awt.Component) buttonPanel50, (java.lang.Object) animator61);
        buttonPanel50.firePropertyChange("hi!", (double) ' ', (double) 4);
        java.util.Locale locale67 = buttonPanel50.getLocale();
        buttonPanel32.setLocale(locale67);
        buttonPanel4.setLocale(locale67);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(component18);
        org.junit.Assert.assertNotNull(componentListenerArray24);
        org.junit.Assert.assertNotNull(dimension27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dimension31);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "PanelUI" + "'", str39.equals("PanelUI"));
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior41 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior41.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(containerListenerArray45);
        org.junit.Assert.assertNotNull(rectangle47);
        org.junit.Assert.assertNotNull(rectangle48);
        org.junit.Assert.assertNotNull(component57);
        org.junit.Assert.assertNotNull(locale67);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.lang.String str14 = buttonPanel1.toString();
        java.awt.Event event15 = null;
        boolean boolean17 = buttonPanel1.lostFocus(event15, (java.lang.Object) (short) 100);
        java.awt.dnd.DropTarget dropTarget18 = buttonPanel1.getDropTarget();
        org.jpacman.framework.ui.ButtonPanel buttonPanel19 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior20 = buttonPanel19.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray21 = buttonPanel19.getContainerListeners();
        boolean boolean23 = buttonPanel19.requestFocus(false);
        buttonPanel19.doLayout();
        boolean boolean25 = buttonPanel19.isCursorSet();
        org.jpacman.framework.ui.ButtonPanel buttonPanel26 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior27 = buttonPanel26.getBaselineResizeBehavior();
        int int28 = buttonPanel26.getWidth();
        float float29 = buttonPanel26.getAlignmentY();
        boolean boolean30 = buttonPanel26.hasFocus();
        float float31 = buttonPanel26.getAlignmentY();
        org.jpacman.framework.ui.ButtonPanel buttonPanel32 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior33 = buttonPanel32.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray34 = buttonPanel32.getContainerListeners();
        boolean boolean36 = buttonPanel32.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray37 = buttonPanel32.getContainerListeners();
        java.awt.Rectangle rectangle38 = null;
        java.awt.Rectangle rectangle39 = buttonPanel32.getBounds(rectangle38);
        buttonPanel26.paintImmediately(rectangle39);
        buttonPanel19.paintImmediately(rectangle39);
        buttonPanel1.computeVisibleRect(rectangle39);
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "org.jpacman.framework.ui.ButtonPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str14.equals("org.jpacman.framework.ui.ButtonPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(dropTarget18);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior20 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior20.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior27 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior27.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.5f + "'", float29 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.5f + "'", float31 == 0.5f);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior33 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior33.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(containerListenerArray37);
        org.junit.Assert.assertNotNull(rectangle39);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        java.awt.Graphics graphics2 = null;
        mainUI0.paint(graphics2);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("", propertyChangeListener5);
        mainUI0.setLocationByPlatform(true);
        try {
            mainUI0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.jpacman.framework.model.Direction direction0 = org.jpacman.framework.model.Direction.RIGHT;
        int int1 = direction0.getDy();
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction0.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(40, 9);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction5.notifyObservers();
        org.jpacman.framework.view.BoardView boardView7 = null;
        org.jpacman.framework.view.Animator animator8 = new org.jpacman.framework.view.Animator(boardView7);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction9 = pacmanInteraction5.controlling((org.jpacman.framework.controller.IController) animator8);
        pacmanInteraction4.deleteObserver((java.util.Observer) pacmanInteraction5);
        org.jpacman.framework.ui.MainUI mainUI11 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray12 = mainUI11.getWindowStateListeners();
        java.awt.Graphics graphics13 = null;
        mainUI11.paint(graphics13);
        java.awt.MenuBar menuBar15 = null;
        mainUI11.setMenuBar(menuBar15);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction17 = pacmanInteraction4.withDisposable((org.jpacman.framework.ui.IDisposable) mainUI11);
        java.awt.Dialog.ModalExclusionType modalExclusionType18 = null;
        mainUI11.setModalExclusionType(modalExclusionType18);
        java.awt.image.BufferStrategy bufferStrategy20 = mainUI11.getBufferStrategy();
        mainUI11.setExtendedState((int) '.');
        java.awt.event.WindowListener[] windowListenerArray23 = mainUI11.getWindowListeners();
        org.junit.Assert.assertNotNull(pacmanInteraction4);
        org.junit.Assert.assertNotNull(pacmanInteraction9);
        org.junit.Assert.assertNotNull(windowStateListenerArray12);
        org.junit.Assert.assertNotNull(pacmanInteraction17);
        org.junit.Assert.assertNull(bufferStrategy20);
        org.junit.Assert.assertNotNull(windowListenerArray23);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        java.awt.Graphics graphics8 = null;
        buttonPanel0.update(graphics8);
        boolean boolean10 = buttonPanel0.requestFocusInWindow();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior11 = buttonPanel0.getBaselineResizeBehavior();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior11 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior11.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction5.notifyObservers();
        org.jpacman.framework.view.BoardView boardView7 = null;
        org.jpacman.framework.view.Animator animator8 = new org.jpacman.framework.view.Animator(boardView7);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction9 = pacmanInteraction5.controlling((org.jpacman.framework.controller.IController) animator8);
        pacmanInteraction4.deleteObserver((java.util.Observer) pacmanInteraction5);
        org.jpacman.framework.ui.MainUI mainUI11 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray12 = mainUI11.getWindowStateListeners();
        java.awt.Graphics graphics13 = null;
        mainUI11.paint(graphics13);
        java.awt.MenuBar menuBar15 = null;
        mainUI11.setMenuBar(menuBar15);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction17 = pacmanInteraction4.withDisposable((org.jpacman.framework.ui.IDisposable) mainUI11);
        java.awt.Dialog.ModalExclusionType modalExclusionType18 = null;
        mainUI11.setModalExclusionType(modalExclusionType18);
        java.awt.image.BufferStrategy bufferStrategy20 = mainUI11.getBufferStrategy();
        mainUI11.setExtendedState((int) '.');
        mainUI11.main();
        org.junit.Assert.assertNotNull(pacmanInteraction4);
        org.junit.Assert.assertNotNull(pacmanInteraction9);
        org.junit.Assert.assertNotNull(windowStateListenerArray12);
        org.junit.Assert.assertNotNull(pacmanInteraction17);
        org.junit.Assert.assertNull(bufferStrategy20);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        java.awt.Dimension dimension8 = buttonPanel0.size();
        int int9 = buttonPanel0.getY();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isRequestFocusEnabled();
        buttonPanel4.setIgnoreRepaint(false);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        int int8 = buttonPanel0.getBaseline(8, 1);
        boolean boolean10 = buttonPanel0.requestFocus(false);
        buttonPanel0.enableInputMethods(true);
        javax.swing.InputMap inputMap13 = buttonPanel0.getInputMap();
        java.awt.event.FocusListener focusListener14 = null;
        buttonPanel0.removeFocusListener(focusListener14);
        java.awt.Component component18 = buttonPanel0.locate((int) (byte) 10, 6);
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(inputMap13);
        org.junit.Assert.assertNull(component18);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        javax.swing.event.AncestorListener[] ancestorListenerArray4 = buttonPanel0.getAncestorListeners();
        buttonPanel0.firePropertyChange("hi!", (short) 10, (short) -1);
        javax.swing.TransferHandler transferHandler9 = null;
        buttonPanel0.setTransferHandler(transferHandler9);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction11 = new org.jpacman.framework.ui.PacmanInteraction();
        org.jpacman.framework.factory.FactoryException factoryException13 = new org.jpacman.framework.factory.FactoryException("");
        org.jpacman.framework.factory.FactoryException factoryException15 = new org.jpacman.framework.factory.FactoryException("");
        factoryException13.addSuppressed((java.lang.Throwable) factoryException15);
        java.lang.Throwable[] throwableArray17 = factoryException13.getSuppressed();
        try {
            buttonPanel0.update((java.util.Observable) pacmanInteraction11, (java.lang.Object) factoryException13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(ancestorListenerArray4);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics3 = null;
        buttonPanel2.printComponents(graphics3);
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics7 = null;
        buttonPanel6.printComponents(graphics7);
        java.awt.Component component9 = buttonPanel2.add("[32,52]", (java.awt.Component) buttonPanel6);
        java.awt.Graphics graphics10 = null;
        buttonPanel2.update(graphics10);
        org.jpacman.framework.view.BoardView boardView12 = null;
        org.jpacman.framework.view.Animator animator13 = new org.jpacman.framework.view.Animator(boardView12);
        buttonPanel1.add((java.awt.Component) buttonPanel2, (java.lang.Object) animator13);
        java.awt.event.ComponentListener[] componentListenerArray15 = buttonPanel1.getComponentListeners();
        buttonPanel1.setEnabled(true);
        java.awt.event.ContainerListener containerListener18 = null;
        buttonPanel1.removeContainerListener(containerListener18);
        java.awt.LayoutManager layoutManager20 = buttonPanel1.getLayout();
        mainUI0.setLayout(layoutManager20);
        org.jpacman.framework.ui.ButtonPanel buttonPanel22 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior23 = buttonPanel22.getBaselineResizeBehavior();
        int int24 = buttonPanel22.getWidth();
        float float25 = buttonPanel22.getAlignmentY();
        java.awt.ImageCapabilities imageCapabilities28 = null;
        java.awt.image.VolatileImage volatileImage29 = buttonPanel22.createVolatileImage((int) 'a', (int) (byte) 10, imageCapabilities28);
        java.awt.LayoutManager layoutManager30 = null;
        buttonPanel22.setLayout(layoutManager30);
        java.awt.ComponentOrientation componentOrientation32 = buttonPanel22.getComponentOrientation();
        mainUI0.applyComponentOrientation(componentOrientation32);
        boolean boolean34 = mainUI0.isUndecorated();
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertNotNull(componentListenerArray15);
        org.junit.Assert.assertNotNull(layoutManager20);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior23 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior23.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
        org.junit.Assert.assertNull(volatileImage29);
        org.junit.Assert.assertNotNull(componentOrientation32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        boolean boolean6 = buttonPanel0.isFocusOwner();
        java.lang.String str7 = buttonPanel0.getUIClassID();
        java.awt.Point point9 = buttonPanel0.getMousePosition(false);
        java.awt.Graphics graphics10 = null;
        buttonPanel0.printAll(graphics10);
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "PanelUI" + "'", str7.equals("PanelUI"));
        org.junit.Assert.assertNull(point9);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        boolean boolean2 = game0.won();
        org.jpacman.framework.ui.ButtonPanel buttonPanel3 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics4 = null;
        buttonPanel3.printComponents(graphics4);
        org.jpacman.framework.ui.ButtonPanel buttonPanel7 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics8 = null;
        buttonPanel7.printComponents(graphics8);
        java.awt.Component component10 = buttonPanel3.add("[32,52]", (java.awt.Component) buttonPanel7);
        boolean boolean11 = buttonPanel7.isFocusable();
        java.awt.MenuComponent menuComponent12 = null;
        buttonPanel7.remove(menuComponent12);
        buttonPanel7.enable();
        game0.attach((java.util.Observer) buttonPanel7);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover16 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game0);
        boolean boolean17 = game0.won();
        org.jpacman.framework.model.PointManager pointManager18 = game0.getPointManager();
        int int19 = pointManager18.getFoodEaten();
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(pointManager18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        buttonPanel1.firePropertyChange("hi!", (double) ' ', (double) 4);
        int int18 = buttonPanel1.getHeight();
        boolean boolean19 = buttonPanel1.isCursorSet();
        boolean boolean20 = buttonPanel1.isRequestFocusEnabled();
        buttonPanel1.grabFocus();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        boolean boolean2 = mainUI0.isResizable();
        java.awt.Container container3 = mainUI0.getFocusCycleRootAncestor();
        mainUI0.setFocusableWindowState(true);
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(container3);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        int int0 = java.awt.Frame.MAXIMIZED_VERT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.awt.event.ComponentListener[] componentListenerArray14 = buttonPanel0.getComponentListeners();
        buttonPanel0.setEnabled(true);
        boolean boolean17 = buttonPanel0.isMaximumSizeSet();
        boolean boolean19 = buttonPanel0.areFocusTraversalKeysSet((int) (byte) 0);
        java.awt.Dimension dimension20 = buttonPanel0.getMaximumSize();
        org.jpacman.framework.ui.IPacmanInteraction iPacmanInteraction21 = buttonPanel0.getPacmanInteractor();
        java.awt.im.InputMethodRequests inputMethodRequests22 = buttonPanel0.getInputMethodRequests();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(componentListenerArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertNull(iPacmanInteraction21);
        org.junit.Assert.assertNull(inputMethodRequests22);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        javax.swing.event.AncestorListener[] ancestorListenerArray4 = buttonPanel0.getAncestorListeners();
        java.awt.Graphics graphics5 = null;
        buttonPanel0.printAll(graphics5);
        java.awt.im.InputContext inputContext7 = buttonPanel0.getInputContext();
        boolean boolean8 = buttonPanel0.requestFocusInWindow();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(ancestorListenerArray4);
        org.junit.Assert.assertNull(inputContext7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.lang.String str14 = buttonPanel1.toString();
        java.awt.Event event15 = null;
        boolean boolean17 = buttonPanel1.lostFocus(event15, (java.lang.Object) (short) 100);
        java.awt.Event event18 = null;
        try {
            boolean boolean19 = buttonPanel1.handleEvent(event18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "org.jpacman.framework.ui.ButtonPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str14.equals("org.jpacman.framework.ui.ButtonPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction1 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction1.notifyObservers();
        org.jpacman.framework.view.BoardView boardView3 = null;
        org.jpacman.framework.view.Animator animator4 = new org.jpacman.framework.view.Animator(boardView3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = pacmanInteraction1.controlling((org.jpacman.framework.controller.IController) animator4);
        animator4.stop();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction7 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator4);
        pacmanInteraction7.down();
        org.junit.Assert.assertNotNull(pacmanInteraction5);
        org.junit.Assert.assertNotNull(pacmanInteraction7);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        boolean boolean1 = mainUI0.isFocused();
        java.awt.event.WindowFocusListener windowFocusListener2 = null;
        mainUI0.removeWindowFocusListener(windowFocusListener2);
        boolean boolean4 = mainUI0.isOpaque();
        java.awt.event.MouseListener mouseListener5 = null;
        mainUI0.removeMouseListener(mouseListener5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray4 = buttonPanel0.getKeyListeners();
        java.awt.Rectangle rectangle5 = buttonPanel0.bounds();
        buttonPanel0.transferFocus();
        boolean boolean7 = buttonPanel0.isFocusTraversalPolicyProvider();
        boolean boolean8 = buttonPanel0.isValid();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray4);
        org.junit.Assert.assertNotNull(rectangle5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction1 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction1.notifyObservers();
        org.jpacman.framework.view.BoardView boardView3 = null;
        org.jpacman.framework.view.Animator animator4 = new org.jpacman.framework.view.Animator(boardView3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = pacmanInteraction1.controlling((org.jpacman.framework.controller.IController) animator4);
        animator4.stop();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction7 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator4);
        animator4.start();
        try {
            animator4.doTick();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pacmanInteraction5);
        org.junit.Assert.assertNotNull(pacmanInteraction7);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        javax.swing.event.AncestorListener[] ancestorListenerArray4 = buttonPanel0.getAncestorListeners();
        buttonPanel0.validate();
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel8 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener9 = null;
        buttonPanel8.removeMouseWheelListener(mouseWheelListener9);
        java.awt.Component component11 = buttonPanel6.add("[32,52]", (java.awt.Component) buttonPanel8);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        buttonPanel8.removePropertyChangeListener("[32,52]", propertyChangeListener13);
        org.jpacman.framework.ui.ButtonPanel buttonPanel15 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior16 = buttonPanel15.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray17 = buttonPanel15.getContainerListeners();
        boolean boolean19 = buttonPanel15.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray20 = buttonPanel15.getContainerListeners();
        java.awt.image.ImageProducer imageProducer21 = null;
        java.awt.Image image22 = buttonPanel15.createImage(imageProducer21);
        org.jpacman.framework.ui.ButtonPanel buttonPanel23 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior24 = buttonPanel23.getBaselineResizeBehavior();
        int int25 = buttonPanel23.getWidth();
        float float26 = buttonPanel23.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray27 = buttonPanel23.getKeyListeners();
        int int28 = buttonPanel8.checkImage(image22, (java.awt.image.ImageObserver) buttonPanel23);
        org.jpacman.framework.ui.ButtonPanel buttonPanel29 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel30 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics31 = null;
        buttonPanel30.printComponents(graphics31);
        org.jpacman.framework.ui.ButtonPanel buttonPanel34 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics35 = null;
        buttonPanel34.printComponents(graphics35);
        java.awt.Component component37 = buttonPanel30.add("[32,52]", (java.awt.Component) buttonPanel34);
        java.awt.Graphics graphics38 = null;
        buttonPanel30.update(graphics38);
        org.jpacman.framework.view.BoardView boardView40 = null;
        org.jpacman.framework.view.Animator animator41 = new org.jpacman.framework.view.Animator(boardView40);
        buttonPanel29.add((java.awt.Component) buttonPanel30, (java.lang.Object) animator41);
        java.awt.event.ComponentListener[] componentListenerArray43 = buttonPanel29.getComponentListeners();
        int int44 = buttonPanel0.checkImage(image22, (java.awt.image.ImageObserver) buttonPanel29);
        buttonPanel29.setToolTipText("org.jpacman.framework.ui.ButtonPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
        buttonPanel29.layout();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(ancestorListenerArray4);
        org.junit.Assert.assertNotNull(component11);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior16 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior16.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(containerListenerArray20);
        org.junit.Assert.assertNotNull(image22);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior24 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior24.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.5f + "'", float26 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(componentListenerArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        javax.swing.event.AncestorListener[] ancestorListenerArray4 = buttonPanel0.getAncestorListeners();
        buttonPanel0.validate();
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel8 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener9 = null;
        buttonPanel8.removeMouseWheelListener(mouseWheelListener9);
        java.awt.Component component11 = buttonPanel6.add("[32,52]", (java.awt.Component) buttonPanel8);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        buttonPanel8.removePropertyChangeListener("[32,52]", propertyChangeListener13);
        org.jpacman.framework.ui.ButtonPanel buttonPanel15 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior16 = buttonPanel15.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray17 = buttonPanel15.getContainerListeners();
        boolean boolean19 = buttonPanel15.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray20 = buttonPanel15.getContainerListeners();
        java.awt.image.ImageProducer imageProducer21 = null;
        java.awt.Image image22 = buttonPanel15.createImage(imageProducer21);
        org.jpacman.framework.ui.ButtonPanel buttonPanel23 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior24 = buttonPanel23.getBaselineResizeBehavior();
        int int25 = buttonPanel23.getWidth();
        float float26 = buttonPanel23.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray27 = buttonPanel23.getKeyListeners();
        int int28 = buttonPanel8.checkImage(image22, (java.awt.image.ImageObserver) buttonPanel23);
        org.jpacman.framework.ui.ButtonPanel buttonPanel29 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel30 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics31 = null;
        buttonPanel30.printComponents(graphics31);
        org.jpacman.framework.ui.ButtonPanel buttonPanel34 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics35 = null;
        buttonPanel34.printComponents(graphics35);
        java.awt.Component component37 = buttonPanel30.add("[32,52]", (java.awt.Component) buttonPanel34);
        java.awt.Graphics graphics38 = null;
        buttonPanel30.update(graphics38);
        org.jpacman.framework.view.BoardView boardView40 = null;
        org.jpacman.framework.view.Animator animator41 = new org.jpacman.framework.view.Animator(boardView40);
        buttonPanel29.add((java.awt.Component) buttonPanel30, (java.lang.Object) animator41);
        java.awt.event.ComponentListener[] componentListenerArray43 = buttonPanel29.getComponentListeners();
        int int44 = buttonPanel0.checkImage(image22, (java.awt.image.ImageObserver) buttonPanel29);
        buttonPanel29.setToolTipText("org.jpacman.framework.ui.ButtonPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
        try {
            java.awt.Point point47 = buttonPanel29.getLocationOnScreen();
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: component must be showing on the screen to determine its location");
        } catch (java.awt.IllegalComponentStateException e) {
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(ancestorListenerArray4);
        org.junit.Assert.assertNotNull(component11);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior16 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior16.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(containerListenerArray20);
        org.junit.Assert.assertNotNull(image22);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior24 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior24.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.5f + "'", float26 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(componentListenerArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        boolean boolean4 = buttonPanel0.requestFocus(false);
        boolean boolean5 = buttonPanel0.isVisible();
        javax.swing.KeyStroke keyStroke6 = null;
        int int7 = buttonPanel0.getConditionForKeyStroke(keyStroke6);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.awt.event.ComponentListener[] componentListenerArray14 = buttonPanel0.getComponentListeners();
        buttonPanel0.setEnabled(true);
        java.awt.Dimension dimension17 = buttonPanel0.getMinimumSize();
        org.jpacman.framework.ui.ButtonPanel buttonPanel18 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics19 = null;
        buttonPanel18.printComponents(graphics19);
        org.jpacman.framework.ui.ButtonPanel buttonPanel22 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics23 = null;
        buttonPanel22.printComponents(graphics23);
        java.awt.Component component25 = buttonPanel18.add("[32,52]", (java.awt.Component) buttonPanel22);
        java.awt.Graphics graphics26 = null;
        buttonPanel18.update(graphics26);
        org.jpacman.framework.ui.ButtonPanel buttonPanel28 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel29 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics30 = null;
        buttonPanel29.printComponents(graphics30);
        org.jpacman.framework.ui.ButtonPanel buttonPanel33 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics34 = null;
        buttonPanel33.printComponents(graphics34);
        java.awt.Component component36 = buttonPanel29.add("[32,52]", (java.awt.Component) buttonPanel33);
        java.awt.Graphics graphics37 = null;
        buttonPanel29.update(graphics37);
        org.jpacman.framework.view.BoardView boardView39 = null;
        org.jpacman.framework.view.Animator animator40 = new org.jpacman.framework.view.Animator(boardView39);
        buttonPanel28.add((java.awt.Component) buttonPanel29, (java.lang.Object) animator40);
        java.awt.event.ComponentListener[] componentListenerArray42 = buttonPanel28.getComponentListeners();
        buttonPanel28.setEnabled(true);
        java.awt.Dimension dimension45 = buttonPanel28.getMinimumSize();
        buttonPanel18.setMinimumSize(dimension45);
        buttonPanel0.setPreferredSize(dimension45);
        int int48 = buttonPanel0.getY();
        org.jpacman.framework.ui.ButtonPanel buttonPanel49 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior50 = buttonPanel49.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray51 = buttonPanel49.getContainerListeners();
        buttonPanel49.setRequestFocusEnabled(true);
        boolean boolean54 = buttonPanel49.isValidateRoot();
        java.awt.Dimension dimension55 = buttonPanel49.getPreferredSize();
        java.awt.Dimension dimension56 = buttonPanel0.getSize(dimension55);
        java.awt.event.MouseEvent mouseEvent57 = null;
        java.lang.String str58 = buttonPanel0.getToolTipText(mouseEvent57);
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(componentListenerArray14);
        org.junit.Assert.assertNotNull(dimension17);
        org.junit.Assert.assertNotNull(component25);
        org.junit.Assert.assertNotNull(component36);
        org.junit.Assert.assertNotNull(componentListenerArray42);
        org.junit.Assert.assertNotNull(dimension45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior50 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior50.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(dimension55);
        org.junit.Assert.assertNotNull(dimension56);
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.lang.String str14 = buttonPanel1.toString();
        java.awt.Event event15 = null;
        boolean boolean17 = buttonPanel1.lostFocus(event15, (java.lang.Object) (short) 100);
        java.awt.Container container18 = buttonPanel1.getTopLevelAncestor();
        java.awt.Graphics graphics19 = null;
        try {
            container18.printComponents(graphics19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "org.jpacman.framework.ui.ButtonPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str14.equals("org.jpacman.framework.ui.ButtonPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(container18);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isFocusable();
        java.awt.MenuComponent menuComponent9 = null;
        buttonPanel4.remove(menuComponent9);
        java.awt.Cursor cursor11 = buttonPanel4.getCursor();
        java.awt.event.MouseEvent mouseEvent12 = null;
        java.awt.Point point13 = buttonPanel4.getToolTipLocation(mouseEvent12);
        buttonPanel4.enable();
        java.awt.Event event15 = null;
        boolean boolean17 = buttonPanel4.keyUp(event15, (int) (byte) 10);
        boolean boolean18 = buttonPanel4.isForegroundSet();
        org.jpacman.framework.model.Game game19 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList20 = game19.getGhosts();
        boolean boolean21 = game19.won();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover22 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game19);
        javax.swing.KeyStroke keyStroke24 = null;
        try {
            buttonPanel4.registerKeyboardAction((java.awt.event.ActionListener) randomGhostMover22, "board.txt", keyStroke24, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cursor11);
        org.junit.Assert.assertNull(point13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(ghostList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        boolean boolean4 = buttonPanel0.hasFocus();
        float float5 = buttonPanel0.getAlignmentY();
        java.awt.Graphics graphics6 = null;
        buttonPanel0.update(graphics6);
        buttonPanel0.reshape(8, 32, 64, (int) '.');
        java.awt.Event event13 = null;
        boolean boolean15 = buttonPanel0.keyUp(event13, 7);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        boolean boolean1 = mainUI0.isFocused();
        int int2 = mainUI0.getCursorType();
        try {
            mainUI0.setOpacity((float) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value of opacity should be in the range [0.0f .. 1.0f].");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior2 = buttonPanel1.getBaselineResizeBehavior();
        int int3 = buttonPanel1.getWidth();
        float float4 = buttonPanel1.getAlignmentY();
        boolean boolean5 = buttonPanel1.hasFocus();
        float float6 = buttonPanel1.getAlignmentY();
        org.jpacman.framework.ui.ButtonPanel buttonPanel7 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior8 = buttonPanel7.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray9 = buttonPanel7.getContainerListeners();
        boolean boolean11 = buttonPanel7.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray12 = buttonPanel7.getContainerListeners();
        java.awt.Rectangle rectangle13 = null;
        java.awt.Rectangle rectangle14 = buttonPanel7.getBounds(rectangle13);
        buttonPanel1.paintImmediately(rectangle14);
        javax.swing.border.Border border16 = null;
        buttonPanel1.setBorder(border16);
        java.awt.Insets insets18 = buttonPanel1.getInsets();
        try {
            java.awt.Component component20 = mainUI0.add((java.awt.Component) buttonPanel1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior2 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior2.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior8 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior8.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(containerListenerArray12);
        org.junit.Assert.assertNotNull(rectangle14);
        org.junit.Assert.assertNotNull(insets18);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics3 = null;
        buttonPanel2.printComponents(graphics3);
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics7 = null;
        buttonPanel6.printComponents(graphics7);
        java.awt.Component component9 = buttonPanel2.add("[32,52]", (java.awt.Component) buttonPanel6);
        boolean boolean10 = buttonPanel6.isFocusable();
        java.awt.MenuComponent menuComponent11 = null;
        buttonPanel6.remove(menuComponent11);
        buttonPanel6.enable();
        org.jpacman.framework.ui.ButtonPanel buttonPanel14 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics15 = null;
        buttonPanel14.printComponents(graphics15);
        org.jpacman.framework.ui.ButtonPanel buttonPanel18 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics19 = null;
        buttonPanel18.printComponents(graphics19);
        java.awt.Component component21 = buttonPanel14.add("[32,52]", (java.awt.Component) buttonPanel18);
        java.awt.Graphics graphics22 = null;
        buttonPanel14.update(graphics22);
        boolean boolean24 = buttonPanel14.requestFocusInWindow();
        boolean boolean25 = buttonPanel6.isAncestorOf((java.awt.Component) buttonPanel14);
        java.awt.Event event26 = null;
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction27 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction27.notifyObservers();
        org.jpacman.framework.view.BoardView boardView29 = null;
        org.jpacman.framework.view.Animator animator30 = new org.jpacman.framework.view.Animator(boardView29);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction31 = pacmanInteraction27.controlling((org.jpacman.framework.controller.IController) animator30);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction32 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction32.notifyObservers();
        org.jpacman.framework.view.BoardView boardView34 = null;
        org.jpacman.framework.view.Animator animator35 = new org.jpacman.framework.view.Animator(boardView34);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction36 = pacmanInteraction32.controlling((org.jpacman.framework.controller.IController) animator35);
        pacmanInteraction31.deleteObserver((java.util.Observer) pacmanInteraction32);
        pacmanInteraction32.up();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction39 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction39.notifyObservers();
        org.jpacman.framework.view.BoardView boardView41 = null;
        org.jpacman.framework.view.Animator animator42 = new org.jpacman.framework.view.Animator(boardView41);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction43 = pacmanInteraction39.controlling((org.jpacman.framework.controller.IController) animator42);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction44 = pacmanInteraction32.controlling((org.jpacman.framework.controller.IController) animator42);
        boolean boolean45 = buttonPanel14.gotFocus(event26, (java.lang.Object) animator42);
        org.jpacman.framework.ui.MainUI mainUI46 = mainUI0.withGhostController((org.jpacman.framework.controller.IController) animator42);
        org.jpacman.framework.ui.ButtonPanel buttonPanel47 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel49 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener50 = null;
        buttonPanel49.removeMouseWheelListener(mouseWheelListener50);
        java.awt.Component component52 = buttonPanel47.add("[32,52]", (java.awt.Component) buttonPanel49);
        int int55 = buttonPanel47.getBaseline(8, 1);
        boolean boolean57 = buttonPanel47.requestFocus(false);
        org.jpacman.framework.ui.ButtonPanel buttonPanel58 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior59 = buttonPanel58.getBaselineResizeBehavior();
        int int60 = buttonPanel58.getWidth();
        float float61 = buttonPanel58.getAlignmentY();
        boolean boolean62 = buttonPanel58.hasFocus();
        float float63 = buttonPanel58.getAlignmentY();
        java.awt.Graphics graphics64 = null;
        buttonPanel58.update(graphics64);
        javax.swing.ActionMap actionMap66 = buttonPanel58.getActionMap();
        buttonPanel47.setActionMap(actionMap66);
        java.awt.Dimension dimension68 = buttonPanel47.getMaximumSize();
        mainUI0.setSize(dimension68);
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(component21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(pacmanInteraction31);
        org.junit.Assert.assertNotNull(pacmanInteraction36);
        org.junit.Assert.assertNotNull(pacmanInteraction43);
        org.junit.Assert.assertNotNull(pacmanInteraction44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(mainUI46);
        org.junit.Assert.assertNotNull(component52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior59 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior59.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 0.5f + "'", float61 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.5f + "'", float63 == 0.5f);
        org.junit.Assert.assertNotNull(actionMap66);
        org.junit.Assert.assertNotNull(dimension68);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction5.notifyObservers();
        org.jpacman.framework.view.BoardView boardView7 = null;
        org.jpacman.framework.view.Animator animator8 = new org.jpacman.framework.view.Animator(boardView7);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction9 = pacmanInteraction5.controlling((org.jpacman.framework.controller.IController) animator8);
        pacmanInteraction4.deleteObserver((java.util.Observer) pacmanInteraction5);
        org.jpacman.framework.ui.MainUI mainUI11 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray12 = mainUI11.getWindowStateListeners();
        java.awt.Graphics graphics13 = null;
        mainUI11.paint(graphics13);
        java.awt.MenuBar menuBar15 = null;
        mainUI11.setMenuBar(menuBar15);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction17 = pacmanInteraction4.withDisposable((org.jpacman.framework.ui.IDisposable) mainUI11);
        java.awt.Dialog.ModalExclusionType modalExclusionType18 = null;
        mainUI11.setModalExclusionType(modalExclusionType18);
        java.awt.image.BufferStrategy bufferStrategy20 = mainUI11.getBufferStrategy();
        java.awt.Container container21 = mainUI11.getContentPane();
        java.util.ResourceBundle resourceBundle22 = null;
        try {
            mainUI11.applyResourceBundle(resourceBundle22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pacmanInteraction4);
        org.junit.Assert.assertNotNull(pacmanInteraction9);
        org.junit.Assert.assertNotNull(windowStateListenerArray12);
        org.junit.Assert.assertNotNull(pacmanInteraction17);
        org.junit.Assert.assertNull(bufferStrategy20);
        org.junit.Assert.assertNotNull(container21);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.awt.Point point15 = buttonPanel1.getMousePosition(true);
        org.jpacman.framework.ui.ButtonPanel buttonPanel16 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel17 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics18 = null;
        buttonPanel17.printComponents(graphics18);
        org.jpacman.framework.ui.ButtonPanel buttonPanel21 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics22 = null;
        buttonPanel21.printComponents(graphics22);
        java.awt.Component component24 = buttonPanel17.add("[32,52]", (java.awt.Component) buttonPanel21);
        java.awt.Graphics graphics25 = null;
        buttonPanel17.update(graphics25);
        org.jpacman.framework.view.BoardView boardView27 = null;
        org.jpacman.framework.view.Animator animator28 = new org.jpacman.framework.view.Animator(boardView27);
        buttonPanel16.add((java.awt.Component) buttonPanel17, (java.lang.Object) animator28);
        int int30 = buttonPanel16.getDebugGraphicsOptions();
        java.awt.event.ContainerListener[] containerListenerArray31 = buttonPanel16.getContainerListeners();
        java.awt.event.InputMethodListener inputMethodListener32 = null;
        buttonPanel16.addInputMethodListener(inputMethodListener32);
        boolean boolean34 = buttonPanel16.getIgnoreRepaint();
        buttonPanel16.layout();
        javax.accessibility.AccessibleContext accessibleContext36 = buttonPanel16.getAccessibleContext();
        org.jpacman.framework.ui.ButtonPanel buttonPanel37 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics38 = null;
        buttonPanel37.printComponents(graphics38);
        org.jpacman.framework.ui.ButtonPanel buttonPanel41 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics42 = null;
        buttonPanel41.printComponents(graphics42);
        java.awt.Component component44 = buttonPanel37.add("[32,52]", (java.awt.Component) buttonPanel41);
        boolean boolean45 = buttonPanel41.isFocusable();
        java.awt.MenuComponent menuComponent46 = null;
        buttonPanel41.remove(menuComponent46);
        java.awt.Cursor cursor48 = buttonPanel41.getCursor();
        java.awt.event.MouseEvent mouseEvent49 = null;
        java.awt.Point point50 = buttonPanel41.getToolTipLocation(mouseEvent49);
        boolean boolean51 = buttonPanel41.isCursorSet();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior52 = buttonPanel41.getBaselineResizeBehavior();
        try {
            buttonPanel1.add((java.awt.Component) buttonPanel16, (java.lang.Object) baselineResizeBehavior52, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNull(point15);
        org.junit.Assert.assertNotNull(component24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(containerListenerArray31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(accessibleContext36);
        org.junit.Assert.assertNotNull(component44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(cursor48);
        org.junit.Assert.assertNull(point50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior52 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior52.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.lang.String str14 = buttonPanel1.toString();
        java.awt.Event event15 = null;
        boolean boolean17 = buttonPanel1.lostFocus(event15, (java.lang.Object) (short) 100);
        java.awt.ComponentOrientation componentOrientation18 = buttonPanel1.getComponentOrientation();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "org.jpacman.framework.ui.ButtonPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str14.equals("org.jpacman.framework.ui.ButtonPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(componentOrientation18);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        java.awt.Graphics graphics8 = null;
        buttonPanel0.update(graphics8);
        javax.swing.KeyStroke keyStroke10 = null;
        buttonPanel0.unregisterKeyboardAction(keyStroke10);
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior13 = buttonPanel12.getBaselineResizeBehavior();
        int int14 = buttonPanel12.getWidth();
        float float15 = buttonPanel12.getAlignmentY();
        boolean boolean16 = buttonPanel12.hasFocus();
        float float17 = buttonPanel12.getAlignmentY();
        org.jpacman.framework.ui.ButtonPanel buttonPanel18 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior19 = buttonPanel18.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray20 = buttonPanel18.getContainerListeners();
        boolean boolean22 = buttonPanel18.requestFocus(false);
        boolean boolean23 = buttonPanel18.isVisible();
        java.awt.event.MouseListener[] mouseListenerArray24 = buttonPanel18.getMouseListeners();
        java.awt.Color color25 = buttonPanel18.getBackground();
        buttonPanel12.setBackground(color25);
        buttonPanel0.setBackground(color25);
        javax.swing.event.AncestorListener[] ancestorListenerArray28 = buttonPanel0.getAncestorListeners();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior13 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior13.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior19 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior19.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(mouseListenerArray24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(ancestorListenerArray28);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        boolean boolean6 = buttonPanel0.isFocusOwner();
        java.lang.String str7 = buttonPanel0.getUIClassID();
        org.jpacman.framework.ui.ButtonPanel buttonPanel8 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior9 = buttonPanel8.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray10 = buttonPanel8.getContainerListeners();
        boolean boolean12 = buttonPanel8.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray13 = buttonPanel8.getContainerListeners();
        java.awt.Rectangle rectangle14 = null;
        java.awt.Rectangle rectangle15 = buttonPanel8.getBounds(rectangle14);
        java.awt.Rectangle rectangle16 = buttonPanel0.getBounds(rectangle15);
        org.jpacman.framework.ui.ButtonPanel buttonPanel18 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics19 = null;
        buttonPanel18.printComponents(graphics19);
        org.jpacman.framework.ui.ButtonPanel buttonPanel22 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics23 = null;
        buttonPanel22.printComponents(graphics23);
        java.awt.Component component25 = buttonPanel18.add("[32,52]", (java.awt.Component) buttonPanel22);
        java.awt.Graphics graphics26 = null;
        buttonPanel18.update(graphics26);
        javax.swing.KeyStroke keyStroke28 = null;
        buttonPanel18.unregisterKeyboardAction(keyStroke28);
        java.awt.Component component30 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel18);
        buttonPanel18.firePropertyChange("PLAYER occupying null", 'a', 'a');
        java.lang.String str35 = buttonPanel18.toString();
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "PanelUI" + "'", str7.equals("PanelUI"));
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior9 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior9.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(containerListenerArray13);
        org.junit.Assert.assertNotNull(rectangle15);
        org.junit.Assert.assertNotNull(rectangle16);
        org.junit.Assert.assertNotNull(component25);
        org.junit.Assert.assertNotNull(component30);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "org.jpacman.framework.ui.ButtonPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str35.equals("org.jpacman.framework.ui.ButtonPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        buttonPanel0.transferFocusBackward();
        java.awt.Container container4 = buttonPanel0.getParent();
        boolean boolean5 = buttonPanel0.requestFocusInWindow();
        java.awt.Container container6 = buttonPanel0.getParent();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(container6);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.jpacman.framework.ui.PointsPanel pointsPanel0 = new org.jpacman.framework.ui.PointsPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics3 = null;
        buttonPanel2.printComponents(graphics3);
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics7 = null;
        buttonPanel6.printComponents(graphics7);
        java.awt.Component component9 = buttonPanel2.add("[32,52]", (java.awt.Component) buttonPanel6);
        java.awt.Graphics graphics10 = null;
        buttonPanel2.update(graphics10);
        org.jpacman.framework.view.BoardView boardView12 = null;
        org.jpacman.framework.view.Animator animator13 = new org.jpacman.framework.view.Animator(boardView12);
        buttonPanel1.add((java.awt.Component) buttonPanel2, (java.lang.Object) animator13);
        java.awt.Point point16 = buttonPanel2.getMousePosition(true);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction17 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction17.notifyObservers();
        org.jpacman.framework.view.BoardView boardView19 = null;
        org.jpacman.framework.view.Animator animator20 = new org.jpacman.framework.view.Animator(boardView19);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction21 = pacmanInteraction17.controlling((org.jpacman.framework.controller.IController) animator20);
        org.jpacman.framework.ui.PacmanInteraction.MatchState matchState22 = pacmanInteraction21.getCurrentState();
        org.jpacman.framework.ui.ButtonPanel buttonPanel23 = buttonPanel2.withInteractor(pacmanInteraction21);
        try {
            pointsPanel0.update((java.util.Observable) pacmanInteraction21, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertNull(point16);
        org.junit.Assert.assertNotNull(pacmanInteraction21);
        org.junit.Assert.assertTrue("'" + matchState22 + "' != '" + org.jpacman.framework.ui.PacmanInteraction.MatchState.PAUSING + "'", matchState22.equals(org.jpacman.framework.ui.PacmanInteraction.MatchState.PAUSING));
        org.junit.Assert.assertNotNull(buttonPanel23);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        buttonPanel2.paintImmediately((int) (short) 100, (int) (short) 10, (int) ' ', (int) (short) 100);
        org.junit.Assert.assertNotNull(component5);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray4 = buttonPanel0.getKeyListeners();
        boolean boolean5 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) buttonPanel0);
        buttonPanel0.updateUI();
        boolean boolean7 = buttonPanel0.isFocusTraversalPolicyProvider();
        java.awt.dnd.DropTarget dropTarget8 = null;
        buttonPanel0.setDropTarget(dropTarget8);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics7 = null;
        buttonPanel6.printComponents(graphics7);
        java.awt.Dimension dimension9 = buttonPanel6.minimumSize();
        buttonPanel2.resize(dimension9);
        org.jpacman.framework.ui.ButtonPanel buttonPanel11 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics12 = null;
        buttonPanel11.printComponents(graphics12);
        org.jpacman.framework.ui.ButtonPanel buttonPanel15 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics16 = null;
        buttonPanel15.printComponents(graphics16);
        java.awt.Component component18 = buttonPanel11.add("[32,52]", (java.awt.Component) buttonPanel15);
        java.awt.Graphics graphics19 = null;
        buttonPanel11.update(graphics19);
        javax.swing.KeyStroke keyStroke21 = null;
        buttonPanel11.unregisterKeyboardAction(keyStroke21);
        java.awt.Dimension dimension23 = buttonPanel11.getMaximumSize();
        buttonPanel2.setPreferredSize(dimension23);
        java.awt.Point point25 = buttonPanel2.getMousePosition();
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertNotNull(component18);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertNull(point25);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        int int8 = buttonPanel0.countComponents();
        boolean boolean9 = buttonPanel0.requestDefaultFocus();
        org.jpacman.framework.ui.ButtonPanel buttonPanel10 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics11 = null;
        buttonPanel10.printComponents(graphics11);
        org.jpacman.framework.ui.ButtonPanel buttonPanel14 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics15 = null;
        buttonPanel14.printComponents(graphics15);
        java.awt.Component component17 = buttonPanel10.add("[32,52]", (java.awt.Component) buttonPanel14);
        java.awt.Graphics graphics18 = null;
        buttonPanel10.update(graphics18);
        org.jpacman.framework.ui.ButtonPanel buttonPanel20 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel21 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics22 = null;
        buttonPanel21.printComponents(graphics22);
        org.jpacman.framework.ui.ButtonPanel buttonPanel25 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics26 = null;
        buttonPanel25.printComponents(graphics26);
        java.awt.Component component28 = buttonPanel21.add("[32,52]", (java.awt.Component) buttonPanel25);
        java.awt.Graphics graphics29 = null;
        buttonPanel21.update(graphics29);
        org.jpacman.framework.view.BoardView boardView31 = null;
        org.jpacman.framework.view.Animator animator32 = new org.jpacman.framework.view.Animator(boardView31);
        buttonPanel20.add((java.awt.Component) buttonPanel21, (java.lang.Object) animator32);
        java.awt.event.ComponentListener[] componentListenerArray34 = buttonPanel20.getComponentListeners();
        buttonPanel20.setEnabled(true);
        java.awt.Dimension dimension37 = buttonPanel20.getMinimumSize();
        buttonPanel10.setMinimumSize(dimension37);
        buttonPanel0.setMaximumSize(dimension37);
        java.awt.Event event40 = null;
        try {
            boolean boolean41 = buttonPanel0.handleEvent(event40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(component17);
        org.junit.Assert.assertNotNull(component28);
        org.junit.Assert.assertNotNull(componentListenerArray34);
        org.junit.Assert.assertNotNull(dimension37);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        boolean boolean2 = component1.isFontSet();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        java.awt.Insets insets8 = buttonPanel0.getInsets();
        javax.swing.event.AncestorListener ancestorListener9 = null;
        buttonPanel0.addAncestorListener(ancestorListener9);
        buttonPanel0.setName("[32,52]");
        org.jpacman.framework.ui.ButtonPanel buttonPanel13 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior14 = buttonPanel13.getBaselineResizeBehavior();
        int int15 = buttonPanel13.getWidth();
        float float16 = buttonPanel13.getAlignmentY();
        boolean boolean17 = buttonPanel13.hasFocus();
        float float18 = buttonPanel13.getAlignmentY();
        java.awt.Graphics graphics19 = null;
        buttonPanel13.update(graphics19);
        javax.swing.ActionMap actionMap21 = buttonPanel13.getActionMap();
        buttonPanel0.setActionMap(actionMap21);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNotNull(insets8);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior14 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior14.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(actionMap21);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        boolean boolean6 = buttonPanel0.isFocusOwner();
        java.lang.String str7 = buttonPanel0.getUIClassID();
        org.jpacman.framework.ui.ButtonPanel buttonPanel8 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior9 = buttonPanel8.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray10 = buttonPanel8.getContainerListeners();
        boolean boolean12 = buttonPanel8.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray13 = buttonPanel8.getContainerListeners();
        java.awt.Rectangle rectangle14 = null;
        java.awt.Rectangle rectangle15 = buttonPanel8.getBounds(rectangle14);
        java.awt.Rectangle rectangle16 = buttonPanel0.getBounds(rectangle15);
        org.jpacman.framework.ui.ButtonPanel buttonPanel18 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics19 = null;
        buttonPanel18.printComponents(graphics19);
        org.jpacman.framework.ui.ButtonPanel buttonPanel22 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics23 = null;
        buttonPanel22.printComponents(graphics23);
        java.awt.Component component25 = buttonPanel18.add("[32,52]", (java.awt.Component) buttonPanel22);
        java.awt.Graphics graphics26 = null;
        buttonPanel18.update(graphics26);
        javax.swing.KeyStroke keyStroke28 = null;
        buttonPanel18.unregisterKeyboardAction(keyStroke28);
        java.awt.Component component30 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel18);
        buttonPanel18.firePropertyChange("PLAYER occupying null", 'a', 'a');
        java.awt.GraphicsConfiguration graphicsConfiguration35 = buttonPanel18.getGraphicsConfiguration();
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "PanelUI" + "'", str7.equals("PanelUI"));
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior9 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior9.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(containerListenerArray13);
        org.junit.Assert.assertNotNull(rectangle15);
        org.junit.Assert.assertNotNull(rectangle16);
        org.junit.Assert.assertNotNull(component25);
        org.junit.Assert.assertNotNull(component30);
        org.junit.Assert.assertNull(graphicsConfiguration35);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        boolean boolean4 = buttonPanel0.requestFocus(false);
        java.awt.Graphics graphics5 = null;
        buttonPanel0.paintAll(graphics5);
        buttonPanel0.firePropertyChange("[32,52]", (int) (byte) -1, 9);
        java.awt.Event event11 = null;
        boolean boolean13 = buttonPanel0.keyUp(event11, 0);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        boolean boolean2 = game0.won();
        org.jpacman.framework.ui.ButtonPanel buttonPanel3 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics4 = null;
        buttonPanel3.printComponents(graphics4);
        org.jpacman.framework.ui.ButtonPanel buttonPanel7 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics8 = null;
        buttonPanel7.printComponents(graphics8);
        java.awt.Component component10 = buttonPanel3.add("[32,52]", (java.awt.Component) buttonPanel7);
        boolean boolean11 = buttonPanel7.isFocusable();
        java.awt.MenuComponent menuComponent12 = null;
        buttonPanel7.remove(menuComponent12);
        buttonPanel7.enable();
        game0.attach((java.util.Observer) buttonPanel7);
        org.jpacman.framework.model.Board board18 = new org.jpacman.framework.model.Board(128, 1);
        int int19 = board18.getWidth();
        game0.setBoard(board18);
        try {
            boolean boolean21 = game0.died();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 128 + "'", int19 == 128);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        buttonPanel0.firePropertyChange("ToolTipText", ' ', ' ');
        java.awt.Graphics graphics18 = null;
        buttonPanel0.paintComponents(graphics18);
        org.jpacman.framework.ui.ButtonPanel buttonPanel20 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics21 = null;
        buttonPanel20.printComponents(graphics21);
        org.jpacman.framework.ui.ButtonPanel buttonPanel24 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics25 = null;
        buttonPanel24.printComponents(graphics25);
        java.awt.Component component27 = buttonPanel20.add("[32,52]", (java.awt.Component) buttonPanel24);
        boolean boolean28 = buttonPanel24.isRequestFocusEnabled();
        try {
            buttonPanel0.setComponentZOrder((java.awt.Component) buttonPanel24, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(component27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction5.notifyObservers();
        org.jpacman.framework.view.BoardView boardView7 = null;
        org.jpacman.framework.view.Animator animator8 = new org.jpacman.framework.view.Animator(boardView7);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction9 = pacmanInteraction5.controlling((org.jpacman.framework.controller.IController) animator8);
        pacmanInteraction4.deleteObserver((java.util.Observer) pacmanInteraction5);
        org.jpacman.framework.ui.MainUI mainUI11 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray12 = mainUI11.getWindowStateListeners();
        java.awt.Graphics graphics13 = null;
        mainUI11.paint(graphics13);
        java.awt.MenuBar menuBar15 = null;
        mainUI11.setMenuBar(menuBar15);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction17 = pacmanInteraction4.withDisposable((org.jpacman.framework.ui.IDisposable) mainUI11);
        java.awt.Dialog.ModalExclusionType modalExclusionType18 = null;
        mainUI11.setModalExclusionType(modalExclusionType18);
        java.awt.Event event20 = null;
        boolean boolean23 = mainUI11.mouseEnter(event20, (int) (short) 0, (int) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        mainUI11.addPropertyChangeListener(propertyChangeListener24);
        java.awt.ComponentOrientation componentOrientation26 = mainUI11.getComponentOrientation();
        mainUI11.setSize(8, (int) (byte) 1);
        mainUI11.show();
        org.junit.Assert.assertNotNull(pacmanInteraction4);
        org.junit.Assert.assertNotNull(pacmanInteraction9);
        org.junit.Assert.assertNotNull(windowStateListenerArray12);
        org.junit.Assert.assertNotNull(pacmanInteraction17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(componentOrientation26);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isFocusable();
        java.awt.MenuComponent menuComponent9 = null;
        buttonPanel4.remove(menuComponent9);
        buttonPanel4.enable();
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics13 = null;
        buttonPanel12.printComponents(graphics13);
        org.jpacman.framework.ui.ButtonPanel buttonPanel16 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics17 = null;
        buttonPanel16.printComponents(graphics17);
        java.awt.Component component19 = buttonPanel12.add("[32,52]", (java.awt.Component) buttonPanel16);
        java.awt.Graphics graphics20 = null;
        buttonPanel12.update(graphics20);
        boolean boolean22 = buttonPanel12.requestFocusInWindow();
        boolean boolean23 = buttonPanel4.isAncestorOf((java.awt.Component) buttonPanel12);
        java.awt.Event event24 = null;
        try {
            boolean boolean25 = buttonPanel4.postEvent(event24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(component19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction5.notifyObservers();
        org.jpacman.framework.view.BoardView boardView7 = null;
        org.jpacman.framework.view.Animator animator8 = new org.jpacman.framework.view.Animator(boardView7);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction9 = pacmanInteraction5.controlling((org.jpacman.framework.controller.IController) animator8);
        pacmanInteraction4.deleteObserver((java.util.Observer) pacmanInteraction5);
        org.jpacman.framework.ui.MainUI mainUI11 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray12 = mainUI11.getWindowStateListeners();
        java.awt.Graphics graphics13 = null;
        mainUI11.paint(graphics13);
        java.awt.MenuBar menuBar15 = null;
        mainUI11.setMenuBar(menuBar15);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction17 = pacmanInteraction4.withDisposable((org.jpacman.framework.ui.IDisposable) mainUI11);
        java.awt.Dialog.ModalExclusionType modalExclusionType18 = null;
        mainUI11.setModalExclusionType(modalExclusionType18);
        boolean boolean20 = mainUI11.isAlwaysOnTop();
        mainUI11.setAutoRequestFocus(false);
        try {
            mainUI11.setCursor((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal cursor type");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(pacmanInteraction4);
        org.junit.Assert.assertNotNull(pacmanInteraction9);
        org.junit.Assert.assertNotNull(windowStateListenerArray12);
        org.junit.Assert.assertNotNull(pacmanInteraction17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        buttonPanel1.repaint(7, 13, 4, (int) (short) 100);
        int int19 = buttonPanel1.getHeight();
        buttonPanel1.setInheritsPopupMenu(false);
        boolean boolean22 = buttonPanel1.isManagingFocus();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        boolean boolean4 = buttonPanel0.requestFocus(false);
        buttonPanel0.doLayout();
        boolean boolean6 = buttonPanel0.isCursorSet();
        java.awt.Image image7 = null;
        org.jpacman.framework.ui.ButtonPanel buttonPanel8 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics9 = null;
        buttonPanel8.printComponents(graphics9);
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics13 = null;
        buttonPanel12.printComponents(graphics13);
        java.awt.Component component15 = buttonPanel8.add("[32,52]", (java.awt.Component) buttonPanel12);
        int int16 = buttonPanel0.checkImage(image7, (java.awt.image.ImageObserver) component15);
        java.awt.Event event17 = null;
        boolean boolean20 = buttonPanel0.mouseExit(event17, (int) '4', 0);
        java.awt.Font font21 = null;
        buttonPanel0.setFont(font21);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(component15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        int int14 = buttonPanel0.getDebugGraphicsOptions();
        java.awt.event.ContainerListener[] containerListenerArray15 = buttonPanel0.getContainerListeners();
        javax.swing.KeyStroke[] keyStrokeArray16 = buttonPanel0.getRegisteredKeyStrokes();
        buttonPanel0.enable(false);
        javax.swing.border.Border border19 = buttonPanel0.getBorder();
        java.awt.Event event20 = null;
        boolean boolean23 = buttonPanel0.mouseUp(event20, (int) (short) 10, 11);
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(containerListenerArray15);
        org.junit.Assert.assertNotNull(keyStrokeArray16);
        org.junit.Assert.assertNull(border19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory1 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game2 = defaultGameFactory1.makeGame();
        level0.setFactory((org.jpacman.framework.factory.IGameFactory) defaultGameFactory1);
        org.jpacman.framework.model.Food food4 = defaultGameFactory1.makeFood();
        org.jpacman.framework.model.Ghost ghost5 = defaultGameFactory1.makeGhost();
        org.jpacman.framework.model.Board board8 = defaultGameFactory1.makeBoard((int) 'G', (int) 'G');
        boolean boolean11 = board8.withinBorders(128, 11);
        org.junit.Assert.assertNotNull(game2);
        org.junit.Assert.assertNotNull(food4);
        org.junit.Assert.assertNotNull(ghost5);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        java.awt.Image image5 = buttonPanel0.createImage((int) (byte) -1, 32);
        java.awt.Component component8 = buttonPanel0.locate((int) (byte) 100, (int) (short) 1);
        javax.accessibility.AccessibleContext accessibleContext9 = buttonPanel0.getAccessibleContext();
        org.jpacman.framework.ui.ButtonPanel buttonPanel10 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener13 = null;
        buttonPanel12.removeMouseWheelListener(mouseWheelListener13);
        java.awt.Component component15 = buttonPanel10.add("[32,52]", (java.awt.Component) buttonPanel12);
        java.awt.Component component16 = buttonPanel0.add((java.awt.Component) buttonPanel12);
        component16.requestFocus();
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(component8);
        org.junit.Assert.assertNotNull(accessibleContext9);
        org.junit.Assert.assertNotNull(component15);
        org.junit.Assert.assertNotNull(component16);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        java.lang.String str2 = mainUI0.getTitle();
        mainUI0.setTitle("PanelUI");
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = buttonPanel5.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray7 = buttonPanel5.getContainerListeners();
        buttonPanel5.setRequestFocusEnabled(true);
        boolean boolean10 = buttonPanel5.isValidateRoot();
        java.awt.Rectangle rectangle11 = buttonPanel5.getBounds();
        try {
            mainUI0.setShape((java.awt.Shape) rectangle11);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is decorated");
        } catch (java.awt.IllegalComponentStateException e) {
        }
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(rectangle11);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        buttonPanel0.removeMouseWheelListener(mouseWheelListener1);
        org.jpacman.framework.ui.MainUI mainUI3 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray4 = mainUI3.getWindowStateListeners();
        boolean boolean5 = mainUI3.isResizable();
        mainUI3.setAlwaysOnTop(true);
        org.jpacman.framework.ui.ButtonPanel buttonPanel8 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior9 = buttonPanel8.getBaselineResizeBehavior();
        int int10 = buttonPanel8.getWidth();
        float float11 = buttonPanel8.getAlignmentY();
        javax.swing.event.AncestorListener[] ancestorListenerArray12 = buttonPanel8.getAncestorListeners();
        buttonPanel8.validate();
        org.jpacman.framework.ui.ButtonPanel buttonPanel14 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel16 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener17 = null;
        buttonPanel16.removeMouseWheelListener(mouseWheelListener17);
        java.awt.Component component19 = buttonPanel14.add("[32,52]", (java.awt.Component) buttonPanel16);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        buttonPanel16.removePropertyChangeListener("[32,52]", propertyChangeListener21);
        org.jpacman.framework.ui.ButtonPanel buttonPanel23 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior24 = buttonPanel23.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray25 = buttonPanel23.getContainerListeners();
        boolean boolean27 = buttonPanel23.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray28 = buttonPanel23.getContainerListeners();
        java.awt.image.ImageProducer imageProducer29 = null;
        java.awt.Image image30 = buttonPanel23.createImage(imageProducer29);
        org.jpacman.framework.ui.ButtonPanel buttonPanel31 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior32 = buttonPanel31.getBaselineResizeBehavior();
        int int33 = buttonPanel31.getWidth();
        float float34 = buttonPanel31.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray35 = buttonPanel31.getKeyListeners();
        int int36 = buttonPanel16.checkImage(image30, (java.awt.image.ImageObserver) buttonPanel31);
        org.jpacman.framework.ui.ButtonPanel buttonPanel37 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel38 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics39 = null;
        buttonPanel38.printComponents(graphics39);
        org.jpacman.framework.ui.ButtonPanel buttonPanel42 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics43 = null;
        buttonPanel42.printComponents(graphics43);
        java.awt.Component component45 = buttonPanel38.add("[32,52]", (java.awt.Component) buttonPanel42);
        java.awt.Graphics graphics46 = null;
        buttonPanel38.update(graphics46);
        org.jpacman.framework.view.BoardView boardView48 = null;
        org.jpacman.framework.view.Animator animator49 = new org.jpacman.framework.view.Animator(boardView48);
        buttonPanel37.add((java.awt.Component) buttonPanel38, (java.lang.Object) animator49);
        java.awt.event.ComponentListener[] componentListenerArray51 = buttonPanel37.getComponentListeners();
        int int52 = buttonPanel8.checkImage(image30, (java.awt.image.ImageObserver) buttonPanel37);
        boolean boolean58 = mainUI3.imageUpdate(image30, (int) (byte) 100, (int) (byte) 10, 11, 4, 11);
        org.jpacman.framework.ui.ButtonPanel buttonPanel59 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior60 = buttonPanel59.getBaselineResizeBehavior();
        int int61 = buttonPanel59.getWidth();
        float float62 = buttonPanel59.getAlignmentY();
        boolean boolean63 = buttonPanel59.hasFocus();
        float float64 = buttonPanel59.getAlignmentY();
        java.awt.Graphics graphics65 = null;
        buttonPanel59.update(graphics65);
        javax.swing.ActionMap actionMap67 = buttonPanel59.getActionMap();
        java.awt.peer.ComponentPeer componentPeer68 = buttonPanel59.getPeer();
        try {
            boolean boolean69 = buttonPanel0.prepareImage(image30, (java.awt.image.ImageObserver) buttonPanel59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(windowStateListenerArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior9 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior9.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertNotNull(ancestorListenerArray12);
        org.junit.Assert.assertNotNull(component19);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior24 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior24.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(containerListenerArray28);
        org.junit.Assert.assertNotNull(image30);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior32 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior32.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.5f + "'", float34 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(component45);
        org.junit.Assert.assertNotNull(componentListenerArray51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior60 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior60.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 0.5f + "'", float62 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.5f + "'", float64 == 0.5f);
        org.junit.Assert.assertNotNull(actionMap67);
        org.junit.Assert.assertNull(componentPeer68);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.awt.event.ComponentListener[] componentListenerArray14 = buttonPanel0.getComponentListeners();
        buttonPanel0.setEnabled(true);
        boolean boolean17 = buttonPanel0.isMaximumSizeSet();
        javax.swing.border.Border border18 = buttonPanel0.getBorder();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(componentListenerArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(border18);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        java.awt.Image image5 = buttonPanel0.createImage((int) (byte) -1, 32);
        org.jpacman.framework.ui.ButtonPanel buttonPanel7 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior8 = buttonPanel7.getBaselineResizeBehavior();
        int int9 = buttonPanel7.getWidth();
        float float10 = buttonPanel7.getAlignmentY();
        javax.swing.event.AncestorListener[] ancestorListenerArray11 = buttonPanel7.getAncestorListeners();
        buttonPanel7.validate();
        java.awt.im.InputContext inputContext13 = buttonPanel7.getInputContext();
        org.jpacman.framework.ui.ButtonPanel buttonPanel15 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior16 = buttonPanel15.getBaselineResizeBehavior();
        int int17 = buttonPanel15.getWidth();
        float float18 = buttonPanel15.getAlignmentY();
        boolean boolean19 = buttonPanel15.hasFocus();
        float float20 = buttonPanel15.getAlignmentY();
        java.awt.Graphics graphics21 = null;
        buttonPanel15.update(graphics21);
        buttonPanel15.reshape(8, 32, 64, (int) '.');
        boolean boolean28 = buttonPanel15.isPreferredSizeSet();
        javax.swing.InputMap inputMap29 = buttonPanel15.getInputMap();
        buttonPanel7.setInputMap((int) (short) 1, inputMap29);
        try {
            buttonPanel0.setInputMap(64, inputMap29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior8 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior8.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNotNull(ancestorListenerArray11);
        org.junit.Assert.assertNull(inputContext13);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior16 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior16.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(inputMap29);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile((int) ' ', (int) '4');
        java.lang.String str3 = tile2.toString();
        org.jpacman.framework.model.Sprite sprite4 = null;
        boolean boolean5 = tile2.containsSprite(sprite4);
        org.jpacman.framework.model.Wall wall6 = new org.jpacman.framework.model.Wall();
        boolean boolean7 = tile2.containsSprite((org.jpacman.framework.model.Sprite) wall6);
        int int8 = tile2.getX();
        int int9 = tile2.getX();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[32,52]" + "'", str3.equals("[32,52]"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(128, 1);
        int int3 = board2.getWidth();
        int int4 = board2.getHeight();
        org.jpacman.framework.model.Tile tile7 = new org.jpacman.framework.model.Tile(7, (int) (byte) 0);
        int int8 = tile7.getY();
        org.jpacman.framework.model.Player player9 = new org.jpacman.framework.model.Player();
        java.lang.String str10 = player9.toString();
        org.jpacman.framework.model.Direction direction11 = player9.getDirection();
        org.jpacman.framework.model.Tile tile12 = board2.tileAtDirection(tile7, direction11);
        try {
            org.jpacman.framework.model.Sprite sprite15 = board2.spriteAt(0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 128 + "'", int3 == 128);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "PLAYER occupying null" + "'", str10.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + direction11 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction11.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertNotNull(tile12);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        int int0 = java.awt.Frame.W_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory1 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game2 = defaultGameFactory1.makeGame();
        level0.setFactory((org.jpacman.framework.factory.IGameFactory) defaultGameFactory1);
        org.jpacman.framework.model.Player player4 = defaultGameFactory1.makePlayer();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = player4.getSpriteType();
        int int6 = player4.getPoints();
        org.junit.Assert.assertNotNull(game2);
        org.junit.Assert.assertNotNull(player4);
        org.junit.Assert.assertTrue("'" + spriteType5 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType5.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isRequestFocusEnabled();
        boolean boolean9 = buttonPanel4.isEnabled();
        buttonPanel4.setDebugGraphicsOptions((int) (byte) -1);
        float float12 = buttonPanel4.getAlignmentX();
        java.awt.Graphics graphics13 = null;
        buttonPanel4.paintAll(graphics13);
        javax.accessibility.AccessibleContext accessibleContext15 = buttonPanel4.getAccessibleContext();
        java.awt.Event event16 = null;
        boolean boolean19 = buttonPanel4.mouseMove(event16, 16, (int) (byte) 10);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(accessibleContext15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        int int8 = buttonPanel0.getBaseline(8, 1);
        boolean boolean10 = buttonPanel0.requestFocus(false);
        javax.swing.ActionMap actionMap11 = buttonPanel0.getActionMap();
        java.awt.Graphics graphics12 = null;
        buttonPanel0.print(graphics12);
        org.jpacman.framework.ui.ButtonPanel buttonPanel14 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics15 = null;
        buttonPanel14.printComponents(graphics15);
        org.jpacman.framework.ui.ButtonPanel buttonPanel18 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics19 = null;
        buttonPanel18.printComponents(graphics19);
        java.awt.Component component21 = buttonPanel14.add("[32,52]", (java.awt.Component) buttonPanel18);
        boolean boolean22 = buttonPanel18.isRequestFocusEnabled();
        javax.swing.ActionMap actionMap23 = buttonPanel18.getActionMap();
        buttonPanel0.setActionMap(actionMap23);
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(actionMap11);
        org.junit.Assert.assertNotNull(component21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(actionMap23);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory1 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game2 = defaultGameFactory1.makeGame();
        level0.setFactory((org.jpacman.framework.factory.IGameFactory) defaultGameFactory1);
        org.jpacman.framework.model.Player player4 = defaultGameFactory1.makePlayer();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = player4.getSpriteType();
        player4.die();
        org.junit.Assert.assertNotNull(game2);
        org.junit.Assert.assertNotNull(player4);
        org.junit.Assert.assertTrue("'" + spriteType5 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType5.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        buttonPanel0.setRequestFocusEnabled(true);
        boolean boolean5 = buttonPanel0.isMaximumSizeSet();
        try {
            java.awt.Component component7 = buttonPanel0.getComponent((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics7 = null;
        buttonPanel6.printComponents(graphics7);
        java.awt.Dimension dimension9 = buttonPanel6.minimumSize();
        buttonPanel2.resize(dimension9);
        org.jpacman.framework.ui.ButtonPanel buttonPanel11 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics12 = null;
        buttonPanel11.printComponents(graphics12);
        org.jpacman.framework.ui.ButtonPanel buttonPanel15 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics16 = null;
        buttonPanel15.printComponents(graphics16);
        java.awt.Component component18 = buttonPanel11.add("[32,52]", (java.awt.Component) buttonPanel15);
        java.awt.Graphics graphics19 = null;
        buttonPanel11.update(graphics19);
        javax.swing.KeyStroke keyStroke21 = null;
        buttonPanel11.unregisterKeyboardAction(keyStroke21);
        java.awt.Dimension dimension23 = buttonPanel11.getMaximumSize();
        buttonPanel2.setPreferredSize(dimension23);
        boolean boolean25 = buttonPanel2.isLightweight();
        java.awt.LayoutManager layoutManager26 = buttonPanel2.getLayout();
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertNotNull(component18);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(layoutManager26);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray4 = buttonPanel0.getKeyListeners();
        java.awt.Rectangle rectangle5 = buttonPanel0.bounds();
        buttonPanel0.transferFocus();
        boolean boolean7 = buttonPanel0.isFocusTraversalPolicyProvider();
        boolean boolean8 = buttonPanel0.isValidateRoot();
        buttonPanel0.initialize();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray4);
        org.junit.Assert.assertNotNull(rectangle5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.lang.String str14 = buttonPanel1.toString();
        java.awt.Event event15 = null;
        boolean boolean17 = buttonPanel1.lostFocus(event15, (java.lang.Object) (short) 100);
        int int18 = buttonPanel1.getDebugGraphicsOptions();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "org.jpacman.framework.ui.ButtonPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str14.equals("org.jpacman.framework.ui.ButtonPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        int int14 = buttonPanel0.getDebugGraphicsOptions();
        java.awt.event.ContainerListener[] containerListenerArray15 = buttonPanel0.getContainerListeners();
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        buttonPanel0.addInputMethodListener(inputMethodListener16);
        boolean boolean18 = buttonPanel0.getIgnoreRepaint();
        buttonPanel0.layout();
        javax.accessibility.AccessibleContext accessibleContext20 = buttonPanel0.getAccessibleContext();
        boolean boolean21 = buttonPanel0.isRequestFocusEnabled();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(containerListenerArray15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(accessibleContext20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray4 = buttonPanel0.getKeyListeners();
        java.awt.Rectangle rectangle5 = buttonPanel0.bounds();
        buttonPanel0.transferFocus();
        boolean boolean7 = buttonPanel0.isFocusTraversalPolicyProvider();
        org.jpacman.framework.ui.ButtonPanel buttonPanel8 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics9 = null;
        buttonPanel8.printComponents(graphics9);
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics13 = null;
        buttonPanel12.printComponents(graphics13);
        java.awt.Component component15 = buttonPanel8.add("[32,52]", (java.awt.Component) buttonPanel12);
        boolean boolean16 = buttonPanel12.isFocusable();
        java.awt.MenuComponent menuComponent17 = null;
        buttonPanel12.remove(menuComponent17);
        buttonPanel12.enable();
        org.jpacman.framework.ui.ButtonPanel buttonPanel20 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics21 = null;
        buttonPanel20.printComponents(graphics21);
        org.jpacman.framework.ui.ButtonPanel buttonPanel24 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics25 = null;
        buttonPanel24.printComponents(graphics25);
        java.awt.Component component27 = buttonPanel20.add("[32,52]", (java.awt.Component) buttonPanel24);
        java.awt.Graphics graphics28 = null;
        buttonPanel20.update(graphics28);
        boolean boolean30 = buttonPanel20.requestFocusInWindow();
        boolean boolean31 = buttonPanel12.isAncestorOf((java.awt.Component) buttonPanel20);
        java.awt.Event event32 = null;
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction33 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction33.notifyObservers();
        org.jpacman.framework.view.BoardView boardView35 = null;
        org.jpacman.framework.view.Animator animator36 = new org.jpacman.framework.view.Animator(boardView35);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction37 = pacmanInteraction33.controlling((org.jpacman.framework.controller.IController) animator36);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction38 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction38.notifyObservers();
        org.jpacman.framework.view.BoardView boardView40 = null;
        org.jpacman.framework.view.Animator animator41 = new org.jpacman.framework.view.Animator(boardView40);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction42 = pacmanInteraction38.controlling((org.jpacman.framework.controller.IController) animator41);
        pacmanInteraction37.deleteObserver((java.util.Observer) pacmanInteraction38);
        pacmanInteraction38.up();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction45 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction45.notifyObservers();
        org.jpacman.framework.view.BoardView boardView47 = null;
        org.jpacman.framework.view.Animator animator48 = new org.jpacman.framework.view.Animator(boardView47);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction49 = pacmanInteraction45.controlling((org.jpacman.framework.controller.IController) animator48);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction50 = pacmanInteraction38.controlling((org.jpacman.framework.controller.IController) animator48);
        boolean boolean51 = buttonPanel20.gotFocus(event32, (java.lang.Object) animator48);
        buttonPanel20.firePropertyChange("", (long) 13, (long) 'a');
        buttonPanel20.resetKeyboardActions();
        java.awt.MenuComponent menuComponent57 = null;
        buttonPanel20.remove(menuComponent57);
        try {
            buttonPanel0.setComponentZOrder((java.awt.Component) buttonPanel20, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray4);
        org.junit.Assert.assertNotNull(rectangle5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(component15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(component27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(pacmanInteraction37);
        org.junit.Assert.assertNotNull(pacmanInteraction42);
        org.junit.Assert.assertNotNull(pacmanInteraction49);
        org.junit.Assert.assertNotNull(pacmanInteraction50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        int int8 = buttonPanel0.countComponents();
        buttonPanel0.enableInputMethods(false);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.IPacmanInteraction iPacmanInteraction3 = buttonPanel0.getPacmanInteractor();
        java.awt.FocusTraversalPolicy focusTraversalPolicy4 = null;
        buttonPanel0.setFocusTraversalPolicy(focusTraversalPolicy4);
        int int6 = buttonPanel0.getHeight();
        javax.swing.JButton jButton7 = null;
        try {
            buttonPanel0.addButton(jButton7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iPacmanInteraction3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        buttonPanel0.setRequestFocusEnabled(true);
        buttonPanel0.transferFocus();
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel7 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics8 = null;
        buttonPanel7.printComponents(graphics8);
        org.jpacman.framework.ui.ButtonPanel buttonPanel11 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics12 = null;
        buttonPanel11.printComponents(graphics12);
        java.awt.Component component14 = buttonPanel7.add("[32,52]", (java.awt.Component) buttonPanel11);
        java.awt.Graphics graphics15 = null;
        buttonPanel7.update(graphics15);
        org.jpacman.framework.view.BoardView boardView17 = null;
        org.jpacman.framework.view.Animator animator18 = new org.jpacman.framework.view.Animator(boardView17);
        buttonPanel6.add((java.awt.Component) buttonPanel7, (java.lang.Object) animator18);
        java.awt.Point point21 = buttonPanel7.getMousePosition(true);
        java.awt.event.FocusListener[] focusListenerArray22 = buttonPanel7.getFocusListeners();
        java.awt.Dimension dimension23 = buttonPanel7.minimumSize();
        buttonPanel0.setPreferredSize(dimension23);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertNotNull(component14);
        org.junit.Assert.assertNull(point21);
        org.junit.Assert.assertNotNull(focusListenerArray22);
        org.junit.Assert.assertNotNull(dimension23);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.awt.event.ComponentListener[] componentListenerArray14 = buttonPanel0.getComponentListeners();
        buttonPanel0.setEnabled(true);
        boolean boolean17 = buttonPanel0.isMaximumSizeSet();
        boolean boolean19 = buttonPanel0.areFocusTraversalKeysSet((int) (byte) 0);
        java.awt.Dimension dimension20 = buttonPanel0.getMaximumSize();
        buttonPanel0.setVisible(true);
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(componentListenerArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dimension20);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.ui.ButtonPanel buttonPanel11 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics13 = null;
        buttonPanel12.printComponents(graphics13);
        org.jpacman.framework.ui.ButtonPanel buttonPanel16 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics17 = null;
        buttonPanel16.printComponents(graphics17);
        java.awt.Component component19 = buttonPanel12.add("[32,52]", (java.awt.Component) buttonPanel16);
        java.awt.Graphics graphics20 = null;
        buttonPanel12.update(graphics20);
        org.jpacman.framework.view.BoardView boardView22 = null;
        org.jpacman.framework.view.Animator animator23 = new org.jpacman.framework.view.Animator(boardView22);
        buttonPanel11.add((java.awt.Component) buttonPanel12, (java.lang.Object) animator23);
        java.awt.event.ComponentListener[] componentListenerArray25 = buttonPanel11.getComponentListeners();
        buttonPanel11.setEnabled(true);
        java.awt.Dimension dimension28 = buttonPanel11.getMinimumSize();
        buttonPanel1.setMinimumSize(dimension28);
        buttonPanel0.setPreferredSize(dimension28);
        java.awt.event.HierarchyListener hierarchyListener31 = null;
        buttonPanel0.addHierarchyListener(hierarchyListener31);
        java.awt.Event event33 = null;
        java.lang.Object obj34 = null;
        boolean boolean35 = buttonPanel0.lostFocus(event33, obj34);
        java.awt.Cursor cursor36 = buttonPanel0.getCursor();
        java.awt.Graphics graphics37 = buttonPanel0.getGraphics();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(component19);
        org.junit.Assert.assertNotNull(componentListenerArray25);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cursor36);
        org.junit.Assert.assertNull(graphics37);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        int int14 = buttonPanel0.getDebugGraphicsOptions();
        java.awt.event.ContainerListener[] containerListenerArray15 = buttonPanel0.getContainerListeners();
        javax.swing.KeyStroke[] keyStrokeArray16 = buttonPanel0.getRegisteredKeyStrokes();
        buttonPanel0.firePropertyChange("board.txt", (float) 0L, (float) (short) 0);
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(containerListenerArray15);
        org.junit.Assert.assertNotNull(keyStrokeArray16);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.awt.Point point15 = buttonPanel1.getMousePosition(true);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction16 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction16.notifyObservers();
        org.jpacman.framework.view.BoardView boardView18 = null;
        org.jpacman.framework.view.Animator animator19 = new org.jpacman.framework.view.Animator(boardView18);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction20 = pacmanInteraction16.controlling((org.jpacman.framework.controller.IController) animator19);
        org.jpacman.framework.ui.PacmanInteraction.MatchState matchState21 = pacmanInteraction20.getCurrentState();
        org.jpacman.framework.ui.ButtonPanel buttonPanel22 = buttonPanel1.withInteractor(pacmanInteraction20);
        boolean boolean23 = buttonPanel22.isShowing();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNull(point15);
        org.junit.Assert.assertNotNull(pacmanInteraction20);
        org.junit.Assert.assertTrue("'" + matchState21 + "' != '" + org.jpacman.framework.ui.PacmanInteraction.MatchState.PAUSING + "'", matchState21.equals(org.jpacman.framework.ui.PacmanInteraction.MatchState.PAUSING));
        org.junit.Assert.assertNotNull(buttonPanel22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        int int0 = java.awt.Frame.HAND_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        java.awt.ImageCapabilities imageCapabilities6 = null;
        java.awt.image.VolatileImage volatileImage7 = buttonPanel0.createVolatileImage((int) 'a', (int) (byte) 10, imageCapabilities6);
        java.awt.LayoutManager layoutManager8 = null;
        buttonPanel0.setLayout(layoutManager8);
        java.awt.Event event10 = null;
        boolean boolean12 = buttonPanel0.keyUp(event10, 9);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNull(volatileImage7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        boolean boolean2 = mainUI0.isResizable();
        java.awt.Dimension dimension3 = mainUI0.getPreferredSize();
        java.awt.Container container4 = mainUI0.getFocusCycleRootAncestor();
        try {
            mainUI0.applyResourceBundle("ToolTipText");
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Can't find bundle for base name ToolTipText, locale en_CA");
        } catch (java.util.MissingResourceException e) {
        }
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertNull(container4);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        pacmanInteraction0.start();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction6 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction6.notifyObservers();
        org.jpacman.framework.view.BoardView boardView8 = null;
        org.jpacman.framework.view.Animator animator9 = new org.jpacman.framework.view.Animator(boardView8);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction10 = pacmanInteraction6.controlling((org.jpacman.framework.controller.IController) animator9);
        pacmanInteraction0.addObserver((java.util.Observer) pacmanInteraction6);
        pacmanInteraction0.deleteObservers();
        pacmanInteraction0.deleteObservers();
        try {
            pacmanInteraction0.left();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pacmanInteraction4);
        org.junit.Assert.assertNotNull(pacmanInteraction10);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        buttonPanel4.grabFocus();
        org.junit.Assert.assertNotNull(component7);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction5.notifyObservers();
        org.jpacman.framework.view.BoardView boardView7 = null;
        org.jpacman.framework.view.Animator animator8 = new org.jpacman.framework.view.Animator(boardView7);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction9 = pacmanInteraction5.controlling((org.jpacman.framework.controller.IController) animator8);
        pacmanInteraction4.deleteObserver((java.util.Observer) pacmanInteraction5);
        pacmanInteraction5.up();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction12 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction12.notifyObservers();
        org.jpacman.framework.view.BoardView boardView14 = null;
        org.jpacman.framework.view.Animator animator15 = new org.jpacman.framework.view.Animator(boardView14);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction16 = pacmanInteraction12.controlling((org.jpacman.framework.controller.IController) animator15);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction17 = pacmanInteraction5.controlling((org.jpacman.framework.controller.IController) animator15);
        try {
            pacmanInteraction5.exit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pacmanInteraction4);
        org.junit.Assert.assertNotNull(pacmanInteraction9);
        org.junit.Assert.assertNotNull(pacmanInteraction16);
        org.junit.Assert.assertNotNull(pacmanInteraction17);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        int int0 = java.awt.Frame.MAXIMIZED_BOTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isRequestFocusEnabled();
        boolean boolean9 = buttonPanel4.isValid();
        org.jpacman.framework.ui.ButtonPanel buttonPanel10 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior11 = buttonPanel10.getBaselineResizeBehavior();
        int int12 = buttonPanel10.getWidth();
        float float13 = buttonPanel10.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray14 = buttonPanel10.getKeyListeners();
        boolean boolean15 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) buttonPanel10);
        buttonPanel10.updateUI();
        javax.swing.plaf.PanelUI panelUI17 = buttonPanel10.getUI();
        buttonPanel4.setUI(panelUI17);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior11 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior11.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(panelUI17);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        buttonPanel0.setVisible(false);
        org.jpacman.framework.model.Game game16 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList17 = game16.getGhosts();
        boolean boolean18 = game16.won();
        org.jpacman.framework.ui.ButtonPanel buttonPanel19 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics20 = null;
        buttonPanel19.printComponents(graphics20);
        org.jpacman.framework.ui.ButtonPanel buttonPanel23 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics24 = null;
        buttonPanel23.printComponents(graphics24);
        java.awt.Component component26 = buttonPanel19.add("[32,52]", (java.awt.Component) buttonPanel23);
        boolean boolean27 = buttonPanel23.isFocusable();
        java.awt.MenuComponent menuComponent28 = null;
        buttonPanel23.remove(menuComponent28);
        buttonPanel23.enable();
        game16.attach((java.util.Observer) buttonPanel23);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover32 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game16);
        javax.swing.KeyStroke keyStroke33 = null;
        try {
            buttonPanel0.registerKeyboardAction((java.awt.event.ActionListener) randomGhostMover32, keyStroke33, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(ghostList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(component26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory1 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game2 = defaultGameFactory1.makeGame();
        level0.setFactory((org.jpacman.framework.factory.IGameFactory) defaultGameFactory1);
        org.jpacman.framework.model.Board board6 = defaultGameFactory1.makeBoard((int) 'a', (int) (short) 1);
        boolean boolean9 = board6.withinBorders((int) '4', 2);
        try {
            org.jpacman.framework.model.Sprite sprite12 = board6.spriteAt(4, (int) 'P');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 80");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(game2);
        org.junit.Assert.assertNotNull(board6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        buttonPanel0.setRequestFocusEnabled(true);
        buttonPanel0.transferFocus();
        java.awt.event.ComponentListener componentListener6 = null;
        buttonPanel0.removeComponentListener(componentListener6);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        java.awt.event.WindowFocusListener windowFocusListener2 = null;
        mainUI0.removeWindowFocusListener(windowFocusListener2);
        int int4 = mainUI0.getState();
        java.awt.Toolkit toolkit5 = mainUI0.getToolkit();
        boolean boolean6 = mainUI0.isAlwaysOnTop();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(toolkit5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        buttonPanel1.repaint(7, 13, 4, (int) (short) 100);
        int int19 = buttonPanel1.getHeight();
        buttonPanel1.setInheritsPopupMenu(false);
        java.awt.Font font22 = null;
        try {
            java.awt.FontMetrics fontMetrics23 = buttonPanel1.getFontMetrics(font22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        java.lang.String str2 = mainUI0.getTitle();
        mainUI0.setTitle("PanelUI");
        mainUI0.setAlwaysOnTop(true);
        javax.swing.JRootPane jRootPane7 = mainUI0.getRootPane();
        boolean boolean8 = mainUI0.isFocusCycleRoot();
        int int9 = mainUI0.getExtendedState();
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNotNull(jRootPane7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        java.awt.Graphics graphics8 = null;
        buttonPanel0.update(graphics8);
        java.awt.event.MouseEvent mouseEvent10 = null;
        java.awt.Point point11 = buttonPanel0.getPopupLocation(mouseEvent10);
        buttonPanel0.setDebugGraphicsOptions(5);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNull(point11);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        boolean boolean2 = mainUI0.isResizable();
        java.awt.Graphics graphics3 = null;
        mainUI0.paintAll(graphics3);
        mainUI0.setVisible(true);
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isFocusable();
        java.awt.MenuComponent menuComponent9 = null;
        buttonPanel4.remove(menuComponent9);
        buttonPanel4.enable();
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics13 = null;
        buttonPanel12.printComponents(graphics13);
        org.jpacman.framework.ui.ButtonPanel buttonPanel16 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics17 = null;
        buttonPanel16.printComponents(graphics17);
        java.awt.Component component19 = buttonPanel12.add("[32,52]", (java.awt.Component) buttonPanel16);
        java.awt.Graphics graphics20 = null;
        buttonPanel12.update(graphics20);
        boolean boolean22 = buttonPanel12.requestFocusInWindow();
        boolean boolean23 = buttonPanel4.isAncestorOf((java.awt.Component) buttonPanel12);
        org.jpacman.framework.model.Game game25 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList26 = game25.getGhosts();
        boolean boolean27 = game25.won();
        org.jpacman.framework.ui.ButtonPanel buttonPanel28 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics29 = null;
        buttonPanel28.printComponents(graphics29);
        org.jpacman.framework.ui.ButtonPanel buttonPanel32 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics33 = null;
        buttonPanel32.printComponents(graphics33);
        java.awt.Component component35 = buttonPanel28.add("[32,52]", (java.awt.Component) buttonPanel32);
        boolean boolean36 = buttonPanel32.isFocusable();
        java.awt.MenuComponent menuComponent37 = null;
        buttonPanel32.remove(menuComponent37);
        buttonPanel32.enable();
        game25.attach((java.util.Observer) buttonPanel32);
        java.awt.Component component41 = buttonPanel12.add("org.jpacman.framework.ui.MainUI[frame0,0,23,0x0,invalid,hidden,disabled,layout=java.awt.BorderLayout,title=,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (java.awt.Component) buttonPanel32);
        java.awt.event.HierarchyListener hierarchyListener42 = null;
        component41.addHierarchyListener(hierarchyListener42);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(component19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(ghostList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(component35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(component41);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel3 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics4 = null;
        buttonPanel3.printComponents(graphics4);
        org.jpacman.framework.ui.ButtonPanel buttonPanel7 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics8 = null;
        buttonPanel7.printComponents(graphics8);
        java.awt.Component component10 = buttonPanel3.add("[32,52]", (java.awt.Component) buttonPanel7);
        java.awt.Graphics graphics11 = null;
        buttonPanel3.update(graphics11);
        org.jpacman.framework.view.BoardView boardView13 = null;
        org.jpacman.framework.view.Animator animator14 = new org.jpacman.framework.view.Animator(boardView13);
        buttonPanel2.add((java.awt.Component) buttonPanel3, (java.lang.Object) animator14);
        java.awt.event.ComponentListener[] componentListenerArray16 = buttonPanel2.getComponentListeners();
        buttonPanel2.setEnabled(true);
        java.awt.Dimension dimension19 = buttonPanel2.getMinimumSize();
        java.awt.Color color20 = null;
        buttonPanel2.setForeground(color20);
        pacmanInteraction0.notifyObservers((java.lang.Object) buttonPanel2);
        javax.accessibility.AccessibleContext accessibleContext23 = buttonPanel2.getAccessibleContext();
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertNotNull(componentListenerArray16);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertNotNull(accessibleContext23);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        boolean boolean2 = mainUI0.isResizable();
        java.awt.event.WindowFocusListener[] windowFocusListenerArray3 = mainUI0.getWindowFocusListeners();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction4.notifyObservers();
        org.jpacman.framework.view.BoardView boardView6 = null;
        org.jpacman.framework.view.Animator animator7 = new org.jpacman.framework.view.Animator(boardView6);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction8 = pacmanInteraction4.controlling((org.jpacman.framework.controller.IController) animator7);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction9 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction9.notifyObservers();
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction13 = pacmanInteraction9.controlling((org.jpacman.framework.controller.IController) animator12);
        pacmanInteraction8.deleteObserver((java.util.Observer) pacmanInteraction9);
        pacmanInteraction9.up();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction16 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction16.notifyObservers();
        org.jpacman.framework.view.BoardView boardView18 = null;
        org.jpacman.framework.view.Animator animator19 = new org.jpacman.framework.view.Animator(boardView18);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction20 = pacmanInteraction16.controlling((org.jpacman.framework.controller.IController) animator19);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction21 = pacmanInteraction9.controlling((org.jpacman.framework.controller.IController) animator19);
        org.jpacman.framework.ui.MainUI mainUI22 = mainUI0.withGhostController((org.jpacman.framework.controller.IController) animator19);
        java.util.List<java.awt.Image> imageList23 = mainUI0.getIconImages();
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(windowFocusListenerArray3);
        org.junit.Assert.assertNotNull(pacmanInteraction8);
        org.junit.Assert.assertNotNull(pacmanInteraction13);
        org.junit.Assert.assertNotNull(pacmanInteraction20);
        org.junit.Assert.assertNotNull(pacmanInteraction21);
        org.junit.Assert.assertNotNull(mainUI22);
        org.junit.Assert.assertNotNull(imageList23);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        javax.swing.event.AncestorListener[] ancestorListenerArray4 = buttonPanel0.getAncestorListeners();
        java.awt.event.ContainerListener containerListener5 = null;
        buttonPanel0.addContainerListener(containerListener5);
        int int7 = buttonPanel0.countComponents();
        java.awt.MenuComponent menuComponent8 = null;
        buttonPanel0.remove(menuComponent8);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(ancestorListenerArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        try {
            animator3.doTick();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pacmanInteraction4);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory1 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game2 = defaultGameFactory1.makeGame();
        level0.setFactory((org.jpacman.framework.factory.IGameFactory) defaultGameFactory1);
        level0.setMapFile("PanelUI");
        try {
            org.jpacman.framework.model.IGameInteractor iGameInteractor6 = level0.parseMap();
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: PanelUI not found on classpath:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes:/Users/zhenwang/Documents/randoop-4.1.1/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertNotNull(game2);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics3 = null;
        buttonPanel2.printComponents(graphics3);
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics7 = null;
        buttonPanel6.printComponents(graphics7);
        java.awt.Component component9 = buttonPanel2.add("[32,52]", (java.awt.Component) buttonPanel6);
        java.awt.Graphics graphics10 = null;
        buttonPanel2.update(graphics10);
        org.jpacman.framework.view.BoardView boardView12 = null;
        org.jpacman.framework.view.Animator animator13 = new org.jpacman.framework.view.Animator(boardView12);
        buttonPanel1.add((java.awt.Component) buttonPanel2, (java.lang.Object) animator13);
        java.awt.event.ComponentListener[] componentListenerArray15 = buttonPanel1.getComponentListeners();
        buttonPanel1.setEnabled(true);
        java.awt.event.ContainerListener containerListener18 = null;
        buttonPanel1.removeContainerListener(containerListener18);
        java.awt.LayoutManager layoutManager20 = buttonPanel1.getLayout();
        mainUI0.setLayout(layoutManager20);
        org.jpacman.framework.ui.ButtonPanel buttonPanel22 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior23 = buttonPanel22.getBaselineResizeBehavior();
        int int24 = buttonPanel22.getWidth();
        float float25 = buttonPanel22.getAlignmentY();
        java.awt.ImageCapabilities imageCapabilities28 = null;
        java.awt.image.VolatileImage volatileImage29 = buttonPanel22.createVolatileImage((int) 'a', (int) (byte) 10, imageCapabilities28);
        java.awt.LayoutManager layoutManager30 = null;
        buttonPanel22.setLayout(layoutManager30);
        java.awt.ComponentOrientation componentOrientation32 = buttonPanel22.getComponentOrientation();
        mainUI0.applyComponentOrientation(componentOrientation32);
        java.awt.im.InputContext inputContext34 = mainUI0.getInputContext();
        java.awt.Window.Type type35 = null;
        try {
            mainUI0.setType(type35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertNotNull(componentListenerArray15);
        org.junit.Assert.assertNotNull(layoutManager20);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior23 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior23.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
        org.junit.Assert.assertNull(volatileImage29);
        org.junit.Assert.assertNotNull(componentOrientation32);
        org.junit.Assert.assertNotNull(inputContext34);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Tile tile3 = new org.jpacman.framework.model.Tile((int) ' ', (int) '4');
        java.lang.String str4 = tile3.toString();
        java.lang.String str5 = tile3.toString();
        org.jpacman.framework.model.Food food6 = new org.jpacman.framework.model.Food();
        boolean boolean7 = tile3.containsSprite((org.jpacman.framework.model.Sprite) food6);
        int int8 = food6.getPoints();
        game0.addFood(food6);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[32,52]" + "'", str4.equals("[32,52]"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[32,52]" + "'", str5.equals("[32,52]"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        java.awt.event.WindowStateListener windowStateListener2 = null;
        mainUI0.addWindowStateListener(windowStateListener2);
        boolean boolean4 = mainUI0.isActive();
        mainUI0.setAutoRequestFocus(true);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction1 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction1.notifyObservers();
        org.jpacman.framework.view.BoardView boardView3 = null;
        org.jpacman.framework.view.Animator animator4 = new org.jpacman.framework.view.Animator(boardView3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = pacmanInteraction1.controlling((org.jpacman.framework.controller.IController) animator4);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction6 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction6.notifyObservers();
        org.jpacman.framework.view.BoardView boardView8 = null;
        org.jpacman.framework.view.Animator animator9 = new org.jpacman.framework.view.Animator(boardView8);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction10 = pacmanInteraction6.controlling((org.jpacman.framework.controller.IController) animator9);
        pacmanInteraction5.deleteObserver((java.util.Observer) pacmanInteraction6);
        pacmanInteraction6.up();
        game0.addObserver((java.util.Observer) pacmanInteraction6);
        org.jpacman.framework.model.IBoardInspector iBoardInspector14 = game0.getBoardInspector();
        org.jpacman.framework.model.Ghost ghost15 = null;
        game0.addGhost(ghost15);
        boolean boolean17 = game0.won();
        try {
            boolean boolean18 = game0.died();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pacmanInteraction5);
        org.junit.Assert.assertNotNull(pacmanInteraction10);
        org.junit.Assert.assertNull(iBoardInspector14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        animator3.stop();
        try {
            animator3.doTick();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pacmanInteraction4);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(0, (int) '4');
        org.jpacman.framework.model.Sprite sprite3 = tile2.topSprite();
        int int4 = tile2.getX();
        org.junit.Assert.assertNull(sprite3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        boolean boolean2 = mainUI0.isResizable();
        java.awt.Dimension dimension3 = mainUI0.getPreferredSize();
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior5 = buttonPanel4.getBaselineResizeBehavior();
        int int6 = buttonPanel4.getWidth();
        float float7 = buttonPanel4.getAlignmentY();
        boolean boolean8 = buttonPanel4.hasFocus();
        float float9 = buttonPanel4.getAlignmentY();
        java.awt.Graphics graphics10 = null;
        buttonPanel4.update(graphics10);
        buttonPanel4.reshape(8, 32, 64, (int) '.');
        java.awt.Color color17 = buttonPanel4.getForeground();
        mainUI0.setBackground(color17);
        java.awt.image.ColorModel colorModel19 = mainUI0.getColorModel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel20 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel22 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener23 = null;
        buttonPanel22.removeMouseWheelListener(mouseWheelListener23);
        java.awt.Component component25 = buttonPanel20.add("[32,52]", (java.awt.Component) buttonPanel22);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        buttonPanel22.removePropertyChangeListener("[32,52]", propertyChangeListener27);
        org.jpacman.framework.ui.ButtonPanel buttonPanel29 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior30 = buttonPanel29.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray31 = buttonPanel29.getContainerListeners();
        boolean boolean33 = buttonPanel29.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray34 = buttonPanel29.getContainerListeners();
        java.awt.image.ImageProducer imageProducer35 = null;
        java.awt.Image image36 = buttonPanel29.createImage(imageProducer35);
        org.jpacman.framework.ui.ButtonPanel buttonPanel37 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior38 = buttonPanel37.getBaselineResizeBehavior();
        int int39 = buttonPanel37.getWidth();
        float float40 = buttonPanel37.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray41 = buttonPanel37.getKeyListeners();
        int int42 = buttonPanel22.checkImage(image36, (java.awt.image.ImageObserver) buttonPanel37);
        mainUI0.setIconImage(image36);
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior5 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior5.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(colorModel19);
        org.junit.Assert.assertNotNull(component25);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior30 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior30.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(containerListenerArray34);
        org.junit.Assert.assertNotNull(image36);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior38 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior38.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.5f + "'", float40 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        java.awt.ImageCapabilities imageCapabilities6 = null;
        java.awt.image.VolatileImage volatileImage7 = buttonPanel0.createVolatileImage((int) 'a', (int) (byte) 10, imageCapabilities6);
        java.awt.LayoutManager layoutManager8 = null;
        buttonPanel0.setLayout(layoutManager8);
        java.awt.event.MouseListener mouseListener10 = null;
        buttonPanel0.addMouseListener(mouseListener10);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNull(volatileImage7);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        boolean boolean2 = mainUI0.isResizable();
        java.awt.Graphics graphics3 = null;
        mainUI0.paintAll(graphics3);
        java.awt.im.InputContext inputContext5 = mainUI0.getInputContext();
        mainUI0.repaint((long) (byte) 10, 5, 0, 8, 32);
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(inputContext5);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.ui.ButtonPanel buttonPanel11 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics13 = null;
        buttonPanel12.printComponents(graphics13);
        org.jpacman.framework.ui.ButtonPanel buttonPanel16 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics17 = null;
        buttonPanel16.printComponents(graphics17);
        java.awt.Component component19 = buttonPanel12.add("[32,52]", (java.awt.Component) buttonPanel16);
        java.awt.Graphics graphics20 = null;
        buttonPanel12.update(graphics20);
        org.jpacman.framework.view.BoardView boardView22 = null;
        org.jpacman.framework.view.Animator animator23 = new org.jpacman.framework.view.Animator(boardView22);
        buttonPanel11.add((java.awt.Component) buttonPanel12, (java.lang.Object) animator23);
        java.awt.event.ComponentListener[] componentListenerArray25 = buttonPanel11.getComponentListeners();
        buttonPanel11.setEnabled(true);
        java.awt.Dimension dimension28 = buttonPanel11.getMinimumSize();
        buttonPanel1.setMinimumSize(dimension28);
        buttonPanel0.setPreferredSize(dimension28);
        java.awt.event.HierarchyListener hierarchyListener31 = null;
        buttonPanel0.addHierarchyListener(hierarchyListener31);
        java.awt.Event event33 = null;
        java.lang.Object obj34 = null;
        boolean boolean35 = buttonPanel0.lostFocus(event33, obj34);
        java.awt.Cursor cursor36 = buttonPanel0.getCursor();
        boolean boolean37 = buttonPanel0.getFocusTraversalKeysEnabled();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(component19);
        org.junit.Assert.assertNotNull(componentListenerArray25);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cursor36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.jpacman.framework.ui.PacmanInteraction.MatchState matchState0 = org.jpacman.framework.ui.PacmanInteraction.MatchState.PLAYING;
        org.junit.Assert.assertTrue("'" + matchState0 + "' != '" + org.jpacman.framework.ui.PacmanInteraction.MatchState.PLAYING + "'", matchState0.equals(org.jpacman.framework.ui.PacmanInteraction.MatchState.PLAYING));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        java.awt.Graphics graphics8 = null;
        buttonPanel0.update(graphics8);
        org.jpacman.framework.ui.ButtonPanel buttonPanel10 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel11 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics12 = null;
        buttonPanel11.printComponents(graphics12);
        org.jpacman.framework.ui.ButtonPanel buttonPanel15 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics16 = null;
        buttonPanel15.printComponents(graphics16);
        java.awt.Component component18 = buttonPanel11.add("[32,52]", (java.awt.Component) buttonPanel15);
        java.awt.Graphics graphics19 = null;
        buttonPanel11.update(graphics19);
        org.jpacman.framework.view.BoardView boardView21 = null;
        org.jpacman.framework.view.Animator animator22 = new org.jpacman.framework.view.Animator(boardView21);
        buttonPanel10.add((java.awt.Component) buttonPanel11, (java.lang.Object) animator22);
        java.awt.event.ComponentListener[] componentListenerArray24 = buttonPanel10.getComponentListeners();
        buttonPanel10.setEnabled(true);
        java.awt.Dimension dimension27 = buttonPanel10.getMinimumSize();
        buttonPanel0.setMinimumSize(dimension27);
        java.awt.event.MouseEvent mouseEvent29 = null;
        java.awt.Point point30 = buttonPanel0.getPopupLocation(mouseEvent29);
        java.awt.dnd.DropTarget dropTarget31 = null;
        buttonPanel0.setDropTarget(dropTarget31);
        boolean boolean33 = buttonPanel0.isFocusOwner();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNotNull(component18);
        org.junit.Assert.assertNotNull(componentListenerArray24);
        org.junit.Assert.assertNotNull(dimension27);
        org.junit.Assert.assertNull(point30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        buttonPanel0.transferFocusBackward();
        buttonPanel0.setVisible(true);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        java.awt.event.WindowStateListener windowStateListener2 = null;
        mainUI0.addWindowStateListener(windowStateListener2);
        mainUI0.removeNotify();
        mainUI0.setExtendedState((int) (byte) -1);
        java.awt.Toolkit toolkit7 = mainUI0.getToolkit();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(toolkit7);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.awt.event.ComponentListener[] componentListenerArray14 = buttonPanel0.getComponentListeners();
        buttonPanel0.setEnabled(true);
        java.awt.Dimension dimension17 = buttonPanel0.getMinimumSize();
        org.jpacman.framework.ui.ButtonPanel buttonPanel18 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics19 = null;
        buttonPanel18.printComponents(graphics19);
        org.jpacman.framework.ui.ButtonPanel buttonPanel22 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics23 = null;
        buttonPanel22.printComponents(graphics23);
        java.awt.Component component25 = buttonPanel18.add("[32,52]", (java.awt.Component) buttonPanel22);
        java.awt.Graphics graphics26 = null;
        buttonPanel18.update(graphics26);
        org.jpacman.framework.ui.ButtonPanel buttonPanel28 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel29 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics30 = null;
        buttonPanel29.printComponents(graphics30);
        org.jpacman.framework.ui.ButtonPanel buttonPanel33 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics34 = null;
        buttonPanel33.printComponents(graphics34);
        java.awt.Component component36 = buttonPanel29.add("[32,52]", (java.awt.Component) buttonPanel33);
        java.awt.Graphics graphics37 = null;
        buttonPanel29.update(graphics37);
        org.jpacman.framework.view.BoardView boardView39 = null;
        org.jpacman.framework.view.Animator animator40 = new org.jpacman.framework.view.Animator(boardView39);
        buttonPanel28.add((java.awt.Component) buttonPanel29, (java.lang.Object) animator40);
        java.awt.event.ComponentListener[] componentListenerArray42 = buttonPanel28.getComponentListeners();
        buttonPanel28.setEnabled(true);
        java.awt.Dimension dimension45 = buttonPanel28.getMinimumSize();
        buttonPanel18.setMinimumSize(dimension45);
        buttonPanel0.setPreferredSize(dimension45);
        int int48 = buttonPanel0.getY();
        org.jpacman.framework.ui.ButtonPanel buttonPanel49 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior50 = buttonPanel49.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray51 = buttonPanel49.getContainerListeners();
        buttonPanel49.setRequestFocusEnabled(true);
        boolean boolean54 = buttonPanel49.isValidateRoot();
        java.awt.Dimension dimension55 = buttonPanel49.getPreferredSize();
        java.awt.Dimension dimension56 = buttonPanel0.getSize(dimension55);
        java.awt.Dimension dimension57 = buttonPanel0.getMaximumSize();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(componentListenerArray14);
        org.junit.Assert.assertNotNull(dimension17);
        org.junit.Assert.assertNotNull(component25);
        org.junit.Assert.assertNotNull(component36);
        org.junit.Assert.assertNotNull(componentListenerArray42);
        org.junit.Assert.assertNotNull(dimension45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior50 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior50.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(dimension55);
        org.junit.Assert.assertNotNull(dimension56);
        org.junit.Assert.assertNotNull(dimension57);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        buttonPanel1.repaint(7, 13, 4, (int) (short) 100);
        int int19 = buttonPanel1.getHeight();
        buttonPanel1.setInheritsPopupMenu(false);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction22 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction22.notifyObservers();
        org.jpacman.framework.view.BoardView boardView24 = null;
        org.jpacman.framework.view.Animator animator25 = new org.jpacman.framework.view.Animator(boardView24);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction26 = pacmanInteraction22.controlling((org.jpacman.framework.controller.IController) animator25);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction27 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction27.notifyObservers();
        org.jpacman.framework.view.BoardView boardView29 = null;
        org.jpacman.framework.view.Animator animator30 = new org.jpacman.framework.view.Animator(boardView29);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction31 = pacmanInteraction27.controlling((org.jpacman.framework.controller.IController) animator30);
        pacmanInteraction27.start();
        org.jpacman.framework.ui.ButtonPanel buttonPanel33 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior34 = buttonPanel33.getBaselineResizeBehavior();
        int int35 = buttonPanel33.getWidth();
        float float36 = buttonPanel33.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray37 = buttonPanel33.getKeyListeners();
        java.awt.Rectangle rectangle38 = buttonPanel33.bounds();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray39 = buttonPanel33.getPropertyChangeListeners();
        pacmanInteraction22.update((java.util.Observable) pacmanInteraction27, (java.lang.Object) propertyChangeListenerArray39);
        org.jpacman.framework.ui.ButtonPanel buttonPanel41 = buttonPanel1.withInteractor(pacmanInteraction22);
        buttonPanel1.paintImmediately(4, (int) '.', 32, (int) 'P');
        buttonPanel1.setEnabled(true);
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(pacmanInteraction26);
        org.junit.Assert.assertNotNull(pacmanInteraction31);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior34 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior34.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray37);
        org.junit.Assert.assertNotNull(rectangle38);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray39);
        org.junit.Assert.assertNotNull(buttonPanel41);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isRequestFocusEnabled();
        javax.swing.ActionMap actionMap9 = buttonPanel4.getActionMap();
        javax.swing.event.AncestorListener[] ancestorListenerArray10 = buttonPanel4.getAncestorListeners();
        java.lang.Object obj11 = buttonPanel4.getTreeLock();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(actionMap9);
        org.junit.Assert.assertNotNull(ancestorListenerArray10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        javax.swing.event.AncestorListener[] ancestorListenerArray4 = buttonPanel0.getAncestorListeners();
        buttonPanel0.firePropertyChange("hi!", (short) 10, (short) -1);
        javax.swing.JPopupMenu jPopupMenu9 = buttonPanel0.getComponentPopupMenu();
        java.io.PrintWriter printWriter10 = null;
        try {
            jPopupMenu9.list(printWriter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(ancestorListenerArray4);
        org.junit.Assert.assertNull(jPopupMenu9);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        buttonPanel0.firePropertyChange("ToolTipText", ' ', ' ');
        java.awt.Graphics graphics18 = null;
        buttonPanel0.paintComponents(graphics18);
        java.awt.Graphics graphics20 = buttonPanel0.getGraphics();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNull(graphics20);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        boolean boolean4 = buttonPanel0.hasFocus();
        buttonPanel0.enable();
        java.awt.Dimension dimension6 = buttonPanel0.getMaximumSize();
        org.jpacman.framework.ui.MainUI mainUI7 = new org.jpacman.framework.ui.MainUI();
        java.awt.Component component8 = mainUI7.getGlassPane();
        java.awt.event.WindowFocusListener windowFocusListener9 = null;
        mainUI7.removeWindowFocusListener(windowFocusListener9);
        int int11 = mainUI7.getState();
        java.awt.Toolkit toolkit12 = mainUI7.getToolkit();
        org.jpacman.framework.ui.ButtonPanel buttonPanel13 = buttonPanel0.withParent((javax.swing.JFrame) mainUI7);
        java.awt.Cursor cursor14 = buttonPanel13.getCursor();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(toolkit12);
        org.junit.Assert.assertNotNull(buttonPanel13);
        org.junit.Assert.assertNotNull(cursor14);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.IPacmanInteraction iPacmanInteraction3 = buttonPanel0.getPacmanInteractor();
        boolean boolean4 = buttonPanel0.isFocusTraversalPolicyProvider();
        javax.swing.InputVerifier inputVerifier5 = null;
        buttonPanel0.setInputVerifier(inputVerifier5);
        org.junit.Assert.assertNull(iPacmanInteraction3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        boolean boolean4 = buttonPanel0.hasFocus();
        float float5 = buttonPanel0.getAlignmentY();
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior7 = buttonPanel6.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray8 = buttonPanel6.getContainerListeners();
        boolean boolean10 = buttonPanel6.requestFocus(false);
        boolean boolean11 = buttonPanel6.isVisible();
        java.awt.event.MouseListener[] mouseListenerArray12 = buttonPanel6.getMouseListeners();
        java.awt.Color color13 = buttonPanel6.getBackground();
        buttonPanel0.setBackground(color13);
        java.awt.Event event15 = null;
        boolean boolean18 = buttonPanel0.mouseDrag(event15, 100, 5);
        java.awt.event.ContainerListener containerListener19 = null;
        buttonPanel0.removeContainerListener(containerListener19);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior7 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior7.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(mouseListenerArray12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        boolean boolean1 = mainUI0.isFocused();
        java.awt.event.WindowStateListener[] windowStateListenerArray2 = mainUI0.getWindowStateListeners();
        org.jpacman.framework.ui.ButtonPanel buttonPanel3 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener6 = null;
        buttonPanel5.removeMouseWheelListener(mouseWheelListener6);
        java.awt.Component component8 = buttonPanel3.add("[32,52]", (java.awt.Component) buttonPanel5);
        boolean boolean9 = buttonPanel3.isFocusOwner();
        java.lang.String str10 = buttonPanel3.getUIClassID();
        org.jpacman.framework.ui.ButtonPanel buttonPanel11 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior12 = buttonPanel11.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray13 = buttonPanel11.getContainerListeners();
        boolean boolean15 = buttonPanel11.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray16 = buttonPanel11.getContainerListeners();
        java.awt.Rectangle rectangle17 = null;
        java.awt.Rectangle rectangle18 = buttonPanel11.getBounds(rectangle17);
        java.awt.Rectangle rectangle19 = buttonPanel3.getBounds(rectangle18);
        org.jpacman.framework.ui.ButtonPanel buttonPanel21 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics22 = null;
        buttonPanel21.printComponents(graphics22);
        org.jpacman.framework.ui.ButtonPanel buttonPanel25 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics26 = null;
        buttonPanel25.printComponents(graphics26);
        java.awt.Component component28 = buttonPanel21.add("[32,52]", (java.awt.Component) buttonPanel25);
        java.awt.Graphics graphics29 = null;
        buttonPanel21.update(graphics29);
        javax.swing.KeyStroke keyStroke31 = null;
        buttonPanel21.unregisterKeyboardAction(keyStroke31);
        java.awt.Component component33 = buttonPanel3.add("[32,52]", (java.awt.Component) buttonPanel21);
        org.jpacman.framework.ui.ButtonPanel buttonPanel34 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior35 = buttonPanel34.getBaselineResizeBehavior();
        int int36 = buttonPanel34.getWidth();
        float float37 = buttonPanel34.getAlignmentY();
        boolean boolean38 = buttonPanel34.hasFocus();
        float float39 = buttonPanel34.getAlignmentY();
        java.awt.Graphics graphics40 = null;
        buttonPanel34.update(graphics40);
        javax.swing.ActionMap actionMap42 = buttonPanel34.getActionMap();
        org.jpacman.framework.ui.ButtonPanel buttonPanel43 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior44 = buttonPanel43.getBaselineResizeBehavior();
        int int45 = buttonPanel43.getWidth();
        float float46 = buttonPanel43.getAlignmentY();
        java.awt.ImageCapabilities imageCapabilities49 = null;
        java.awt.image.VolatileImage volatileImage50 = buttonPanel43.createVolatileImage((int) 'a', (int) (byte) 10, imageCapabilities49);
        java.awt.LayoutManager layoutManager51 = null;
        buttonPanel43.setLayout(layoutManager51);
        org.jpacman.framework.ui.MainUI mainUI53 = new org.jpacman.framework.ui.MainUI();
        org.jpacman.framework.ui.ButtonPanel buttonPanel54 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel55 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics56 = null;
        buttonPanel55.printComponents(graphics56);
        org.jpacman.framework.ui.ButtonPanel buttonPanel59 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics60 = null;
        buttonPanel59.printComponents(graphics60);
        java.awt.Component component62 = buttonPanel55.add("[32,52]", (java.awt.Component) buttonPanel59);
        java.awt.Graphics graphics63 = null;
        buttonPanel55.update(graphics63);
        org.jpacman.framework.view.BoardView boardView65 = null;
        org.jpacman.framework.view.Animator animator66 = new org.jpacman.framework.view.Animator(boardView65);
        buttonPanel54.add((java.awt.Component) buttonPanel55, (java.lang.Object) animator66);
        java.awt.event.ComponentListener[] componentListenerArray68 = buttonPanel54.getComponentListeners();
        buttonPanel54.setEnabled(true);
        java.awt.event.ContainerListener containerListener71 = null;
        buttonPanel54.removeContainerListener(containerListener71);
        java.awt.LayoutManager layoutManager73 = buttonPanel54.getLayout();
        mainUI53.setLayout(layoutManager73);
        org.jpacman.framework.ui.ButtonPanel buttonPanel75 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior76 = buttonPanel75.getBaselineResizeBehavior();
        int int77 = buttonPanel75.getWidth();
        float float78 = buttonPanel75.getAlignmentY();
        java.awt.ImageCapabilities imageCapabilities81 = null;
        java.awt.image.VolatileImage volatileImage82 = buttonPanel75.createVolatileImage((int) 'a', (int) (byte) 10, imageCapabilities81);
        java.awt.LayoutManager layoutManager83 = null;
        buttonPanel75.setLayout(layoutManager83);
        java.awt.ComponentOrientation componentOrientation85 = buttonPanel75.getComponentOrientation();
        mainUI53.applyComponentOrientation(componentOrientation85);
        buttonPanel43.setComponentOrientation(componentOrientation85);
        buttonPanel34.setComponentOrientation(componentOrientation85);
        try {
            mainUI0.add((java.awt.Component) buttonPanel21, (java.lang.Object) buttonPanel34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cannot add to layout: constraint must be a string (or null)");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(windowStateListenerArray2);
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "PanelUI" + "'", str10.equals("PanelUI"));
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior12 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior12.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(containerListenerArray16);
        org.junit.Assert.assertNotNull(rectangle18);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertNotNull(component28);
        org.junit.Assert.assertNotNull(component33);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior35 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior35.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.5f + "'", float37 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.5f + "'", float39 == 0.5f);
        org.junit.Assert.assertNotNull(actionMap42);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior44 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior44.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.5f + "'", float46 == 0.5f);
        org.junit.Assert.assertNull(volatileImage50);
        org.junit.Assert.assertNotNull(component62);
        org.junit.Assert.assertNotNull(componentListenerArray68);
        org.junit.Assert.assertNotNull(layoutManager73);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior76 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior76.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + float78 + "' != '" + 0.5f + "'", float78 == 0.5f);
        org.junit.Assert.assertNull(volatileImage82);
        org.junit.Assert.assertNotNull(componentOrientation85);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        int int2 = player0.getPoints();
        player0.resurrect();
        org.jpacman.framework.model.Tile tile6 = new org.jpacman.framework.model.Tile((int) ' ', (int) '4');
        java.lang.String str7 = tile6.toString();
        java.lang.String str8 = tile6.toString();
        player0.occupy(tile6);
        int int10 = tile6.getY();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[32,52]" + "'", str7.equals("[32,52]"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[32,52]" + "'", str8.equals("[32,52]"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        java.awt.Graphics graphics8 = null;
        buttonPanel0.update(graphics8);
        java.awt.event.MouseEvent mouseEvent10 = null;
        java.awt.Point point11 = buttonPanel0.getPopupLocation(mouseEvent10);
        java.awt.Image image14 = buttonPanel0.createImage(128, (int) 'a');
        java.awt.event.MouseListener mouseListener15 = null;
        buttonPanel0.removeMouseListener(mouseListener15);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNull(point11);
        org.junit.Assert.assertNull(image14);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory1 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game2 = defaultGameFactory1.makeGame();
        level0.setFactory((org.jpacman.framework.factory.IGameFactory) defaultGameFactory1);
        org.jpacman.framework.model.Food food4 = defaultGameFactory1.makeFood();
        org.jpacman.framework.model.Ghost ghost5 = defaultGameFactory1.makeGhost();
        org.jpacman.framework.model.Tile tile6 = ghost5.getTile();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = ghost5.getSpriteType();
        org.junit.Assert.assertNotNull(game2);
        org.junit.Assert.assertNotNull(food4);
        org.junit.Assert.assertNotNull(ghost5);
        org.junit.Assert.assertNull(tile6);
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        java.awt.Graphics graphics2 = null;
        mainUI0.paint(graphics2);
        java.awt.MenuBar menuBar4 = null;
        mainUI0.setMenuBar(menuBar4);
        mainUI0.setEnabled(false);
        java.lang.String str8 = mainUI0.toString();
        mainUI0.setAutoRequestFocus(true);
        mainUI0.setAlwaysOnTop(false);
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.jpacman.framework.ui.MainUI[frame6,0,23,0x0,invalid,hidden,disabled,layout=java.awt.BorderLayout,title=,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str8.equals("org.jpacman.framework.ui.MainUI[frame6,0,23,0x0,invalid,hidden,disabled,layout=java.awt.BorderLayout,title=,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isFocusable();
        java.awt.MenuComponent menuComponent9 = null;
        buttonPanel4.remove(menuComponent9);
        buttonPanel4.enable();
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics13 = null;
        buttonPanel12.printComponents(graphics13);
        org.jpacman.framework.ui.ButtonPanel buttonPanel16 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics17 = null;
        buttonPanel16.printComponents(graphics17);
        java.awt.Component component19 = buttonPanel12.add("[32,52]", (java.awt.Component) buttonPanel16);
        java.awt.Graphics graphics20 = null;
        buttonPanel12.update(graphics20);
        boolean boolean22 = buttonPanel12.requestFocusInWindow();
        boolean boolean23 = buttonPanel4.isAncestorOf((java.awt.Component) buttonPanel12);
        java.awt.Event event24 = null;
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction25 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction25.notifyObservers();
        org.jpacman.framework.view.BoardView boardView27 = null;
        org.jpacman.framework.view.Animator animator28 = new org.jpacman.framework.view.Animator(boardView27);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction29 = pacmanInteraction25.controlling((org.jpacman.framework.controller.IController) animator28);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction30 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction30.notifyObservers();
        org.jpacman.framework.view.BoardView boardView32 = null;
        org.jpacman.framework.view.Animator animator33 = new org.jpacman.framework.view.Animator(boardView32);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction34 = pacmanInteraction30.controlling((org.jpacman.framework.controller.IController) animator33);
        pacmanInteraction29.deleteObserver((java.util.Observer) pacmanInteraction30);
        pacmanInteraction30.up();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction37 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction37.notifyObservers();
        org.jpacman.framework.view.BoardView boardView39 = null;
        org.jpacman.framework.view.Animator animator40 = new org.jpacman.framework.view.Animator(boardView39);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction41 = pacmanInteraction37.controlling((org.jpacman.framework.controller.IController) animator40);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction42 = pacmanInteraction30.controlling((org.jpacman.framework.controller.IController) animator40);
        boolean boolean43 = buttonPanel12.gotFocus(event24, (java.lang.Object) animator40);
        buttonPanel12.firePropertyChange("", (long) 13, (long) 'a');
        buttonPanel12.resetKeyboardActions();
        buttonPanel12.firePropertyChange("org.jpacman.framework.ui.MainUI[frame1,0,23,0x0,invalid,hidden,disabled,layout=java.awt.BorderLayout,title=,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (int) '4', (int) (short) -1);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(component19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(pacmanInteraction29);
        org.junit.Assert.assertNotNull(pacmanInteraction34);
        org.junit.Assert.assertNotNull(pacmanInteraction41);
        org.junit.Assert.assertNotNull(pacmanInteraction42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        pacmanInteraction0.start();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction6 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction6.notifyObservers();
        org.jpacman.framework.view.BoardView boardView8 = null;
        org.jpacman.framework.view.Animator animator9 = new org.jpacman.framework.view.Animator(boardView8);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction10 = pacmanInteraction6.controlling((org.jpacman.framework.controller.IController) animator9);
        pacmanInteraction0.addObserver((java.util.Observer) pacmanInteraction6);
        pacmanInteraction0.deleteObservers();
        pacmanInteraction0.deleteObservers();
        try {
            pacmanInteraction0.up();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pacmanInteraction4);
        org.junit.Assert.assertNotNull(pacmanInteraction10);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        org.jpacman.framework.model.IGameInteractor iGameInteractor1 = level0.parseMap();
        java.lang.String str2 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor3 = level0.parseMap();
        org.jpacman.framework.model.IGameInteractor iGameInteractor4 = level0.parseMap();
        org.junit.Assert.assertNotNull(iGameInteractor1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "board.txt" + "'", str2.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor3);
        org.junit.Assert.assertNotNull(iGameInteractor4);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        boolean boolean2 = mainUI0.isResizable();
        java.awt.Graphics graphics3 = null;
        mainUI0.paintAll(graphics3);
        java.awt.im.InputContext inputContext5 = mainUI0.getInputContext();
        java.awt.event.WindowStateListener windowStateListener6 = null;
        mainUI0.removeWindowStateListener(windowStateListener6);
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(inputContext5);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isFocusable();
        java.awt.MenuComponent menuComponent9 = null;
        buttonPanel4.remove(menuComponent9);
        buttonPanel4.enable();
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics13 = null;
        buttonPanel12.printComponents(graphics13);
        org.jpacman.framework.ui.ButtonPanel buttonPanel16 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics17 = null;
        buttonPanel16.printComponents(graphics17);
        java.awt.Component component19 = buttonPanel12.add("[32,52]", (java.awt.Component) buttonPanel16);
        java.awt.Graphics graphics20 = null;
        buttonPanel12.update(graphics20);
        boolean boolean22 = buttonPanel12.requestFocusInWindow();
        boolean boolean23 = buttonPanel4.isAncestorOf((java.awt.Component) buttonPanel12);
        java.awt.Event event24 = null;
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction25 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction25.notifyObservers();
        org.jpacman.framework.view.BoardView boardView27 = null;
        org.jpacman.framework.view.Animator animator28 = new org.jpacman.framework.view.Animator(boardView27);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction29 = pacmanInteraction25.controlling((org.jpacman.framework.controller.IController) animator28);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction30 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction30.notifyObservers();
        org.jpacman.framework.view.BoardView boardView32 = null;
        org.jpacman.framework.view.Animator animator33 = new org.jpacman.framework.view.Animator(boardView32);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction34 = pacmanInteraction30.controlling((org.jpacman.framework.controller.IController) animator33);
        pacmanInteraction29.deleteObserver((java.util.Observer) pacmanInteraction30);
        pacmanInteraction30.up();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction37 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction37.notifyObservers();
        org.jpacman.framework.view.BoardView boardView39 = null;
        org.jpacman.framework.view.Animator animator40 = new org.jpacman.framework.view.Animator(boardView39);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction41 = pacmanInteraction37.controlling((org.jpacman.framework.controller.IController) animator40);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction42 = pacmanInteraction30.controlling((org.jpacman.framework.controller.IController) animator40);
        boolean boolean43 = buttonPanel12.gotFocus(event24, (java.lang.Object) animator40);
        buttonPanel12.firePropertyChange("", (long) 13, (long) 'a');
        javax.accessibility.AccessibleContext accessibleContext48 = buttonPanel12.getAccessibleContext();
        java.awt.Dimension dimension49 = buttonPanel12.getMaximumSize();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(component19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(pacmanInteraction29);
        org.junit.Assert.assertNotNull(pacmanInteraction34);
        org.junit.Assert.assertNotNull(pacmanInteraction41);
        org.junit.Assert.assertNotNull(pacmanInteraction42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(accessibleContext48);
        org.junit.Assert.assertNotNull(dimension49);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        boolean boolean1 = mainUI0.isFocused();
        javax.swing.TransferHandler transferHandler2 = null;
        mainUI0.setTransferHandler(transferHandler2);
        java.awt.Graphics graphics4 = mainUI0.getGraphics();
        java.lang.String str5 = mainUI0.getTitle();
        boolean boolean6 = mainUI0.isAlwaysOnTopSupported();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graphics4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        boolean boolean4 = buttonPanel0.requestFocus(false);
        boolean boolean5 = buttonPanel0.isVisible();
        java.awt.event.MouseListener[] mouseListenerArray6 = buttonPanel0.getMouseListeners();
        int int7 = buttonPanel0.getHeight();
        buttonPanel0.setEnabled(true);
        javax.swing.InputVerifier inputVerifier10 = buttonPanel0.getInputVerifier();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction11 = new org.jpacman.framework.ui.PacmanInteraction();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction12 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction12.notifyObservers();
        org.jpacman.framework.view.BoardView boardView14 = null;
        org.jpacman.framework.view.Animator animator15 = new org.jpacman.framework.view.Animator(boardView14);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction16 = pacmanInteraction12.controlling((org.jpacman.framework.controller.IController) animator15);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction17 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction17.notifyObservers();
        org.jpacman.framework.view.BoardView boardView19 = null;
        org.jpacman.framework.view.Animator animator20 = new org.jpacman.framework.view.Animator(boardView19);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction21 = pacmanInteraction17.controlling((org.jpacman.framework.controller.IController) animator20);
        pacmanInteraction16.deleteObserver((java.util.Observer) pacmanInteraction17);
        pacmanInteraction11.deleteObserver((java.util.Observer) pacmanInteraction17);
        pacmanInteraction11.deleteObservers();
        boolean boolean25 = pacmanInteraction11.hasChanged();
        org.jpacman.framework.ui.PacmanInteraction.MatchState matchState26 = pacmanInteraction11.getCurrentState();
        org.jpacman.framework.ui.ButtonPanel buttonPanel27 = buttonPanel0.withInteractor(pacmanInteraction11);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction28 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction28.notifyObservers();
        org.jpacman.framework.view.BoardView boardView30 = null;
        org.jpacman.framework.view.Animator animator31 = new org.jpacman.framework.view.Animator(boardView30);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction32 = pacmanInteraction28.controlling((org.jpacman.framework.controller.IController) animator31);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction33 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction33.notifyObservers();
        org.jpacman.framework.view.BoardView boardView35 = null;
        org.jpacman.framework.view.Animator animator36 = new org.jpacman.framework.view.Animator(boardView35);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction37 = pacmanInteraction33.controlling((org.jpacman.framework.controller.IController) animator36);
        pacmanInteraction32.deleteObserver((java.util.Observer) pacmanInteraction33);
        org.jpacman.framework.ui.MainUI mainUI39 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray40 = mainUI39.getWindowStateListeners();
        java.awt.Graphics graphics41 = null;
        mainUI39.paint(graphics41);
        java.awt.MenuBar menuBar43 = null;
        mainUI39.setMenuBar(menuBar43);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction45 = pacmanInteraction32.withDisposable((org.jpacman.framework.ui.IDisposable) mainUI39);
        java.awt.Dialog.ModalExclusionType modalExclusionType46 = null;
        mainUI39.setModalExclusionType(modalExclusionType46);
        java.awt.Event event48 = null;
        boolean boolean51 = mainUI39.mouseEnter(event48, (int) (short) 0, (int) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        mainUI39.addPropertyChangeListener(propertyChangeListener52);
        java.awt.ComponentOrientation componentOrientation54 = mainUI39.getComponentOrientation();
        buttonPanel27.applyComponentOrientation(componentOrientation54);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(mouseListenerArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(inputVerifier10);
        org.junit.Assert.assertNotNull(pacmanInteraction16);
        org.junit.Assert.assertNotNull(pacmanInteraction21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + matchState26 + "' != '" + org.jpacman.framework.ui.PacmanInteraction.MatchState.PAUSING + "'", matchState26.equals(org.jpacman.framework.ui.PacmanInteraction.MatchState.PAUSING));
        org.junit.Assert.assertNotNull(buttonPanel27);
        org.junit.Assert.assertNotNull(pacmanInteraction32);
        org.junit.Assert.assertNotNull(pacmanInteraction37);
        org.junit.Assert.assertNotNull(windowStateListenerArray40);
        org.junit.Assert.assertNotNull(pacmanInteraction45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(componentOrientation54);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        buttonPanel0.addNotify();
        float float5 = buttonPanel0.getAlignmentX();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isRequestFocusEnabled();
        boolean boolean9 = buttonPanel4.isEnabled();
        buttonPanel4.setDebugGraphicsOptions((int) (byte) -1);
        float float12 = buttonPanel4.getAlignmentY();
        javax.swing.JPopupMenu jPopupMenu13 = null;
        buttonPanel4.setComponentPopupMenu(jPopupMenu13);
        java.io.PrintWriter printWriter15 = null;
        try {
            buttonPanel4.list(printWriter15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction5.notifyObservers();
        org.jpacman.framework.view.BoardView boardView7 = null;
        org.jpacman.framework.view.Animator animator8 = new org.jpacman.framework.view.Animator(boardView7);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction9 = pacmanInteraction5.controlling((org.jpacman.framework.controller.IController) animator8);
        pacmanInteraction4.deleteObserver((java.util.Observer) pacmanInteraction5);
        org.jpacman.framework.ui.MainUI mainUI11 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray12 = mainUI11.getWindowStateListeners();
        java.awt.Graphics graphics13 = null;
        mainUI11.paint(graphics13);
        java.awt.MenuBar menuBar15 = null;
        mainUI11.setMenuBar(menuBar15);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction17 = pacmanInteraction4.withDisposable((org.jpacman.framework.ui.IDisposable) mainUI11);
        java.awt.Dialog.ModalExclusionType modalExclusionType18 = null;
        mainUI11.setModalExclusionType(modalExclusionType18);
        java.awt.image.BufferStrategy bufferStrategy20 = mainUI11.getBufferStrategy();
        mainUI11.setExtendedState((int) '.');
        java.awt.event.WindowListener windowListener23 = null;
        mainUI11.removeWindowListener(windowListener23);
        java.awt.event.WindowStateListener[] windowStateListenerArray25 = mainUI11.getWindowStateListeners();
        org.junit.Assert.assertNotNull(pacmanInteraction4);
        org.junit.Assert.assertNotNull(pacmanInteraction9);
        org.junit.Assert.assertNotNull(windowStateListenerArray12);
        org.junit.Assert.assertNotNull(pacmanInteraction17);
        org.junit.Assert.assertNull(bufferStrategy20);
        org.junit.Assert.assertNotNull(windowStateListenerArray25);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        int int8 = buttonPanel0.countComponents();
        boolean boolean9 = buttonPanel0.requestDefaultFocus();
        org.jpacman.framework.ui.ButtonPanel buttonPanel10 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics11 = null;
        buttonPanel10.printComponents(graphics11);
        org.jpacman.framework.ui.ButtonPanel buttonPanel14 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics15 = null;
        buttonPanel14.printComponents(graphics15);
        java.awt.Component component17 = buttonPanel10.add("[32,52]", (java.awt.Component) buttonPanel14);
        java.awt.Graphics graphics18 = null;
        buttonPanel10.update(graphics18);
        org.jpacman.framework.ui.ButtonPanel buttonPanel20 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel21 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics22 = null;
        buttonPanel21.printComponents(graphics22);
        org.jpacman.framework.ui.ButtonPanel buttonPanel25 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics26 = null;
        buttonPanel25.printComponents(graphics26);
        java.awt.Component component28 = buttonPanel21.add("[32,52]", (java.awt.Component) buttonPanel25);
        java.awt.Graphics graphics29 = null;
        buttonPanel21.update(graphics29);
        org.jpacman.framework.view.BoardView boardView31 = null;
        org.jpacman.framework.view.Animator animator32 = new org.jpacman.framework.view.Animator(boardView31);
        buttonPanel20.add((java.awt.Component) buttonPanel21, (java.lang.Object) animator32);
        java.awt.event.ComponentListener[] componentListenerArray34 = buttonPanel20.getComponentListeners();
        buttonPanel20.setEnabled(true);
        java.awt.Dimension dimension37 = buttonPanel20.getMinimumSize();
        buttonPanel10.setMinimumSize(dimension37);
        buttonPanel0.setMaximumSize(dimension37);
        boolean boolean40 = buttonPanel0.isValid();
        int int41 = buttonPanel0.getWidth();
        boolean boolean42 = buttonPanel0.isValidateRoot();
        int int43 = buttonPanel0.getWidth();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(component17);
        org.junit.Assert.assertNotNull(component28);
        org.junit.Assert.assertNotNull(componentListenerArray34);
        org.junit.Assert.assertNotNull(dimension37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        int int14 = buttonPanel0.getDebugGraphicsOptions();
        java.awt.event.ContainerListener[] containerListenerArray15 = buttonPanel0.getContainerListeners();
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        buttonPanel0.addInputMethodListener(inputMethodListener16);
        int int18 = buttonPanel0.getWidth();
        java.awt.Container container19 = buttonPanel0.getTopLevelAncestor();
        try {
            boolean boolean20 = container19.isBackgroundSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(containerListenerArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(container19);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isFocusable();
        java.awt.MenuComponent menuComponent9 = null;
        buttonPanel4.remove(menuComponent9);
        buttonPanel4.enable();
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics13 = null;
        buttonPanel12.printComponents(graphics13);
        org.jpacman.framework.ui.ButtonPanel buttonPanel16 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics17 = null;
        buttonPanel16.printComponents(graphics17);
        java.awt.Component component19 = buttonPanel12.add("[32,52]", (java.awt.Component) buttonPanel16);
        java.awt.Graphics graphics20 = null;
        buttonPanel12.update(graphics20);
        boolean boolean22 = buttonPanel12.requestFocusInWindow();
        boolean boolean23 = buttonPanel4.isAncestorOf((java.awt.Component) buttonPanel12);
        java.awt.Event event24 = null;
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction25 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction25.notifyObservers();
        org.jpacman.framework.view.BoardView boardView27 = null;
        org.jpacman.framework.view.Animator animator28 = new org.jpacman.framework.view.Animator(boardView27);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction29 = pacmanInteraction25.controlling((org.jpacman.framework.controller.IController) animator28);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction30 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction30.notifyObservers();
        org.jpacman.framework.view.BoardView boardView32 = null;
        org.jpacman.framework.view.Animator animator33 = new org.jpacman.framework.view.Animator(boardView32);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction34 = pacmanInteraction30.controlling((org.jpacman.framework.controller.IController) animator33);
        pacmanInteraction29.deleteObserver((java.util.Observer) pacmanInteraction30);
        pacmanInteraction30.up();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction37 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction37.notifyObservers();
        org.jpacman.framework.view.BoardView boardView39 = null;
        org.jpacman.framework.view.Animator animator40 = new org.jpacman.framework.view.Animator(boardView39);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction41 = pacmanInteraction37.controlling((org.jpacman.framework.controller.IController) animator40);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction42 = pacmanInteraction30.controlling((org.jpacman.framework.controller.IController) animator40);
        boolean boolean43 = buttonPanel12.gotFocus(event24, (java.lang.Object) animator40);
        java.awt.event.MouseEvent mouseEvent44 = null;
        java.lang.String str45 = buttonPanel12.getToolTipText(mouseEvent44);
        boolean boolean46 = buttonPanel12.isFocusTraversable();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(component19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(pacmanInteraction29);
        org.junit.Assert.assertNotNull(pacmanInteraction34);
        org.junit.Assert.assertNotNull(pacmanInteraction41);
        org.junit.Assert.assertNotNull(pacmanInteraction42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isFocusable();
        java.awt.MenuComponent menuComponent9 = null;
        buttonPanel4.remove(menuComponent9);
        buttonPanel4.enable();
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics13 = null;
        buttonPanel12.printComponents(graphics13);
        org.jpacman.framework.ui.ButtonPanel buttonPanel16 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics17 = null;
        buttonPanel16.printComponents(graphics17);
        java.awt.Component component19 = buttonPanel12.add("[32,52]", (java.awt.Component) buttonPanel16);
        java.awt.Graphics graphics20 = null;
        buttonPanel12.update(graphics20);
        boolean boolean22 = buttonPanel12.requestFocusInWindow();
        boolean boolean23 = buttonPanel4.isAncestorOf((java.awt.Component) buttonPanel12);
        org.jpacman.framework.model.Game game25 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList26 = game25.getGhosts();
        boolean boolean27 = game25.won();
        org.jpacman.framework.ui.ButtonPanel buttonPanel28 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics29 = null;
        buttonPanel28.printComponents(graphics29);
        org.jpacman.framework.ui.ButtonPanel buttonPanel32 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics33 = null;
        buttonPanel32.printComponents(graphics33);
        java.awt.Component component35 = buttonPanel28.add("[32,52]", (java.awt.Component) buttonPanel32);
        boolean boolean36 = buttonPanel32.isFocusable();
        java.awt.MenuComponent menuComponent37 = null;
        buttonPanel32.remove(menuComponent37);
        buttonPanel32.enable();
        game25.attach((java.util.Observer) buttonPanel32);
        java.awt.Component component41 = buttonPanel12.add("org.jpacman.framework.ui.MainUI[frame0,0,23,0x0,invalid,hidden,disabled,layout=java.awt.BorderLayout,title=,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (java.awt.Component) buttonPanel32);
        org.jpacman.framework.ui.MainUI mainUI42 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray43 = mainUI42.getWindowStateListeners();
        boolean boolean44 = mainUI42.isResizable();
        java.awt.Dimension dimension45 = mainUI42.getPreferredSize();
        java.awt.Dimension dimension46 = buttonPanel12.getSize(dimension45);
        int int47 = buttonPanel12.getY();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(component19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(ghostList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(component35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(component41);
        org.junit.Assert.assertNotNull(windowStateListenerArray43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(dimension45);
        org.junit.Assert.assertNotNull(dimension46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.lang.String str14 = buttonPanel1.toString();
        java.awt.Event event15 = null;
        boolean boolean17 = buttonPanel1.lostFocus(event15, (java.lang.Object) (short) 100);
        java.awt.dnd.DropTarget dropTarget18 = buttonPanel1.getDropTarget();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior19 = buttonPanel1.getBaselineResizeBehavior();
        buttonPanel1.enable(true);
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "org.jpacman.framework.ui.ButtonPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str14.equals("org.jpacman.framework.ui.ButtonPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(dropTarget18);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior19 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior19.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        boolean boolean2 = mainUI0.isResizable();
        java.awt.Dimension dimension3 = mainUI0.getPreferredSize();
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior5 = buttonPanel4.getBaselineResizeBehavior();
        int int6 = buttonPanel4.getWidth();
        float float7 = buttonPanel4.getAlignmentY();
        boolean boolean8 = buttonPanel4.hasFocus();
        float float9 = buttonPanel4.getAlignmentY();
        java.awt.Graphics graphics10 = null;
        buttonPanel4.update(graphics10);
        buttonPanel4.reshape(8, 32, 64, (int) '.');
        java.awt.Color color17 = buttonPanel4.getForeground();
        mainUI0.setBackground(color17);
        java.awt.image.ColorModel colorModel19 = mainUI0.getColorModel();
        mainUI0.setBounds((int) '4', 6, 16, (int) (short) -1);
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior5 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior5.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(colorModel19);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isFocusable();
        java.awt.MenuComponent menuComponent9 = null;
        buttonPanel4.remove(menuComponent9);
        buttonPanel4.enable();
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics13 = null;
        buttonPanel12.printComponents(graphics13);
        org.jpacman.framework.ui.ButtonPanel buttonPanel16 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics17 = null;
        buttonPanel16.printComponents(graphics17);
        java.awt.Component component19 = buttonPanel12.add("[32,52]", (java.awt.Component) buttonPanel16);
        java.awt.Graphics graphics20 = null;
        buttonPanel12.update(graphics20);
        boolean boolean22 = buttonPanel12.requestFocusInWindow();
        boolean boolean23 = buttonPanel4.isAncestorOf((java.awt.Component) buttonPanel12);
        java.awt.Event event24 = null;
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction25 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction25.notifyObservers();
        org.jpacman.framework.view.BoardView boardView27 = null;
        org.jpacman.framework.view.Animator animator28 = new org.jpacman.framework.view.Animator(boardView27);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction29 = pacmanInteraction25.controlling((org.jpacman.framework.controller.IController) animator28);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction30 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction30.notifyObservers();
        org.jpacman.framework.view.BoardView boardView32 = null;
        org.jpacman.framework.view.Animator animator33 = new org.jpacman.framework.view.Animator(boardView32);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction34 = pacmanInteraction30.controlling((org.jpacman.framework.controller.IController) animator33);
        pacmanInteraction29.deleteObserver((java.util.Observer) pacmanInteraction30);
        pacmanInteraction30.up();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction37 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction37.notifyObservers();
        org.jpacman.framework.view.BoardView boardView39 = null;
        org.jpacman.framework.view.Animator animator40 = new org.jpacman.framework.view.Animator(boardView39);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction41 = pacmanInteraction37.controlling((org.jpacman.framework.controller.IController) animator40);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction42 = pacmanInteraction30.controlling((org.jpacman.framework.controller.IController) animator40);
        boolean boolean43 = buttonPanel12.gotFocus(event24, (java.lang.Object) animator40);
        try {
            animator40.doTick();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(component19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(pacmanInteraction29);
        org.junit.Assert.assertNotNull(pacmanInteraction34);
        org.junit.Assert.assertNotNull(pacmanInteraction41);
        org.junit.Assert.assertNotNull(pacmanInteraction42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        boolean boolean4 = buttonPanel0.hasFocus();
        float float5 = buttonPanel0.getAlignmentY();
        java.awt.Graphics graphics6 = null;
        buttonPanel0.update(graphics6);
        boolean boolean8 = buttonPanel0.isOpaque();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        int int14 = buttonPanel0.getDebugGraphicsOptions();
        java.awt.event.ContainerListener[] containerListenerArray15 = buttonPanel0.getContainerListeners();
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        buttonPanel0.addInputMethodListener(inputMethodListener16);
        boolean boolean20 = buttonPanel0.inside(6, 0);
        float float21 = buttonPanel0.getAlignmentY();
        java.io.PrintStream printStream22 = null;
        try {
            buttonPanel0.list(printStream22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(containerListenerArray15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        int int14 = buttonPanel0.getDebugGraphicsOptions();
        java.awt.Event event15 = null;
        boolean boolean18 = buttonPanel0.mouseUp(event15, 7, 40);
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics7 = null;
        buttonPanel6.printComponents(graphics7);
        java.awt.Dimension dimension9 = buttonPanel6.minimumSize();
        buttonPanel2.resize(dimension9);
        buttonPanel2.setFocusCycleRoot(false);
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertNotNull(dimension9);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isRequestFocusEnabled();
        boolean boolean9 = buttonPanel4.isValid();
        int int10 = buttonPanel4.getHeight();
        java.awt.Dimension dimension11 = buttonPanel4.getPreferredSize();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dimension11);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        boolean boolean4 = buttonPanel0.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray5 = buttonPanel0.getContainerListeners();
        javax.swing.InputVerifier inputVerifier6 = null;
        buttonPanel0.setInputVerifier(inputVerifier6);
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray8 = buttonPanel0.getMouseWheelListeners();
        int int9 = buttonPanel0.getDebugGraphicsOptions();
        org.jpacman.framework.ui.ButtonPanel buttonPanel10 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel11 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics12 = null;
        buttonPanel11.printComponents(graphics12);
        org.jpacman.framework.ui.ButtonPanel buttonPanel15 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics16 = null;
        buttonPanel15.printComponents(graphics16);
        java.awt.Component component18 = buttonPanel11.add("[32,52]", (java.awt.Component) buttonPanel15);
        java.awt.Graphics graphics19 = null;
        buttonPanel11.update(graphics19);
        org.jpacman.framework.view.BoardView boardView21 = null;
        org.jpacman.framework.view.Animator animator22 = new org.jpacman.framework.view.Animator(boardView21);
        buttonPanel10.add((java.awt.Component) buttonPanel11, (java.lang.Object) animator22);
        buttonPanel10.setFocusTraversalKeysEnabled(false);
        java.awt.dnd.DropTarget dropTarget26 = buttonPanel10.getDropTarget();
        javax.swing.ActionMap actionMap27 = buttonPanel10.getActionMap();
        buttonPanel0.setActionMap(actionMap27);
        boolean boolean29 = buttonPanel0.isDoubleBuffered();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(containerListenerArray5);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(component18);
        org.junit.Assert.assertNull(dropTarget26);
        org.junit.Assert.assertNotNull(actionMap27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        int int14 = buttonPanel0.getDebugGraphicsOptions();
        java.awt.event.ContainerListener[] containerListenerArray15 = buttonPanel0.getContainerListeners();
        javax.swing.KeyStroke[] keyStrokeArray16 = buttonPanel0.getRegisteredKeyStrokes();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray18 = buttonPanel0.getPropertyChangeListeners("");
        org.jpacman.framework.ui.ButtonPanel buttonPanel19 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics20 = null;
        buttonPanel19.printComponents(graphics20);
        org.jpacman.framework.ui.ButtonPanel buttonPanel23 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics24 = null;
        buttonPanel23.printComponents(graphics24);
        java.awt.Component component26 = buttonPanel19.add("[32,52]", (java.awt.Component) buttonPanel23);
        java.awt.Dimension dimension27 = buttonPanel19.size();
        buttonPanel0.setMaximumSize(dimension27);
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(containerListenerArray15);
        org.junit.Assert.assertNotNull(keyStrokeArray16);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray18);
        org.junit.Assert.assertNotNull(component26);
        org.junit.Assert.assertNotNull(dimension27);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        boolean boolean4 = buttonPanel0.hasFocus();
        float float5 = buttonPanel0.getAlignmentY();
        java.awt.Graphics graphics6 = null;
        buttonPanel0.update(graphics6);
        buttonPanel0.reshape(8, 32, 64, (int) '.');
        boolean boolean13 = buttonPanel0.isPreferredSizeSet();
        boolean boolean14 = buttonPanel0.isCursorSet();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        boolean boolean4 = buttonPanel0.requestFocus(false);
        boolean boolean5 = buttonPanel0.isVisible();
        java.awt.event.MouseListener[] mouseListenerArray6 = buttonPanel0.getMouseListeners();
        int int7 = buttonPanel0.getHeight();
        java.awt.Rectangle rectangle8 = buttonPanel0.bounds();
        java.awt.peer.ComponentPeer componentPeer9 = buttonPanel0.getPeer();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(mouseListenerArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(rectangle8);
        org.junit.Assert.assertNull(componentPeer9);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        boolean boolean6 = buttonPanel0.isFocusOwner();
        java.lang.String str7 = buttonPanel0.getUIClassID();
        java.awt.Point point9 = buttonPanel0.getMousePosition(false);
        java.awt.Point point10 = null;
        try {
            boolean boolean11 = buttonPanel0.contains(point10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "PanelUI" + "'", str7.equals("PanelUI"));
        org.junit.Assert.assertNull(point9);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction1 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction1.notifyObservers();
        org.jpacman.framework.view.BoardView boardView3 = null;
        org.jpacman.framework.view.Animator animator4 = new org.jpacman.framework.view.Animator(boardView3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = pacmanInteraction1.controlling((org.jpacman.framework.controller.IController) animator4);
        animator4.stop();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction7 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator4);
        animator4.start();
        animator4.stop();
        org.junit.Assert.assertNotNull(pacmanInteraction5);
        org.junit.Assert.assertNotNull(pacmanInteraction7);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        boolean boolean2 = game0.won();
        org.jpacman.framework.ui.ButtonPanel buttonPanel3 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics4 = null;
        buttonPanel3.printComponents(graphics4);
        org.jpacman.framework.ui.ButtonPanel buttonPanel7 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics8 = null;
        buttonPanel7.printComponents(graphics8);
        java.awt.Component component10 = buttonPanel3.add("[32,52]", (java.awt.Component) buttonPanel7);
        boolean boolean11 = buttonPanel7.isFocusable();
        java.awt.MenuComponent menuComponent12 = null;
        buttonPanel7.remove(menuComponent12);
        buttonPanel7.enable();
        game0.attach((java.util.Observer) buttonPanel7);
        org.jpacman.framework.model.Board board18 = new org.jpacman.framework.model.Board(128, 1);
        int int19 = board18.getWidth();
        game0.setBoard(board18);
        boolean boolean23 = board18.withinBorders((int) (byte) 1, (-1));
        try {
            org.jpacman.framework.model.Sprite sprite26 = board18.spriteAt((int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 128 + "'", int19 == 128);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.jpacman.framework.ui.PointsPanel pointsPanel0 = new org.jpacman.framework.ui.PointsPanel();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction1 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction1.notifyObservers();
        org.jpacman.framework.view.BoardView boardView3 = null;
        org.jpacman.framework.view.Animator animator4 = new org.jpacman.framework.view.Animator(boardView3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = pacmanInteraction1.controlling((org.jpacman.framework.controller.IController) animator4);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction6 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction6.notifyObservers();
        org.jpacman.framework.view.BoardView boardView8 = null;
        org.jpacman.framework.view.Animator animator9 = new org.jpacman.framework.view.Animator(boardView8);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction10 = pacmanInteraction6.controlling((org.jpacman.framework.controller.IController) animator9);
        pacmanInteraction5.deleteObserver((java.util.Observer) pacmanInteraction6);
        pacmanInteraction6.up();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction13 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction13.notifyObservers();
        org.jpacman.framework.view.BoardView boardView15 = null;
        org.jpacman.framework.view.Animator animator16 = new org.jpacman.framework.view.Animator(boardView15);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction17 = pacmanInteraction13.controlling((org.jpacman.framework.controller.IController) animator16);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction18 = pacmanInteraction6.controlling((org.jpacman.framework.controller.IController) animator16);
        pacmanInteraction6.stop();
        pacmanInteraction6.notifyObservers();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction21 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction21.notifyObservers();
        org.jpacman.framework.view.BoardView boardView23 = null;
        org.jpacman.framework.view.Animator animator24 = new org.jpacman.framework.view.Animator(boardView23);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction25 = pacmanInteraction21.controlling((org.jpacman.framework.controller.IController) animator24);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction26 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction26.notifyObservers();
        org.jpacman.framework.view.BoardView boardView28 = null;
        org.jpacman.framework.view.Animator animator29 = new org.jpacman.framework.view.Animator(boardView28);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction30 = pacmanInteraction26.controlling((org.jpacman.framework.controller.IController) animator29);
        pacmanInteraction25.deleteObserver((java.util.Observer) pacmanInteraction26);
        org.jpacman.framework.ui.MainUI mainUI32 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray33 = mainUI32.getWindowStateListeners();
        java.awt.Graphics graphics34 = null;
        mainUI32.paint(graphics34);
        java.awt.MenuBar menuBar36 = null;
        mainUI32.setMenuBar(menuBar36);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction38 = pacmanInteraction25.withDisposable((org.jpacman.framework.ui.IDisposable) mainUI32);
        java.awt.Dialog.ModalExclusionType modalExclusionType39 = null;
        mainUI32.setModalExclusionType(modalExclusionType39);
        java.awt.image.BufferStrategy bufferStrategy41 = mainUI32.getBufferStrategy();
        try {
            pointsPanel0.update((java.util.Observable) pacmanInteraction6, (java.lang.Object) mainUI32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pacmanInteraction5);
        org.junit.Assert.assertNotNull(pacmanInteraction10);
        org.junit.Assert.assertNotNull(pacmanInteraction17);
        org.junit.Assert.assertNotNull(pacmanInteraction18);
        org.junit.Assert.assertNotNull(pacmanInteraction25);
        org.junit.Assert.assertNotNull(pacmanInteraction30);
        org.junit.Assert.assertNotNull(windowStateListenerArray33);
        org.junit.Assert.assertNotNull(pacmanInteraction38);
        org.junit.Assert.assertNull(bufferStrategy41);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction1 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction1.notifyObservers();
        org.jpacman.framework.view.BoardView boardView3 = null;
        org.jpacman.framework.view.Animator animator4 = new org.jpacman.framework.view.Animator(boardView3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = pacmanInteraction1.controlling((org.jpacman.framework.controller.IController) animator4);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction6 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction6.notifyObservers();
        org.jpacman.framework.view.BoardView boardView8 = null;
        org.jpacman.framework.view.Animator animator9 = new org.jpacman.framework.view.Animator(boardView8);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction10 = pacmanInteraction6.controlling((org.jpacman.framework.controller.IController) animator9);
        pacmanInteraction5.deleteObserver((java.util.Observer) pacmanInteraction6);
        pacmanInteraction6.up();
        game0.addObserver((java.util.Observer) pacmanInteraction6);
        org.jpacman.framework.model.IBoardInspector iBoardInspector14 = game0.getBoardInspector();
        org.jpacman.framework.model.Ghost ghost15 = null;
        game0.addGhost(ghost15);
        boolean boolean17 = game0.won();
        org.jpacman.framework.model.Ghost ghost18 = null;
        game0.addGhost(ghost18);
        org.junit.Assert.assertNotNull(pacmanInteraction5);
        org.junit.Assert.assertNotNull(pacmanInteraction10);
        org.junit.Assert.assertNull(iBoardInspector14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isRequestFocusEnabled();
        javax.swing.ActionMap actionMap9 = buttonPanel4.getActionMap();
        javax.swing.event.AncestorListener[] ancestorListenerArray10 = buttonPanel4.getAncestorListeners();
        java.awt.Event event11 = null;
        boolean boolean14 = buttonPanel4.mouseEnter(event11, 128, (int) (short) 1);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(actionMap9);
        org.junit.Assert.assertNotNull(ancestorListenerArray10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction5.notifyObservers();
        org.jpacman.framework.view.BoardView boardView7 = null;
        org.jpacman.framework.view.Animator animator8 = new org.jpacman.framework.view.Animator(boardView7);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction9 = pacmanInteraction5.controlling((org.jpacman.framework.controller.IController) animator8);
        pacmanInteraction4.deleteObserver((java.util.Observer) pacmanInteraction5);
        org.jpacman.framework.ui.MainUI mainUI11 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray12 = mainUI11.getWindowStateListeners();
        java.awt.Graphics graphics13 = null;
        mainUI11.paint(graphics13);
        java.awt.MenuBar menuBar15 = null;
        mainUI11.setMenuBar(menuBar15);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction17 = pacmanInteraction4.withDisposable((org.jpacman.framework.ui.IDisposable) mainUI11);
        java.awt.Dialog.ModalExclusionType modalExclusionType18 = null;
        mainUI11.setModalExclusionType(modalExclusionType18);
        java.awt.image.BufferStrategy bufferStrategy20 = mainUI11.getBufferStrategy();
        java.awt.Container container21 = mainUI11.getContentPane();
        java.awt.Window.Type type22 = null;
        try {
            mainUI11.setType(type22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(pacmanInteraction4);
        org.junit.Assert.assertNotNull(pacmanInteraction9);
        org.junit.Assert.assertNotNull(windowStateListenerArray12);
        org.junit.Assert.assertNotNull(pacmanInteraction17);
        org.junit.Assert.assertNull(bufferStrategy20);
        org.junit.Assert.assertNotNull(container21);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        buttonPanel0.setRequestFocusEnabled(true);
        java.awt.Container container5 = buttonPanel0.getParent();
        try {
            java.awt.Component component7 = container5.getComponent(5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertNull(container5);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction1 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction1.notifyObservers();
        org.jpacman.framework.view.BoardView boardView3 = null;
        org.jpacman.framework.view.Animator animator4 = new org.jpacman.framework.view.Animator(boardView3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = pacmanInteraction1.controlling((org.jpacman.framework.controller.IController) animator4);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction6 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction6.notifyObservers();
        org.jpacman.framework.view.BoardView boardView8 = null;
        org.jpacman.framework.view.Animator animator9 = new org.jpacman.framework.view.Animator(boardView8);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction10 = pacmanInteraction6.controlling((org.jpacman.framework.controller.IController) animator9);
        pacmanInteraction5.deleteObserver((java.util.Observer) pacmanInteraction6);
        pacmanInteraction6.up();
        game0.addObserver((java.util.Observer) pacmanInteraction6);
        try {
            pacmanInteraction6.exit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pacmanInteraction5);
        org.junit.Assert.assertNotNull(pacmanInteraction10);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray4 = buttonPanel0.getKeyListeners();
        boolean boolean5 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) buttonPanel0);
        java.awt.event.MouseWheelListener mouseWheelListener6 = null;
        buttonPanel0.addMouseWheelListener(mouseWheelListener6);
        java.awt.Event event8 = null;
        boolean boolean11 = buttonPanel0.mouseDrag(event8, 0, 13);
        java.awt.ImageCapabilities imageCapabilities14 = null;
        java.awt.image.VolatileImage volatileImage15 = buttonPanel0.createVolatileImage((int) (byte) 10, (int) 'P', imageCapabilities14);
        org.jpacman.framework.ui.ButtonPanel buttonPanel16 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel17 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics18 = null;
        buttonPanel17.printComponents(graphics18);
        org.jpacman.framework.ui.ButtonPanel buttonPanel21 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics22 = null;
        buttonPanel21.printComponents(graphics22);
        java.awt.Component component24 = buttonPanel17.add("[32,52]", (java.awt.Component) buttonPanel21);
        java.awt.Graphics graphics25 = null;
        buttonPanel17.update(graphics25);
        org.jpacman.framework.view.BoardView boardView27 = null;
        org.jpacman.framework.view.Animator animator28 = new org.jpacman.framework.view.Animator(boardView27);
        buttonPanel16.add((java.awt.Component) buttonPanel17, (java.lang.Object) animator28);
        java.awt.event.ComponentListener[] componentListenerArray30 = buttonPanel16.getComponentListeners();
        buttonPanel16.setEnabled(true);
        java.awt.event.ContainerListener containerListener33 = null;
        buttonPanel16.removeContainerListener(containerListener33);
        java.awt.LayoutManager layoutManager35 = buttonPanel16.getLayout();
        buttonPanel0.setLayout(layoutManager35);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(volatileImage15);
        org.junit.Assert.assertNotNull(component24);
        org.junit.Assert.assertNotNull(componentListenerArray30);
        org.junit.Assert.assertNotNull(layoutManager35);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        boolean boolean2 = mainUI0.isResizable();
        java.awt.Dimension dimension3 = mainUI0.getPreferredSize();
        java.awt.Component component4 = mainUI0.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar5 = null;
        mainUI0.setMenuBar(menuBar5);
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertNotNull(component4);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics3 = null;
        buttonPanel2.printComponents(graphics3);
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics7 = null;
        buttonPanel6.printComponents(graphics7);
        java.awt.Component component9 = buttonPanel2.add("[32,52]", (java.awt.Component) buttonPanel6);
        boolean boolean10 = buttonPanel6.isFocusable();
        java.awt.MenuComponent menuComponent11 = null;
        buttonPanel6.remove(menuComponent11);
        buttonPanel6.enable();
        org.jpacman.framework.ui.ButtonPanel buttonPanel14 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics15 = null;
        buttonPanel14.printComponents(graphics15);
        org.jpacman.framework.ui.ButtonPanel buttonPanel18 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics19 = null;
        buttonPanel18.printComponents(graphics19);
        java.awt.Component component21 = buttonPanel14.add("[32,52]", (java.awt.Component) buttonPanel18);
        java.awt.Graphics graphics22 = null;
        buttonPanel14.update(graphics22);
        boolean boolean24 = buttonPanel14.requestFocusInWindow();
        boolean boolean25 = buttonPanel6.isAncestorOf((java.awt.Component) buttonPanel14);
        java.awt.Event event26 = null;
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction27 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction27.notifyObservers();
        org.jpacman.framework.view.BoardView boardView29 = null;
        org.jpacman.framework.view.Animator animator30 = new org.jpacman.framework.view.Animator(boardView29);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction31 = pacmanInteraction27.controlling((org.jpacman.framework.controller.IController) animator30);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction32 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction32.notifyObservers();
        org.jpacman.framework.view.BoardView boardView34 = null;
        org.jpacman.framework.view.Animator animator35 = new org.jpacman.framework.view.Animator(boardView34);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction36 = pacmanInteraction32.controlling((org.jpacman.framework.controller.IController) animator35);
        pacmanInteraction31.deleteObserver((java.util.Observer) pacmanInteraction32);
        pacmanInteraction32.up();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction39 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction39.notifyObservers();
        org.jpacman.framework.view.BoardView boardView41 = null;
        org.jpacman.framework.view.Animator animator42 = new org.jpacman.framework.view.Animator(boardView41);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction43 = pacmanInteraction39.controlling((org.jpacman.framework.controller.IController) animator42);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction44 = pacmanInteraction32.controlling((org.jpacman.framework.controller.IController) animator42);
        boolean boolean45 = buttonPanel14.gotFocus(event26, (java.lang.Object) animator42);
        org.jpacman.framework.ui.MainUI mainUI46 = mainUI0.withGhostController((org.jpacman.framework.controller.IController) animator42);
        java.awt.Color color47 = mainUI0.getBackground();
        mainUI0.setFocusTraversalKeysEnabled(false);
        mainUI0.setUndecorated(false);
        java.awt.Graphics graphics52 = null;
        mainUI0.update(graphics52);
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(component21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(pacmanInteraction31);
        org.junit.Assert.assertNotNull(pacmanInteraction36);
        org.junit.Assert.assertNotNull(pacmanInteraction43);
        org.junit.Assert.assertNotNull(pacmanInteraction44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(mainUI46);
        org.junit.Assert.assertNotNull(color47);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction5.notifyObservers();
        org.jpacman.framework.view.BoardView boardView7 = null;
        org.jpacman.framework.view.Animator animator8 = new org.jpacman.framework.view.Animator(boardView7);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction9 = pacmanInteraction5.controlling((org.jpacman.framework.controller.IController) animator8);
        pacmanInteraction4.deleteObserver((java.util.Observer) pacmanInteraction5);
        pacmanInteraction4.left();
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior13 = buttonPanel12.getBaselineResizeBehavior();
        int int14 = buttonPanel12.getWidth();
        float float15 = buttonPanel12.getAlignmentY();
        javax.swing.event.AncestorListener[] ancestorListenerArray16 = buttonPanel12.getAncestorListeners();
        buttonPanel12.firePropertyChange("hi!", (short) 10, (short) -1);
        pacmanInteraction4.deleteObserver((java.util.Observer) buttonPanel12);
        org.junit.Assert.assertNotNull(pacmanInteraction4);
        org.junit.Assert.assertNotNull(pacmanInteraction9);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior13 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior13.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertNotNull(ancestorListenerArray16);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        buttonPanel2.removePropertyChangeListener("[32,52]", propertyChangeListener7);
        org.jpacman.framework.ui.ButtonPanel buttonPanel9 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior10 = buttonPanel9.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray11 = buttonPanel9.getContainerListeners();
        boolean boolean13 = buttonPanel9.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray14 = buttonPanel9.getContainerListeners();
        java.awt.image.ImageProducer imageProducer15 = null;
        java.awt.Image image16 = buttonPanel9.createImage(imageProducer15);
        org.jpacman.framework.ui.ButtonPanel buttonPanel17 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior18 = buttonPanel17.getBaselineResizeBehavior();
        int int19 = buttonPanel17.getWidth();
        float float20 = buttonPanel17.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray21 = buttonPanel17.getKeyListeners();
        int int22 = buttonPanel2.checkImage(image16, (java.awt.image.ImageObserver) buttonPanel17);
        boolean boolean23 = buttonPanel2.isDoubleBuffered();
        int int24 = buttonPanel2.getDebugGraphicsOptions();
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior10 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior10.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(containerListenerArray14);
        org.junit.Assert.assertNotNull(image16);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior18 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior18.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        buttonPanel0.removeMouseWheelListener(mouseWheelListener1);
        buttonPanel0.validate();
        java.awt.Graphics graphics4 = null;
        buttonPanel0.paintAll(graphics4);
        buttonPanel0.setLocation(1, 8);
        try {
            buttonPanel0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(128, 1);
        int int3 = board2.getWidth();
        int int4 = board2.getHeight();
        org.jpacman.framework.model.Tile tile7 = new org.jpacman.framework.model.Tile(7, (int) (byte) 0);
        int int8 = tile7.getY();
        org.jpacman.framework.model.Player player9 = new org.jpacman.framework.model.Player();
        java.lang.String str10 = player9.toString();
        org.jpacman.framework.model.Direction direction11 = player9.getDirection();
        org.jpacman.framework.model.Tile tile12 = board2.tileAtDirection(tile7, direction11);
        try {
            org.jpacman.framework.model.Tile tile15 = board2.tileAt(13, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 128 + "'", int3 == 128);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "PLAYER occupying null" + "'", str10.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + direction11 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction11.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertNotNull(tile12);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.awt.Container container14 = buttonPanel0.getFocusCycleRootAncestor();
        try {
            container14.firePropertyChange("board.txt", 'G', 'P');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNull(container14);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) '.', 128);
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) ' ', (int) '4');
        java.lang.String str6 = tile5.toString();
        int int7 = tile5.getX();
        org.jpacman.framework.model.Tile tile10 = board2.tileAtOffset(tile5, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[32,52]" + "'", str6.equals("[32,52]"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(tile10);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        buttonPanel0.setEnabled(false);
        org.jpacman.framework.ui.ButtonPanel buttonPanel8 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior9 = buttonPanel8.getBaselineResizeBehavior();
        int int10 = buttonPanel8.getWidth();
        float float11 = buttonPanel8.getAlignmentY();
        javax.swing.event.AncestorListener[] ancestorListenerArray12 = buttonPanel8.getAncestorListeners();
        buttonPanel8.validate();
        org.jpacman.framework.ui.ButtonPanel buttonPanel14 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel16 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener17 = null;
        buttonPanel16.removeMouseWheelListener(mouseWheelListener17);
        java.awt.Component component19 = buttonPanel14.add("[32,52]", (java.awt.Component) buttonPanel16);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        buttonPanel16.removePropertyChangeListener("[32,52]", propertyChangeListener21);
        org.jpacman.framework.ui.ButtonPanel buttonPanel23 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior24 = buttonPanel23.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray25 = buttonPanel23.getContainerListeners();
        boolean boolean27 = buttonPanel23.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray28 = buttonPanel23.getContainerListeners();
        java.awt.image.ImageProducer imageProducer29 = null;
        java.awt.Image image30 = buttonPanel23.createImage(imageProducer29);
        org.jpacman.framework.ui.ButtonPanel buttonPanel31 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior32 = buttonPanel31.getBaselineResizeBehavior();
        int int33 = buttonPanel31.getWidth();
        float float34 = buttonPanel31.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray35 = buttonPanel31.getKeyListeners();
        int int36 = buttonPanel16.checkImage(image30, (java.awt.image.ImageObserver) buttonPanel31);
        org.jpacman.framework.ui.ButtonPanel buttonPanel37 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel38 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics39 = null;
        buttonPanel38.printComponents(graphics39);
        org.jpacman.framework.ui.ButtonPanel buttonPanel42 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics43 = null;
        buttonPanel42.printComponents(graphics43);
        java.awt.Component component45 = buttonPanel38.add("[32,52]", (java.awt.Component) buttonPanel42);
        java.awt.Graphics graphics46 = null;
        buttonPanel38.update(graphics46);
        org.jpacman.framework.view.BoardView boardView48 = null;
        org.jpacman.framework.view.Animator animator49 = new org.jpacman.framework.view.Animator(boardView48);
        buttonPanel37.add((java.awt.Component) buttonPanel38, (java.lang.Object) animator49);
        java.awt.event.ComponentListener[] componentListenerArray51 = buttonPanel37.getComponentListeners();
        int int52 = buttonPanel8.checkImage(image30, (java.awt.image.ImageObserver) buttonPanel37);
        org.jpacman.framework.ui.ButtonPanel buttonPanel53 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel54 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics55 = null;
        buttonPanel54.printComponents(graphics55);
        org.jpacman.framework.ui.ButtonPanel buttonPanel58 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics59 = null;
        buttonPanel58.printComponents(graphics59);
        java.awt.Component component61 = buttonPanel54.add("[32,52]", (java.awt.Component) buttonPanel58);
        java.awt.Graphics graphics62 = null;
        buttonPanel54.update(graphics62);
        org.jpacman.framework.view.BoardView boardView64 = null;
        org.jpacman.framework.view.Animator animator65 = new org.jpacman.framework.view.Animator(boardView64);
        buttonPanel53.add((java.awt.Component) buttonPanel54, (java.lang.Object) animator65);
        buttonPanel54.repaint(7, 13, 4, (int) (short) 100);
        int int72 = buttonPanel54.getHeight();
        try {
            boolean boolean73 = buttonPanel0.prepareImage(image30, (java.awt.image.ImageObserver) buttonPanel54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior9 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior9.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertNotNull(ancestorListenerArray12);
        org.junit.Assert.assertNotNull(component19);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior24 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior24.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(containerListenerArray28);
        org.junit.Assert.assertNotNull(image30);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior32 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior32.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.5f + "'", float34 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(component45);
        org.junit.Assert.assertNotNull(componentListenerArray51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(component61);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        boolean boolean4 = buttonPanel0.hasFocus();
        float float5 = buttonPanel0.getAlignmentY();
        java.awt.Graphics graphics6 = null;
        buttonPanel0.update(graphics6);
        javax.swing.ActionMap actionMap8 = buttonPanel0.getActionMap();
        org.jpacman.framework.ui.ButtonPanel buttonPanel9 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior10 = buttonPanel9.getBaselineResizeBehavior();
        int int11 = buttonPanel9.getWidth();
        float float12 = buttonPanel9.getAlignmentY();
        java.awt.ImageCapabilities imageCapabilities15 = null;
        java.awt.image.VolatileImage volatileImage16 = buttonPanel9.createVolatileImage((int) 'a', (int) (byte) 10, imageCapabilities15);
        java.awt.LayoutManager layoutManager17 = null;
        buttonPanel9.setLayout(layoutManager17);
        org.jpacman.framework.ui.MainUI mainUI19 = new org.jpacman.framework.ui.MainUI();
        org.jpacman.framework.ui.ButtonPanel buttonPanel20 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel21 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics22 = null;
        buttonPanel21.printComponents(graphics22);
        org.jpacman.framework.ui.ButtonPanel buttonPanel25 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics26 = null;
        buttonPanel25.printComponents(graphics26);
        java.awt.Component component28 = buttonPanel21.add("[32,52]", (java.awt.Component) buttonPanel25);
        java.awt.Graphics graphics29 = null;
        buttonPanel21.update(graphics29);
        org.jpacman.framework.view.BoardView boardView31 = null;
        org.jpacman.framework.view.Animator animator32 = new org.jpacman.framework.view.Animator(boardView31);
        buttonPanel20.add((java.awt.Component) buttonPanel21, (java.lang.Object) animator32);
        java.awt.event.ComponentListener[] componentListenerArray34 = buttonPanel20.getComponentListeners();
        buttonPanel20.setEnabled(true);
        java.awt.event.ContainerListener containerListener37 = null;
        buttonPanel20.removeContainerListener(containerListener37);
        java.awt.LayoutManager layoutManager39 = buttonPanel20.getLayout();
        mainUI19.setLayout(layoutManager39);
        org.jpacman.framework.ui.ButtonPanel buttonPanel41 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior42 = buttonPanel41.getBaselineResizeBehavior();
        int int43 = buttonPanel41.getWidth();
        float float44 = buttonPanel41.getAlignmentY();
        java.awt.ImageCapabilities imageCapabilities47 = null;
        java.awt.image.VolatileImage volatileImage48 = buttonPanel41.createVolatileImage((int) 'a', (int) (byte) 10, imageCapabilities47);
        java.awt.LayoutManager layoutManager49 = null;
        buttonPanel41.setLayout(layoutManager49);
        java.awt.ComponentOrientation componentOrientation51 = buttonPanel41.getComponentOrientation();
        mainUI19.applyComponentOrientation(componentOrientation51);
        buttonPanel9.setComponentOrientation(componentOrientation51);
        buttonPanel0.setComponentOrientation(componentOrientation51);
        boolean boolean55 = buttonPanel0.isPreferredSizeSet();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNotNull(actionMap8);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior10 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior10.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNull(volatileImage16);
        org.junit.Assert.assertNotNull(component28);
        org.junit.Assert.assertNotNull(componentListenerArray34);
        org.junit.Assert.assertNotNull(layoutManager39);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior42 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior42.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.5f + "'", float44 == 0.5f);
        org.junit.Assert.assertNull(volatileImage48);
        org.junit.Assert.assertNotNull(componentOrientation51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        buttonPanel0.setRequestFocusEnabled(true);
        boolean boolean5 = buttonPanel0.isValidateRoot();
        java.awt.Rectangle rectangle6 = buttonPanel0.getBounds();
        java.awt.Component component9 = buttonPanel0.findComponentAt(128, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangle6);
        org.junit.Assert.assertNull(component9);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        boolean boolean2 = game0.won();
        org.jpacman.framework.ui.ButtonPanel buttonPanel3 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics4 = null;
        buttonPanel3.printComponents(graphics4);
        org.jpacman.framework.ui.ButtonPanel buttonPanel7 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics8 = null;
        buttonPanel7.printComponents(graphics8);
        java.awt.Component component10 = buttonPanel3.add("[32,52]", (java.awt.Component) buttonPanel7);
        boolean boolean11 = buttonPanel7.isFocusable();
        java.awt.MenuComponent menuComponent12 = null;
        buttonPanel7.remove(menuComponent12);
        buttonPanel7.enable();
        game0.attach((java.util.Observer) buttonPanel7);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover16 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game0);
        try {
            boolean boolean17 = game0.died();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile((int) ' ', (int) '4');
        java.lang.String str3 = tile2.toString();
        java.lang.String str4 = tile2.toString();
        org.jpacman.framework.model.Food food5 = new org.jpacman.framework.model.Food();
        boolean boolean6 = tile2.containsSprite((org.jpacman.framework.model.Sprite) food5);
        java.lang.String str7 = tile2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[32,52]" + "'", str3.equals("[32,52]"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[32,52]" + "'", str4.equals("[32,52]"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[32,52]" + "'", str7.equals("[32,52]"));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        buttonPanel0.transferFocusBackward();
        buttonPanel0.setVisible(false);
        buttonPanel0.setEnabled(false);
        org.jpacman.framework.ui.ButtonPanel buttonPanel8 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior9 = buttonPanel8.getBaselineResizeBehavior();
        int int10 = buttonPanel8.getWidth();
        float float11 = buttonPanel8.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray12 = buttonPanel8.getKeyListeners();
        boolean boolean13 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) buttonPanel8);
        buttonPanel8.updateUI();
        boolean boolean15 = buttonPanel8.isFocusTraversalPolicyProvider();
        buttonPanel0.setNextFocusableComponent((java.awt.Component) buttonPanel8);
        java.beans.VetoableChangeListener vetoableChangeListener17 = null;
        buttonPanel0.addVetoableChangeListener(vetoableChangeListener17);
        java.awt.Event event19 = null;
        boolean boolean22 = buttonPanel0.mouseEnter(event19, 6, 7);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior9 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior9.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        buttonPanel0.initialize();
        java.awt.Graphics graphics3 = null;
        try {
            buttonPanel0.printAll(graphics3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        boolean boolean4 = buttonPanel0.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray5 = buttonPanel0.getContainerListeners();
        javax.swing.InputVerifier inputVerifier6 = null;
        buttonPanel0.setInputVerifier(inputVerifier6);
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray8 = buttonPanel0.getMouseWheelListeners();
        int int9 = buttonPanel0.getDebugGraphicsOptions();
        javax.swing.InputVerifier inputVerifier10 = null;
        buttonPanel0.setInputVerifier(inputVerifier10);
        org.jpacman.framework.ui.MainUI mainUI12 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray13 = mainUI12.getWindowStateListeners();
        org.jpacman.framework.ui.ButtonPanel buttonPanel14 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics15 = null;
        buttonPanel14.printComponents(graphics15);
        org.jpacman.framework.ui.ButtonPanel buttonPanel18 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics19 = null;
        buttonPanel18.printComponents(graphics19);
        java.awt.Component component21 = buttonPanel14.add("[32,52]", (java.awt.Component) buttonPanel18);
        boolean boolean22 = buttonPanel18.isFocusable();
        java.awt.MenuComponent menuComponent23 = null;
        buttonPanel18.remove(menuComponent23);
        buttonPanel18.enable();
        org.jpacman.framework.ui.ButtonPanel buttonPanel26 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics27 = null;
        buttonPanel26.printComponents(graphics27);
        org.jpacman.framework.ui.ButtonPanel buttonPanel30 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics31 = null;
        buttonPanel30.printComponents(graphics31);
        java.awt.Component component33 = buttonPanel26.add("[32,52]", (java.awt.Component) buttonPanel30);
        java.awt.Graphics graphics34 = null;
        buttonPanel26.update(graphics34);
        boolean boolean36 = buttonPanel26.requestFocusInWindow();
        boolean boolean37 = buttonPanel18.isAncestorOf((java.awt.Component) buttonPanel26);
        java.awt.Event event38 = null;
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction39 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction39.notifyObservers();
        org.jpacman.framework.view.BoardView boardView41 = null;
        org.jpacman.framework.view.Animator animator42 = new org.jpacman.framework.view.Animator(boardView41);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction43 = pacmanInteraction39.controlling((org.jpacman.framework.controller.IController) animator42);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction44 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction44.notifyObservers();
        org.jpacman.framework.view.BoardView boardView46 = null;
        org.jpacman.framework.view.Animator animator47 = new org.jpacman.framework.view.Animator(boardView46);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction48 = pacmanInteraction44.controlling((org.jpacman.framework.controller.IController) animator47);
        pacmanInteraction43.deleteObserver((java.util.Observer) pacmanInteraction44);
        pacmanInteraction44.up();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction51 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction51.notifyObservers();
        org.jpacman.framework.view.BoardView boardView53 = null;
        org.jpacman.framework.view.Animator animator54 = new org.jpacman.framework.view.Animator(boardView53);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction55 = pacmanInteraction51.controlling((org.jpacman.framework.controller.IController) animator54);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction56 = pacmanInteraction44.controlling((org.jpacman.framework.controller.IController) animator54);
        boolean boolean57 = buttonPanel26.gotFocus(event38, (java.lang.Object) animator54);
        org.jpacman.framework.ui.MainUI mainUI58 = mainUI12.withGhostController((org.jpacman.framework.controller.IController) animator54);
        org.jpacman.framework.ui.ButtonPanel buttonPanel59 = buttonPanel0.withParent((javax.swing.JFrame) mainUI58);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(containerListenerArray5);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(windowStateListenerArray13);
        org.junit.Assert.assertNotNull(component21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(component33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(pacmanInteraction43);
        org.junit.Assert.assertNotNull(pacmanInteraction48);
        org.junit.Assert.assertNotNull(pacmanInteraction55);
        org.junit.Assert.assertNotNull(pacmanInteraction56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(mainUI58);
        org.junit.Assert.assertNotNull(buttonPanel59);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        boolean boolean4 = buttonPanel0.requestFocus(false);
        buttonPanel0.doLayout();
        buttonPanel0.setDebugGraphicsOptions((int) (byte) 1);
        buttonPanel0.list();
        java.awt.Dimension dimension9 = buttonPanel0.minimumSize();
        java.awt.Dimension dimension10 = buttonPanel0.getMaximumSize();
        boolean boolean11 = buttonPanel0.requestDefaultFocus();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        int int8 = buttonPanel0.getBaseline(8, 1);
        boolean boolean10 = buttonPanel0.requestFocus(false);
        javax.swing.ActionMap actionMap11 = buttonPanel0.getActionMap();
        buttonPanel0.show();
        java.awt.Graphics graphics13 = buttonPanel0.getGraphics();
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(actionMap11);
        org.junit.Assert.assertNull(graphics13);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        boolean boolean2 = mainUI0.isResizable();
        java.awt.Dimension dimension3 = mainUI0.getPreferredSize();
        java.awt.Container container4 = mainUI0.getFocusCycleRootAncestor();
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics7 = null;
        buttonPanel6.printComponents(graphics7);
        org.jpacman.framework.ui.ButtonPanel buttonPanel10 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics11 = null;
        buttonPanel10.printComponents(graphics11);
        java.awt.Component component13 = buttonPanel6.add("[32,52]", (java.awt.Component) buttonPanel10);
        java.awt.Graphics graphics14 = null;
        buttonPanel6.update(graphics14);
        org.jpacman.framework.view.BoardView boardView16 = null;
        org.jpacman.framework.view.Animator animator17 = new org.jpacman.framework.view.Animator(boardView16);
        buttonPanel5.add((java.awt.Component) buttonPanel6, (java.lang.Object) animator17);
        int int19 = buttonPanel5.getDebugGraphicsOptions();
        java.awt.event.ContainerListener[] containerListenerArray20 = buttonPanel5.getContainerListeners();
        java.awt.event.InputMethodListener inputMethodListener21 = null;
        buttonPanel5.addInputMethodListener(inputMethodListener21);
        boolean boolean25 = buttonPanel5.inside(6, 0);
        org.jpacman.framework.ui.MainUI mainUI26 = new org.jpacman.framework.ui.MainUI();
        boolean boolean27 = mainUI26.isFocused();
        javax.swing.TransferHandler transferHandler28 = null;
        mainUI26.setTransferHandler(transferHandler28);
        org.jpacman.framework.ui.ButtonPanel buttonPanel30 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel32 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener33 = null;
        buttonPanel32.removeMouseWheelListener(mouseWheelListener33);
        java.awt.Component component35 = buttonPanel30.add("[32,52]", (java.awt.Component) buttonPanel32);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        buttonPanel32.removePropertyChangeListener("[32,52]", propertyChangeListener37);
        org.jpacman.framework.ui.ButtonPanel buttonPanel39 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior40 = buttonPanel39.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray41 = buttonPanel39.getContainerListeners();
        boolean boolean43 = buttonPanel39.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray44 = buttonPanel39.getContainerListeners();
        java.awt.image.ImageProducer imageProducer45 = null;
        java.awt.Image image46 = buttonPanel39.createImage(imageProducer45);
        org.jpacman.framework.ui.ButtonPanel buttonPanel47 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior48 = buttonPanel47.getBaselineResizeBehavior();
        int int49 = buttonPanel47.getWidth();
        float float50 = buttonPanel47.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray51 = buttonPanel47.getKeyListeners();
        int int52 = buttonPanel32.checkImage(image46, (java.awt.image.ImageObserver) buttonPanel47);
        mainUI26.setIconImage(image46);
        org.jpacman.framework.ui.ButtonPanel buttonPanel56 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior57 = buttonPanel56.getBaselineResizeBehavior();
        int int58 = buttonPanel56.getWidth();
        float float59 = buttonPanel56.getAlignmentY();
        boolean boolean60 = buttonPanel56.hasFocus();
        float float61 = buttonPanel56.getAlignmentY();
        org.jpacman.framework.ui.ButtonPanel buttonPanel62 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior63 = buttonPanel62.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray64 = buttonPanel62.getContainerListeners();
        boolean boolean66 = buttonPanel62.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray67 = buttonPanel62.getContainerListeners();
        java.awt.Rectangle rectangle68 = null;
        java.awt.Rectangle rectangle69 = buttonPanel62.getBounds(rectangle68);
        buttonPanel56.paintImmediately(rectangle69);
        javax.swing.border.Border border71 = null;
        buttonPanel56.setBorder(border71);
        int int73 = buttonPanel5.checkImage(image46, (int) 'G', 3, (java.awt.image.ImageObserver) buttonPanel56);
        mainUI0.setIconImage(image46);
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(containerListenerArray20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(component35);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior40 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior40.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(containerListenerArray44);
        org.junit.Assert.assertNotNull(image46);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior48 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior48.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 0.5f + "'", float50 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior57 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior57.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.5f + "'", float59 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 0.5f + "'", float61 == 0.5f);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior63 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior63.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(containerListenerArray67);
        org.junit.Assert.assertNotNull(rectangle69);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        java.awt.Graphics graphics8 = null;
        buttonPanel0.update(graphics8);
        javax.swing.KeyStroke keyStroke10 = null;
        buttonPanel0.unregisterKeyboardAction(keyStroke10);
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior13 = buttonPanel12.getBaselineResizeBehavior();
        int int14 = buttonPanel12.getWidth();
        float float15 = buttonPanel12.getAlignmentY();
        boolean boolean16 = buttonPanel12.hasFocus();
        float float17 = buttonPanel12.getAlignmentY();
        org.jpacman.framework.ui.ButtonPanel buttonPanel18 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior19 = buttonPanel18.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray20 = buttonPanel18.getContainerListeners();
        boolean boolean22 = buttonPanel18.requestFocus(false);
        boolean boolean23 = buttonPanel18.isVisible();
        java.awt.event.MouseListener[] mouseListenerArray24 = buttonPanel18.getMouseListeners();
        java.awt.Color color25 = buttonPanel18.getBackground();
        buttonPanel12.setBackground(color25);
        buttonPanel0.setBackground(color25);
        buttonPanel0.transferFocusDownCycle();
        org.jpacman.framework.ui.ButtonPanel buttonPanel29 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics30 = null;
        buttonPanel29.printComponents(graphics30);
        org.jpacman.framework.ui.ButtonPanel buttonPanel33 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics34 = null;
        buttonPanel33.printComponents(graphics34);
        java.awt.Component component36 = buttonPanel29.add("[32,52]", (java.awt.Component) buttonPanel33);
        java.awt.Dimension dimension37 = buttonPanel29.size();
        buttonPanel0.setPreferredSize(dimension37);
        buttonPanel0.layout();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior13 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior13.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior19 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior19.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(mouseListenerArray24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(component36);
        org.junit.Assert.assertNotNull(dimension37);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isRequestFocusEnabled();
        boolean boolean9 = buttonPanel4.isEnabled();
        java.awt.Insets insets10 = buttonPanel4.getInsets();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(insets10);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        boolean boolean2 = mainUI0.isResizable();
        java.awt.Dimension dimension3 = mainUI0.getPreferredSize();
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior5 = buttonPanel4.getBaselineResizeBehavior();
        int int6 = buttonPanel4.getWidth();
        float float7 = buttonPanel4.getAlignmentY();
        boolean boolean8 = buttonPanel4.hasFocus();
        float float9 = buttonPanel4.getAlignmentY();
        java.awt.Graphics graphics10 = null;
        buttonPanel4.update(graphics10);
        buttonPanel4.reshape(8, 32, 64, (int) '.');
        java.awt.Color color17 = buttonPanel4.getForeground();
        mainUI0.setBackground(color17);
        java.awt.image.ColorModel colorModel19 = mainUI0.getColorModel();
        java.awt.image.VolatileImage volatileImage22 = mainUI0.createVolatileImage(10, (int) (short) 1);
        boolean boolean23 = mainUI0.isOpaque();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        mainUI0.addPropertyChangeListener(propertyChangeListener24);
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior5 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior5.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(colorModel19);
        org.junit.Assert.assertNull(volatileImage22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        java.awt.Graphics graphics8 = null;
        buttonPanel0.update(graphics8);
        javax.swing.KeyStroke keyStroke10 = null;
        buttonPanel0.unregisterKeyboardAction(keyStroke10);
        buttonPanel0.setDoubleBuffered(false);
        buttonPanel0.firePropertyChange("", true, false);
        boolean boolean19 = buttonPanel0.requestFocus(false);
        buttonPanel0.setEnabled(true);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray4 = buttonPanel0.getKeyListeners();
        boolean boolean5 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) buttonPanel0);
        java.awt.event.MouseWheelListener mouseWheelListener6 = null;
        buttonPanel0.addMouseWheelListener(mouseWheelListener6);
        buttonPanel0.setVisible(true);
        javax.accessibility.AccessibleContext accessibleContext10 = buttonPanel0.getAccessibleContext();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(accessibleContext10);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        buttonPanel0.setRequestFocusEnabled(true);
        javax.swing.border.Border border5 = null;
        buttonPanel0.setBorder(border5);
        buttonPanel0.firePropertyChange("org.jpacman.framework.ui.ButtonPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", 'P', ' ');
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        javax.swing.event.AncestorListener[] ancestorListenerArray4 = buttonPanel0.getAncestorListeners();
        buttonPanel0.validate();
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel8 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener9 = null;
        buttonPanel8.removeMouseWheelListener(mouseWheelListener9);
        java.awt.Component component11 = buttonPanel6.add("[32,52]", (java.awt.Component) buttonPanel8);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        buttonPanel8.removePropertyChangeListener("[32,52]", propertyChangeListener13);
        org.jpacman.framework.ui.ButtonPanel buttonPanel15 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior16 = buttonPanel15.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray17 = buttonPanel15.getContainerListeners();
        boolean boolean19 = buttonPanel15.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray20 = buttonPanel15.getContainerListeners();
        java.awt.image.ImageProducer imageProducer21 = null;
        java.awt.Image image22 = buttonPanel15.createImage(imageProducer21);
        org.jpacman.framework.ui.ButtonPanel buttonPanel23 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior24 = buttonPanel23.getBaselineResizeBehavior();
        int int25 = buttonPanel23.getWidth();
        float float26 = buttonPanel23.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray27 = buttonPanel23.getKeyListeners();
        int int28 = buttonPanel8.checkImage(image22, (java.awt.image.ImageObserver) buttonPanel23);
        org.jpacman.framework.ui.ButtonPanel buttonPanel29 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel30 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics31 = null;
        buttonPanel30.printComponents(graphics31);
        org.jpacman.framework.ui.ButtonPanel buttonPanel34 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics35 = null;
        buttonPanel34.printComponents(graphics35);
        java.awt.Component component37 = buttonPanel30.add("[32,52]", (java.awt.Component) buttonPanel34);
        java.awt.Graphics graphics38 = null;
        buttonPanel30.update(graphics38);
        org.jpacman.framework.view.BoardView boardView40 = null;
        org.jpacman.framework.view.Animator animator41 = new org.jpacman.framework.view.Animator(boardView40);
        buttonPanel29.add((java.awt.Component) buttonPanel30, (java.lang.Object) animator41);
        java.awt.event.ComponentListener[] componentListenerArray43 = buttonPanel29.getComponentListeners();
        int int44 = buttonPanel0.checkImage(image22, (java.awt.image.ImageObserver) buttonPanel29);
        buttonPanel29.setToolTipText("org.jpacman.framework.ui.ButtonPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
        java.awt.Event event47 = null;
        boolean boolean49 = buttonPanel29.keyDown(event47, 128);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(ancestorListenerArray4);
        org.junit.Assert.assertNotNull(component11);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior16 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior16.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(containerListenerArray20);
        org.junit.Assert.assertNotNull(image22);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior24 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior24.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.5f + "'", float26 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(componentListenerArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        java.awt.Graphics graphics8 = null;
        buttonPanel0.update(graphics8);
        boolean boolean10 = buttonPanel0.requestFocusInWindow();
        java.awt.Dimension dimension11 = buttonPanel0.getPreferredSize();
        org.jpacman.framework.ui.ButtonPanel buttonPanel13 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics14 = null;
        buttonPanel13.printComponents(graphics14);
        org.jpacman.framework.ui.ButtonPanel buttonPanel17 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics18 = null;
        buttonPanel17.printComponents(graphics18);
        java.awt.Component component20 = buttonPanel13.add("[32,52]", (java.awt.Component) buttonPanel17);
        boolean boolean21 = buttonPanel17.isRequestFocusEnabled();
        boolean boolean22 = buttonPanel17.isEnabled();
        buttonPanel17.setDebugGraphicsOptions((int) (byte) -1);
        java.awt.Color color25 = null;
        buttonPanel17.setForeground(color25);
        javax.swing.JPopupMenu jPopupMenu27 = buttonPanel17.getComponentPopupMenu();
        java.awt.Component component28 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel17);
        boolean boolean31 = buttonPanel17.contains((int) 'a', (int) ' ');
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertNotNull(component20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(jPopupMenu27);
        org.junit.Assert.assertNotNull(component28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction5.notifyObservers();
        org.jpacman.framework.view.BoardView boardView7 = null;
        org.jpacman.framework.view.Animator animator8 = new org.jpacman.framework.view.Animator(boardView7);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction9 = pacmanInteraction5.controlling((org.jpacman.framework.controller.IController) animator8);
        pacmanInteraction4.deleteObserver((java.util.Observer) pacmanInteraction5);
        org.jpacman.framework.ui.MainUI mainUI11 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray12 = mainUI11.getWindowStateListeners();
        java.awt.Graphics graphics13 = null;
        mainUI11.paint(graphics13);
        java.awt.MenuBar menuBar15 = null;
        mainUI11.setMenuBar(menuBar15);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction17 = pacmanInteraction4.withDisposable((org.jpacman.framework.ui.IDisposable) mainUI11);
        java.awt.Dialog.ModalExclusionType modalExclusionType18 = null;
        mainUI11.setModalExclusionType(modalExclusionType18);
        java.awt.Event event20 = null;
        boolean boolean23 = mainUI11.mouseEnter(event20, (int) (short) 0, (int) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        mainUI11.addPropertyChangeListener(propertyChangeListener24);
        java.awt.ComponentOrientation componentOrientation26 = mainUI11.getComponentOrientation();
        org.jpacman.framework.ui.ButtonPanel buttonPanel27 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics28 = null;
        buttonPanel27.printComponents(graphics28);
        org.jpacman.framework.ui.ButtonPanel buttonPanel31 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics32 = null;
        buttonPanel31.printComponents(graphics32);
        java.awt.Component component34 = buttonPanel27.add("[32,52]", (java.awt.Component) buttonPanel31);
        java.awt.Graphics graphics35 = null;
        buttonPanel27.update(graphics35);
        boolean boolean37 = buttonPanel27.requestFocusInWindow();
        org.jpacman.framework.ui.ButtonPanel buttonPanel38 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior39 = buttonPanel38.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray40 = buttonPanel38.getContainerListeners();
        buttonPanel38.setRequestFocusEnabled(true);
        boolean boolean43 = buttonPanel38.isValidateRoot();
        java.awt.Rectangle rectangle44 = buttonPanel38.getBounds();
        java.lang.Object obj45 = buttonPanel27.getClientProperty((java.lang.Object) rectangle44);
        mainUI11.setMaximizedBounds(rectangle44);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        mainUI11.addPropertyChangeListener("org.jpacman.framework.ui.MainUI[frame1,0,23,0x0,invalid,hidden,disabled,layout=java.awt.BorderLayout,title=,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", propertyChangeListener48);
        org.junit.Assert.assertNotNull(pacmanInteraction4);
        org.junit.Assert.assertNotNull(pacmanInteraction9);
        org.junit.Assert.assertNotNull(windowStateListenerArray12);
        org.junit.Assert.assertNotNull(pacmanInteraction17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(componentOrientation26);
        org.junit.Assert.assertNotNull(component34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior39 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior39.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(rectangle44);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        buttonPanel0.setFocusTraversalKeysEnabled(false);
        org.jpacman.framework.ui.ButtonPanel buttonPanel16 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior17 = buttonPanel16.getBaselineResizeBehavior();
        int int18 = buttonPanel16.getWidth();
        float float19 = buttonPanel16.getAlignmentY();
        boolean boolean20 = buttonPanel16.hasFocus();
        float float21 = buttonPanel16.getAlignmentY();
        boolean boolean22 = buttonPanel16.isValid();
        buttonPanel0.remove((java.awt.Component) buttonPanel16);
        boolean boolean24 = buttonPanel0.isFocusCycleRoot();
        buttonPanel0.addNotify();
        java.awt.event.ComponentListener[] componentListenerArray26 = buttonPanel0.getComponentListeners();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior17 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior17.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(componentListenerArray26);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory0 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game1 = defaultGameFactory0.makeGame();
        org.jpacman.framework.model.Game game2 = defaultGameFactory0.makeGame();
        org.jpacman.framework.ui.ButtonPanel buttonPanel3 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = buttonPanel3.getBaselineResizeBehavior();
        int int5 = buttonPanel3.getWidth();
        float float6 = buttonPanel3.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray7 = buttonPanel3.getKeyListeners();
        boolean boolean8 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) buttonPanel3);
        buttonPanel3.updateUI();
        javax.swing.event.AncestorListener ancestorListener10 = null;
        buttonPanel3.removeAncestorListener(ancestorListener10);
        java.awt.Event event12 = null;
        boolean boolean14 = buttonPanel3.keyUp(event12, 40);
        java.awt.event.ComponentListener componentListener15 = null;
        buttonPanel3.removeComponentListener(componentListener15);
        game2.attach((java.util.Observer) buttonPanel3);
        java.awt.Event event18 = null;
        try {
            boolean boolean19 = buttonPanel3.handleEvent(event18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(game1);
        org.junit.Assert.assertNotNull(game2);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        java.awt.Insets insets8 = buttonPanel0.getInsets();
        java.awt.Component component9 = buttonPanel0.getNextFocusableComponent();
        buttonPanel0.setLocation(0, 128);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNotNull(insets8);
        org.junit.Assert.assertNull(component9);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        buttonPanel0.setFocusTraversalKeysEnabled(false);
        buttonPanel0.updateUI();
        org.junit.Assert.assertNotNull(component8);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        pointManager2.addPointsToBoard((int) ' ');
        int int5 = pointManager2.totalFoodInGame();
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        java.awt.Dimension dimension8 = buttonPanel0.size();
        boolean boolean11 = buttonPanel0.contains(4, 1);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(32, 7);
        int int3 = board2.getWidth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory1 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game2 = defaultGameFactory1.makeGame();
        level0.setFactory((org.jpacman.framework.factory.IGameFactory) defaultGameFactory1);
        org.jpacman.framework.model.Player player4 = defaultGameFactory1.makePlayer();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = player4.getSpriteType();
        boolean boolean6 = player4.isAlive();
        int int8 = player4.addPoints(10);
        int int9 = player4.getPoints();
        org.junit.Assert.assertNotNull(game2);
        org.junit.Assert.assertNotNull(player4);
        org.junit.Assert.assertTrue("'" + spriteType5 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType5.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        buttonPanel0.removePropertyChangeListener(propertyChangeListener6);
        javax.swing.InputVerifier inputVerifier8 = null;
        buttonPanel0.setInputVerifier(inputVerifier8);
        buttonPanel0.firePropertyChange("board.txt", (float) (byte) 10, (float) (short) -1);
        org.junit.Assert.assertNotNull(component5);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.awt.event.ComponentListener[] componentListenerArray14 = buttonPanel0.getComponentListeners();
        buttonPanel0.setEnabled(true);
        java.awt.Dimension dimension17 = buttonPanel0.getMinimumSize();
        boolean boolean18 = buttonPanel0.isFocusOwner();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(componentListenerArray14);
        org.junit.Assert.assertNotNull(dimension17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(128, 1);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = board2.spriteTypeAt(3, (int) (byte) 0);
        try {
            org.jpacman.framework.model.Sprite sprite8 = board2.spriteAt((int) '.', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + spriteType5 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.EMPTY + "'", spriteType5.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.EMPTY));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        int int0 = java.awt.Frame.CROSSHAIR_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        buttonPanel0.setFocusTraversalKeysEnabled(false);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener16 = null;
        buttonPanel0.addHierarchyBoundsListener(hierarchyBoundsListener16);
        org.junit.Assert.assertNotNull(component8);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.jpacman.framework.factory.FactoryException factoryException1 = new org.jpacman.framework.factory.FactoryException("org.jpacman.framework.ui.ButtonPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        buttonPanel1.repaint(7, 13, 4, (int) (short) 100);
        int int19 = buttonPanel1.getHeight();
        buttonPanel1.setInheritsPopupMenu(false);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction22 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction22.notifyObservers();
        org.jpacman.framework.view.BoardView boardView24 = null;
        org.jpacman.framework.view.Animator animator25 = new org.jpacman.framework.view.Animator(boardView24);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction26 = pacmanInteraction22.controlling((org.jpacman.framework.controller.IController) animator25);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction27 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction27.notifyObservers();
        org.jpacman.framework.view.BoardView boardView29 = null;
        org.jpacman.framework.view.Animator animator30 = new org.jpacman.framework.view.Animator(boardView29);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction31 = pacmanInteraction27.controlling((org.jpacman.framework.controller.IController) animator30);
        pacmanInteraction27.start();
        org.jpacman.framework.ui.ButtonPanel buttonPanel33 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior34 = buttonPanel33.getBaselineResizeBehavior();
        int int35 = buttonPanel33.getWidth();
        float float36 = buttonPanel33.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray37 = buttonPanel33.getKeyListeners();
        java.awt.Rectangle rectangle38 = buttonPanel33.bounds();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray39 = buttonPanel33.getPropertyChangeListeners();
        pacmanInteraction22.update((java.util.Observable) pacmanInteraction27, (java.lang.Object) propertyChangeListenerArray39);
        org.jpacman.framework.ui.ButtonPanel buttonPanel41 = buttonPanel1.withInteractor(pacmanInteraction22);
        java.awt.event.ContainerListener containerListener42 = null;
        buttonPanel41.addContainerListener(containerListener42);
        boolean boolean44 = buttonPanel41.isFocusTraversalPolicyProvider();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(pacmanInteraction26);
        org.junit.Assert.assertNotNull(pacmanInteraction31);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior34 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior34.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray37);
        org.junit.Assert.assertNotNull(rectangle38);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray39);
        org.junit.Assert.assertNotNull(buttonPanel41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isFocusable();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction9 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction9.notifyObservers();
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction13 = pacmanInteraction9.controlling((org.jpacman.framework.controller.IController) animator12);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction14 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction14.notifyObservers();
        org.jpacman.framework.view.BoardView boardView16 = null;
        org.jpacman.framework.view.Animator animator17 = new org.jpacman.framework.view.Animator(boardView16);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction18 = pacmanInteraction14.controlling((org.jpacman.framework.controller.IController) animator17);
        pacmanInteraction14.start();
        org.jpacman.framework.ui.ButtonPanel buttonPanel20 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior21 = buttonPanel20.getBaselineResizeBehavior();
        int int22 = buttonPanel20.getWidth();
        float float23 = buttonPanel20.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray24 = buttonPanel20.getKeyListeners();
        java.awt.Rectangle rectangle25 = buttonPanel20.bounds();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray26 = buttonPanel20.getPropertyChangeListeners();
        pacmanInteraction9.update((java.util.Observable) pacmanInteraction14, (java.lang.Object) propertyChangeListenerArray26);
        org.jpacman.framework.ui.ButtonPanel buttonPanel28 = buttonPanel4.withInteractor(pacmanInteraction14);
        try {
            pacmanInteraction14.updateState();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(pacmanInteraction13);
        org.junit.Assert.assertNotNull(pacmanInteraction18);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior21 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior21.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.5f + "'", float23 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray24);
        org.junit.Assert.assertNotNull(rectangle25);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray26);
        org.junit.Assert.assertNotNull(buttonPanel28);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory1 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game2 = defaultGameFactory1.makeGame();
        level0.setFactory((org.jpacman.framework.factory.IGameFactory) defaultGameFactory1);
        org.jpacman.framework.model.Player player4 = defaultGameFactory1.makePlayer();
        player4.resurrect();
        org.jpacman.framework.model.Tile tile8 = new org.jpacman.framework.model.Tile(7, (int) (byte) 0);
        int int9 = tile8.getY();
        player4.occupy(tile8);
        org.junit.Assert.assertNotNull(game2);
        org.junit.Assert.assertNotNull(player4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        boolean boolean4 = buttonPanel0.hasFocus();
        buttonPanel0.enable();
        java.awt.Dimension dimension6 = buttonPanel0.getMaximumSize();
        java.awt.event.ContainerListener containerListener7 = null;
        buttonPanel0.addContainerListener(containerListener7);
        org.jpacman.framework.ui.ButtonPanel buttonPanel9 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics10 = null;
        buttonPanel9.printComponents(graphics10);
        org.jpacman.framework.ui.ButtonPanel buttonPanel13 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics14 = null;
        buttonPanel13.printComponents(graphics14);
        java.awt.Component component16 = buttonPanel9.add("[32,52]", (java.awt.Component) buttonPanel13);
        int int17 = buttonPanel9.countComponents();
        buttonPanel9.nextFocus();
        boolean boolean19 = buttonPanel0.isFocusCycleRoot((java.awt.Container) buttonPanel9);
        javax.swing.JButton jButton20 = null;
        try {
            buttonPanel9.addButton(jButton20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(component16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isRequestFocusEnabled();
        boolean boolean9 = buttonPanel4.isValid();
        buttonPanel4.transferFocus();
        boolean boolean11 = buttonPanel4.isVisible();
        buttonPanel4.transferFocusUpCycle();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        buttonPanel0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.event.KeyListener keyListener3 = null;
        buttonPanel0.removeKeyListener(keyListener3);
        java.awt.event.MouseEvent mouseEvent5 = null;
        java.lang.String str6 = buttonPanel0.getToolTipText(mouseEvent5);
        org.jpacman.framework.ui.ButtonPanel buttonPanel7 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior8 = buttonPanel7.getBaselineResizeBehavior();
        int int9 = buttonPanel7.getWidth();
        float float10 = buttonPanel7.getAlignmentY();
        boolean boolean11 = buttonPanel7.hasFocus();
        float float12 = buttonPanel7.getAlignmentY();
        org.jpacman.framework.ui.ButtonPanel buttonPanel13 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior14 = buttonPanel13.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray15 = buttonPanel13.getContainerListeners();
        boolean boolean17 = buttonPanel13.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray18 = buttonPanel13.getContainerListeners();
        java.awt.Rectangle rectangle19 = null;
        java.awt.Rectangle rectangle20 = buttonPanel13.getBounds(rectangle19);
        buttonPanel7.paintImmediately(rectangle20);
        javax.swing.border.Border border22 = null;
        buttonPanel7.setBorder(border22);
        java.awt.Insets insets24 = buttonPanel7.getInsets();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction25 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction25.notifyObservers();
        org.jpacman.framework.view.BoardView boardView27 = null;
        org.jpacman.framework.view.Animator animator28 = new org.jpacman.framework.view.Animator(boardView27);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction29 = pacmanInteraction25.controlling((org.jpacman.framework.controller.IController) animator28);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction30 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction30.notifyObservers();
        org.jpacman.framework.view.BoardView boardView32 = null;
        org.jpacman.framework.view.Animator animator33 = new org.jpacman.framework.view.Animator(boardView32);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction34 = pacmanInteraction30.controlling((org.jpacman.framework.controller.IController) animator33);
        pacmanInteraction29.deleteObserver((java.util.Observer) pacmanInteraction30);
        org.jpacman.framework.ui.MainUI mainUI36 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray37 = mainUI36.getWindowStateListeners();
        java.awt.Graphics graphics38 = null;
        mainUI36.paint(graphics38);
        java.awt.MenuBar menuBar40 = null;
        mainUI36.setMenuBar(menuBar40);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction42 = pacmanInteraction29.withDisposable((org.jpacman.framework.ui.IDisposable) mainUI36);
        java.awt.Dialog.ModalExclusionType modalExclusionType43 = null;
        mainUI36.setModalExclusionType(modalExclusionType43);
        java.awt.event.WindowListener[] windowListenerArray45 = mainUI36.getWindowListeners();
        try {
            buttonPanel0.add((java.awt.Component) buttonPanel7, (java.lang.Object) windowListenerArray45, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior8 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior8.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior14 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior14.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(containerListenerArray18);
        org.junit.Assert.assertNotNull(rectangle20);
        org.junit.Assert.assertNotNull(insets24);
        org.junit.Assert.assertNotNull(pacmanInteraction29);
        org.junit.Assert.assertNotNull(pacmanInteraction34);
        org.junit.Assert.assertNotNull(windowStateListenerArray37);
        org.junit.Assert.assertNotNull(pacmanInteraction42);
        org.junit.Assert.assertNotNull(windowListenerArray45);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.awt.event.ComponentListener[] componentListenerArray14 = buttonPanel0.getComponentListeners();
        buttonPanel0.setEnabled(true);
        java.awt.event.ContainerListener containerListener17 = null;
        buttonPanel0.removeContainerListener(containerListener17);
        buttonPanel0.reshape((int) 'G', (int) (short) 10, 6, (-1));
        java.lang.String str24 = buttonPanel0.getToolTipText();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(componentListenerArray14);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        boolean boolean1 = mainUI0.isFocused();
        mainUI0.setLocationByPlatform(true);
        java.awt.Graphics graphics4 = null;
        mainUI0.paintAll(graphics4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        boolean boolean4 = buttonPanel0.hasFocus();
        float float5 = buttonPanel0.getAlignmentY();
        java.awt.Graphics graphics6 = null;
        buttonPanel0.update(graphics6);
        javax.swing.ActionMap actionMap8 = buttonPanel0.getActionMap();
        java.awt.Event event9 = null;
        boolean boolean12 = buttonPanel0.mouseUp(event9, 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNotNull(actionMap8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.jpacman.framework.model.Direction direction0 = org.jpacman.framework.model.Direction.RIGHT;
        int int1 = direction0.getDx();
        int int2 = direction0.getDy();
        int int3 = direction0.getDx();
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction0.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics3 = null;
        buttonPanel2.printComponents(graphics3);
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics7 = null;
        buttonPanel6.printComponents(graphics7);
        java.awt.Component component9 = buttonPanel2.add("[32,52]", (java.awt.Component) buttonPanel6);
        boolean boolean10 = buttonPanel6.isFocusable();
        java.awt.MenuComponent menuComponent11 = null;
        buttonPanel6.remove(menuComponent11);
        buttonPanel6.enable();
        org.jpacman.framework.ui.ButtonPanel buttonPanel14 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics15 = null;
        buttonPanel14.printComponents(graphics15);
        org.jpacman.framework.ui.ButtonPanel buttonPanel18 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics19 = null;
        buttonPanel18.printComponents(graphics19);
        java.awt.Component component21 = buttonPanel14.add("[32,52]", (java.awt.Component) buttonPanel18);
        java.awt.Graphics graphics22 = null;
        buttonPanel14.update(graphics22);
        boolean boolean24 = buttonPanel14.requestFocusInWindow();
        boolean boolean25 = buttonPanel6.isAncestorOf((java.awt.Component) buttonPanel14);
        java.awt.Event event26 = null;
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction27 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction27.notifyObservers();
        org.jpacman.framework.view.BoardView boardView29 = null;
        org.jpacman.framework.view.Animator animator30 = new org.jpacman.framework.view.Animator(boardView29);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction31 = pacmanInteraction27.controlling((org.jpacman.framework.controller.IController) animator30);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction32 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction32.notifyObservers();
        org.jpacman.framework.view.BoardView boardView34 = null;
        org.jpacman.framework.view.Animator animator35 = new org.jpacman.framework.view.Animator(boardView34);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction36 = pacmanInteraction32.controlling((org.jpacman.framework.controller.IController) animator35);
        pacmanInteraction31.deleteObserver((java.util.Observer) pacmanInteraction32);
        pacmanInteraction32.up();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction39 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction39.notifyObservers();
        org.jpacman.framework.view.BoardView boardView41 = null;
        org.jpacman.framework.view.Animator animator42 = new org.jpacman.framework.view.Animator(boardView41);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction43 = pacmanInteraction39.controlling((org.jpacman.framework.controller.IController) animator42);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction44 = pacmanInteraction32.controlling((org.jpacman.framework.controller.IController) animator42);
        boolean boolean45 = buttonPanel14.gotFocus(event26, (java.lang.Object) animator42);
        org.jpacman.framework.ui.MainUI mainUI46 = mainUI0.withGhostController((org.jpacman.framework.controller.IController) animator42);
        mainUI46.resize(1, (int) '#');
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(component21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(pacmanInteraction31);
        org.junit.Assert.assertNotNull(pacmanInteraction36);
        org.junit.Assert.assertNotNull(pacmanInteraction43);
        org.junit.Assert.assertNotNull(pacmanInteraction44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(mainUI46);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        java.awt.Image image5 = buttonPanel0.createImage((int) (byte) -1, 32);
        java.awt.Component component8 = buttonPanel0.locate((int) (byte) 100, (int) (short) 1);
        javax.accessibility.AccessibleContext accessibleContext9 = buttonPanel0.getAccessibleContext();
        java.awt.event.MouseListener mouseListener10 = null;
        buttonPanel0.removeMouseListener(mouseListener10);
        java.awt.event.MouseEvent mouseEvent12 = null;
        java.lang.String str13 = buttonPanel0.getToolTipText(mouseEvent12);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(component8);
        org.junit.Assert.assertNotNull(accessibleContext9);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        java.awt.Image image5 = buttonPanel0.createImage((int) (byte) -1, 32);
        java.awt.Component component8 = buttonPanel0.locate((int) (byte) 100, (int) (short) 1);
        javax.accessibility.AccessibleContext accessibleContext9 = buttonPanel0.getAccessibleContext();
        org.jpacman.framework.ui.ButtonPanel buttonPanel10 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener13 = null;
        buttonPanel12.removeMouseWheelListener(mouseWheelListener13);
        java.awt.Component component15 = buttonPanel10.add("[32,52]", (java.awt.Component) buttonPanel12);
        java.awt.Component component16 = buttonPanel0.add((java.awt.Component) buttonPanel12);
        boolean boolean17 = buttonPanel0.isValid();
        boolean boolean18 = buttonPanel0.getVerifyInputWhenFocusTarget();
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(component8);
        org.junit.Assert.assertNotNull(accessibleContext9);
        org.junit.Assert.assertNotNull(component15);
        org.junit.Assert.assertNotNull(component16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        boolean boolean6 = buttonPanel0.isFocusOwner();
        java.lang.String str7 = buttonPanel0.getUIClassID();
        java.awt.Point point9 = buttonPanel0.getMousePosition(false);
        buttonPanel0.enableInputMethods(true);
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "PanelUI" + "'", str7.equals("PanelUI"));
        org.junit.Assert.assertNull(point9);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction5.notifyObservers();
        org.jpacman.framework.view.BoardView boardView7 = null;
        org.jpacman.framework.view.Animator animator8 = new org.jpacman.framework.view.Animator(boardView7);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction9 = pacmanInteraction5.controlling((org.jpacman.framework.controller.IController) animator8);
        pacmanInteraction4.deleteObserver((java.util.Observer) pacmanInteraction5);
        pacmanInteraction5.up();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction12 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction12.notifyObservers();
        org.jpacman.framework.view.BoardView boardView14 = null;
        org.jpacman.framework.view.Animator animator15 = new org.jpacman.framework.view.Animator(boardView14);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction16 = pacmanInteraction12.controlling((org.jpacman.framework.controller.IController) animator15);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction17 = pacmanInteraction5.controlling((org.jpacman.framework.controller.IController) animator15);
        animator15.stop();
        org.junit.Assert.assertNotNull(pacmanInteraction4);
        org.junit.Assert.assertNotNull(pacmanInteraction9);
        org.junit.Assert.assertNotNull(pacmanInteraction16);
        org.junit.Assert.assertNotNull(pacmanInteraction17);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        boolean boolean4 = buttonPanel0.hasFocus();
        buttonPanel0.enable();
        java.awt.Dimension dimension6 = buttonPanel0.getMaximumSize();
        org.jpacman.framework.ui.MainUI mainUI7 = new org.jpacman.framework.ui.MainUI();
        java.awt.Component component8 = mainUI7.getGlassPane();
        java.awt.event.WindowFocusListener windowFocusListener9 = null;
        mainUI7.removeWindowFocusListener(windowFocusListener9);
        int int11 = mainUI7.getState();
        java.awt.Toolkit toolkit12 = mainUI7.getToolkit();
        org.jpacman.framework.ui.ButtonPanel buttonPanel13 = buttonPanel0.withParent((javax.swing.JFrame) mainUI7);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction14 = mainUI7.eventHandler();
        javax.swing.TransferHandler transferHandler15 = mainUI7.getTransferHandler();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(toolkit12);
        org.junit.Assert.assertNotNull(buttonPanel13);
        org.junit.Assert.assertNull(pacmanInteraction14);
        org.junit.Assert.assertNull(transferHandler15);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.IPacmanInteraction iPacmanInteraction3 = buttonPanel0.getPacmanInteractor();
        java.awt.FocusTraversalPolicy focusTraversalPolicy4 = null;
        buttonPanel0.setFocusTraversalPolicy(focusTraversalPolicy4);
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior7 = buttonPanel6.getBaselineResizeBehavior();
        int int8 = buttonPanel6.getWidth();
        float float9 = buttonPanel6.getAlignmentY();
        javax.swing.event.AncestorListener[] ancestorListenerArray10 = buttonPanel6.getAncestorListeners();
        buttonPanel6.validate();
        java.awt.Component component12 = buttonPanel0.add((java.awt.Component) buttonPanel6);
        java.awt.Container container13 = buttonPanel0.getParent();
        org.jpacman.framework.ui.ButtonPanel buttonPanel14 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics15 = null;
        buttonPanel14.printComponents(graphics15);
        org.jpacman.framework.ui.ButtonPanel buttonPanel18 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics19 = null;
        buttonPanel18.printComponents(graphics19);
        java.awt.Component component21 = buttonPanel14.add("[32,52]", (java.awt.Component) buttonPanel18);
        java.awt.Dimension dimension22 = buttonPanel14.size();
        java.awt.Dimension dimension23 = buttonPanel0.getSize(dimension22);
        org.junit.Assert.assertNull(iPacmanInteraction3);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior7 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior7.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(ancestorListenerArray10);
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertNull(container13);
        org.junit.Assert.assertNotNull(component21);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNotNull(dimension23);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        int int8 = buttonPanel0.getBaseline(8, 1);
        java.awt.Component component11 = buttonPanel0.findComponentAt(0, 100);
        java.awt.MenuComponent menuComponent12 = null;
        try {
            component11.remove(menuComponent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(component11);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        org.jpacman.framework.model.Player player1 = new org.jpacman.framework.model.Player();
        player1.die();
        int int3 = player1.getPoints();
        player1.resurrect();
        pointManager0.consumePointsOnBoard(player1, 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        boolean boolean4 = buttonPanel0.hasFocus();
        float float5 = buttonPanel0.getAlignmentY();
        java.awt.Graphics graphics6 = null;
        buttonPanel0.update(graphics6);
        buttonPanel0.reshape(8, 32, 64, (int) '.');
        java.beans.PropertyChangeListener[] propertyChangeListenerArray14 = buttonPanel0.getPropertyChangeListeners("");
        javax.swing.border.Border border15 = buttonPanel0.getBorder();
        java.awt.event.FocusListener focusListener16 = null;
        buttonPanel0.removeFocusListener(focusListener16);
        int int18 = buttonPanel0.getHeight();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray14);
        org.junit.Assert.assertNull(border15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 46 + "'", int18 == 46);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        int int8 = buttonPanel0.countComponents();
        org.jpacman.framework.ui.ButtonPanel buttonPanel9 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics10 = null;
        buttonPanel9.printComponents(graphics10);
        org.jpacman.framework.ui.ButtonPanel buttonPanel13 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics14 = null;
        buttonPanel13.printComponents(graphics14);
        java.awt.Component component16 = buttonPanel9.add("[32,52]", (java.awt.Component) buttonPanel13);
        boolean boolean17 = buttonPanel13.isRequestFocusEnabled();
        java.awt.Image image18 = null;
        org.jpacman.framework.ui.ButtonPanel buttonPanel19 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel20 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics21 = null;
        buttonPanel20.printComponents(graphics21);
        org.jpacman.framework.ui.ButtonPanel buttonPanel24 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics25 = null;
        buttonPanel24.printComponents(graphics25);
        java.awt.Component component27 = buttonPanel20.add("[32,52]", (java.awt.Component) buttonPanel24);
        java.awt.Graphics graphics28 = null;
        buttonPanel20.update(graphics28);
        org.jpacman.framework.view.BoardView boardView30 = null;
        org.jpacman.framework.view.Animator animator31 = new org.jpacman.framework.view.Animator(boardView30);
        buttonPanel19.add((java.awt.Component) buttonPanel20, (java.lang.Object) animator31);
        java.awt.event.ComponentListener[] componentListenerArray33 = buttonPanel19.getComponentListeners();
        buttonPanel19.setEnabled(true);
        java.awt.Dimension dimension36 = buttonPanel19.getMinimumSize();
        java.awt.Color color37 = null;
        buttonPanel19.setForeground(color37);
        boolean boolean39 = buttonPanel13.prepareImage(image18, (java.awt.image.ImageObserver) buttonPanel19);
        buttonPanel0.remove((java.awt.Component) buttonPanel13);
        org.jpacman.framework.ui.ButtonPanel buttonPanel41 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior42 = buttonPanel41.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray43 = buttonPanel41.getContainerListeners();
        buttonPanel41.setRequestFocusEnabled(true);
        buttonPanel41.transferFocus();
        java.awt.Dimension dimension47 = buttonPanel41.preferredSize();
        buttonPanel13.setPreferredSize(dimension47);
        org.jpacman.framework.ui.ButtonPanel buttonPanel49 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics50 = null;
        buttonPanel49.printComponents(graphics50);
        org.jpacman.framework.ui.ButtonPanel buttonPanel53 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics54 = null;
        buttonPanel53.printComponents(graphics54);
        java.awt.Component component56 = buttonPanel49.add("[32,52]", (java.awt.Component) buttonPanel53);
        java.awt.Graphics graphics57 = null;
        buttonPanel49.update(graphics57);
        boolean boolean59 = buttonPanel49.requestFocusInWindow();
        java.awt.Dimension dimension60 = buttonPanel49.getPreferredSize();
        org.jpacman.framework.ui.ButtonPanel buttonPanel62 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics63 = null;
        buttonPanel62.printComponents(graphics63);
        org.jpacman.framework.ui.ButtonPanel buttonPanel66 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics67 = null;
        buttonPanel66.printComponents(graphics67);
        java.awt.Component component69 = buttonPanel62.add("[32,52]", (java.awt.Component) buttonPanel66);
        boolean boolean70 = buttonPanel66.isRequestFocusEnabled();
        boolean boolean71 = buttonPanel66.isEnabled();
        buttonPanel66.setDebugGraphicsOptions((int) (byte) -1);
        java.awt.Color color74 = null;
        buttonPanel66.setForeground(color74);
        javax.swing.JPopupMenu jPopupMenu76 = buttonPanel66.getComponentPopupMenu();
        java.awt.Component component77 = buttonPanel49.add("[32,52]", (java.awt.Component) buttonPanel66);
        java.awt.Point point78 = buttonPanel49.getLocation();
        java.awt.Point point79 = buttonPanel13.getLocation(point78);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener80 = null;
        buttonPanel13.removeHierarchyBoundsListener(hierarchyBoundsListener80);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(component16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(component27);
        org.junit.Assert.assertNotNull(componentListenerArray33);
        org.junit.Assert.assertNotNull(dimension36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior42 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior42.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray43);
        org.junit.Assert.assertNotNull(dimension47);
        org.junit.Assert.assertNotNull(component56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(dimension60);
        org.junit.Assert.assertNotNull(component69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNull(jPopupMenu76);
        org.junit.Assert.assertNotNull(component77);
        org.junit.Assert.assertNotNull(point78);
        org.junit.Assert.assertNotNull(point79);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction1 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction1.notifyObservers();
        org.jpacman.framework.view.BoardView boardView3 = null;
        org.jpacman.framework.view.Animator animator4 = new org.jpacman.framework.view.Animator(boardView3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = pacmanInteraction1.controlling((org.jpacman.framework.controller.IController) animator4);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction6 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction6.notifyObservers();
        org.jpacman.framework.view.BoardView boardView8 = null;
        org.jpacman.framework.view.Animator animator9 = new org.jpacman.framework.view.Animator(boardView8);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction10 = pacmanInteraction6.controlling((org.jpacman.framework.controller.IController) animator9);
        pacmanInteraction5.deleteObserver((java.util.Observer) pacmanInteraction6);
        pacmanInteraction0.deleteObserver((java.util.Observer) pacmanInteraction6);
        try {
            pacmanInteraction6.exit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pacmanInteraction5);
        org.junit.Assert.assertNotNull(pacmanInteraction10);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction5.notifyObservers();
        org.jpacman.framework.view.BoardView boardView7 = null;
        org.jpacman.framework.view.Animator animator8 = new org.jpacman.framework.view.Animator(boardView7);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction9 = pacmanInteraction5.controlling((org.jpacman.framework.controller.IController) animator8);
        pacmanInteraction4.deleteObserver((java.util.Observer) pacmanInteraction5);
        org.jpacman.framework.ui.MainUI mainUI11 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray12 = mainUI11.getWindowStateListeners();
        java.awt.Graphics graphics13 = null;
        mainUI11.paint(graphics13);
        java.awt.MenuBar menuBar15 = null;
        mainUI11.setMenuBar(menuBar15);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction17 = pacmanInteraction4.withDisposable((org.jpacman.framework.ui.IDisposable) mainUI11);
        mainUI11.hide();
        int int19 = mainUI11.getState();
        org.junit.Assert.assertNotNull(pacmanInteraction4);
        org.junit.Assert.assertNotNull(pacmanInteraction9);
        org.junit.Assert.assertNotNull(windowStateListenerArray12);
        org.junit.Assert.assertNotNull(pacmanInteraction17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        buttonPanel0.transferFocusBackward();
        java.awt.Dimension dimension4 = buttonPanel0.size();
        buttonPanel0.setName("PanelUI");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertNotNull(dimension4);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        buttonPanel0.firePropertyChange("ToolTipText", ' ', ' ');
        boolean boolean18 = buttonPanel0.getIgnoreRepaint();
        boolean boolean19 = buttonPanel0.isFocusTraversalPolicySet();
        boolean boolean20 = buttonPanel0.isOpaque();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        boolean boolean2 = mainUI0.isResizable();
        java.awt.Dimension dimension3 = mainUI0.getPreferredSize();
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior5 = buttonPanel4.getBaselineResizeBehavior();
        int int6 = buttonPanel4.getWidth();
        float float7 = buttonPanel4.getAlignmentY();
        boolean boolean8 = buttonPanel4.hasFocus();
        float float9 = buttonPanel4.getAlignmentY();
        java.awt.Graphics graphics10 = null;
        buttonPanel4.update(graphics10);
        buttonPanel4.reshape(8, 32, 64, (int) '.');
        java.awt.Color color17 = buttonPanel4.getForeground();
        mainUI0.setBackground(color17);
        java.awt.image.ColorModel colorModel19 = mainUI0.getColorModel();
        float float20 = mainUI0.getAlignmentX();
        try {
            mainUI0.setCursor(16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal cursor type");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior5 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior5.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(colorModel19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        boolean boolean2 = game0.won();
        org.jpacman.framework.ui.ButtonPanel buttonPanel3 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics4 = null;
        buttonPanel3.printComponents(graphics4);
        org.jpacman.framework.ui.ButtonPanel buttonPanel7 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics8 = null;
        buttonPanel7.printComponents(graphics8);
        java.awt.Component component10 = buttonPanel3.add("[32,52]", (java.awt.Component) buttonPanel7);
        boolean boolean11 = buttonPanel7.isFocusable();
        java.awt.MenuComponent menuComponent12 = null;
        buttonPanel7.remove(menuComponent12);
        buttonPanel7.enable();
        game0.attach((java.util.Observer) buttonPanel7);
        org.jpacman.framework.model.Board board18 = new org.jpacman.framework.model.Board(128, 1);
        int int19 = board18.getWidth();
        game0.setBoard(board18);
        boolean boolean23 = board18.withinBorders((int) (byte) 1, (-1));
        org.jpacman.framework.model.Game game24 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction25 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction25.notifyObservers();
        org.jpacman.framework.view.BoardView boardView27 = null;
        org.jpacman.framework.view.Animator animator28 = new org.jpacman.framework.view.Animator(boardView27);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction29 = pacmanInteraction25.controlling((org.jpacman.framework.controller.IController) animator28);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction30 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction30.notifyObservers();
        org.jpacman.framework.view.BoardView boardView32 = null;
        org.jpacman.framework.view.Animator animator33 = new org.jpacman.framework.view.Animator(boardView32);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction34 = pacmanInteraction30.controlling((org.jpacman.framework.controller.IController) animator33);
        pacmanInteraction29.deleteObserver((java.util.Observer) pacmanInteraction30);
        pacmanInteraction30.up();
        game24.addObserver((java.util.Observer) pacmanInteraction30);
        boolean boolean38 = game24.won();
        org.jpacman.framework.model.Level level39 = new org.jpacman.framework.model.Level();
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory40 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game41 = defaultGameFactory40.makeGame();
        level39.setFactory((org.jpacman.framework.factory.IGameFactory) defaultGameFactory40);
        org.jpacman.framework.model.Food food43 = defaultGameFactory40.makeFood();
        org.jpacman.framework.model.Ghost ghost44 = defaultGameFactory40.makeGhost();
        org.jpacman.framework.model.Board board47 = defaultGameFactory40.makeBoard((int) 'G', (int) 'G');
        game24.setBoard(board47);
        org.jpacman.framework.model.Level level49 = new org.jpacman.framework.model.Level();
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory50 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game51 = defaultGameFactory50.makeGame();
        level49.setFactory((org.jpacman.framework.factory.IGameFactory) defaultGameFactory50);
        org.jpacman.framework.model.Food food53 = defaultGameFactory50.makeFood();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType54 = food53.getSpriteType();
        game24.addFood(food53);
        try {
            board18.put((org.jpacman.framework.model.Sprite) food53, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 128 + "'", int19 == 128);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(pacmanInteraction29);
        org.junit.Assert.assertNotNull(pacmanInteraction34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(game41);
        org.junit.Assert.assertNotNull(food43);
        org.junit.Assert.assertNotNull(ghost44);
        org.junit.Assert.assertNotNull(board47);
        org.junit.Assert.assertNotNull(game51);
        org.junit.Assert.assertNotNull(food53);
        org.junit.Assert.assertTrue("'" + spriteType54 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType54.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        org.jpacman.framework.ui.PacmanInteraction.MatchState matchState1 = pacmanInteraction0.getCurrentState();
        pacmanInteraction0.stop();
        pacmanInteraction0.updateState();
        pacmanInteraction0.deleteObservers();
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = buttonPanel5.getBaselineResizeBehavior();
        int int7 = buttonPanel5.getWidth();
        float float8 = buttonPanel5.getAlignmentY();
        boolean boolean9 = buttonPanel5.hasFocus();
        float float10 = buttonPanel5.getAlignmentY();
        java.awt.Graphics graphics11 = null;
        buttonPanel5.update(graphics11);
        javax.swing.ActionMap actionMap13 = buttonPanel5.getActionMap();
        pacmanInteraction0.notifyObservers((java.lang.Object) buttonPanel5);
        buttonPanel5.setAlignmentY((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + matchState1 + "' != '" + org.jpacman.framework.ui.PacmanInteraction.MatchState.PAUSING + "'", matchState1.equals(org.jpacman.framework.ui.PacmanInteraction.MatchState.PAUSING));
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNotNull(actionMap13);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        buttonPanel1.firePropertyChange("hi!", (double) ' ', (double) 4);
        float float18 = buttonPanel1.getAlignmentX();
        buttonPanel1.setSize((int) (byte) 100, 40);
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics3 = null;
        buttonPanel2.printComponents(graphics3);
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics7 = null;
        buttonPanel6.printComponents(graphics7);
        java.awt.Component component9 = buttonPanel2.add("[32,52]", (java.awt.Component) buttonPanel6);
        java.awt.Graphics graphics10 = null;
        buttonPanel2.update(graphics10);
        org.jpacman.framework.view.BoardView boardView12 = null;
        org.jpacman.framework.view.Animator animator13 = new org.jpacman.framework.view.Animator(boardView12);
        buttonPanel1.add((java.awt.Component) buttonPanel2, (java.lang.Object) animator13);
        java.awt.event.ComponentListener[] componentListenerArray15 = buttonPanel1.getComponentListeners();
        buttonPanel1.setEnabled(true);
        java.awt.event.ContainerListener containerListener18 = null;
        buttonPanel1.removeContainerListener(containerListener18);
        java.awt.LayoutManager layoutManager20 = buttonPanel1.getLayout();
        mainUI0.setLayout(layoutManager20);
        org.jpacman.framework.ui.ButtonPanel buttonPanel22 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior23 = buttonPanel22.getBaselineResizeBehavior();
        int int24 = buttonPanel22.getWidth();
        float float25 = buttonPanel22.getAlignmentY();
        java.awt.ImageCapabilities imageCapabilities28 = null;
        java.awt.image.VolatileImage volatileImage29 = buttonPanel22.createVolatileImage((int) 'a', (int) (byte) 10, imageCapabilities28);
        java.awt.LayoutManager layoutManager30 = null;
        buttonPanel22.setLayout(layoutManager30);
        java.awt.ComponentOrientation componentOrientation32 = buttonPanel22.getComponentOrientation();
        mainUI0.applyComponentOrientation(componentOrientation32);
        java.awt.im.InputContext inputContext34 = mainUI0.getInputContext();
        java.awt.Component component35 = mainUI0.getMostRecentFocusOwner();
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertNotNull(componentListenerArray15);
        org.junit.Assert.assertNotNull(layoutManager20);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior23 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior23.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
        org.junit.Assert.assertNull(volatileImage29);
        org.junit.Assert.assertNotNull(componentOrientation32);
        org.junit.Assert.assertNotNull(inputContext34);
        org.junit.Assert.assertNotNull(component35);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isFocusable();
        java.awt.MenuComponent menuComponent9 = null;
        buttonPanel4.remove(menuComponent9);
        buttonPanel4.enable();
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics13 = null;
        buttonPanel12.printComponents(graphics13);
        org.jpacman.framework.ui.ButtonPanel buttonPanel16 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics17 = null;
        buttonPanel16.printComponents(graphics17);
        java.awt.Component component19 = buttonPanel12.add("[32,52]", (java.awt.Component) buttonPanel16);
        java.awt.Graphics graphics20 = null;
        buttonPanel12.update(graphics20);
        boolean boolean22 = buttonPanel12.requestFocusInWindow();
        boolean boolean23 = buttonPanel4.isAncestorOf((java.awt.Component) buttonPanel12);
        java.awt.im.InputContext inputContext24 = buttonPanel4.getInputContext();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(component19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(inputContext24);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        boolean boolean4 = buttonPanel0.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray5 = buttonPanel0.getContainerListeners();
        java.awt.Rectangle rectangle6 = null;
        java.awt.Rectangle rectangle7 = buttonPanel0.getBounds(rectangle6);
        org.jpacman.framework.model.Level level8 = new org.jpacman.framework.model.Level();
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory9 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game10 = defaultGameFactory9.makeGame();
        level8.setFactory((org.jpacman.framework.factory.IGameFactory) defaultGameFactory9);
        org.jpacman.framework.model.Player player12 = defaultGameFactory9.makePlayer();
        player12.resurrect();
        player12.die();
        java.lang.Object obj15 = buttonPanel0.getClientProperty((java.lang.Object) player12);
        boolean boolean16 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) buttonPanel0);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(containerListenerArray5);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(game10);
        org.junit.Assert.assertNotNull(player12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isFocusable();
        java.awt.MenuComponent menuComponent9 = null;
        buttonPanel4.remove(menuComponent9);
        java.awt.Cursor cursor11 = buttonPanel4.getCursor();
        java.awt.event.MouseEvent mouseEvent12 = null;
        java.awt.Point point13 = buttonPanel4.getToolTipLocation(mouseEvent12);
        boolean boolean14 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) buttonPanel4);
        java.awt.Event event15 = null;
        org.jpacman.framework.ui.ButtonPanel buttonPanel16 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics17 = null;
        buttonPanel16.printComponents(graphics17);
        org.jpacman.framework.ui.ButtonPanel buttonPanel20 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics21 = null;
        buttonPanel20.printComponents(graphics21);
        java.awt.Component component23 = buttonPanel16.add("[32,52]", (java.awt.Component) buttonPanel20);
        boolean boolean24 = buttonPanel20.isFocusable();
        java.awt.MenuComponent menuComponent25 = null;
        buttonPanel20.remove(menuComponent25);
        buttonPanel20.enable();
        org.jpacman.framework.ui.ButtonPanel buttonPanel28 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics29 = null;
        buttonPanel28.printComponents(graphics29);
        org.jpacman.framework.ui.ButtonPanel buttonPanel32 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics33 = null;
        buttonPanel32.printComponents(graphics33);
        java.awt.Component component35 = buttonPanel28.add("[32,52]", (java.awt.Component) buttonPanel32);
        java.awt.Graphics graphics36 = null;
        buttonPanel28.update(graphics36);
        boolean boolean38 = buttonPanel28.requestFocusInWindow();
        boolean boolean39 = buttonPanel20.isAncestorOf((java.awt.Component) buttonPanel28);
        org.jpacman.framework.model.Game game41 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList42 = game41.getGhosts();
        boolean boolean43 = game41.won();
        org.jpacman.framework.ui.ButtonPanel buttonPanel44 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics45 = null;
        buttonPanel44.printComponents(graphics45);
        org.jpacman.framework.ui.ButtonPanel buttonPanel48 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics49 = null;
        buttonPanel48.printComponents(graphics49);
        java.awt.Component component51 = buttonPanel44.add("[32,52]", (java.awt.Component) buttonPanel48);
        boolean boolean52 = buttonPanel48.isFocusable();
        java.awt.MenuComponent menuComponent53 = null;
        buttonPanel48.remove(menuComponent53);
        buttonPanel48.enable();
        game41.attach((java.util.Observer) buttonPanel48);
        java.awt.Component component57 = buttonPanel28.add("org.jpacman.framework.ui.MainUI[frame0,0,23,0x0,invalid,hidden,disabled,layout=java.awt.BorderLayout,title=,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (java.awt.Component) buttonPanel48);
        boolean boolean58 = buttonPanel4.lostFocus(event15, (java.lang.Object) buttonPanel28);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cursor11);
        org.junit.Assert.assertNull(point13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(component23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(component35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(ghostList42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(component51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(component57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        boolean boolean4 = buttonPanel0.requestFocus(false);
        buttonPanel0.doLayout();
        boolean boolean6 = buttonPanel0.isMinimumSizeSet();
        boolean boolean7 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) buttonPanel0);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        int int14 = buttonPanel0.getDebugGraphicsOptions();
        java.awt.event.ContainerListener[] containerListenerArray15 = buttonPanel0.getContainerListeners();
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        buttonPanel0.addInputMethodListener(inputMethodListener16);
        java.awt.Event event18 = null;
        boolean boolean20 = buttonPanel0.keyDown(event18, 13);
        org.jpacman.framework.ui.MainUI mainUI21 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray22 = mainUI21.getWindowStateListeners();
        boolean boolean23 = mainUI21.isResizable();
        java.awt.Dimension dimension24 = mainUI21.getPreferredSize();
        buttonPanel0.setPreferredSize(dimension24);
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(containerListenerArray15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(windowStateListenerArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dimension24);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        int int14 = buttonPanel0.getDebugGraphicsOptions();
        java.awt.event.ContainerListener[] containerListenerArray15 = buttonPanel0.getContainerListeners();
        javax.swing.KeyStroke[] keyStrokeArray16 = buttonPanel0.getRegisteredKeyStrokes();
        org.jpacman.framework.ui.ButtonPanel buttonPanel17 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel19 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener20 = null;
        buttonPanel19.removeMouseWheelListener(mouseWheelListener20);
        java.awt.Component component22 = buttonPanel17.add("[32,52]", (java.awt.Component) buttonPanel19);
        int int25 = buttonPanel17.getBaseline(8, 1);
        boolean boolean27 = buttonPanel17.requestFocus(false);
        javax.swing.ActionMap actionMap28 = buttonPanel17.getActionMap();
        buttonPanel0.setActionMap(actionMap28);
        boolean boolean30 = buttonPanel0.isOpaque();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(containerListenerArray15);
        org.junit.Assert.assertNotNull(keyStrokeArray16);
        org.junit.Assert.assertNotNull(component22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(actionMap28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        boolean boolean4 = buttonPanel0.hasFocus();
        float float5 = buttonPanel0.getAlignmentY();
        java.awt.Graphics graphics6 = null;
        buttonPanel0.update(graphics6);
        buttonPanel0.reshape(8, 32, 64, (int) '.');
        java.awt.Color color13 = buttonPanel0.getForeground();
        java.awt.Point point15 = buttonPanel0.getMousePosition(false);
        java.awt.event.MouseMotionListener mouseMotionListener16 = null;
        buttonPanel0.addMouseMotionListener(mouseMotionListener16);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNull(point15);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        buttonPanel1.repaint(7, 13, 4, (int) (short) 100);
        int int19 = buttonPanel1.getHeight();
        java.beans.VetoableChangeListener vetoableChangeListener20 = null;
        buttonPanel1.addVetoableChangeListener(vetoableChangeListener20);
        javax.swing.border.Border border22 = buttonPanel1.getBorder();
        java.awt.Dimension dimension23 = buttonPanel1.getSize();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(border22);
        org.junit.Assert.assertNotNull(dimension23);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        java.awt.Image image5 = buttonPanel0.createImage((int) (byte) -1, 32);
        java.awt.Component component8 = buttonPanel0.locate((int) (byte) 100, (int) (short) 1);
        boolean boolean10 = buttonPanel0.requestFocus(false);
        java.lang.String str11 = buttonPanel0.getUIClassID();
        java.awt.event.FocusListener focusListener12 = null;
        buttonPanel0.removeFocusListener(focusListener12);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(component8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "PanelUI" + "'", str11.equals("PanelUI"));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        boolean boolean4 = buttonPanel0.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray5 = buttonPanel0.getContainerListeners();
        java.awt.Event event6 = null;
        boolean boolean8 = buttonPanel0.gotFocus(event6, (java.lang.Object) 100.0d);
        float float9 = buttonPanel0.getAlignmentY();
        java.awt.Event event10 = null;
        boolean boolean13 = buttonPanel0.mouseMove(event10, (int) '.', (int) (byte) 100);
        javax.swing.JPopupMenu jPopupMenu14 = null;
        buttonPanel0.setComponentPopupMenu(jPopupMenu14);
        java.awt.event.ComponentListener componentListener16 = null;
        buttonPanel0.addComponentListener(componentListener16);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(containerListenerArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertNotNull(ghostList3);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        boolean boolean1 = mainUI0.isFocused();
        java.awt.event.WindowFocusListener windowFocusListener2 = null;
        mainUI0.removeWindowFocusListener(windowFocusListener2);
        boolean boolean4 = mainUI0.isOpaque();
        mainUI0.setState((int) (byte) 1);
        java.awt.dnd.DropTarget dropTarget7 = mainUI0.getDropTarget();
        java.awt.Graphics graphics8 = null;
        mainUI0.paintAll(graphics8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dropTarget7);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        boolean boolean4 = buttonPanel0.requestFocus(false);
        buttonPanel0.doLayout();
        boolean boolean6 = buttonPanel0.isCursorSet();
        java.awt.Image image7 = null;
        org.jpacman.framework.ui.ButtonPanel buttonPanel8 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics9 = null;
        buttonPanel8.printComponents(graphics9);
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics13 = null;
        buttonPanel12.printComponents(graphics13);
        java.awt.Component component15 = buttonPanel8.add("[32,52]", (java.awt.Component) buttonPanel12);
        int int16 = buttonPanel0.checkImage(image7, (java.awt.image.ImageObserver) component15);
        buttonPanel0.setToolTipText("org.jpacman.framework.ui.MainUI[frame7,0,23,0x0,invalid,hidden,disabled,layout=java.awt.BorderLayout,title=,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(component15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        buttonPanel0.setRequestFocusEnabled(false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        java.awt.Graphics graphics2 = null;
        mainUI0.paint(graphics2);
        java.awt.MenuBar menuBar4 = null;
        mainUI0.setMenuBar(menuBar4);
        mainUI0.setEnabled(false);
        java.awt.Event event8 = null;
        boolean boolean11 = mainUI0.mouseUp(event8, 3, (int) (short) 1);
        mainUI0.setAutoRequestFocus(false);
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile((int) ' ', (int) '4');
        int int3 = tile2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        boolean boolean2 = game0.won();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover3 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game0);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover4 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game0);
        java.awt.event.ActionEvent actionEvent5 = null;
        try {
            randomGhostMover4.actionPerformed(actionEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        java.awt.Insets insets8 = buttonPanel0.getInsets();
        boolean boolean9 = buttonPanel0.isFocusTraversalPolicySet();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNotNull(insets8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isFocusable();
        java.awt.MenuComponent menuComponent9 = null;
        buttonPanel4.remove(menuComponent9);
        java.awt.Cursor cursor11 = buttonPanel4.getCursor();
        java.awt.event.MouseEvent mouseEvent12 = null;
        java.awt.Point point13 = buttonPanel4.getToolTipLocation(mouseEvent12);
        buttonPanel4.enable();
        java.awt.Event event15 = null;
        boolean boolean17 = buttonPanel4.keyUp(event15, (int) (byte) 10);
        javax.swing.JPopupMenu jPopupMenu18 = buttonPanel4.getComponentPopupMenu();
        org.jpacman.framework.ui.MainUI mainUI19 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray20 = mainUI19.getWindowStateListeners();
        org.jpacman.framework.ui.ButtonPanel buttonPanel21 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics22 = null;
        buttonPanel21.printComponents(graphics22);
        org.jpacman.framework.ui.ButtonPanel buttonPanel25 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics26 = null;
        buttonPanel25.printComponents(graphics26);
        java.awt.Component component28 = buttonPanel21.add("[32,52]", (java.awt.Component) buttonPanel25);
        boolean boolean29 = buttonPanel25.isFocusable();
        java.awt.MenuComponent menuComponent30 = null;
        buttonPanel25.remove(menuComponent30);
        buttonPanel25.enable();
        org.jpacman.framework.ui.ButtonPanel buttonPanel33 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics34 = null;
        buttonPanel33.printComponents(graphics34);
        org.jpacman.framework.ui.ButtonPanel buttonPanel37 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics38 = null;
        buttonPanel37.printComponents(graphics38);
        java.awt.Component component40 = buttonPanel33.add("[32,52]", (java.awt.Component) buttonPanel37);
        java.awt.Graphics graphics41 = null;
        buttonPanel33.update(graphics41);
        boolean boolean43 = buttonPanel33.requestFocusInWindow();
        boolean boolean44 = buttonPanel25.isAncestorOf((java.awt.Component) buttonPanel33);
        java.awt.Event event45 = null;
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction46 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction46.notifyObservers();
        org.jpacman.framework.view.BoardView boardView48 = null;
        org.jpacman.framework.view.Animator animator49 = new org.jpacman.framework.view.Animator(boardView48);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction50 = pacmanInteraction46.controlling((org.jpacman.framework.controller.IController) animator49);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction51 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction51.notifyObservers();
        org.jpacman.framework.view.BoardView boardView53 = null;
        org.jpacman.framework.view.Animator animator54 = new org.jpacman.framework.view.Animator(boardView53);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction55 = pacmanInteraction51.controlling((org.jpacman.framework.controller.IController) animator54);
        pacmanInteraction50.deleteObserver((java.util.Observer) pacmanInteraction51);
        pacmanInteraction51.up();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction58 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction58.notifyObservers();
        org.jpacman.framework.view.BoardView boardView60 = null;
        org.jpacman.framework.view.Animator animator61 = new org.jpacman.framework.view.Animator(boardView60);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction62 = pacmanInteraction58.controlling((org.jpacman.framework.controller.IController) animator61);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction63 = pacmanInteraction51.controlling((org.jpacman.framework.controller.IController) animator61);
        boolean boolean64 = buttonPanel33.gotFocus(event45, (java.lang.Object) animator61);
        org.jpacman.framework.ui.MainUI mainUI65 = mainUI19.withGhostController((org.jpacman.framework.controller.IController) animator61);
        java.awt.Color color66 = mainUI19.getBackground();
        boolean boolean67 = buttonPanel4.isFocusCycleRoot((java.awt.Container) mainUI19);
        buttonPanel4.paintImmediately((int) (short) 10, (int) '4', 1, (int) ' ');
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cursor11);
        org.junit.Assert.assertNull(point13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(jPopupMenu18);
        org.junit.Assert.assertNotNull(windowStateListenerArray20);
        org.junit.Assert.assertNotNull(component28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(component40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(pacmanInteraction50);
        org.junit.Assert.assertNotNull(pacmanInteraction55);
        org.junit.Assert.assertNotNull(pacmanInteraction62);
        org.junit.Assert.assertNotNull(pacmanInteraction63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(mainUI65);
        org.junit.Assert.assertNotNull(color66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        boolean boolean4 = buttonPanel0.requestFocus(false);
        buttonPanel0.doLayout();
        boolean boolean6 = buttonPanel0.isCursorSet();
        java.awt.Image image7 = null;
        org.jpacman.framework.ui.ButtonPanel buttonPanel8 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics9 = null;
        buttonPanel8.printComponents(graphics9);
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics13 = null;
        buttonPanel12.printComponents(graphics13);
        java.awt.Component component15 = buttonPanel8.add("[32,52]", (java.awt.Component) buttonPanel12);
        int int16 = buttonPanel0.checkImage(image7, (java.awt.image.ImageObserver) component15);
        java.awt.event.MouseMotionListener mouseMotionListener17 = null;
        component15.removeMouseMotionListener(mouseMotionListener17);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(component15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        boolean boolean4 = buttonPanel0.requestFocus(false);
        buttonPanel0.doLayout();
        buttonPanel0.setDebugGraphicsOptions((int) (byte) 1);
        buttonPanel0.list();
        java.awt.Dimension dimension9 = buttonPanel0.minimumSize();
        java.awt.Dimension dimension10 = buttonPanel0.getMaximumSize();
        javax.swing.event.AncestorListener ancestorListener11 = null;
        buttonPanel0.addAncestorListener(ancestorListener11);
        java.awt.Graphics graphics13 = null;
        buttonPanel0.paintAll(graphics13);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertNotNull(dimension10);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        boolean boolean2 = mainUI0.isResizable();
        mainUI0.setAlwaysOnTop(true);
        mainUI0.setExtendedState((int) '#');
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        java.awt.Graphics graphics8 = null;
        buttonPanel0.update(graphics8);
        boolean boolean10 = buttonPanel0.requestFocusInWindow();
        java.awt.Dimension dimension11 = buttonPanel0.getPreferredSize();
        org.jpacman.framework.ui.ButtonPanel buttonPanel13 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics14 = null;
        buttonPanel13.printComponents(graphics14);
        org.jpacman.framework.ui.ButtonPanel buttonPanel17 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics18 = null;
        buttonPanel17.printComponents(graphics18);
        java.awt.Component component20 = buttonPanel13.add("[32,52]", (java.awt.Component) buttonPanel17);
        boolean boolean21 = buttonPanel17.isRequestFocusEnabled();
        boolean boolean22 = buttonPanel17.isEnabled();
        buttonPanel17.setDebugGraphicsOptions((int) (byte) -1);
        java.awt.Color color25 = null;
        buttonPanel17.setForeground(color25);
        javax.swing.JPopupMenu jPopupMenu27 = buttonPanel17.getComponentPopupMenu();
        java.awt.Component component28 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel17);
        java.awt.Event event29 = null;
        boolean boolean32 = component28.mouseMove(event29, 2, (int) 'G');
        java.awt.Rectangle rectangle33 = component28.bounds();
        java.awt.peer.ComponentPeer componentPeer34 = component28.getPeer();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertNotNull(component20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(jPopupMenu27);
        org.junit.Assert.assertNotNull(component28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(rectangle33);
        org.junit.Assert.assertNull(componentPeer34);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        buttonPanel0.firePropertyChange("ToolTipText", ' ', ' ');
        java.awt.Graphics graphics18 = null;
        buttonPanel0.paintComponents(graphics18);
        buttonPanel0.disable();
        org.junit.Assert.assertNotNull(component8);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel2 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        buttonPanel2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component5 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel2);
        int int8 = buttonPanel0.getBaseline(8, 1);
        boolean boolean10 = buttonPanel0.requestFocus(false);
        java.awt.event.MouseMotionListener mouseMotionListener11 = null;
        buttonPanel0.addMouseMotionListener(mouseMotionListener11);
        buttonPanel0.hide();
        java.awt.Graphics graphics14 = null;
        buttonPanel0.printAll(graphics14);
        boolean boolean16 = buttonPanel0.isEnabled();
        java.awt.im.InputContext inputContext17 = buttonPanel0.getInputContext();
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(inputContext17);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray2 = buttonPanel0.getContainerListeners();
        boolean boolean4 = buttonPanel0.requestFocus(false);
        buttonPanel0.doLayout();
        boolean boolean6 = buttonPanel0.isRequestFocusEnabled();
        java.awt.Container container7 = buttonPanel0.getTopLevelAncestor();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(container7);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        javax.swing.event.AncestorListener[] ancestorListenerArray4 = buttonPanel0.getAncestorListeners();
        buttonPanel0.validate();
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel8 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.event.MouseWheelListener mouseWheelListener9 = null;
        buttonPanel8.removeMouseWheelListener(mouseWheelListener9);
        java.awt.Component component11 = buttonPanel6.add("[32,52]", (java.awt.Component) buttonPanel8);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        buttonPanel8.removePropertyChangeListener("[32,52]", propertyChangeListener13);
        org.jpacman.framework.ui.ButtonPanel buttonPanel15 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior16 = buttonPanel15.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray17 = buttonPanel15.getContainerListeners();
        boolean boolean19 = buttonPanel15.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray20 = buttonPanel15.getContainerListeners();
        java.awt.image.ImageProducer imageProducer21 = null;
        java.awt.Image image22 = buttonPanel15.createImage(imageProducer21);
        org.jpacman.framework.ui.ButtonPanel buttonPanel23 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior24 = buttonPanel23.getBaselineResizeBehavior();
        int int25 = buttonPanel23.getWidth();
        float float26 = buttonPanel23.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray27 = buttonPanel23.getKeyListeners();
        int int28 = buttonPanel8.checkImage(image22, (java.awt.image.ImageObserver) buttonPanel23);
        org.jpacman.framework.ui.ButtonPanel buttonPanel29 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel30 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics31 = null;
        buttonPanel30.printComponents(graphics31);
        org.jpacman.framework.ui.ButtonPanel buttonPanel34 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics35 = null;
        buttonPanel34.printComponents(graphics35);
        java.awt.Component component37 = buttonPanel30.add("[32,52]", (java.awt.Component) buttonPanel34);
        java.awt.Graphics graphics38 = null;
        buttonPanel30.update(graphics38);
        org.jpacman.framework.view.BoardView boardView40 = null;
        org.jpacman.framework.view.Animator animator41 = new org.jpacman.framework.view.Animator(boardView40);
        buttonPanel29.add((java.awt.Component) buttonPanel30, (java.lang.Object) animator41);
        java.awt.event.ComponentListener[] componentListenerArray43 = buttonPanel29.getComponentListeners();
        int int44 = buttonPanel0.checkImage(image22, (java.awt.image.ImageObserver) buttonPanel29);
        java.beans.VetoableChangeListener vetoableChangeListener45 = null;
        buttonPanel29.removeVetoableChangeListener(vetoableChangeListener45);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(ancestorListenerArray4);
        org.junit.Assert.assertNotNull(component11);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior16 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior16.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(containerListenerArray20);
        org.junit.Assert.assertNotNull(image22);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior24 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior24.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.5f + "'", float26 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(componentListenerArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        int int14 = buttonPanel0.getDebugGraphicsOptions();
        java.awt.event.ContainerListener[] containerListenerArray15 = buttonPanel0.getContainerListeners();
        javax.swing.KeyStroke[] keyStrokeArray16 = buttonPanel0.getRegisteredKeyStrokes();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray18 = buttonPanel0.getPropertyChangeListeners("");
        boolean boolean19 = buttonPanel0.isOptimizedDrawingEnabled();
        java.awt.event.MouseWheelListener mouseWheelListener20 = null;
        buttonPanel0.addMouseWheelListener(mouseWheelListener20);
        try {
            javax.swing.InputMap inputMap23 = buttonPanel0.getInputMap((int) 'G');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(containerListenerArray15);
        org.junit.Assert.assertNotNull(keyStrokeArray16);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        java.awt.event.KeyListener[] keyListenerArray4 = buttonPanel0.getKeyListeners();
        boolean boolean5 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) buttonPanel0);
        buttonPanel0.updateUI();
        javax.swing.event.AncestorListener ancestorListener7 = null;
        buttonPanel0.removeAncestorListener(ancestorListener7);
        boolean boolean9 = buttonPanel0.requestFocusInWindow();
        java.lang.String str10 = buttonPanel0.getUIClassID();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(keyListenerArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "PanelUI" + "'", str10.equals("PanelUI"));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        java.awt.Graphics graphics2 = null;
        mainUI0.paint(graphics2);
        org.jpacman.framework.ui.MainUI mainUI4 = mainUI0.initialize();
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
        org.junit.Assert.assertNotNull(mainUI4);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        boolean boolean4 = buttonPanel0.hasFocus();
        float float5 = buttonPanel0.getAlignmentY();
        java.awt.Graphics graphics6 = null;
        buttonPanel0.update(graphics6);
        javax.swing.ActionMap actionMap8 = buttonPanel0.getActionMap();
        org.jpacman.framework.ui.ButtonPanel buttonPanel9 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics10 = null;
        buttonPanel9.printComponents(graphics10);
        org.jpacman.framework.ui.ButtonPanel buttonPanel13 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics14 = null;
        buttonPanel13.printComponents(graphics14);
        java.awt.Component component16 = buttonPanel9.add("[32,52]", (java.awt.Component) buttonPanel13);
        java.awt.Graphics graphics17 = null;
        buttonPanel9.update(graphics17);
        boolean boolean19 = buttonPanel9.requestFocusInWindow();
        java.awt.Dimension dimension20 = buttonPanel9.getPreferredSize();
        java.awt.Dimension dimension21 = buttonPanel0.getSize(dimension20);
        javax.swing.TransferHandler transferHandler22 = buttonPanel0.getTransferHandler();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNotNull(actionMap8);
        org.junit.Assert.assertNotNull(component16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertNotNull(dimension21);
        org.junit.Assert.assertNull(transferHandler22);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        int int14 = buttonPanel0.getDebugGraphicsOptions();
        java.awt.event.ContainerListener[] containerListenerArray15 = buttonPanel0.getContainerListeners();
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        buttonPanel0.addInputMethodListener(inputMethodListener16);
        java.awt.event.InputMethodListener inputMethodListener18 = null;
        buttonPanel0.addInputMethodListener(inputMethodListener18);
        java.awt.event.HierarchyListener hierarchyListener20 = null;
        buttonPanel0.addHierarchyListener(hierarchyListener20);
        javax.swing.TransferHandler transferHandler22 = buttonPanel0.getTransferHandler();
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(containerListenerArray15);
        org.junit.Assert.assertNull(transferHandler22);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        boolean boolean2 = game0.won();
        org.jpacman.framework.ui.ButtonPanel buttonPanel3 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics4 = null;
        buttonPanel3.printComponents(graphics4);
        org.jpacman.framework.ui.ButtonPanel buttonPanel7 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics8 = null;
        buttonPanel7.printComponents(graphics8);
        java.awt.Component component10 = buttonPanel3.add("[32,52]", (java.awt.Component) buttonPanel7);
        boolean boolean11 = buttonPanel7.isFocusable();
        java.awt.MenuComponent menuComponent12 = null;
        buttonPanel7.remove(menuComponent12);
        buttonPanel7.enable();
        game0.attach((java.util.Observer) buttonPanel7);
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover16 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game0);
        boolean boolean17 = game0.won();
        org.jpacman.framework.ui.MainUI mainUI18 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray19 = mainUI18.getWindowStateListeners();
        boolean boolean20 = mainUI18.isResizable();
        java.awt.event.WindowFocusListener[] windowFocusListenerArray21 = mainUI18.getWindowFocusListeners();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction22 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction22.notifyObservers();
        org.jpacman.framework.view.BoardView boardView24 = null;
        org.jpacman.framework.view.Animator animator25 = new org.jpacman.framework.view.Animator(boardView24);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction26 = pacmanInteraction22.controlling((org.jpacman.framework.controller.IController) animator25);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction27 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction27.notifyObservers();
        org.jpacman.framework.view.BoardView boardView29 = null;
        org.jpacman.framework.view.Animator animator30 = new org.jpacman.framework.view.Animator(boardView29);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction31 = pacmanInteraction27.controlling((org.jpacman.framework.controller.IController) animator30);
        pacmanInteraction26.deleteObserver((java.util.Observer) pacmanInteraction27);
        pacmanInteraction27.up();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction34 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction34.notifyObservers();
        org.jpacman.framework.view.BoardView boardView36 = null;
        org.jpacman.framework.view.Animator animator37 = new org.jpacman.framework.view.Animator(boardView36);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction38 = pacmanInteraction34.controlling((org.jpacman.framework.controller.IController) animator37);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction39 = pacmanInteraction27.controlling((org.jpacman.framework.controller.IController) animator37);
        org.jpacman.framework.ui.MainUI mainUI40 = mainUI18.withGhostController((org.jpacman.framework.controller.IController) animator37);
        game0.addObserver((java.util.Observer) mainUI18);
        boolean boolean42 = game0.won();
        org.jpacman.framework.model.Level level43 = new org.jpacman.framework.model.Level();
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory44 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game45 = defaultGameFactory44.makeGame();
        level43.setFactory((org.jpacman.framework.factory.IGameFactory) defaultGameFactory44);
        org.jpacman.framework.model.Food food47 = defaultGameFactory44.makeFood();
        org.jpacman.framework.model.Ghost ghost48 = defaultGameFactory44.makeGhost();
        org.jpacman.framework.model.Direction direction49 = org.jpacman.framework.model.Direction.LEFT;
        int int50 = direction49.getDy();
        try {
            game0.moveGhost(ghost48, direction49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(windowStateListenerArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(windowFocusListenerArray21);
        org.junit.Assert.assertNotNull(pacmanInteraction26);
        org.junit.Assert.assertNotNull(pacmanInteraction31);
        org.junit.Assert.assertNotNull(pacmanInteraction38);
        org.junit.Assert.assertNotNull(pacmanInteraction39);
        org.junit.Assert.assertNotNull(mainUI40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(game45);
        org.junit.Assert.assertNotNull(food47);
        org.junit.Assert.assertNotNull(ghost48);
        org.junit.Assert.assertTrue("'" + direction49 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction49.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isRequestFocusEnabled();
        boolean boolean9 = buttonPanel4.isValid();
        java.awt.dnd.DropTarget dropTarget10 = buttonPanel4.getDropTarget();
        int int11 = buttonPanel4.getHeight();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dropTarget10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel1 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics2 = null;
        buttonPanel1.printComponents(graphics2);
        org.jpacman.framework.ui.ButtonPanel buttonPanel5 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics6 = null;
        buttonPanel5.printComponents(graphics6);
        java.awt.Component component8 = buttonPanel1.add("[32,52]", (java.awt.Component) buttonPanel5);
        java.awt.Graphics graphics9 = null;
        buttonPanel1.update(graphics9);
        org.jpacman.framework.view.BoardView boardView11 = null;
        org.jpacman.framework.view.Animator animator12 = new org.jpacman.framework.view.Animator(boardView11);
        buttonPanel0.add((java.awt.Component) buttonPanel1, (java.lang.Object) animator12);
        java.lang.String str14 = buttonPanel1.toString();
        java.awt.Event event15 = null;
        boolean boolean17 = buttonPanel1.lostFocus(event15, (java.lang.Object) (short) 100);
        java.awt.dnd.DropTarget dropTarget18 = buttonPanel1.getDropTarget();
        buttonPanel1.setVisible(true);
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "org.jpacman.framework.ui.ButtonPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str14.equals("org.jpacman.framework.ui.ButtonPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(dropTarget18);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) '4', 64);
        try {
            org.jpacman.framework.model.Tile tile5 = board2.tileAt(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(10, (int) 'G');
        int int3 = tile2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        boolean boolean2 = mainUI0.isResizable();
        java.awt.Container container3 = mainUI0.getFocusCycleRootAncestor();
        mainUI0.setExtendedState(3);
        mainUI0.setFocusTraversalPolicyProvider(true);
        org.jpacman.framework.ui.ButtonPanel buttonPanel8 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel9 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics10 = null;
        buttonPanel9.printComponents(graphics10);
        org.jpacman.framework.ui.ButtonPanel buttonPanel13 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics14 = null;
        buttonPanel13.printComponents(graphics14);
        java.awt.Component component16 = buttonPanel9.add("[32,52]", (java.awt.Component) buttonPanel13);
        java.awt.Graphics graphics17 = null;
        buttonPanel9.update(graphics17);
        org.jpacman.framework.view.BoardView boardView19 = null;
        org.jpacman.framework.view.Animator animator20 = new org.jpacman.framework.view.Animator(boardView19);
        buttonPanel8.add((java.awt.Component) buttonPanel9, (java.lang.Object) animator20);
        int int22 = buttonPanel8.getDebugGraphicsOptions();
        java.awt.event.ContainerListener[] containerListenerArray23 = buttonPanel8.getContainerListeners();
        javax.swing.KeyStroke[] keyStrokeArray24 = buttonPanel8.getRegisteredKeyStrokes();
        buttonPanel8.enable(false);
        javax.swing.border.Border border27 = buttonPanel8.getBorder();
        org.jpacman.framework.ui.ButtonPanel buttonPanel28 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel29 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics30 = null;
        buttonPanel29.printComponents(graphics30);
        org.jpacman.framework.ui.ButtonPanel buttonPanel33 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics34 = null;
        buttonPanel33.printComponents(graphics34);
        java.awt.Component component36 = buttonPanel29.add("[32,52]", (java.awt.Component) buttonPanel33);
        java.awt.Graphics graphics37 = null;
        buttonPanel29.update(graphics37);
        org.jpacman.framework.view.BoardView boardView39 = null;
        org.jpacman.framework.view.Animator animator40 = new org.jpacman.framework.view.Animator(boardView39);
        buttonPanel28.add((java.awt.Component) buttonPanel29, (java.lang.Object) animator40);
        org.jpacman.framework.ui.ButtonPanel buttonPanel42 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior43 = buttonPanel42.getBaselineResizeBehavior();
        int int44 = buttonPanel42.getWidth();
        float float45 = buttonPanel42.getAlignmentY();
        boolean boolean46 = buttonPanel42.hasFocus();
        float float47 = buttonPanel42.getAlignmentY();
        org.jpacman.framework.ui.ButtonPanel buttonPanel48 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior49 = buttonPanel48.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray50 = buttonPanel48.getContainerListeners();
        boolean boolean52 = buttonPanel48.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray53 = buttonPanel48.getContainerListeners();
        java.awt.Rectangle rectangle54 = null;
        java.awt.Rectangle rectangle55 = buttonPanel48.getBounds(rectangle54);
        buttonPanel42.paintImmediately(rectangle55);
        javax.swing.border.Border border57 = null;
        buttonPanel42.setBorder(border57);
        java.awt.Point point59 = buttonPanel42.location();
        java.awt.Point point60 = buttonPanel28.getLocation(point59);
        boolean boolean61 = buttonPanel8.contains(point59);
        boolean boolean62 = mainUI0.contains(point59);
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(container3);
        org.junit.Assert.assertNotNull(component16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(containerListenerArray23);
        org.junit.Assert.assertNotNull(keyStrokeArray24);
        org.junit.Assert.assertNull(border27);
        org.junit.Assert.assertNotNull(component36);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior43 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior43.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.5f + "'", float45 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.5f + "'", float47 == 0.5f);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior49 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior49.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(containerListenerArray53);
        org.junit.Assert.assertNotNull(rectangle55);
        org.junit.Assert.assertNotNull(point59);
        org.junit.Assert.assertNotNull(point60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction0 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction0.notifyObservers();
        org.jpacman.framework.view.BoardView boardView2 = null;
        org.jpacman.framework.view.Animator animator3 = new org.jpacman.framework.view.Animator(boardView2);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction4 = pacmanInteraction0.controlling((org.jpacman.framework.controller.IController) animator3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction5.notifyObservers();
        org.jpacman.framework.view.BoardView boardView7 = null;
        org.jpacman.framework.view.Animator animator8 = new org.jpacman.framework.view.Animator(boardView7);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction9 = pacmanInteraction5.controlling((org.jpacman.framework.controller.IController) animator8);
        pacmanInteraction4.deleteObserver((java.util.Observer) pacmanInteraction5);
        org.jpacman.framework.ui.MainUI mainUI11 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray12 = mainUI11.getWindowStateListeners();
        java.awt.Graphics graphics13 = null;
        mainUI11.paint(graphics13);
        java.awt.MenuBar menuBar15 = null;
        mainUI11.setMenuBar(menuBar15);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction17 = pacmanInteraction4.withDisposable((org.jpacman.framework.ui.IDisposable) mainUI11);
        java.awt.Dialog.ModalExclusionType modalExclusionType18 = null;
        mainUI11.setModalExclusionType(modalExclusionType18);
        java.awt.Event event20 = null;
        boolean boolean23 = mainUI11.mouseEnter(event20, (int) (short) 0, (int) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        mainUI11.addPropertyChangeListener(propertyChangeListener24);
        mainUI11.pack();
        org.junit.Assert.assertNotNull(pacmanInteraction4);
        org.junit.Assert.assertNotNull(pacmanInteraction9);
        org.junit.Assert.assertNotNull(windowStateListenerArray12);
        org.junit.Assert.assertNotNull(pacmanInteraction17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isRequestFocusEnabled();
        boolean boolean9 = buttonPanel4.isEnabled();
        buttonPanel4.setDebugGraphicsOptions((int) (byte) -1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior13 = buttonPanel12.getBaselineResizeBehavior();
        int int14 = buttonPanel12.getWidth();
        float float15 = buttonPanel12.getAlignmentY();
        boolean boolean16 = buttonPanel12.hasFocus();
        float float17 = buttonPanel12.getAlignmentY();
        java.awt.Graphics graphics18 = null;
        buttonPanel12.update(graphics18);
        buttonPanel12.reshape(8, 32, 64, (int) '.');
        java.awt.Color color25 = buttonPanel12.getForeground();
        buttonPanel4.setForeground(color25);
        buttonPanel4.setEnabled(false);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior13 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior13.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNotNull(color25);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        java.lang.String str2 = mainUI0.getTitle();
        javax.swing.JLayeredPane jLayeredPane3 = mainUI0.getLayeredPane();
        boolean boolean4 = mainUI0.isActive();
        javax.swing.TransferHandler transferHandler5 = null;
        mainUI0.setTransferHandler(transferHandler5);
        boolean boolean7 = mainUI0.isAutoRequestFocus();
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNotNull(jLayeredPane3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.jpacman.framework.ui.MainUI mainUI0 = new org.jpacman.framework.ui.MainUI();
        java.awt.event.WindowStateListener[] windowStateListenerArray1 = mainUI0.getWindowStateListeners();
        java.awt.Graphics graphics2 = null;
        mainUI0.paint(graphics2);
        java.awt.MenuBar menuBar4 = null;
        mainUI0.setMenuBar(menuBar4);
        java.awt.MenuComponent menuComponent6 = null;
        mainUI0.remove(menuComponent6);
        javax.swing.JMenuBar jMenuBar8 = null;
        mainUI0.setJMenuBar(jMenuBar8);
        org.junit.Assert.assertNotNull(windowStateListenerArray1);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        boolean boolean4 = buttonPanel0.hasFocus();
        float float5 = buttonPanel0.getAlignmentY();
        org.jpacman.framework.ui.ButtonPanel buttonPanel6 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior7 = buttonPanel6.getBaselineResizeBehavior();
        java.awt.event.ContainerListener[] containerListenerArray8 = buttonPanel6.getContainerListeners();
        boolean boolean10 = buttonPanel6.requestFocus(false);
        java.awt.event.ContainerListener[] containerListenerArray11 = buttonPanel6.getContainerListeners();
        java.awt.Rectangle rectangle12 = null;
        java.awt.Rectangle rectangle13 = buttonPanel6.getBounds(rectangle12);
        buttonPanel0.paintImmediately(rectangle13);
        javax.swing.border.Border border15 = null;
        buttonPanel0.setBorder(border15);
        java.awt.Insets insets17 = buttonPanel0.getInsets();
        java.awt.Dimension dimension18 = buttonPanel0.getPreferredSize();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior7 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior7.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(containerListenerArray11);
        org.junit.Assert.assertNotNull(rectangle13);
        org.junit.Assert.assertNotNull(insets17);
        org.junit.Assert.assertNotNull(dimension18);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior1 = buttonPanel0.getBaselineResizeBehavior();
        int int2 = buttonPanel0.getWidth();
        float float3 = buttonPanel0.getAlignmentY();
        boolean boolean4 = buttonPanel0.hasFocus();
        float float5 = buttonPanel0.getAlignmentY();
        java.awt.Graphics graphics6 = null;
        buttonPanel0.update(graphics6);
        buttonPanel0.reshape(8, 32, 64, (int) '.');
        java.beans.PropertyChangeListener[] propertyChangeListenerArray14 = buttonPanel0.getPropertyChangeListeners("");
        javax.swing.border.Border border15 = buttonPanel0.getBorder();
        javax.swing.JRootPane jRootPane16 = buttonPanel0.getRootPane();
        try {
            java.awt.image.VolatileImage volatileImage19 = jRootPane16.createVolatileImage(52, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior1 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior1.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray14);
        org.junit.Assert.assertNull(border15);
        org.junit.Assert.assertNull(jRootPane16);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction1 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction1.notifyObservers();
        org.jpacman.framework.view.BoardView boardView3 = null;
        org.jpacman.framework.view.Animator animator4 = new org.jpacman.framework.view.Animator(boardView3);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction5 = pacmanInteraction1.controlling((org.jpacman.framework.controller.IController) animator4);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction6 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction6.notifyObservers();
        org.jpacman.framework.view.BoardView boardView8 = null;
        org.jpacman.framework.view.Animator animator9 = new org.jpacman.framework.view.Animator(boardView8);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction10 = pacmanInteraction6.controlling((org.jpacman.framework.controller.IController) animator9);
        pacmanInteraction5.deleteObserver((java.util.Observer) pacmanInteraction6);
        pacmanInteraction6.up();
        game0.addObserver((java.util.Observer) pacmanInteraction6);
        boolean boolean14 = game0.won();
        int int15 = game0.countObservers();
        org.jpacman.framework.model.IBoardInspector iBoardInspector16 = game0.getBoardInspector();
        org.jpacman.framework.controller.RandomGhostMover randomGhostMover17 = new org.jpacman.framework.controller.RandomGhostMover((org.jpacman.framework.model.IGameInteractor) game0);
        org.jpacman.framework.ui.ButtonPanel buttonPanel18 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel19 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics20 = null;
        buttonPanel19.printComponents(graphics20);
        org.jpacman.framework.ui.ButtonPanel buttonPanel23 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics24 = null;
        buttonPanel23.printComponents(graphics24);
        java.awt.Component component26 = buttonPanel19.add("[32,52]", (java.awt.Component) buttonPanel23);
        java.awt.Graphics graphics27 = null;
        buttonPanel19.update(graphics27);
        org.jpacman.framework.ui.ButtonPanel buttonPanel29 = new org.jpacman.framework.ui.ButtonPanel();
        org.jpacman.framework.ui.ButtonPanel buttonPanel30 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics31 = null;
        buttonPanel30.printComponents(graphics31);
        org.jpacman.framework.ui.ButtonPanel buttonPanel34 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics35 = null;
        buttonPanel34.printComponents(graphics35);
        java.awt.Component component37 = buttonPanel30.add("[32,52]", (java.awt.Component) buttonPanel34);
        java.awt.Graphics graphics38 = null;
        buttonPanel30.update(graphics38);
        org.jpacman.framework.view.BoardView boardView40 = null;
        org.jpacman.framework.view.Animator animator41 = new org.jpacman.framework.view.Animator(boardView40);
        buttonPanel29.add((java.awt.Component) buttonPanel30, (java.lang.Object) animator41);
        java.awt.event.ComponentListener[] componentListenerArray43 = buttonPanel29.getComponentListeners();
        buttonPanel29.setEnabled(true);
        java.awt.Dimension dimension46 = buttonPanel29.getMinimumSize();
        buttonPanel19.setMinimumSize(dimension46);
        buttonPanel18.setPreferredSize(dimension46);
        java.awt.event.HierarchyListener hierarchyListener49 = null;
        buttonPanel18.addHierarchyListener(hierarchyListener49);
        java.awt.Event event51 = null;
        java.lang.Object obj52 = null;
        boolean boolean53 = buttonPanel18.lostFocus(event51, obj52);
        java.awt.Cursor cursor54 = buttonPanel18.getCursor();
        game0.addObserver((java.util.Observer) buttonPanel18);
        org.jpacman.framework.ui.ButtonPanel buttonPanel56 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics57 = null;
        buttonPanel56.printComponents(graphics57);
        java.awt.Dimension dimension59 = buttonPanel56.minimumSize();
        buttonPanel18.setSize(dimension59);
        org.junit.Assert.assertNotNull(pacmanInteraction5);
        org.junit.Assert.assertNotNull(pacmanInteraction10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(iBoardInspector16);
        org.junit.Assert.assertNotNull(component26);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(componentListenerArray43);
        org.junit.Assert.assertNotNull(dimension46);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(cursor54);
        org.junit.Assert.assertNotNull(dimension59);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        boolean boolean2 = game0.won();
        org.jpacman.framework.ui.ButtonPanel buttonPanel3 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics4 = null;
        buttonPanel3.printComponents(graphics4);
        org.jpacman.framework.ui.ButtonPanel buttonPanel7 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics8 = null;
        buttonPanel7.printComponents(graphics8);
        java.awt.Component component10 = buttonPanel3.add("[32,52]", (java.awt.Component) buttonPanel7);
        boolean boolean11 = buttonPanel7.isFocusable();
        java.awt.MenuComponent menuComponent12 = null;
        buttonPanel7.remove(menuComponent12);
        buttonPanel7.enable();
        game0.attach((java.util.Observer) buttonPanel7);
        org.jpacman.framework.model.Board board18 = new org.jpacman.framework.model.Board(128, 1);
        int int19 = board18.getWidth();
        game0.setBoard(board18);
        org.jpacman.framework.model.Level level21 = new org.jpacman.framework.model.Level();
        org.jpacman.framework.factory.DefaultGameFactory defaultGameFactory22 = new org.jpacman.framework.factory.DefaultGameFactory();
        org.jpacman.framework.model.Game game23 = defaultGameFactory22.makeGame();
        level21.setFactory((org.jpacman.framework.factory.IGameFactory) defaultGameFactory22);
        org.jpacman.framework.model.Player player25 = defaultGameFactory22.makePlayer();
        player25.resurrect();
        org.jpacman.framework.model.Direction direction27 = player25.getDirection();
        int int28 = player25.getPoints();
        try {
            board18.put((org.jpacman.framework.model.Sprite) player25, 9, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 128 + "'", int19 == 128);
        org.junit.Assert.assertNotNull(game23);
        org.junit.Assert.assertNotNull(player25);
        org.junit.Assert.assertTrue("'" + direction27 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction27.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.jpacman.framework.ui.ButtonPanel buttonPanel0 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics1 = null;
        buttonPanel0.printComponents(graphics1);
        org.jpacman.framework.ui.ButtonPanel buttonPanel4 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics5 = null;
        buttonPanel4.printComponents(graphics5);
        java.awt.Component component7 = buttonPanel0.add("[32,52]", (java.awt.Component) buttonPanel4);
        boolean boolean8 = buttonPanel4.isFocusable();
        java.awt.MenuComponent menuComponent9 = null;
        buttonPanel4.remove(menuComponent9);
        buttonPanel4.enable();
        org.jpacman.framework.ui.ButtonPanel buttonPanel12 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics13 = null;
        buttonPanel12.printComponents(graphics13);
        org.jpacman.framework.ui.ButtonPanel buttonPanel16 = new org.jpacman.framework.ui.ButtonPanel();
        java.awt.Graphics graphics17 = null;
        buttonPanel16.printComponents(graphics17);
        java.awt.Component component19 = buttonPanel12.add("[32,52]", (java.awt.Component) buttonPanel16);
        java.awt.Graphics graphics20 = null;
        buttonPanel12.update(graphics20);
        boolean boolean22 = buttonPanel12.requestFocusInWindow();
        boolean boolean23 = buttonPanel4.isAncestorOf((java.awt.Component) buttonPanel12);
        java.awt.Event event24 = null;
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction25 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction25.notifyObservers();
        org.jpacman.framework.view.BoardView boardView27 = null;
        org.jpacman.framework.view.Animator animator28 = new org.jpacman.framework.view.Animator(boardView27);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction29 = pacmanInteraction25.controlling((org.jpacman.framework.controller.IController) animator28);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction30 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction30.notifyObservers();
        org.jpacman.framework.view.BoardView boardView32 = null;
        org.jpacman.framework.view.Animator animator33 = new org.jpacman.framework.view.Animator(boardView32);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction34 = pacmanInteraction30.controlling((org.jpacman.framework.controller.IController) animator33);
        pacmanInteraction29.deleteObserver((java.util.Observer) pacmanInteraction30);
        pacmanInteraction30.up();
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction37 = new org.jpacman.framework.ui.PacmanInteraction();
        pacmanInteraction37.notifyObservers();
        org.jpacman.framework.view.BoardView boardView39 = null;
        org.jpacman.framework.view.Animator animator40 = new org.jpacman.framework.view.Animator(boardView39);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction41 = pacmanInteraction37.controlling((org.jpacman.framework.controller.IController) animator40);
        org.jpacman.framework.ui.PacmanInteraction pacmanInteraction42 = pacmanInteraction30.controlling((org.jpacman.framework.controller.IController) animator40);
        boolean boolean43 = buttonPanel12.gotFocus(event24, (java.lang.Object) animator40);
        animator40.stop();
        animator40.stop();
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(component19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(pacmanInteraction29);
        org.junit.Assert.assertNotNull(pacmanInteraction34);
        org.junit.Assert.assertNotNull(pacmanInteraction41);
        org.junit.Assert.assertNotNull(pacmanInteraction42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }
}

