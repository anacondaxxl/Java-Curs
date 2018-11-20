package oop.person;

public class PersonTest {
    public static void main(String[] args) {
        Person  vito = new Person("Don Vito" , 100);
        Person sony = new Person( "Supersonic", 200);
        Child Alex = new Child("Alex", 50);

        Alex.run();
        Alex.sleep();
        Alex.showEnergy();
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
