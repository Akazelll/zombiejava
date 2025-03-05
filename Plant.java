package TugasZombie;

public class Plant {
    public void doDestroy(Destroyable D){
        if(D instanceof WalkingZombie){
            WalkingZombie WZ = (WalkingZombie) D;
            WZ.destroyed();
        }else if(D instanceof JumpingZombie){
            JumpingZombie JZ = (JumpingZombie) D;
            JZ.destroyed();
        }else if(D instanceof Barrier){
            Barrier B = (Barrier) D;
            B.destroy();
        }
        
    }
}
