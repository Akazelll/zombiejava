package TugasZombie;

public class Tester {

    public static void main(String[] args) {
        WalkingZombie ZJ = new WalkingZombie(100,1);
        JumpingZombie ZL = new JumpingZombie(150, 2);
        Barrier B = new Barrier(175);
        Plant P = new Plant();

        System.out.println(ZJ.getZombieinfo()); 
        System.out.println(ZL.getZombieinfo());
        System.out.println(B.getBarrierInfo());
        System.out.println("----------------------\n");

        for(int i = 1; i<=10; i++){
            P.doDestroy(ZJ);
            P.doDestroy(ZL);
            P.doDestroy(B);
        }

        ZJ.heal();
        ZL.heal();

        System.out.println("\n ----------------------\n");

        
        System.out.println(ZJ.getZombieinfo());
        System.out.println(ZL.getZombieinfo());
        System.out.println(B.getBarrierInfo());

    }
    
}
