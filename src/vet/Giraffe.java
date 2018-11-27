package vet;

public class Giraffe {
    public class Giraffe implements WildAnimalPet {
        @Override
        public void makeNoise() {
            System.out.println("gif!gif!");
        }

        public  void sleep () {
            System.out.println("zzzzzzzzz");
        }

        @Override
        public void play() {
            System.out.println("Head down");
        }
    }
}
