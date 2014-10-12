package edu.lmu.cmsi.mike.game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {

  @Test
  public void movementTest() {
      GameCharacter tes = new GameCharacter(0, 0, 0, 1);
      GameCharacter.update();
      int yTest = GameCharacter.getY();
      assertEquals("Failure - character location does not update", 1, yTest);


//    LameSubtract ls = new LameSubtract();
//    int output = ls.subtract(500, 100);
//    assertEquals("failure - subtraction didn't return expected value", 500 - 100, output);
  }
    @Test
    public void collissionTest() {

    }

    @Test
    public void hitTest() {

    }

    @Test
    public void battleTest() {

    }





}