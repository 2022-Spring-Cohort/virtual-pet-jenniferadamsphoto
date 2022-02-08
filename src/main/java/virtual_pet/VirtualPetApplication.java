package virtual_pet;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        VirtualPetShelter crabsInShelter = new VirtualPetShelter();
        HermitCrab hermitCrab1 = new HermitCrab("Kirby", 5, "pink","Hermit Crab");
        HermitCrab hermitCrab2 = new HermitCrab("Goldie", 7, "gold", "Hermit Crab");
        crabsInShelter.addCrab(hermitCrab1);
        crabsInShelter.addCrab(hermitCrab2);
        HorseshoeCrab horseshoeCrab1 = new HorseshoeCrab("Krusty", 5, "tan", "Horseshoe Crab");
        HorseshoeCrab horseshoeCrab2 = new HorseshoeCrab("CrabbyPatty", 3, "brown", "Horseshoe Crab");
        crabsInShelter.addCrab(horseshoeCrab1);
        crabsInShelter.addCrab(horseshoeCrab2);
        RoboticHermitCrab roboticHermitCrab1 = new RoboticHermitCrab("Bender", 1, "pewter", "Robotic Hermit Crab");
        RoboticHermitCrab roboticHermitCrab2 = new RoboticHermitCrab("Clamps", 8, "silver", "Robotic Hermit Crab");
        crabsInShelter.addCrab(roboticHermitCrab1);
        crabsInShelter.addCrab(roboticHermitCrab2);
        RoboticHorseshoeCrab roboticHorseshoeCrab1 = new RoboticHorseshoeCrab("Bolts", 2, "platinum", "Robotic Horseshoe Crab");
        RoboticHorseshoeCrab roboticHorseshoeCrab2 = new RoboticHorseshoeCrab("Nuts", 4, "bronze", "Robotic Horseshoe Crab");
        crabsInShelter.addCrab(roboticHorseshoeCrab1);
        crabsInShelter.addCrab(roboticHorseshoeCrab2);

        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to Virtual Crab Shelter! We currently have " + crabsInShelter.getNumberOfCrabs() + " crabs to adopt and play with." +
                "\nBe careful, if all the crabs needs go down to zero, you will have to leave." +
                "\n                          _______   " +
                "\n                        [         ]    " +
                "\n                      [   @     @   ]     " +
                "\n                     |               |     " +
                "\n         __          |  ~~~~~~~~~~~  |      " +
                "\n        (__)          [    <   >    ]      " +
                "\n       (____)         <[    < >    ]>   " +
                "\n      (______)         <[__  ~  __]>      " +
                "\n.....[[(  00 )]]].....      <|>       " +
                "\n                             |     " +
                "\n                             |     ");
        System.out.println(directions());

        int userSelect = 0;
        while (crabsInShelter.allCrabsAlive()) {
            userSelect = userInput.nextInt();
            userInput.nextLine();
            if (userSelect == 1) {
                crabsInShelter.checkStatusAllCrabs();
                crabsInShelter.tickAllCrabs();
            }else if (userSelect ==2){
                crabsInShelter.feedAllOrganicCrabs();
                System.out.println("Thank you for feeding us!");
                crabsInShelter.checkStatusAllOrganicCrabs();
                crabsInShelter.tickOrganicCrabs();
            }
            else if (userSelect == 3) {
                crabsInShelter.giveWaterAllOrganicCrabs();
                System.out.println("Thank you for giving us water!");
                crabsInShelter.checkStatusAllOrganicCrabs();
                crabsInShelter.tickOrganicCrabs();
            } else if (userSelect == 4) {
                crabsInShelter.giveSaltWaterAllOrganicCrabs();
                System.out.println("Thank you for the salt water!");
                crabsInShelter.checkStatusAllOrganicCrabs();
                crabsInShelter.tickOrganicCrabs();
            } else if (userSelect == 5) {
                crabsInShelter.cleanCagesOrganicCrabs();
                System.out.println("Thank you for cleaning our cages!");
                crabsInShelter.checkStatusAllOrganicCrabs();
                crabsInShelter.tickOrganicCrabs();
            } else if (userSelect == 6) {
                crabsInShelter.chargeAllRoboticCrabs();
                System.out.println("Thank you for charging us!");
                crabsInShelter.checkStatusAllRoboticCrabs();
                crabsInShelter.tickRoboticCrabs();
            } else if (userSelect == 7) {
                crabsInShelter.giveOilAllRoboticCrabs();
                System.out.println("Thank you for giving us oil!");
                crabsInShelter.checkStatusAllRoboticCrabs();
                crabsInShelter.tickRoboticCrabs();
            } else if (userSelect == 8){
                crabsInShelter.maintenanceAllRoboticCrabs();
                System.out.println("Thank you for maintenance!");
                crabsInShelter.checkStatusAllRoboticCrabs();
                crabsInShelter.tickRoboticCrabs();
            } else if (userSelect == 9) {
                crabsInShelter.takeSwimmingHorseshoeCrabs();
                System.out.println("Thank you for taking us swimming!");
                crabsInShelter.checkStatusAllHorseshoeCrabs();
                crabsInShelter.tickAllCrabs();
            } else if (userSelect == 10) {
                System.out.println("What type of crab with you like to interact with?" +
                        "\nType 1 for organic crabs" +
                        "\nType 2 for robotic crabs");
                Scanner scanner = new Scanner(System.in);
                int typeSelect = userInput.nextInt();
                if (typeSelect == 1) {
                    System.out.println("Here are the organic crabs currently in the shelter:");
                    crabsInShelter.getListOfOrganicCrabs();
                    System.out.println("Please type the name of the crab you want to interact with:");
                    String crabSelect = scanner.nextLine();
                    crabsInShelter.greetingCrabByName(crabSelect);
                    System.out.println("What would you like to do with your crab?" +
                            "\nType 1 to feed it" +
                            "\nType 2 to give it water" +
                            "\nType 3 to give it salt water" +
                            "\nType 4 to take it for a swim");
                    int playSelect = scanner.nextInt();
                    switch (playSelect) {
                        case 1:
                            crabsInShelter.feedCrabByName(crabSelect);
                            crabsInShelter.checkStatusCrabByName(crabSelect);
                            System.out.println("Thank you for feeding me.");
                            break;
                        case 2:
                            crabsInShelter.giveWaterCrabByName(crabSelect);
                            crabsInShelter.checkStatusCrabByName(crabSelect);
                            System.out.println("Thank you for giving me water.");
                            break;
                        case 3:
                            crabsInShelter.sprayCageCrabByName(crabSelect);
                            crabsInShelter.checkStatusCrabByName(crabSelect);
                            System.out.println("Thank you for spraying my cage.");
                            break;
                        case 4:
                            crabsInShelter.takeSwimmingCrabByName(crabSelect);
                            crabsInShelter.checkStatusCrabByName(crabSelect);
                            System.out.println("Thank you for taking me for a swim!");
                            break;
                        default: System.out.println("You typed something wrong, please try again");
                    }
                } else if (typeSelect == 2) {
                    System.out.println("Here are the robotic crabs currently in the shelter:");
                    crabsInShelter.getListOfRoboticCrabs();
                    System.out.println("Please type the name of the crab you want to interact with:");
                    String crabRoboticSelect = scanner.nextLine();
                    crabsInShelter.greetingCrabByName(crabRoboticSelect);
                    System.out.println("What would you like to do with your crab?" +
                            "\nType 1 to charge it" +
                            "\nType 2 to give it oil" +
                            "\nType 3 to perform maintenance" +
                            "\nType 4 to take it for a swim");
                    int playSelect = userInput.nextInt();
                    switch (playSelect){
                        case 1:
                            crabsInShelter.chargeCrabByName(crabRoboticSelect);
                            crabsInShelter.checkStatusCrabByName(crabRoboticSelect);
                            System.out.println("Thank you for charging me.");
                            break;
                        case 2:
                            crabsInShelter.giveOilCrabByName(crabRoboticSelect);
                            crabsInShelter.checkStatusCrabByName(crabRoboticSelect);
                            System.out.println("Thank you for giving me oil.");
                            break;
                        case 3:
                            crabsInShelter.maintenanceCrabByName(crabRoboticSelect);
                            crabsInShelter.checkStatusCrabByName(crabRoboticSelect);
                            System.out.println("Thank you for doing maintenance!");
                            break;
                        case 4:
                            crabsInShelter.takeSwimmingCrabByName(crabRoboticSelect);
                            crabsInShelter.checkStatusCrabByName(crabRoboticSelect);
                            System.out.println("Thank you for taking me for a swim!");
                            break;
                        default: System.out.println("You typed something wrong, please try again");
                    }
                }
            }
            else if (userSelect == 11) {
                crabsInShelter.addNewCrab();
            } else if (userSelect == 12) {
                Crab tempCrab;
                do {
                    System.out.println("Please choose a crab to adopt");
                    crabsInShelter.getListOfCrabs();
                    String crabName = userInput.nextLine();
                    tempCrab = crabsInShelter.adoptCrabByName(crabName);
                    if (tempCrab == null){
                        System.out.println("Incorrect crab name, please try again");
                    }
                }while (tempCrab == null);
                System.out.println("Thank you for adopting a crab! We love to see them get new homes!");
            }
            else if (userSelect == 13){
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
            else if (userSelect > 13) {
                System.out.println("Please enter a number between 1-13");
            }
        }

    }

    public static String directions() {
        return  "\nType 1 to check the status of all crabs" +
                "\nType 2 to feed all organic crabs" +
                "\nType 3 to give all organic crabs water" +
                "\nType 4 to give all organic crabs salt water" +
                "\nType 5 to clean organic crab cages" +
                "\nType 6 to charge all robotic crabs" +
                "\nType 7 to give all robotic crabs oil" +
                "\nType 8 to perform maintenance on all robotic crabs" +
                "\nType 9 if you would like to take the horseshoe crabs swimming" +
                "\nType 10 if you would like to interact with just one crab" +
                "\nType 11 if you want to add a crab to the shelter" +
                "\nType 12 if you would like to adopt a crab" +
                "\nType 13 to leave the shelter";
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

