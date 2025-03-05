package TugasZombie;

public class JumpingZombie extends Zombie{

    public JumpingZombie(int health, int level){
        this.health=health;
        this.level=level;
    }

    public void heal(){
        switch(level){
            case 1:
                health+=30;
                System.out.println("Zombie meregen 30 HP");
                break;
            case 2:
                health+=40;
                System.out.println("Zombie meregen 40 HP");
                break;
            case 3:
                health+=50;
                System.out.println("Zombie meregen 50 HP"); 
                break;
        }
        
    }

    public void destroyed(){
        health-=1;
        System.out.println("memberikan damage 1 HP ke Jumping Zombie");
    }

    public String getZombieinfo(){
        return  "Jumping Zombie"+"\n"+
                "level = "+level + "\n"+
                "health = "+health+
                "\n";
    }

}