package TenObjects;

import org.junit.jupiter.api.Test;

public class TvPractice {
    @Test
    public void workingWithTV(){
        TV firstTV = new TV();
        firstTV.setDiagonal(55);
        firstTV.setColor("black");

        TV secondTV = new TV();
        secondTV.setDiagonal(65);
        secondTV.setColor("stainless steel");

        System.out.println("TV diagonal");
        System.out.println(firstTV.getDiagonal());
        System.out.println(secondTV.getDiagonal());

        System.out.println("TV color");
        System.out.println(firstTV.getColor());
        System.out.println(secondTV.getColor());
    }
}
