package virtual_pet;



import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method

        Pet manticore= new Pet("Manticore", 5, 6, 5);
                String userOption = "";
        Scanner input = new Scanner (System.in);

        while(true) {
            manticore.greeting();
            System.out.println("Type feed/water/play");
            userOption = input.nextLine();
            switch( userOption.toLowerCase()){
                case "feed":
                    manticore.feed();
                    break;

                case "water":
                    manticore.water();
                    break;

                case "play":
                    manticore.play();
                    break;
            }
           manticore.tick();
        }
            
    }

}
