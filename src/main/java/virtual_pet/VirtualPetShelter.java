package virtual_pet;

import java.util.ArrayList;

public class VirtualPetShelter {
    private ArrayList<Pet> shelter;

    public ArrayList<Pet> getShelter() {
        return shelter;
    }

    public VirtualPetShelter () {
        shelter = new ArrayList<>();
        shelter.add(new Pet("Jackalope", 3, 2, 5 ));
        shelter.add(new Pet("El Chupacabra", 2, 7, 8));
        shelter.add(new Pet("Manticore", 3, 3, 3));

    }

    public int shelterPopulation() {
        return shelter.size();
    }

    public void admitPet(String name) {
        shelter.add(new Pet(name, 2, 2, 2));
    }

    public void adoptPet(String name) {
        shelter.remove(findPetByName(name));
    }

    public Pet findPetByName(String name) {
        for (Pet temporaryPet : shelter) {
            if (temporaryPet.getName().equalsIgnoreCase(name)) {
                return temporaryPet;
            }
        }
        return null;
    }

    public void showAllPetStatus() {
        for(Pet pet: shelter) {
            pet.greeting();
        }
    }

    public void feedAll() {
        for(Pet pet: shelter){
            pet.feed();
        }
    }

    public void waterAll() {
        for(Pet pet: shelter) {
            pet.water();
        }
    }

    public void playAll() {
        for(Pet pet: shelter) {
            pet.play();
        }
    }

    public void tickAll() {
        for(Pet pet: shelter) {
            pet.tick();
        }
    }


}
