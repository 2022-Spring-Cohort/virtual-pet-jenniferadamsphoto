package virtual_pet;

public abstract class Crab {
    protected String name;
    protected int age;
    protected String shellColor;
    protected static int hunger;
    protected static int thirst;
    protected static int humid;
    protected int happiness;
    protected boolean alive;

    public Crab(String name, int age, String shellColor) {
        //Constructors
        this.name = name;
        this.age = age;
        this.shellColor = shellColor;
        this.alive = true;
    }
//Getters
    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return alive;
    }

    public int getAge() {
        return age;
    }

    public String getShellColor() {
        return shellColor;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getHumid() {
        return humid;
    }
    public boolean areNeedsTooHigh(){
        if (hunger == 0 && thirst == 0 && humid == 0){
            return true;
        }
        return false;
    }

    public int getHappiness() {
        return happiness;
    }
}
