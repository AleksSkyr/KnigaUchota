package Servis;

public class Bicycle extends WheeledTransport {
    public Bicycle(String nameTransport, int numberWheels) {
        super(nameTransport, numberWheels);
    }

    @Override
    public void servis() {
        for (int i = 0; i < getNumberWheels(); i++) {
            updateTyre();
        }
    }
}
