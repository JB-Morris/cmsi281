//package edu.lmu.cmsi.mike.game.engine;
//
//
//import edu.lmu.cmsi.mike.game.core.Coordinate;
//import edu.lmu.cmsi.mike.game.core.Displacement;
//import edu.lmu.cmsi.mike.game.engine.GameEngine;
//import edu.lmu.cmsi.mike.game.gameobjects.Wall;
//import edu.lmu.cmsi.mike.game.gameobjects.Boss;
//import edu.lmu.cmsi.mike.game.gameobjects.GameCharacter;
//import edu.lmu.cmsi.mike.game.gameobjects.GameObject;
//import edu.lmu.cmsi.mike.game.gameobjects.Monster;
//import edu.lmu.cmsi.mike.game.gameobjects.Player;
//import edu.lmu.cmsi.mike.game.gameobjects.Rock;
//import edu.lmu.cmsi.mike.game.gameobjects.Tree;
//import static org.junit.Assert.assertEquals;
//
//import org.junit.Test;
//
//public class EngineTest {
//
//    GameEngine ge;
//
//  @Test
//  public void environmentTest() {
//    ge = new GameEngine(20);
//
//  }
//  @Test
//  public void hitTest() {
//    ge = new GameEngine(20);
//    Rock rt = new Rock(5,5);
//    Player pt = new Player(5,5,0,1);
//    ge.update();
//    int h = pt.getHits();
//    assertEquals("Failure - Player didn't return expected hits", 1, h);
//
//
//
//    }
//
//    @Test
//    public void collissionTest() {
//
//    }
//
//    @Test
//    public void battleTest() {
//
//    }
//
//
//
//
//
//}