package edu.lmu.cmsi.mike.game.gameobjects;

public class Rock extends GameObject {

    public Rock(int x, int y){
        super(x, y);
        makeRock();
    }
    public void makeRock() {
        setType('r');
//        super.setType?
    }
    //GameObject.getRenderedCharacter(type);


}