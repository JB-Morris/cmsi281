package edu.lmu.cmsi.mike.game.gameobjects;

import edu.lmu.cmsi.mike.game.core.Coordinate;
import edu.lmu.cmsi.mike.game.core.Displacement;

public class Character extends GameObject {
    private Coordinate location;
    private Displacement displacement;
    private GameObject character;

    public character(int x, int y, int dx, int dy) {
        this.location = new Coordinate(x, y);
        this.displacement = new Displacement(dx, dy);
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



}