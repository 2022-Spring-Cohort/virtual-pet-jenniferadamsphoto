package virtual_pet;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        VirtualPetShelter crabsInShelter = new VirtualPetShelter();
        HermitCrab hermitCrab1 = new HermitCrab("Kirby", "pink", 7);
        HermitCrab hermitCrab2 = new HermitCrab("Goldie", "gold", 8);
        HermitCrab hermitCrab3 = new HermitCrab("Oscar", "green", 3);
        HermitCrab hermitCrab4 = new HermitCrab("KrustyKrab", "rust", 5);
        HermitCrab hermitCrab5 = new HermitCrab("CrabbiePattie", "purple", 1);
        crabsInShelter.addCrab(hermitCrab1);
        crabsInShelter.addCrab(hermitCrab2);
        crabsInShelter.addCrab(hermitCrab3);
        crabsInShelter.addCrab(hermitCrab4);
        crabsInShelter.addCrab(hermitCrab5);

        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to Virtual Crab Shelter! We have currently have " + crabsInShelter.getNumberOfCrabs() + " crabs to adopt and play with.");
        System.out.println(directions());


        int userSelect = 0;
        while (hermitCrab1.alive) {
            userSelect = userInput.nextInt();
            userInput.nextLine();
            if (userSelect == 1) {
                crabsInShelter.feedAll();
                System.out.println("Thank you for feeding us!");
                crabsInShelter.checkStatusAll();
            } else if (userSelect == 2) {
                crabsInShelter.giveWaterAll();
                System.out.println("Thank you for giving us water!");
                crabsInShelter.checkStatusAll();
            } else if (userSelect == 3) {
                crabsInShelter.sprayCageAll();
                System.out.println("Thank you for spraying our cages!");
                crabsInShelter.checkStatusAll();
            } else if (userSelect == 4) {
                crabsInShelter.playAll();
                System.out.println("Please put me down, I don't like being picked up.");
                crabsInShelter.checkStatusAll();
            } else if (userSelect == 5) {
                System.out.println("Here are the crabs currently in the shelter:");
                crabsInShelter.getListOfCrabs();
                System.out.println("Please type the name of the crab you want to interact with:");
                Scanner scanner = new Scanner(System.in);
                String crabSelect = scanner.nextLine();
                crabsInShelter.greetingCrabByName(crabSelect);
                System.out.println("What would you like to do with your crab?" +
                        "\nType A to feed it" +
                        "\nType B to give it water" +
                        "\nType C to spray it's cage with water" +
                        "\nType D to play with it");
                String playSelect = scanner.nextLine();
                    if (playSelect.equalsIgnoreCase("A")) {
                        crabsInShelter.feedCrabByName(crabSelect);
                        crabsInShelter.checkStatusCrabByName(crabSelect);
                        System.out.println("Thank you for feeding me.");
                    }
                    else if (playSelect.equalsIgnoreCase("B")) {
                        crabsInShelter.giveWaterCrabByName(crabSelect);
                        crabsInShelter.checkStatusCrabByName(crabSelect);
                        System.out.println("Thank you for giving me water.");
                    }
                    else if (playSelect.equalsIgnoreCase("C")) {
                        crabsInShelter.sprayCageCrabByName(crabSelect);
                        crabsInShelter.checkStatusCrabByName(crabSelect);
                        System.out.println("Thank you for spraying my cage.");
                    }
                    else if (playSelect.equalsIgnoreCase("D")) {
                        crabsInShelter.playCrabByName(crabSelect);
                        crabsInShelter.checkStatusCrabByName(crabSelect);
                        System.out.println("I don't like to play.");
                    }
                    else {
                        System.out.println("You typed something wrong, please try again");}
            }
                else if (userSelect == 6) {
                    crabsInShelter.addNewHermitCrab();
                }

             else if (userSelect == 7) {
                System.out.println("Please choose a crab to adopt");
                crabsInShelter.getListOfCrabs();
                String crabName = userInput.nextLine();
                crabsInShelter.adoptCrabByName(crabName);
                System.out.println("Thank you for adopting a crab! We love to see them get new homes!");
            }
             else if (userSelect == 8){
                System.out.println("Are you sure you want to leave the shelter? Type Y or N");
                Scanner scanner = new Scanner(System.in);
                String quitAnswer = scanner.nextLine();
                if (quitAnswer.equalsIgnoreCase("N")){
                    System.out.println(directions());
                }
                else if (quitAnswer.equalsIgnoreCase("Y")){
                    break;
                }

            }
            crabsInShelter.tick();

        }

    }

    public static String directions() {
        return "\nIf you would like to feed all the crabs please type 1" +
                "\nIf you would like to give all the crabs water, please type 2" +
                "\nIf you would like to spray all the crabs cage's with water, please type 3" +
                "\nIf you would like to play with all the crabs, please type 4" +
                "\nIf you would like to interact with just one crab, please type 5" +
                "\nIf you would like to add a crab to the shelter, please type 6" +
                "\nIf you would like to adopt a crab, please type 7" +
                "\nIf you would like to leave the shelter, please type 8";
    }
}







  /*
        System.out.println(hermitCrab1.greeting());

        while (hermitCrab1.getHunger() > 0) {
            System.out.println(directions());
            int userSelect = userInput.nextInt();
            if (userSelect == 1) {
                System.out.println(hermitCrab1.statusCheck());
            }
            else if (userSelect == 2) {
                hermitCrab1.feed();
                System.out.println(hermitCrab1.hungerCheck());
                System.out.println(hermitCrab1.statusCheck());
            } else if (userSelect == 3) {
                hermitCrab1.giveWater();
                System.out.println(hermitCrab1.thirstCheck());
                System.out.println(hermitCrab1.statusCheck());
            } else if (userSelect == 4) {
                hermitCrab1.sprayCage();
                System.out.println(hermitCrab1.humidCheck());
                System.out.println(hermitCrab1.statusCheck());
            } else if (userSelect == 5) {
                hermitCrab1.play();
                System.out.println(hermitCrab1.playMessage());
                System.out.println(hermitCrab1.statusCheck());
            } else if (userSelect == 6) {
                hermitCrab1.isNeedsNewShell();
                System.out.println(hermitCrab1.shellCheck());
                System.out.println(hermitCrab1.statusCheck());
            }
            else if (userSelect == 7) {
                System.out.println("Thanks for playing.");
                break;
            }
            hermitCrab1.tick();
        }
    }
    public String directions() {
        return "\nDirections on how to play:" +
                "\nYou can interact with your pet and take care of it using the following, but be careful, if your crab" +
                "\ngets too hungry, the game will end." +
                "\nType 1 to check the status of your crab" +
                "\nType 2 to feed your crab" +
                "\nType 3 to give your crab water to drink" +
                "\nType 4 to spray your crab's cage with water" +
                "\nType 5 to play with your crab. Remember, hermit crabs don't like being handled." +
                "\nType 6 to see if your crab needs a new shell." +
                "\nType 7 to quit playing.";
    }



    }
}
}
 */

