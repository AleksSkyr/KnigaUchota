package Servis;

public abstract class WheeledTransport implements Transport {

    private String nameTransport;
    private int numberWheels;

    public WheeledTransport(String nameTransport, int numberWheels) {
        this.nameTransport = nameTransport;
        this.numberWheels = numberWheels;
    }

    public String getNameTransport() {
        return nameTransport;
    }

    public int getNumberWheels() {
        return numberWheels;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

}

