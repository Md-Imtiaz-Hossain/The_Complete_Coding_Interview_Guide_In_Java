package section_02.O6_Object_Oriented_Programming.a_oop.a2_eccapsulation;

public class CatDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.feed();
        cat.play();
        cat.feed();
        cat.sleep();

        System.out.println("Energy: " + cat.getEnergy());
        System.out.println("Mood: " + cat.getMood());
        System.out.println("Hungry: " + cat.getHungry());
    }
}
