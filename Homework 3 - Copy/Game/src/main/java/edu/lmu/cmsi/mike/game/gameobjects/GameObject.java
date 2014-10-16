package edu.lmu.cmsi.mike.game.gameobjects;

import edu.lmu.cmsi.mike.game.core.Coordinate;

public class GameObject {

    private Coordinate location;
    public char type;

    public GameObject(int x, int y) {
        this.location = new Coordinate(x, y);
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
}