import org.junit.jupiter.api.Test;

public class ObjectsPractice {
    @Test
    public void workingWithOrder() {
       Order firstOrder = new Order();

       firstOrder.setTotalPrice(12.34);
        firstOrder.setAdress("Rigas str. 22");
        firstOrder.setItemCount(9);
        firstOrder.setDepth(3.5);
        Order secondOrder = new Order();
        secondOrder.setTotalPrice(55.67);
        secondOrder.setAdress("Lubanas str. 43-13");
        secondOrder.setItemCount(3);

        System.out.println("Hello, world!");
        System.out.println("1st order:");
        System.out.println(firstOrder.getTotalPrice());

        System.out.println("2nd order:");
        System.out.println(secondOrder.getTotalPrice());
    }
}
