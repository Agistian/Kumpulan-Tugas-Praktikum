
public class Magician extends Character{
    
    double randomangka;
    double minimum = 1;
    double maximum = 10 - minimum;
     
    Magician(int HP, int attack, int defense){
        setHP(HP);
        setAttack(attack);
        setDefense(defense);
    }
    
    @Override
    public boolean attack() {
        randomangka = ((Math.random()* maximum) + minimum);
        if(randomangka < 3.5 && randomangka >= 1.0){
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
    
    public void info() throws ClassNotFoundException
    {
        Class myClass = Class.forName("Magician");
        System.out.println("============ PLAYER ============");
        System.out.println("------------ STATUS -----------");
        System.out.println("Role        : " + myClass.getSimpleName());
        System.out.println("HP          : " + getHP());
        System.out.println("Attack      : " + getAttack());
        System.out.println("Defense     : " + getDefense());
    }
}
