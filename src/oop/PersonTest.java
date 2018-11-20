package oop;

public class PersonTest {
    public static void main(String[] args) {
        Person  vito = new Person("Don Vito" , 100);
        Person sony = new Person( "Supersonic", 200);
        vito.run();
        vito.run();
        vito.run();
        vito.showEnergy(); {
            String energy;
        }
        vito.sleep();
        vito.showEnergy();
        for (int i=0; i<5; i++) {
            sony.run();
        }
        sony.showEnergy();

    }
}
