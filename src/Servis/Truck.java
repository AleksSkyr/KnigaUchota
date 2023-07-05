package Servis;

public class Truck extends TransportWithMotor {

    public Truck(String nameTransport, int numberWheels) {
        super(nameTransport, numberWheels);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void servis() {
        for (int i = 0; i < getNumberWheels(); i++) {
            updateTyre();
        }
        checkTrailer();


    }
}

