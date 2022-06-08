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
        System.out.println("Hello proud pet owner, this is " + name + ", his boredom level is at " + boredomLevel + ", his hunger level is at " + hungerLevel + ", his thirst level is at " + thirstLevel);
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




        if (hungerLevel == 10) {


            System.out.println( name + "'s hunger has become ravenous and he decided to eat you, successfully");
            System.exit(0);
        }
        if (thirstLevel == 10) {


            System.out.println(name +"'s thirst has become unquenchable and he decided to drink your blood, successfully");
            System.exit(0);
        }
        if (boredomLevel == 10) {
            System.out.println(name + "'s has become so unbearably bored, he decided he needed to use your lifeless body as a toy, and succeeded");
            System.exit(0);

        }
    }



}


