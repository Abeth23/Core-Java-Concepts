package Inheritance;


class Vehicle{
    String brand;

    void startEngine(){
        System.out.println(brand + "Engine started");
    }
}

class Car extends Vehicle{
    int doors;
    
    void showDetails(){
        System.out.println("Brand: " + brand + ", Doors: " + doors);
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.doors = 4;

        car.startEngine();
        car.showDetails();
    }
}
