package vet;

public class AnimalTest {
    public static void main(String[] args) {
        Giraffe x = new Giraffe();
        Hippo y = new Hippo();


        PetOwner bob = new PetOwner(x, y);
        Vet marley = new Vet();

        bob.takePetToVet(marley);
        bob.playWithPets();
        x.sleep();
    }
}
