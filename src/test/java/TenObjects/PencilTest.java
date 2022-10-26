package TenObjects;

import org.junit.jupiter.api.Test;

public class PencilTest {
    @Test
    public void workingWithPencil(){
        Pencil firstPencil = new Pencil();

        firstPencil.setSize(15.5);
        firstPencil.setColor("purple");

        Pencil secondPencil = new Pencil();

        secondPencil.setSize(18.7);
        secondPencil.setColor("black");

        System.out.println("First pencil size, cm");
        System.out.println(firstPencil.getSize());
        System.out.println("First pencil color");
        System.out.println(firstPencil.getColor());

        System.out.println("Second pencil size, cm");
        System.out.println(secondPencil.getSize());
        System.out.println("Second pencil color");
        System.out.println(secondPencil.getColor());




    }
}
