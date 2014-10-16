package edu.lmu.cmsi.mike.game.gameobjects;

public class Wall extends GameObject {

//    private GameObject wall;
    public Wall(int x, int y){
        super(x, y);
        makeWall();
    }
        public void makeWall() {
            setType('w');
    //        super.setType?
        }
//    getRenderedCharacter(type);


}