package section_02.O6_Object_Oriented_Programming.a_oop.a4_polymorphism.run_time;

public class RuntimePolymorphism {
    public static void main(String[] args) {

        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        triangle.draw();
        rectangle.draw();
        circle.draw();
    }
}
