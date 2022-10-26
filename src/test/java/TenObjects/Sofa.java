package TenObjects;

public class Sofa {
    // ---------------ATTRIBUTES-------------
    private double weight;
    private double height;
    private String material;
    private String color;
    private Integer numberOfSeats;
    private String retractableSofa;

    //-------G/S--------

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getRetractableSofa() {
        return retractableSofa;
    }

    public void setRetractableSofa(String retractableSofa) {
        this.retractableSofa = retractableSofa;
    }
}
