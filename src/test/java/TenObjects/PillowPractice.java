package TenObjects;

import org.junit.jupiter.api.Test;

public class PillowPractice {
    @Test
    public void workingWithPillow(){
        Pillow firstPillow = new Pillow();
        firstPillow.setWeight(250);
        firstPillow.setWashingMethod("Hand washing");

        Pillow secondPillow = new Pillow();
        secondPillow.setWeight(450);
        secondPillow.setWashingMethod("Hand washing");

        System.out.println("Weight of pillows");
        System.out.println(firstPillow.getWeight());
        System.out.println(secondPillow.getWeight());

        System.out.println("Washing methods");
        System.out.println(firstPillow.getWashingMethod());
        System.out.println(secondPillow.getWashingMethod());
    }
}
