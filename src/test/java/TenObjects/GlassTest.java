package TenObjects;

import org.junit.jupiter.api.Test;

public class GlassTest {
    @Test
    public void workingWithGlass(){

    Glass redGlass = new Glass();
    redGlass.setCapacity(200);
    redGlass.setMaterial("glass");

    Glass blueGlass = new Glass();
    blueGlass.setCapacity(300);
    blueGlass.setMaterial("plastic");

        System.out.println("Capacity");
        System.out.println("Red glass");
        System.out.println(redGlass.getCapacity());
        System.out.println("Blue glass");
        System.out.println(blueGlass.getCapacity());

        System.out.println("Material");
        System.out.println("Red glass");
        System.out.println(redGlass.getMaterial());
        System.out.println("Blue glass");
        System.out.println(blueGlass.getMaterial());

    }
}
