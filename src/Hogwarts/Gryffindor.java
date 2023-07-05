package Hogwarts;

public class Gryffindor extends HogwartsStudent {
    private int honor;
    private int bravery;
    private int nobility;

    public Gryffindor(String name, String faculty, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, faculty, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    ;

    public int honor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int bravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int nobility() {
        return nobility;
    }


    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "honor=" + honor +
                ", bravery=" + bravery +
                ", nobility=" + nobility +
                '}';
    }

    private int getGryffindorTotalPower() {
        return nobility + honor + bravery;
    }

    public void compareTwoGryffindorStudents(Gryffindor other) {
        if (other.getGryffindorTotalPower() < this.getGryffindorTotalPower()) {
            System.out.println("Ученик " + this.getName() + " сильнее, чем ученик " + other.getName());
        } else if (other.getGryffindorTotalPower() > this.getGryffindorTotalPower()) {
            System.out.println("Ученик " + other.getName() + " сильнее, чем ученик " + this.getName());
        } else {
            System.out.println("Ученики имеют равную силу");
        }
    }
}
