public class Main {
    void participation(Driver d, Car c) {
        if ((d.getClass() == DriverA.class) && (c.getClass() == CarLight.class)) {
            System.out.println("водитель " + d.getName() + " управляет автомобилем " + c + " и будет участвовать в заезде");
        }
        if ((d.getClass() == DriverB.class) && (c.getClass() == CarCargo.class)) {
            System.out.println("водитель " + d.getName() + " управляет автомобилем " + c + " и будет участвовать в заезде");
        }
        if ((d.getClass() == DriverD.class) && (c.getClass() == Bus.class)) {
            System.out.println("водитель " + d.getName() + " управляет автомобилем " + c + " и будет участвовать в заезде");
        }
    }

    public static void main(String[] args) {
        CarLight carLight = new CarLight("toyota", "a1", 1.5f);
        CarLight carLight1 = new CarLight("победа", "123", 1.2f);
        CarLight carLight2 = new CarLight("жигули", "a8", 1.6f);
        CarLight carLight3 = new CarLight("волга", "b1", 1.7f);

        CarCargo carCargo = new CarCargo("Kamaz", "u1", 4.5f);
        CarCargo carCargo1 = new CarCargo("Урал", "в1231", 4.6f);
        CarCargo carCargo2 = new CarCargo("Трак", "1цц1", 4.2f);
        CarCargo carCargo3 = new CarCargo("Kamaz", "й14", 4.5f);

        Bus bus = new Bus("Kamaz", "qwe", 2.5f);
        Bus bus1 = new Bus("Уаз", "йцуe", 2.2f);
        Bus bus2 = new Bus("Икарус", "12e", 2.6f);
        Bus bus3 = new Bus("Kamaz", "511", 2.5f);

        DriverA a = new DriverA();
        a.setName("Богдан");
        DriverB b = new DriverB();
        b.setName("Артур");
        DriverD d = new DriverD();
        d.setName("Петр");

        Main m = new Main();
        m.participation(a,carLight2);
        m.participation(b,carCargo);
        m.participation(d,bus);
        m.participation(a, bus);
    }
}