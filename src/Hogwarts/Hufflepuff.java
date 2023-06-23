package Hogwarts;

public class Hufflepuff extends Student {
    private int diligence;  // усердие
    private int loyalty;    // верность
    private int honesty;    // честность

    private Hufflepuff(String name, String faculty, int magic, int transgression, int diligence, int loyalty, int honesty) {
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
}
