package virtual_pet;

public abstract class OrganicCrab extends Crab {
    protected int hunger;
    protected int saltWaterLevel;
    protected int thirst;
    protected int cleanliness;

    public OrganicCrab(String name, int age, String shellColor, String type) {
        super(name, age, shellColor, type);
        this.hunger = hunger;
        this.age = age;
        this.thirst = thirst;
        this.saltWaterLevel = saltWaterLevel;
        this.cleanliness = cleanliness;
    }

    public int getHunger() {
        return hunger;
    }

    public void cleanCage(){
    }
    public void feed() {
        hunger += 3;
    }
    public void giveWater(){
        thirst += 3;
    }
    public void giveSaltWater(){
        saltWaterLevel += 3;
    }
    public void tickOrganic() {
        hunger--;
        thirst--;
        saltWaterLevel--;
        cleanliness--;
    }
    public void cleanCages(){
        cleanliness +=3;
    }

    public void takeSwimming(){
        hunger --;
        thirst --;
        cleanliness++;
    }
    public void statusMessage() {
        System.out.println(name + " - " + type + " - Hunger:" + hunger + " Thirst:" + thirst +  " Salt Water Level:" + saltWaterLevel + " Cleanliness:" + cleanliness);
    }

    public boolean alive(){
        if (thirst <= 0 || hunger <= 0 || saltWaterLevel <= 0){
            return false;
        }
        return true;
    }
}
