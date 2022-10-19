package HM2;

import org.junit.jupiter.api.Test;

public class RoatTripPractice {
    @Test
    public void workingWithTransport(){
        Transport auto = new Transport();
        auto.setFuelConsumptional(7.5);
        auto.setFuelTankCapacity(70);

        Transport train = new Transport();
        train.setFuelTankCapacity(15720);
        train.setFuelConsumptional(3000);

        Transport airplane = new Transport();
        airplane.setFuelConsumptional(500);
        airplane.setFuelTankCapacity(170000);


    public void workingWithRoad(){
        Road firstRoute = new Road();
        firstRoute.setStartingPoint("Riga");
        firstRoute.setFinishingPoint("Daugavpils");
        firstRoute.setDistance(205);

        Road secondRoute = new Road();
        secondRoute.setStartingPoint("Riga");
        secondRoute.setFinishingPoint("Berlin");
        secondRoute.setDistance(843);

        Road thirdRoute = new Road();
        thirdRoute.setStartingPoint("Riga");
        thirdRoute.setFinishingPoint("Sidney");
        thirdRoute.setDistance(15322);

            System.out.println(firstRoute.getDistance());
            System.out.println(airplane.getFuelConsumptional());
    }
    }
}


