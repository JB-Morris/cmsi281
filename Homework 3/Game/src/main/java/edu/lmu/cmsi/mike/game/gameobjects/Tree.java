package edu.lmu.cmsi.mike.game.gameobjects;

public class Tree extends GameObject {

    public Tree(int x, int y) {
        super(x, y);
        makeTree();
    }

    public void makeTree(){
        setType('t');
    }
//    getRenderedCharacter(type);

}