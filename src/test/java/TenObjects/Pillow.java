package TenObjects;

public class Pillow {
    // ---------------ATTRIBUTES-------------
    private double weight;
    private double height;
    private String material;
    private String color;
    private String applicableSeason;
    private String washingMethod;

    //-------G/S------

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

    public String getApplicableSeason() {
        return applicableSeason;
    }

    public void setApplicableSeason(String applicableSeason) {
        this.applicableSeason = applicableSeason;
    }

    public String getWashingMethod() {
        return washingMethod;
    }

    public void setWashingMethod(String washingMethod) {
        this.washingMethod = washingMethod;
    }
}
