package HomeWorkFirst;

import com.sun.source.tree.WhileLoopTree;
import org.junit.jupiter.api.Test;

public class FloorLampPractice {
    @Test
    public void workingWithFloorLamp(){
        FloorLamp WhiteFloorLamp = new FloorLamp();

        WhiteFloorLamp.setHeight(115);
        WhiteFloorLamp.setInputVoltage(220);

        FloorLamp BlackFloorLamp = new FloorLamp();

        BlackFloorLamp.setHeight(180);
        BlackFloorLamp.setInputVoltage(220);

        System.out.println("Floor lamps height");

        System.out.println(WhiteFloorLamp.getHeight());
        System.out.println(BlackFloorLamp.getHeight());

        System.out.println("Floor lamps voltage");
        System.out.println(WhiteFloorLamp.getInputVoltage());
        System.out.println(BlackFloorLamp.getInputVoltage());



    }
}
