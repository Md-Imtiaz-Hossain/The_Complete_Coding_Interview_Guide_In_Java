package section_02.O6_Object_Oriented_Programming.a_oop.a3_inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Imtiaz", "IUMS-Team");
        System.out.println(programmer.getName() + " is assigned to the " + programmer.getTeam() + " team.");
    }
}
