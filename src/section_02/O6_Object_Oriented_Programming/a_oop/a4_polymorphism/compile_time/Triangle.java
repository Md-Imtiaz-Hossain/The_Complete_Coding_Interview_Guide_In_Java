package section_02.O6_Object_Oriented_Programming.a_oop.a4_polymorphism.compile_time;

public class Triangle {
    public void draw() {
        System.out.println("Draw default triangle ...");
    }

    public void draw(String color) {
        System.out.println("Draw a triangle of color " + color);
    }

    public void draw(int size, String color) {
        System.out.println("Draw a triangle of color " + color + " and scale it up with the new size of " + size);
    }
}
