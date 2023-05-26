package Tutorial.OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.setColor("Blue");
        car.setModel("Corvette");
        car.setYear(2019);
        car.setModification(true);

        
        System.out.println(car.getColor());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println(car.getModification());

        car.speedUp();
    }
}
