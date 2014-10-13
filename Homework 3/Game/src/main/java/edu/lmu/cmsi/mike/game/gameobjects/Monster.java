package edu.lmu.cmsi.mike.game.gameobjects;

public class Monster extends GameCharacter{

    public Monster(int x, int y, int dx, int dy, char m){
        super(x, y, dx, dy);
        if(m == 'z'){
            makeMonsterZ();
        }else if(m == 'x'){
            makeMonsterX();
        }else if(m == 'a'){
            makeMonsterA();
        }else if(m == 's'){
            makeMonsterS();
        }


    }
    public void makeMonsterZ(){
        setType('z');
    }
    public void makeMonsterX(){
        setType('x');
    }
    public void makeMonsterA(){
        setType('a');
    }
    public void makeMonsterS(){
        setType('s');
    }

    public boolean checkBattle(Player p) {
        boolean battle = false;
        double chance = 0.0;
        if (this.getX() == p.getX() && this.getY() == p.getY()){
            battle = true;
            char t = this.getRenderedCharacter();
            if(t == 'z' || t == 'x'){
                chance = .5;
            }else if(t == 'a' || t == 's') {
                chance = .5;
            }
            if ((Math.random() + .01) <= chance){
                addHit();
            }
        }
        return battle;
    }
}

