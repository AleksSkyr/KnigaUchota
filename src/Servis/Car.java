package Servis;

public class Car extends TransportWithMotor {

    public Car(String nameTransport, int numberWheels) {
        super(nameTransport, numberWheels);
    }
        @Override
    public void servis() {
            for (int i = 0; i < getNumberWheels(); i++) {
                updateTyre();
            }
            checkEngine();
    }
}
