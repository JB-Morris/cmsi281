package edu.lmu.cmsi.mike.game.gameobjects;

public class Player extends GameCharacter{

    public Player(int x, int y, int dx, int dy) {
        super(x, y, dx, dy);
        makePlayer();
    }
    public void makePlayer() {
        setType('p');
    }

    public void checkBattle(GameCharacter e) {
        double chance = 0.0;
        if (this.getX() == e.getX() && this.getY() == e.getY()){
            char t = e.getRenderedCharacter();
            if(t == 'z' || t == 'x'){
                chance = .5;
            }else if(t == 'a' || t == 's') {
                chance = .6;
            }else if(t == 'o' || t == 'k') {
                chance = .7;
            }
            if ((Math.random() + .01) <= chance){
                addHit();
            }
        }
    }


}


