package TugasZombie;

public class WalkingZombie extends Zombie{
    
    public WalkingZombie(int health, int level){
        this.health=health;
        this.level=level;
    }

    public void heal(){
        switch(level){
            case 1:
                health+=20;
                System.out.println("Zombie meregen 20 HP");
                break;
            case 2:
                health+=30;
                System.out.println("Zombie meregen 30 HP");
                break;
            case 3:
                health+=40;
                System.out.println("Zombie meregen 40 HP");
                break;
        }
        
    }

    public void destroyed(){
        health-=2;
        System.out.println("Memberikan damage 2 HP ke Walking Zombie");
    }

    public String getZombieinfo(){
        return  "Walking Zombie"+"\n"+
                "level = "+level + "\n"+
                "health = "+health+
                "\n";
    }

}