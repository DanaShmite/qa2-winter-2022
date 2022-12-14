package TenObjects;

import org.junit.jupiter.api.Test;

public class CoffeeTableTest {
    @Test
       public void workingWithCoffeeTable() {
       CoffeeTable firstCoffeeTable = new CoffeeTable();

       firstCoffeeTable.setBaseMaterial("wood");
       firstCoffeeTable.setHeight(34);

       CoffeeTable secondCoffeeTable = new CoffeeTable();

       secondCoffeeTable.setBaseMaterial("metal");
       secondCoffeeTable.setHeight(65);

        System.out.println("First table");
        System.out.println("Base material: "+firstCoffeeTable.getBaseMaterial());
        System.out.println("Height: "+firstCoffeeTable.getHeight());

        System.out.println("Second table");
           System.out.println("Base material: "+secondCoffeeTable.getBaseMaterial());
           System.out.println("Height: "+secondCoffeeTable.getHeight());
    }
}

