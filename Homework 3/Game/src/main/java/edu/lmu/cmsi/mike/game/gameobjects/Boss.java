package edu.lmu.cmsi.mike.game.gameobjects;

public class Boss extends GameCharacter{

    //private Character player;
    public Boss(int x, int y, int dx, int dy, char b){
        super(x, y, dx, dy);
        if(b == 'o'){
            makeBossO();
        }else if (b == 'k'){
            makeBossK();
        }
    }

    public void makeBossO() {
        setType('o');
    }

    public void makeBossK() {
        setType('k');
    }

    public boolean checkBattle(GameCharacter e) {
        boolean battle = false;
        double chance = 0.0;
        if (this.getX() == e.getX() && this.getY() == e.getY()){
            battle = true;
            char t = this.getRenderedCharacter();
            if(t == 'o' || t == 'k') {
                chance = .3;
            }
            if ((Math.random() + .01) <= chance){
                addHit();
            }
        }
        return battle;
    }
}


