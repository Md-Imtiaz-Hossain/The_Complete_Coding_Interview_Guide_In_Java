package section_02.O6_Object_Oriented_Programming.a_oop.a1_abstraction;

public class ElectricCar implements Car{

    private final String carType;

    public ElectricCar(String carType) {
        this.carType = carType;
    }

    @Override
    public void speedUp() {
        System.out.println("Speed up the electric car");
    }

    @Override
    public void slowdown() {
        System.out.println("Slow down the electric car");
    }

    @Override
    public void turnRight() {
        System.out.println("Turn right the electric car");
    }

    @Override
    public void turnLeft() {
        System.out.println("Turn left the electric car");
    }

    @Override
    public String getCarType() {
        return this.carType;
    }
}
