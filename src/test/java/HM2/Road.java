package HM2;

public class Road {
    //------ATRIBUTES-----
    private String startingPoint;
    private String FinishingPoint;
    private double distance;

    //----G/S---------


    public String getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }

    public String getFinishingPoint() {
        return FinishingPoint;
    }

    public void setFinishingPoint(String finishingPoint) {
        FinishingPoint = finishingPoint;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
