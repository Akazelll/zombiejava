package TugasZombie;

public class Barrier implements Destroyable{

    int strength;

    public Barrier(int strength){
        this.strength=strength;
    }

    public void setStrength(int strength){
        this.strength=strength;
    }
    
    public int getStrength(){
        return strength;
    }

    public void destroy(){
        strength-=1;
        System.out.println("memberikan damage ke Barrier");
    }

    public String getBarrierInfo(){
        return  "Barrier \n"+
                "Strength = "+strength+"\n";
    }

    @Override
    public void destroyed() {}
        
}
