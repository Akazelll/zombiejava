package TugasZombie;

public class Zombie implements Destroyable{
    
    int health;
    int level;
    
    public void heal(){}

    public void destroyed(){}

    public String getZombieinfo(){
        return "level = "+level + System.lineSeparator()+
               "health = "+health;
    }
    
}
