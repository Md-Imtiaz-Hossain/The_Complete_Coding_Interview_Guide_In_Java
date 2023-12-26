package section_02.O6_Object_Oriented_Programming.a_oop.a3_inheritance;

public class Programmer extends Employee {

    private String team;

    public Programmer(String name, String team) {
        super(name);
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
