package Hogwarts;

public class Hufflepuff extends HogwartsStudent {
    private int diligence;  // усердие
    private int loyalty;    // верность
    private int honesty;    // честность

    public Hufflepuff(String name, String faculty, int magic, int transgression, int diligence, int loyalty, int honesty) {
        super(name, faculty, magic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Пупиндуй: " +
                " Студент: " + super.getName() + ' ' + "Факультет: " + super.getFaculty() +
                ", Магия: " + super.getMagic() +
                ", Трансгрессия: " + super.getTransgression() +
                ", diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                ' ';
    }
    private int getHufflepuffTotalPower() {
        return diligence + loyalty + honesty;
    }

    public void compareTwoHufflepuffStudents(Hufflepuff other) {
        if (other.getHufflepuffTotalPower() < this.getHufflepuffTotalPower()) {
            System.out.println("Ученик " + this.getName() + " сильнее, чем ученик " + other.getName());
        } else if (other.getHufflepuffTotalPower() > this.getHufflepuffTotalPower()) {
            System.out.println("Ученик " + other.getName() + " сильнее, чем ученик " + this.getName());
        } else {
            System.out.println("Ученики имеют равную силу");
        }
    }
}
