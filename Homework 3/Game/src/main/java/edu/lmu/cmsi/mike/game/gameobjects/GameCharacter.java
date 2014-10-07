package edu.lmu.cmsi.mike.game.gameobjects;

import edu.lmu.cmsi.mike.game.core.Coordinate;
import edu.lmu.cmsi.mike.game.core.Displacement;

public class GameCharacter {
    private Coordinate location;
    private Displacement displacement;
    private int hits = 0;
    public char type;

    public GameCharacter(int x, int y, int dx, int dy) {
        this.location = new Coordinate(x, y);
        this.displacement = new Displacement(dx, dy);
    }

    public int getX() {
        return this.location.getX();
    }

    public int getY() {
        return this.location.getY();
    }

    public void setType(char t) {
        type = t;
    }

    public Coordinate getLocation() {
        return this.location;
    }

    public char getRenderedCharacter() {
         return type;
    }

    public void update() {
        this.location.setX(this.location.getX() + this.displacement.getXDisplacement());
        this.location.setY(this.location.getY() + this.displacement.getYDisplacement());
    }


    public void checkCollision(Wall w) {
        if (this.getX() == w.getX() && this.getY() == w.getY()) {
            displacement.invert();
        }
    }



    public void checkHit(GameObject o) {
        if(this.getX() == o.getX() && this.getY() == o.getY()){
            addHit();
        }
    }

    public void addHit(){
        this.hits = hits ++;
    }

    public int getHits(){
        return hits;
    }

}