package TenObjects;

import org.junit.jupiter.api.Test;

public class WardrobeDimensions {
    @Test
    public void workingWithWardrobe(){
        Wardrobe firstWardrobe = new Wardrobe();
        firstWardrobe.setHeight(165);
        firstWardrobe.setWeight(60);
        firstWardrobe.setWidth(60);

        Wardrobe secondWardrobe = new Wardrobe();
        secondWardrobe.setHeight(185);
        secondWardrobe.setWeight(80);
        secondWardrobe.setWidth(60);

        System.out.println("First wardrobe dimensions, cm");
        System.out.println(firstWardrobe.getHeight() + "x" + firstWardrobe.getWeight() + "x" + firstWardrobe.getWidth());

        System.out.println("Second wardrobe dimensions, cm");
        System.out.println(secondWardrobe.getHeight() + "x" + secondWardrobe.getWeight() + "x" + secondWardrobe.getWidth());
    }
}
