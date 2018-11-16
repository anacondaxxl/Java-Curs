package oop;

        public class CarTest {
            public static void main(String[] args) {
                Car audi = new Car();          // creem un obiect nou cu  'new"
                audi.fuel = 60;
                audi.fuelConsumation = 8;
                audi.started = false;

            audi.start ();
            audi.drive(180);
                audi.drive(600);
                System.out.println(audi.fuel);
                System.out.println(audi.range());
            }

}
