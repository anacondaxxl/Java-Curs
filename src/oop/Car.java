package oop;

public class Car {

    float fuel;  // putem sa folosim si int
    float fuelConsumation;   // folosim pt zecimale
    boolean started;

    public void start() {
        started = true;

    }
    public void drive (int distance) {
        fuel -= fuelConsumation * distance / 100;

    }

    public float range() {
        return fuel / fuelConsumation * 100;

    }
}
