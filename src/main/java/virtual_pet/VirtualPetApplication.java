package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {
    private Crab kirby = new Crab("Kirby", "pink", 7);
    private Crab goldie = new Crab("Goldie", "gold", 8);

    public static void main(String[] args) {
        //Interact with a Crab object in this method
        new VirtualPetApplication().play();
    }

    public void play() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to Hermit Crabs Make Terrible Pets! Meet your new crab:");
        System.out.println(kirby.greeting());
        while (playGame == true) {
            System.out.println(directions());
            int userSelect = userInput.nextInt();
            if (userSelect == 1) {
                System.out.println(kirby.hungerCheck());
            }
            if (userSelect == 2) {
                System.out.println(kirby.thirstCheck());
            } else if (userSelect == 3) {
                System.out.println(kirby.humidCheck());
            } else if (userSelect == 4) {
                kirby.feed();
                System.out.println(kirby.hungerCheck());
            } else if (userSelect == 5) {
                kirby.giveWater();
                System.out.println(kirby.thirstCheck());
            } else if (userSelect == 6) {
                kirby.sprayCage();
                System.out.println(kirby.humidCheck());
            }
            else if (userSelect == 7) {
                System.out.println("Thanks for playing");
                break;
            }
            kirby.tick();
        }
    }
    public String directions() {
        return "\nDirections on how to play:" +
                "\nYou can interact with your pet and take care of it using the following:" +
                "\nType 1 to check the hunger status of your crab" +
                "\nType 2 to check the thirst status of your crab" +
                "\nType 3 to check the humidity level of your crab's cage" +
                "\nType 4 to feed your crab" +
                "\nType 5 to give your crab water to drink" +
                "\nType 6 to spray your crab's cage with water" +
                "\nType 7 to quit";
    }
    public boolean playGame = true;

}



