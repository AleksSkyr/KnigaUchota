package Servis;

public abstract class TransportWithMotor extends WheeledTransport {
    public TransportWithMotor(String nameTransport, int numberWheels) {
        super(nameTransport, numberWheels);
    }

    void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public abstract void servis();
}
