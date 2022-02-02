package virtual_pet;

public class HermitCrab extends Crab {
    private boolean needsNewShell;


    public HermitCrab(String name, String shellColor, int age) {
        super(name,age, shellColor);
        // Constructors
        this.name = name;
        this.shellColor = shellColor;
        this.age = age;
        this.hunger = 5;
        this.thirst = 5;
        this.humid = 5;
        this.happiness = 5;
        this.needsNewShell = false;
    }
    // Getters

    public boolean isNeedsNewShell() {
        return needsNewShell;
    }


    public void greeting() {
        System.out.println("My name is: " + name + "\nMy shell color  is: " + shellColor + "\nI am " + age + " years old." +
                "\n       __\n" +
                "      (__)\n" +
                "     (____)\n" +
                "    (______)\n" +
                "...//(  00 )\\..... ");
    }

    public void statusMessage() {
        System.out.println(name + " - My hunger level is: " + hunger + " My thirst level is: " + thirst + " My humidity level is: " + humid);
    }
    public String hungerCheck() {
        String hungerMessage = "";
        if (hunger <= 3) {
            hungerMessage = "\nI am starving, please feed me now." + "\nHunger level at:" + hunger;
        }
        else if (hunger >= 4 && hunger <= 7) {
            hungerMessage = "\nI am hungry, please feed me."+ "\nHunger level at:" + hunger;
        } else if (hunger >= 8) {
            hungerMessage = "\nI am full."+ "\nHunger level at:" + hunger;
        }
        return hungerMessage;
    }

    public String thirstCheck() {
        String thirstMessage = "";
        if (thirst <= 3) {
            thirstMessage = "\nI am so parched, please give me water." + "\nThirst level at:" + thirst;
        } else if (thirst >= 4 && thirst <= 7) {
            thirstMessage = "\nI am thirsty, please give me water." + "\nThirst level at:" + thirst;
        } else if (thirst >= 8) {
            thirstMessage = "\nI don't need water right now." + "\nThirst level at:" + thirst;
        }
        return thirstMessage;
    }


    public String humidCheck() {
        String humidMessage = "";
        if (humid <= 3) {
            humidMessage = "\nI am dry as a desert, please spray my cage." + "\nHumidity level at:" + humid;
        } else if (humid >= 4 && humid <= 7) {
            humidMessage = "\nI am so dry, please spray my cage."+ "\nHumidity level at:" + humid;
        } else if (humid >= 8) {
            humidMessage = "\nI don't sprayed right now." + "\nHumidity level at:" + humid;
        }
        return humidMessage;
    }
    public String happinessCheck(){
        String happinessMessage = "";
        if (happiness <= 3) {
            happinessMessage = "\nI am not happy.";
        } else if (happiness >= 4 && happiness<= 7) {
            happinessMessage = "\nI am OK.";
        } else if (happiness >= 8) {
            happinessMessage = "\nI am happy.";
        }
        return happinessMessage;
    }
    public void feed() {
        hunger += 3;
    }
    public void giveWater(){
        thirst += 3;
    }
    public void play(){
        hunger --;
        thirst --;
        happiness --;
    }
    public String playMessage() {
       return "Please put me down. I don't like to be picked up.";

    }
    public void sprayCage(){
        humid += 3;
    }

    public String shellCheck() {
        return "I don't need a new shell right now.";

    }
    public void tick() {
        this.hunger--;
        this.thirst--;
        this.humid--;
    }
    }




