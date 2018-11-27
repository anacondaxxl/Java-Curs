package vet;

public class PetOwner {

    protected WildAnimalPet firstPet;
    protected WildAnimalPet secondPet;

    public PetOwner(WildAnimalPet firstPet, WildAnimalPet secondPet) {
        this.firstPet = firstPet;
        this.secondPet = secondPet;
    }

    public void takePetToVet(Vet vet){
        vet.giveShotTo(firstPet);
        vet.giveShotTo(secondPet);
    }
    public void playWithPets(){
        firstPet.play();
        secondPet.play();
    }

}