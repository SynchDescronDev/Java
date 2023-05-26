package Tutorial.OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Range Rover");
        System.out.println(car.getModel());

        Car carTwo = new Car();
        carTwo.setModel("BMW");
        System.out.println(carTwo.getModel());
    }
}
