package virtual_pet;

public class Pet {
    private String name;
    private int boredomLevel;
    private int hungerLevel;
    private int thirstLevel;

    public Pet(String name, int boredomLevel, int hungerLevel, int thirstLevel) {
        this.name = name;
        this.boredomLevel = boredomLevel;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
    }

    public String getName() {
        return name;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBoredomLevel(int boredomLevel) {
        this.boredomLevel = boredomLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public void setThirstLevel(int thirstLevel) {
        this.thirstLevel = thirstLevel;
    }

    public void greeting() {
        System.out.println("This is " + name + ", his boredom level is at " + boredomLevel + ", his hunger level is at " + hungerLevel + ", his thirst level is at " + thirstLevel);
    }

    public void feed() {
        hungerLevel = -1;
    }

    public void play() {
        boredomLevel = -1;
    }

    public void water() {
        thirstLevel = -1;
    }

    public void tick() {
        hungerLevel++;
        boredomLevel++;
        thirstLevel++;


    }

    public boolean isAlive(){
        if (hungerLevel == 10 || thirstLevel == 10 || boredomLevel == 10) {
            return false;
        }
        return true;
    }


}


