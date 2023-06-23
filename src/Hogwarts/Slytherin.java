package Hogwarts;

public class Slytherin extends Student {
    private int cunning;
    private int determination;
    private int ambition;
    private int ingenuity;
    private int thirstForPower;

    private Slytherin(String name, String faculty, int magic, int transgression, int cunning, int determination,
                             int ambition, int ingenuity, int thirstForPower) {
        super(name, faculty, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.thirstForPower = thirstForPower;
    }

    public int cunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int determination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int ambition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int ingenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int thirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return "SlytherinStudent{" +
        " Студент: " + super.getName() + ' ' + "Факультет: " + super.getFaculty() +
                ", Магия: " + super.getMagic() +
                ", Трансгрессия: " + super.getTransgression() +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", ingenuity=" + ingenuity +
                ", thirstForPower=" + thirstForPower +
                '}';
    }
}
