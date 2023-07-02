package Servis;

public class main {

    public static void main(String[] args) {
        Transport car = new Car("Chery",4);
        Transport car2 = new Car("Geel",4);
        Transport truck = new Truck("Man",6);
        Transport truck2 = new Truck("Maz",8);
        Transport bicycle = new Bicycle("Ласточка",2);
        Transport bicycle2 = new Bicycle("Дисна",2);


        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        System.out.println();
        station.check(truck);
        station.check(truck2);
        System.out.println();
        System.out.println();
        station.check(bicycle);
        station.check(bicycle2);
    }
}

