
public class Warrior extends Character{
    
    double randomangka;
    double minimum = 1;
    double maximum = 10 - minimum;
    
    Warrior(int HP, int attack, int defense){
        setHP(HP);
        setAttack(attack);
        setDefense(defense);
    }
    
    @Override
    public boolean attack() {
        randomangka = ((Math.random()* maximum) + minimum);
        if(randomangka < 6.0 && randomangka >= 1.0){
            return true;
        }
        return false;
    }
    @Override
    public void receiveDamage(int damage){
        if(damage > getDefense()){
            damage = damage - getDefense();
            setHP((getHP() - damage));
            if(getHP() < 0){
                setHP(getAttack() + (-(getAttack())));
            }
        }
    }
    public void info() throws ClassNotFoundException
    {
        Class myClass = Class.forName("Warrior");
        System.out.println("============ PLAYER ============");
        System.out.println("------------ STATUS -----------");
        System.out.println("Role        : " + myClass.getSimpleName());
        System.out.println("HP          : " + getHP());
        System.out.println("Attack      : " + getAttack());
        System.out.println("Defense     : " + getDefense());
    }
    
}
