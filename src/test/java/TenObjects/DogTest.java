package TenObjects;

import org.junit.jupiter.api.Test;

public class DogTest {
    @Test
    public void workingWithDog(){
        Dog ChaseDog = new Dog();

        ChaseDog.setGender("male");
        ChaseDog.setAge(3);

        Dog RockDog = new Dog();

        RockDog.setGender("male");
        RockDog.setAge(14);

        System.out.println("Dog's gender");
        System.out.println("Chase gender");
        System.out.println(ChaseDog.getGender());
        System.out.println("Rock gender");
        System.out.println(RockDog.getGender());
        System.out.println("Dog's age");
        System.out.println("Chase age");
        System.out.println(ChaseDog.getAge());
        System.out.println("Rock age");
        System.out.println(RockDog.getAge());

    }
}
