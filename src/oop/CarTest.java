package oop;

        public class CarTest {
            public static void main(String[] args) {
                Car audi = new Car(8f,60,false);          // creem un obiect nou cu  'new"
                audi.fuel = 60f;
                audi.fuelConsumation = 8f;
                audi.started = false;

            audi.start ();
            audi.drive(180);
                audi.drive(600);
                System.out.println(audi.getFuel());
                System.out.println(audi.range());

                audi.wheels = 3;
            }

}
