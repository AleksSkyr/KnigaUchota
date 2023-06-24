package Hogwarts;

public class HogwartsStudent {

    private String name;
    private String faculty;
    private int magic;
    private int transgression;

    public HogwartsStudent(String name, String faculty, int magic, int transgression) {
        this.name = name;
        this.faculty = faculty;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", magic=" + magic +
                ", transgression=" + transgression +
                '}';
    }

    public void compareTwoHogwartsStudents(HogwartsStudent other) {
        if (other.getMagic() < this.getMagic()) {
            System.out.println("Студент " + this.getName() + " факультета " + this.getFaculty() + " сильнее, студент " + other.getName() + " факультета " + other.getFaculty());
        } else if (other.getMagic() > this.getMagic()) {
            System.out.println("Студент " + other.getName() + " факультета " + other.getFaculty() + " сильнее, студент " + this.getName() + " факультета " + this.getFaculty());
        } else {
            System.out.println("Студент " + other.getName() + " и " + this.getName() + " имеют равную силу");
        }
    }
}
