package Hogwarts;

public class Gryffindor extends Student{
    private int honor;
    private int bravery;
    private int nobility;
    private Gryffindor(String name, String faculty, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, faculty, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    };

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
}
