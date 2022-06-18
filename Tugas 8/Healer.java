
public class Healer extends Character{
    double randomangka;
    double minimum = 1;
    double maximum = 10 - minimum;
    int turn = 0;
    
    Healer(int HP, int attack, int defense){
        setHP(HP);
        setAttack(attack);
        setDefense(defense);
    }
    
    @Override
    public boolean attack() {
        turn++;
        if(turn == 2){
            turn = 0;
            heal();
        }
        randomangka = ((Math.random()* maximum) + minimum);
        if(randomangka < 8.5 && randomangka >= 1.0){
            return true;
        }
        return false;
    }
    
    public void receiveDamage(int damage){
        if(damage > getDefense()){
            damage = damage - getDefense();
            setHP((getHP() - damage));
            if(getHP() < 0){
                setHP(getAttack() + (-(getAttack())));
            }
        }
    }
    
    public void heal(){
        setHP(getHP() + 25);
    }
    
    public void info() throws ClassNotFoundException
    {
        Class myClass = Class.forName("Healer");
        System.out.println("============ PLAYER ============");
        System.out.println("------------ STATUS -----------");
        System.out.println("Role        : " + myClass.getSimpleName());
        System.out.println("HP          : " + getHP());
        System.out.println("Attack      : " + getAttack());
        System.out.println("Defense     : " + getDefense());
    }
}
