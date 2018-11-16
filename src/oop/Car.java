package oop;

public class Car {

    protected float fuel;  // putem sa folosim si int
    protected float fuelConsumation;   // folosim pt zecimale
    protected boolean started;
    protected static int wheels = 4;


    public float getFuel() {
        return fuel;
    }

    public Car(float fuel, float fuelConsumation, boolean started) {
        this.fuel = fuel;
        this.fuelConsumation = fuelConsumation;
        this.started = started;
    }

    public void start() {
        started = true;

    }
    public void drive (int distance) {
        if (distance > range());
        fuel -= fuelConsumation * distance / 100;
        }

    }

    public float range() {
        return fuel / fuelConsumation *  / 100;

        if (fuel < 0) {
            fuel = 0;

    }
}
