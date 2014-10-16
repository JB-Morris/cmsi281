package edu.lmu.cmsi.mike.game.engine;

import edu.lmu.cmsi.mike.game.gameobjects.Wall;
import edu.lmu.cmsi.mike.game.gameobjects.Player;
import edu.lmu.cmsi.mike.game.gameobjects.Monster;
import edu.lmu.cmsi.mike.game.gameobjects.Boss;
import edu.lmu.cmsi.mike.game.gameobjects.Tree;
import edu.lmu.cmsi.mike.game.gameobjects.Rock;


import java.lang.Character;

public class GameEngine {

  private int frame;
  private int size;

  // Game Objects
  private Wall[] walls;
  private Player player;
  private Monster[] monsters;
  private Tree[] trees;
  private Rock[] rocks;
  private Boss[] bosses;

  public GameEngine(int size) {
    if (size < 1) {
      throw new IllegalArgumentException("The world should exist");
    }
    this.frame = 0;
    this.size = size;

    // do this in a separate method to keep the constructor clean
    this.createWalls();

    this.player = new Player(1, 2, 0, 1);
    this.monsters = new Monster[4];
    this.monsters[0] = new Monster(4, 3, 1, 0, 's');
    this.monsters[1] = new Monster(10, 12, 0, 1, 'a');
    this.monsters[2] = new Monster(8, 17, 1, 1, 'x');
    this.monsters[3] = new Monster(5, 14, 1, 1, 'z');
    this.trees = new Tree[3];
    this.trees[0] = new Tree(2,2);
    this.trees[1] = new Tree(5,6);
    this.trees[2] = new Tree(10,8);
    this.rocks = new Rock[2];
    this.rocks[0] = new Rock(2,3);
    this.rocks[1] = new Rock(5,8);
    this.bosses = new Boss[2];
    this.bosses[0] = new Boss(18, 18, 0, 0, 'o');
    this.bosses[1] = new Boss(1, 18, 0, 0, 'k');
  }

  private void createWalls() {
    // Let's create walls
    //for now, we only care about putting walls on the edges

    int wallCount = 0;

    // calculate the amount of walls we'll need
    this.walls = new Wall[this.size * 4 - 4];

    for (int x = 0; x < this.size; x++) {
      Wall x1 = new Wall(x, 0);
      walls[wallCount++] = x1;
      Wall x2 = new Wall(x, this.size - 1);
      walls[wallCount++] = x2;
    }

    for (int y = 1; y < size - 1; y++) {
      Wall y1 = new Wall(0, y);
      walls[wallCount++] = y1;
      Wall y2 = new Wall(this.size - 1, y);
      walls[wallCount++] = y2;
    }

  }

  // the main upadte loop
  public void update() {
    this.frame++;
    this.render();
    this.updateObjects();
    this.checkCollisions();
    this.checkHits();
    this.checkBossBattles();
    this.checkMonsterBattles();
  }

  private void render() {
    // Strings are a bit overkill here but easier to represent a String as a null than a character
    String[][] renderedWorld = new String[this.size][this.size];

    //walls
    for (int i = 0; i < this.walls.length; i++) {
      Wall w = this.walls[i];
      renderedWorld[w.getY()][w.getX()] = Character.toString(w.getRenderedCharacter());
    }

    renderedWorld[this.player.getY()][this.player.getX()] =
        Character.toString(this.player.getRenderedCharacter());

    // monster
    for (int i = 0; i < this.monsters.length; i++) {
      Monster m = this.monsters[i];
      renderedWorld[m.getY()][m.getX()] = Character.toString(m.getRenderedCharacter());

    }

    //trees
     for (int i = 0; i < this.trees.length; i++) {
          Tree t = this.trees[i];
         renderedWorld[t.getY()][t.getX()] = Character.toString(t.getRenderedCharacter());
      }
//rocks
     for (int i = 0; i < this.rocks.length; i++) {
          Rock r = this.rocks[i];
          renderedWorld[r.getY()][r.getX()] = Character.toString(r.getRenderedCharacter());
      }

//bosses
      for (int i = 0; i < this.bosses.length; i++) {
          Boss b = this.bosses[i];
          renderedWorld[b.getY()][b.getX()] = Character.toString(b.getRenderedCharacter());
      }

    System.out.println("=========================");
    System.out.println("Frame: " + this.frame);  // book keeping

    for (int row = 0; row < renderedWorld.length; row++) {
      String[] rowOfWorld = renderedWorld[row];
      for (int col = 0; col < rowOfWorld.length; col++) {
        String w = rowOfWorld[col];
        // If our string is null
        if (w == null) {
          w = ".";
        }
        System.out.print(w + " ");
      }
      System.out.println(""); // print a new line between each scene
    }

    System.out.println("=========================");

    System.out.println("Hits: Player: " + player.getHits());
    for (int i = 0; i < this.monsters.length; i++) {
        int x = i + 1;
        System.out.println("Hits: Monster " + x + " (type: " + monsters[i].getRenderedCharacter() + "): " + monsters[i].getHits());
    }
    for (int i = 0; i < this.bosses.length; i++) {
        int x = i + 1;
        System.out.println("Hits: boss " + x + " (type: " + bosses[i].getRenderedCharacter() + "): " + bosses[i].getHits());
    }
  }

  private void updateObjects() {
    // everytime we add a new game object, we've got to ho back through
    // every other place and add in more code - such duplication
    this.player.update();
    for (int i = 0; i < this.monsters.length; i++) {
      this.monsters[i].update();
    }
    for (int i = 0; i < this.bosses.length; i++) {
      this.bosses[i].update();
    }
  }

  private void checkCollisions() {
    for (int i = 0; i < this.walls.length; i++) {
      Wall w = this.walls[i];
      this.player.checkCollision(w);
    }
    for (int i = 0; i < this.walls.length; i++) {
      Wall w = this.walls[i];
      for (int j = 0; j < this.monsters.length; j++) {
        this.monsters[j].checkCollision(w);
      }
    }
  }
  private void checkHits() {
      for (int i = 0; i < this.trees.length; i++) {
          Tree t = this.trees[i];
          this.player.checkHit(t);
          for (int j = 0; j < this.monsters.length; j++){
              this.monsters[j].checkHit(t);
          }
          for (int j = 0; j < this.bosses.length; j++){
              this.bosses[j].checkHit(t);
          }
      }

      for (int i = 0; i < this.rocks.length; i++) {
          Rock r = this.rocks[i];
          this.player.checkHit(r);
          for (int j = 0; j < this.monsters.length; j++){
              this.monsters[j].checkHit(r);
          }
          for (int j = 0; j < this.bosses.length; j++){
              this.bosses[j].checkHit(r);
          }
      }
  }


  private void checkMonsterBattles() {
      for (int i = 0; i < this.monsters.length; i++) {
          Monster m = this.monsters[i];
          this.player.checkBattle(m);
          m.checkBattle(player);
      }
  }
  private void checkBossBattles() {
      for (int i = 0; i < this.bosses.length; i++) {
          Boss b = this.bosses[i];
          this.player.checkBattle(b);
          b.checkBattle(player);
      }
  }
}