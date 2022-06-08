package virtual_pet;

import java.util.Scanner;

public class VirtualPetShelterApplication {

    public static void main(String[] args) {

        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.admitPet("Cthulhu");

        String userInput = "";
        Scanner input = new Scanner(System.in);

        while ( !userInput.equalsIgnoreCase("quit")) {
            shelter.showAllPetStatus();
            System.out.println("Type 'feed', 'water', 'play', 'adopt', 'admit', or 'interact' with single pet. Type 'quit' to end.");
            System.out.println("Be careful with these beasts, they can be deadly");
            userInput = input.nextLine();

            switch (userInput.toLowerCase()) {
                case "feed":
                    shelter.feedAll();
                    break;

                case "water":
                    shelter.waterAll();
                    break;

                case "play":
                    shelter.playAll();
                    break;

                case "adopt":
                    System.out.println("Enter the name of the pet you want to adopt.");
                    shelter.adoptPet(input.nextLine());
                    break;

                case "admit":
                    System.out.println("Enter the name of the pet you want to admit.");
                    shelter.admitPet(input.nextLine());
                    break;

                case "interact":
                    System.out.println("Enter the name of the pet you want to interact with.");
                    String name = input.nextLine();
                    System.out.println("What would you like to do with the pet? feed, play, water?");
                    String selection = input.nextLine();
                    if (selection.equalsIgnoreCase("feed")) {
                        shelter.findPetByName(name).feed();
                    } else if (selection.equalsIgnoreCase("water")) {
                        shelter.findPetByName(name).water();
                    } else if (selection.equalsIgnoreCase("play")) {
                        shelter.findPetByName(name).play();
                    }
                    break;
            }
            shelter.tickAll();
        }

        }
    }

