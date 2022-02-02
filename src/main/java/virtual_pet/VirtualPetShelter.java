package virtual_pet;

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
        System.out.println(size);
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
    public void addNewHermitCrab(){
        System.out.println("What is your crab's name?");
        Scanner scanner = new Scanner(System.in);
        String newName = scanner.nextLine();

        System.out.println("What is your crab's shell color?");
        String newShellColor = scanner.nextLine();

        System.out.println("How old is your crab?");
        int newAge = scanner.nextInt();

        Crab newHermitCrab = new HermitCrab(newName, newShellColor, newAge);
        crabsInShelter.add(newHermitCrab);

        System.out.println("Thank you for admitting a new crab, we will give it a good home!");
    }
    public void getListOfCrabs() {
        for (Crab currentCreature : crabsInShelter)
            System.out.println(currentCreature.getName());
    }
    public void adoptCrabByName(String crabName){
        crabsInShelter.remove(findCrabByName(crabName));
    }
    public void feedAll(){
        for(Crab crab:crabsInShelter){
            if(crab instanceof HermitCrab) {
                ((HermitCrab) crab).feed();
            }
        }
    }
    public void feedCrabByName(String crabName) {
        Crab crab = findCrabByName(crabName);
        if (crab instanceof HermitCrab) {
            ((HermitCrab) crab).feed();
        }
    }
        public void giveWaterCrabByName(String crabName){
            Crab crab = findCrabByName(crabName);
            if(crab instanceof HermitCrab){
                ((HermitCrab) crab).giveWater();
            }
    }
    public void checkStatusCrabByName(String crabName){
        Crab crab = findCrabByName(crabName);
        if(crab instanceof HermitCrab){
            ((HermitCrab) crab).statusMessage();
        }
    }
    public void sprayCageCrabByName(String crabName){
        Crab crab = findCrabByName(crabName);
        if(crab instanceof HermitCrab){
            ((HermitCrab) crab).sprayCage();
        }
    }
    public void greetingCrabByName(String crabName){
        Crab crab = findCrabByName(crabName);
        if(crab instanceof HermitCrab){
            ((HermitCrab) crab).greeting();
        }
    }

    public void playCrabByName(String crabName){
        Crab crab = findCrabByName(crabName);
        if(crab instanceof HermitCrab){
            ((HermitCrab) crab).play();
        }
    }
    public void giveWaterAll(){
        for(Crab crab:crabsInShelter){
            if(crab instanceof HermitCrab) {
                ((HermitCrab) crab).giveWater();
            }
        }
    }
    public void checkStatusAll(){
        for(Crab crab:crabsInShelter){
            if(crab instanceof HermitCrab) {
                ((HermitCrab) crab).statusMessage();
            }
        }
    }
    public void sprayCageAll(){
        for(Crab crab:crabsInShelter){
            if(crab instanceof HermitCrab) {
                ((HermitCrab) crab).sprayCage();
            }
        }
    }
    public void playAll(){
        for(Crab crab:crabsInShelter){
            if(crab instanceof HermitCrab) {
                ((HermitCrab) crab).play();
            }
        }
    }
    public void tick(){
        Crab.hunger--;
        Crab.thirst--;
        Crab.humid--;
    }

}


