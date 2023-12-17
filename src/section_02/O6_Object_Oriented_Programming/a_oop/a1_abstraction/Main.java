package section_02.O6_Object_Oriented_Programming.a_oop.a1_abstraction;

public class Main {
    public static void main(String[] args) {
        Car electricCar = new ElectricCar("BMW");
        System.out.println("Driving the electric car: " + electricCar.getCarType());
        electricCar.speedUp();
        electricCar.slowdown();
        electricCar.turnLeft();
    }
}
