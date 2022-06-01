package virtual_pet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class VirtualPetTest {
    @Test
    void hungerGoesToZeroWhenFed() {
        Pet underTest = new Pet("test", 5, 5, 5 );
        underTest.feed();
        underTest.tick();
        assertEquals(0, underTest.getHungerLevel());
    }

    @Test
    void thirstLevelShouldGoTo0WhenWater() {
        Pet underTest = new Pet("test", 5, 5, 5 );
        underTest.water();
        underTest.tick();
        assertEquals(0, underTest.getThirstLevel());
    }

    @Test
    void boredomLevelShouldGoTo0WhenPlay() {
        Pet underTest = new Pet("test", 5, 5, 5 );
        underTest.play();
        underTest.tick();
        assertEquals(0, underTest.getBoredomLevel());


    }
}
