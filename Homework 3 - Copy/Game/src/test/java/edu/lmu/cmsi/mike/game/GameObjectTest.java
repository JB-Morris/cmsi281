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

public class GameObjectTest {

    public GameObject go;

    @Test
    public void ObjectPointTest() {
        go = new Tree(5, 5);
        int x = go.getX();
        int y = go.getY();
        assertEquals("Failure - Tree didn't return expected x value", 5, x);
        assertEquals("Failure - Tree didn't return expected y value", 5, y);

    }

    @Test
    public void ObjectTypeTest() {
        go = new Rock(5, 5);
        char o = go.getRenderedCharacter();
        assertEquals("Failure - Rock didn't return expected character", 'r', o);

    }

}