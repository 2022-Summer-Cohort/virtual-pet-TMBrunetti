package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VirtualShelterTest {
    @Test
    public void canAdmitPetToShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admitPet("Unicorn");
        assertTrue(underTest.findPetByName("Unicorn") != null);
    }

    @Test
    public void canAdoptPetFromShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admitPet("Centaur");
        assertTrue(underTest.findPetByName("Centaur") != null);
        underTest.adoptPet("Centaur");
        assertTrue(underTest.findPetByName("Centaur") == null);
    }

    @Test
    public void feedAllPets() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.getShelter();
        underTest.feedAll();
        underTest.tickAll();
        for (Pet pet:underTest.getShelter()) {
            assertEquals(0,pet.getHungerLevel());
        }


    }
}

