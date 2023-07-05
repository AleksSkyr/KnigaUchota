package Servis;

public abstract class TransportWithMotor extends WheeledTransport {
    public TransportWithMotor(String nameTransport, int numberWheels) {
        super(nameTransport, numberWheels);
    }



    public abstract void servis();
}
