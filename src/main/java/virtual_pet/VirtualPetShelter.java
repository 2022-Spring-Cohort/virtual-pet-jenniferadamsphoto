package virtual_pet;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetShelter {
    ArrayList<Crab> crabsInShelter;

    public VirtualPetShelter() {
        this.crabsInShelter = new ArrayList<>();

    }

    public void addCrab(Crab myCrab) {
        crabsInShelter.add(myCrab);
    }

    public int getNumberOfCrabs() {
        int size = crabsInShelter.size();
        return size;
    }

    public Crab findCrabByName(String crabName) {
        Crab crab = null;
        for (Crab creature : crabsInShelter) {
            if (creature.getName().equalsIgnoreCase(crabName)) {
                crab = creature;
            }
        }
        return crab;
    }

    public void addNewCrab() {
        System.out.println("What is your crab's name?");
        Scanner scanner = new Scanner(System.in);
        String newName = scanner.nextLine();

        System.out.println("What is your crab's shell color?");
        String newShellColor = scanner.nextLine();

        System.out.println("How old is your crab?");
        int newAge = scanner.nextInt();

        System.out.println("What type of crab is it?" +
                "\nType 1 for hermit crab" +
                "\nType 2 for horseshoe crab" +
                "\nType 3 for robotic hermit crab" +
                "\nType 4 for robotic horseshoe crab");
        int typeSelect = scanner.nextInt();
        String newType = "";
        switch (typeSelect) {
            case 1:
                newType.equalsIgnoreCase("hermit crab");
                Crab newHermitCrab = new HermitCrab(newName, newAge, newShellColor, newType);
                crabsInShelter.add(newHermitCrab);
                break;
            case 2:
                newType.equalsIgnoreCase("horseshoe crab");
                Crab newHorseshoeCrab = new HorseshoeCrab(newName, newAge, newShellColor, newType);
                crabsInShelter.add(newHorseshoeCrab);
                break;
            case 3:
                newType.equalsIgnoreCase("robotic hermit crab");
                Crab newRoboticHermitCrab = new RoboticHermitCrab(newName, newAge, newShellColor, newType);
                crabsInShelter.add(newRoboticHermitCrab);
                break;
            case 4:
                newType.equalsIgnoreCase("robotic horseshoe crab");
                Crab newRoboticHorseshoeCrab = new RoboticHorseshoeCrab(newName, newAge, newShellColor, newType);
                crabsInShelter.add(newRoboticHorseshoeCrab);
                break;
            default:
                System.out.println("You typed something wrong, please try again");
        }

        System.out.println("Thank you for admitting a new crab, we will give it a good home!");
    }

    public void getListOfCrabs() {
        for (Crab currentCreature : crabsInShelter)
            System.out.println(currentCreature.getName());
    }

    public void getListOfOrganicCrabs() {
        for (Crab crab : crabsInShelter)
            if (crab instanceof OrganicCrab)
                System.out.println(crab.getName());
    }

    public void getListOfRoboticCrabs() {
        for (Crab crab : crabsInShelter)
            if (crab instanceof RoboticCrab)
                System.out.println(crab.getName());
    }

    public Crab adoptCrabByName(String crabName) {
        Crab tempCrab = findCrabByName(crabName);
        if (tempCrab != null) {
            crabsInShelter.remove(tempCrab);
        }
        return tempCrab;
    }

    public void feedAllOrganicCrabs() {
        for (Crab crab : crabsInShelter) {
            if (crab instanceof OrganicCrab) {
                ((OrganicCrab) crab).feed();
            }
        }
    }

    public void giveWaterAllOrganicCrabs() {
        for (Crab crab : crabsInShelter) {
            if (crab instanceof OrganicCrab) {
                ((OrganicCrab) crab).giveWater();
            }
        }
    }

    public void giveSaltWaterAllOrganicCrabs() {
        for (Crab crab : crabsInShelter) {
            if (crab instanceof OrganicCrab) {
                ((OrganicCrab) crab).giveSaltWater();
            }
        }
    }

    public void cleanCagesOrganicCrabs() {
        for (Crab crab : crabsInShelter) {
            if (crab instanceof OrganicCrab) {
                ((OrganicCrab) crab).cleanCages();
            }
        }
    }

    public void chargeAllRoboticCrabs() {
        for (Crab crab : crabsInShelter) {
            if (crab instanceof RoboticCrab) {
                ((RoboticCrab) crab).chargeRoboticCrabs();
            }
        }
    }

    public void giveOilAllRoboticCrabs() {
        for (Crab crab : crabsInShelter) {
            if (crab instanceof RoboticCrab) {
                ((RoboticCrab) crab).giveOilRoboticCrabs();
            }
        }
    }

    public void maintenanceAllRoboticCrabs() {
        for (Crab crab : crabsInShelter) {
            if (crab instanceof RoboticCrab) {
                ((RoboticCrab) crab).maintenanceRoboticCrabs();
            }
        }
    }

    public void feedCrabByName(String crabName) {
        Crab crab = findCrabByName(crabName);
        if (crab instanceof OrganicCrab) {
            ((OrganicCrab) crab).feed();
        }
    }

    public void chargeCrabByName(String crabName) {
        Crab crab = findCrabByName(crabName);
        if (crab instanceof RoboticCrab) {
            ((RoboticCrab) crab).chargeRoboticCrabs();
        }
    }

    public void giveOilCrabByName(String crabName) {
        Crab crab = findCrabByName(crabName);
        if (crab instanceof RoboticCrab) {
            ((RoboticCrab) crab).giveOilRoboticCrabs();
        }
    }

    public void maintenanceCrabByName(String crabName) {
        Crab crab = findCrabByName(crabName);
        if (crab instanceof RoboticCrab) {
            ((RoboticCrab) crab).maintenanceRoboticCrabs();
        }
    }

    public void giveWaterCrabByName(String crabName) {
        Crab crab = findCrabByName(crabName);
        if (crab instanceof OrganicCrab) {
            ((OrganicCrab) crab).giveWater();
        }
    }

    public void checkStatusCrabByName(String crabName) {
        Crab crab = findCrabByName(crabName);
        if (crab instanceof OrganicCrab) {
            ((OrganicCrab) crab).statusMessage();
        } else if (crab instanceof RoboticCrab) {
            ((RoboticCrab) crab).statusMessageRoboticCrabs();
        }
    }

    public void sprayCageCrabByName(String crabName) {
        Crab crab = findCrabByName(crabName);
        if (crab instanceof OrganicCrab) {
            ((OrganicCrab) crab).giveSaltWater();
        }
    }

    public void greetingCrabByName(String crabName) {
        Crab crab = findCrabByName(crabName);
        if (crab instanceof HermitCrab) {
            ((HermitCrab) crab).greetingHermitCrab();
        } else if (crab instanceof RoboticHermitCrab) {
            ((RoboticHermitCrab) crab).greetingRoboticHermitCrab();
        } else if (crab instanceof RoboticHorseshoeCrab) {
            ((RoboticHorseshoeCrab) crab).greetingRoboticHorseshoeCrab();
        } else if (crab instanceof HorseshoeCrab) {
            ((HorseshoeCrab) crab).greetingHorseshoeCrab();
        }
    }

    public void takeSwimmingCrabByName(String crabName) {
        Crab crab = findCrabByName(crabName);
        if (crab instanceof HorseshoeCrab) {
            ((HorseshoeCrab) crab).takeSwimming();
            ((HorseshoeCrab) crab).swim();
        } else if (crab instanceof RoboticHorseshoeCrab) {
            ((RoboticHorseshoeCrab) crab).takeSwimming();
            ((RoboticHorseshoeCrab) crab).swim();
        }
    }
    public void checkStatusAllOrganicCrabs() {
        for (Crab crab : crabsInShelter) {
            if (crab instanceof OrganicCrab) {
                ((OrganicCrab) crab).statusMessage();
            }
        }
    }
    public void checkStatusAllCrabs() {
        for (Crab crab : crabsInShelter) {
            if (crab instanceof OrganicCrab) {
                ((OrganicCrab) crab).statusMessage();
            } else if (crab instanceof RoboticCrab) {
                ((RoboticCrab) crab).statusMessageRoboticCrabs();
            }
        }
    }


    public void checkStatusAllRoboticCrabs() {
        for (Crab crab : crabsInShelter) {
            if (crab instanceof RoboticCrab) {
                ((RoboticCrab) crab).statusMessageRoboticCrabs();
            }
        }
    }

    public void takeSwimmingHorseshoeCrabs() {
        for (Crab crab : crabsInShelter) {
            if (crab instanceof HorseshoeCrab) {
                ((HorseshoeCrab) crab).takeSwimming();
            } else if (crab instanceof RoboticHorseshoeCrab) {
                ((RoboticHorseshoeCrab) crab).takeSwimming();
            }
        }
    }

    public void checkStatusAllHorseshoeCrabs() {
        for (Crab crab : crabsInShelter) {
            if (crab instanceof HorseshoeCrab) {
                ((HorseshoeCrab) crab).statusMessage();
            } else if (crab instanceof RoboticHorseshoeCrab) {
                ((RoboticHorseshoeCrab) crab).statusMessageRoboticCrabs();
            }
        }
    }

    public void tickOrganicCrabs() {
        for (Crab crab : crabsInShelter) {
            if (crab instanceof OrganicCrab) {
                ((OrganicCrab) crab).tickOrganic();
            }
        }
    }

    public void tickRoboticCrabs() {
        for (Crab crab : crabsInShelter) {
            if (crab instanceof RoboticCrab) {
                ((RoboticCrab) crab).tickRoboticCrab();
            }
        }
    }
    public void tickAllCrabs() {
        for (Crab crab : crabsInShelter) {
            if (crab instanceof RoboticCrab) {
                ((RoboticCrab) crab).tickRoboticCrab();
            }
            else if (crab instanceof OrganicCrab) {
                ((OrganicCrab) crab).tickOrganic();
            }
        }
    }
    public boolean allCrabsAlive(){
        for (Crab crab : crabsInShelter) {
            if (!crab.alive()){
                return false;
            }
        }
        return true;
    }

}


