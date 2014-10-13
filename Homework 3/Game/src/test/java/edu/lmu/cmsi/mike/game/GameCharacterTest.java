package edu.lmu.cmsi.mike.game.gameobjects;


import edu.lmu.cmsi.mike.game.core.Coordinate;
import edu.lmu.cmsi.mike.game.core.Displacement;
import edu.lmu.cmsi.mike.game.engine.GameEngine;
import edu.lmu.cmsi.mike.game.gameobjects.Wall;
import edu.lmu.cmsi.mike.game.gameobjects.Boss;
import edu.lmu.cmsi.mike.game.gameobjects.GameCharacter;
import edu.lmu.cmsi.mike.game.gameobjects.GameObject;
import edu.lmu.cmsi.mike.game.gameobjects.Monster;
import edu.lmu.cmsi.mike.game.gameobjects.Player;
import edu.lmu.cmsi.mike.game.gameobjects.Rock;
import edu.lmu.cmsi.mike.game.gameobjects.Tree;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GameCharacterTest {

    public GameCharacter ct;


    @Test
    public void playerTypeTest() {
        ct = new Player(0, 0, 0, 0);
        char ty = ct.getRenderedCharacter();
        assertEquals("Failure - Player didn't return expected character", 'p', ty);
    }

    @Test
    public void monsterZTypeTest() {
        ct = new Monster(0, 0, 0, 0, 'z');
        char ty = ct.getRenderedCharacter();
        assertEquals("Failure - Monster Z didn't return expected character", 'z', ty);
    }
    @Test
    public void monsterXTypeTest() {
        ct = new Monster(0, 0, 0, 0, 'x');
        char ty = ct.getRenderedCharacter();
        assertEquals("Failure - Monster X didn't return expected character", 'x', ty);
    }

    @Test
    public void bossKTypeTest() {
        ct = new Boss(0, 0, 0, 0, 'k');
        char ty = ct.getRenderedCharacter();
        assertEquals("Failure - Boss K didn't return expected character", 'k', ty);
    }

    @Test
    public void monsterAMovementTest() {
        ct = new Monster(0, 0, 1, 1, 'a');
        int x = ct.getX();
        int y = ct.getY();
        ct.update();
        x = ct.getX();
        y = ct.getY();
        assertEquals("Failure - Monster A didn't return expected x value", 1, x);
        assertEquals("Failure - Monster A didn't return expected y value", 1, y);
    }

    @Test
    public void playerMonsterBattleTest() {
        Player pt = new Player(0,0,0,0);
        Monster mt = new Monster(0,0,0,0,'s');
        boolean pb = pt.checkBattle(mt);
        boolean mb = mt.checkBattle(pt);
        assertEquals("Failure - Character didn't battle with Monster S", true, pb);
        assertEquals("Failure - Monster S didn't battle with Player", true, mb);
    }
    @Test
    public void monsterBossBattleTest() {
        Player pt = new Player(0,0,0,0);
        Boss bt = new Boss(0,0,0,0,'k');
        boolean pb = pt.checkBattle(bt);
        boolean bb = bt.checkBattle(pt);
        assertEquals("Failure - Character didn't battle with Boss K", true, pb);
        assertEquals("Failure - Boss K didn't battle with Player", true, bb);
    }

    @Test
    public void playerRockCollisionTest() {
        ct = new GameCharacter(0,0,0,0);
        Rock rt = new Rock(0,0);
        boolean h = ct.checkHit(rt);
        assertEquals("Failure - Player didn't hit rock", true, h);

    }

    @Test
    public void playerTreeCollisionTest() {
        ct = new GameCharacter(0,0,0,0);
        Tree tt = new Tree(0,0);
        boolean h = ct.checkHit(tt);
        assertEquals("Failure - Player didn't hit rock", true, h);

    }

}

