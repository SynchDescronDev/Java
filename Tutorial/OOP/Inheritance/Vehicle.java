package Tutorial.OOP.Inheritance;

public class Vehicle {
    private String model;
    private String color;
    private int year;
    public void speedUp(){
        System.out.println("Increase speed");
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
