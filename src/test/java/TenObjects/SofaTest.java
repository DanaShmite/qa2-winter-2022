package TenObjects;

import org.junit.jupiter.api.Test;

public class SofaTest {
    @Test
    public void workingWithSofa(){
        Sofa firstSofa = new Sofa();
        firstSofa.setNumberOfSeats(4);
        firstSofa.setColor("Grey");

        Sofa secondSofa = new Sofa();
        secondSofa.setNumberOfSeats(3);
        secondSofa.setColor("beige");

        System.out.println("Number of seats");
        System.out.println("First sofa");
        System.out.println(firstSofa.getNumberOfSeats());
        System.out.println("Second sofa");
        System.out.println(secondSofa.getNumberOfSeats());

        System.out.println("Colors");
        System.out.println("First sofa");
        System.out.println(firstSofa.getColor());
        System.out.println("Second sofa");
        System.out.println(secondSofa.getColor());
    }
}
