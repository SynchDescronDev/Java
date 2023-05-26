package Tutorial.OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
        
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Truck truck = new Truck();

        vehicle.honk();
        car.honk();
        truck.honk();
    }
}
