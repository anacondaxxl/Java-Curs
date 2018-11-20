package oop.person;

public class Child extends  Person {

    public Child(String name, Integer energy) {
        super(name, energy);
    }

    public void  eat () {
        energy ++;
    }

    @Override
    public void sleep() {
        super.sleep();
        energy = 50;

    }
}
