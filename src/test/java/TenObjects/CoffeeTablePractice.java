package TenObjects;

import org.junit.jupiter.api.Test;

public class CoffeeTablePractice {
    @Test
       public void workingWithCoffeeTable() {
       CoffeeTable firstCoffeeTable = new CoffeeTable();

       firstCoffeeTable.setBaseMaterial("wood");
       firstCoffeeTable.setHeight(34);

       CoffeeTable secondCoffeeTable = new CoffeeTable();

       secondCoffeeTable.setBaseMaterial("metal");
       secondCoffeeTable.setHeight(65);

        System.out.println("First table");
        System.out.println("First coffee table base material");
        System.out.println(firstCoffeeTable.getBaseMaterial());
           System.out.println("First coffee table height");
        System.out.println(firstCoffeeTable.getHeight());

        System.out.println("Second table");
           System.out.println("Second table base material");
           System.out.println(secondCoffeeTable.getBaseMaterial());
           System.out.println("Second table height");
           System.out.println(secondCoffeeTable.getHeight());

    }
}
