package Hogwarts;

public class Ravenclaw extends HogwartsStudent {
    private int cleverness;   // сообразительность
    private int wisdom;       // мудрость
    private int wit;          // остроумие
    private int creativity;   // креативность

    public Ravenclaw(String name, String faculty, int magic, int transgression, int cleverness,
                     int wisdom, int wit, int creativity) {
        super(name, faculty, magic, transgression);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Когтевран: " +
                " Студент: " + super.getName() + ' ' + "Факультет: " + super.getFaculty() +
                ", Магия: " + super.getMagic() +
                ", Трансгрессия: " + super.getTransgression() +
                ", Сообразительность: " + cleverness +
                ", Мудрость: " + wisdom +
                ", Остроумие: " + wit +
                ", Креативность: " + creativity +
                ' ';
    }

    private int getRavenclawTotalPower() {
        return wisdom + wit + creativity;
    }

    public void compareTwoRavenclawStudents(Ravenclaw other) {
        if (other.getRavenclawTotalPower() < this.getRavenclawTotalPower()) {
            System.out.println("Ученик " + this.getName() + " сильнее, чем ученик " + other.getName());
        } else if (other.getRavenclawTotalPower() > this.getRavenclawTotalPower()) {
            System.out.println("Ученик " + other.getName() + " сильнее, чем ученик " + this.getName());
        } else {
            System.out.println("Ученики имеют равную силу");
        }

    }
}
