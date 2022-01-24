package virtual_pet;

public class Crab {
    private String name;
    private String shellColor;
    private int age;
    private int hunger;
    private int thirst;
    private int humid;
    private int happiness;
    private boolean needsNewShell;


    public Crab(String name, String shellColor, int age) {
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

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }
    public int getHumid() {
        return humid;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return shellColor;
    }

    public int getAge() {
        return age;
    }

    public String greeting() {
        return "My name is: " + name + "\nMy shell color  is: " + shellColor + "\nI am " + age + " years old." +
                "\n       __\n" +
                "      (__)_\n" +
                "     (____)_\n" +
                "    (______)\n" +
                "...//(  00 )\\..... ";
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
        hunger ++;
        hunger ++;
        hunger ++;
    }
    public void giveWater(){
        thirst ++;
        thirst ++;
        thirst ++;
    }
    public void play(){
        happiness --;
        hunger --;
        thirst --;
    }
    public void sprayCage(){
        humid ++;
        humid ++;
        humid ++;
    }
    public void tick() {
        this.hunger--;
        this.thirst--;
        this.humid--;
    }
    public String winGame(){
        String winGame = "";
        if (hunger >= 10 && thirst >= 10 && humid >= 10) {
            return "Congratulations! You have a happy crab! \nThank you for playing!";
        }
    return winGame;
    }

    }

