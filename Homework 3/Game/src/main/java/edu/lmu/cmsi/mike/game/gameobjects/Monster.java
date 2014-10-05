package edu.lmu.cmsi.mike.game.gameobjects;

import edu.lmu.cmsi.mike.game.core.Coordinate;
import edu.lmu.cmsi.mike.game.core.Displacement;

import edu.lmu.cmsi.mike.game.gameobjects.Wall;

public class Monster extends Character{

  private Coordinate location;
  private Displacement displacement;

    public Monster = new Character;

  public char getRenderedCharacter() {
    return 'm';
  }


  }

  // You need to know about all this if you want to continue down this path
  //public void checkCollision(Player m);
  //public void checkCollision(Boss b);
}