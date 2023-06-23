package Hogwarts;

public class Ravenclaw extends Student {
    private int cleverness;   // сообразительность
    private int wisdom;       // мудрость
    private int wit;          // остроумие
    private int creativity;   // креативность

    private Ravenclaw(String name, String faculty, int magic, int transgression, int cleverness,
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ravenclaw that = (Ravenclaw) o;
        return cleverness == that.cleverness && wisdom == that.wisdom && wit == that.wit && creativity == that.creativity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cleverness, wisdom, wit, creativity);
    }

    void compareToPrint(Ravenclaw student) {
        int i = (super.getMagic() + super.getTransgression() - student.getMagic() - student.getTransgression())
                + this.cleverness + this.wisdom + this.wit + this.creativity
                - student.creativity - student.wisdom - this.wit - this.creativity;
        super.toPrint(i, this.getName(), student.getName());
    }

    static Ravenclaw generateRavenclawStudent(String name) {
        return new Ravenclaw(
                name,
                GetRandon.getIntRANDOM(),
                GetRandon.getIntRANDOM(),
                GetRandon.getIntRANDOM(),
                GetRandon.getIntRANDOM(),
                GetRandon.getIntRANDOM(),
                GetRandon.getIntRANDOM()
        );
    }
}
}
