package oop;

public class Person {
    private String name;
    private Integer energy;
    private Boolean alive = true;

    public Person(String name, Integer energy) {
        this.name = name;
        this.energy = energy;
    }
    public void run() {
        if (!alive) {
            return;
        }
        energy -= 30;
        if (energy <= 0) {
            alive = false;
        }
        }
    public void  sleep () {
        if (!alive) {
            return;
        }

            energy = 100;
        }

    public void showEnergy() {
        System.out.println(name +"energy: " + energy);
    }
}
