package TenObjects;

import org.junit.jupiter.api.Test;

public class PhoneTest {
    @Test
    public void workingWithPhone(){
        Phone firstPhone = new Phone();
        firstPhone.setBrand("Samsung");
        firstPhone.setWeight(104);


        Phone secondPhone = new Phone();
        secondPhone.setBrand("LG");
        secondPhone.setWeight(108);

        System.out.println("Phone brand");
        System.out.println(firstPhone.getBrand());
        System.out.println(secondPhone.getBrand());

        System.out.println("Phone weight");
        System.out.println(firstPhone.getWeight());
        System.out.println(secondPhone.getWeight());
    }
}
