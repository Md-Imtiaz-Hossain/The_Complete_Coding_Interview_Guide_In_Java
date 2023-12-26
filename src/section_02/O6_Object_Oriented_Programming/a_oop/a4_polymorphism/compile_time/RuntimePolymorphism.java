package section_02.O6_Object_Oriented_Programming.a_oop.a4_polymorphism.compile_time;

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.draw();
        triangle.draw("Red");
        triangle.draw( 20, "Yellow");
    }
}
