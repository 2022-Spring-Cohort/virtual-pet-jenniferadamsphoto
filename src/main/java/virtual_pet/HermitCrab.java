package virtual_pet;

public class HermitCrab extends OrganicCrab {

    public HermitCrab(String name, int age, String shellColor, String type) {
        super(name, age, shellColor, type);
        this.name = name;
        this.age = age;
        this.shellColor = shellColor;
        this.hunger = 10;
        this.thirst = 10;
        this.saltWaterLevel = 10;
        this.cleanliness = 10;

    }

    public void greetingHermitCrab() {
        System.out.println("My name is " + name +
                "\nI am a " + type +
                "\nMy shell color  is " + shellColor +
                "\nI am " + age + " years old" +
                "\n         __  " +
                "\n        (__)  " +
                "\n       (____)  " +
                "\n      (______)" +
                "\n.....[[(  00 )]]]..... ");
    }

//    public String hungerCheck() {
//        String hungerMessage = "";
//        if (hunger <= 3) {
//            hungerMessage = "\nI am starving, please feed me now." + "\nHunger level at:" + hunger;
//        }
//        else if (hunger >= 4 && hunger <= 7) {
//            hungerMessage = "\nI am hungry, please feed me."+ "\nHunger level at:" + hunger;
//        } else if (hunger >= 8) {
//            hungerMessage = "\nI am full."+ "\nHunger level at:" + hunger;
//        }
//        return hungerMessage;
//    }
//
//    public String thirstCheck() {
//        String thirstMessage = "";
//        if (thirst <= 3) {
//            thirstMessage = "\nI am so parched, please give me water." + "\nThirst level at:" + thirst;
//        } else if (thirst >= 4 && thirst <= 7) {
//            thirstMessage = "\nI am thirsty, please give me water." + "\nThirst level at:" + thirst;
//        } else if (thirst >= 8) {
//            thirstMessage = "\nI don't need water right now." + "\nThirst level at:" + thirst;
//        }
//        return thirstMessage;
//    }
//



    String type() {
        return "Hermit Crab";
    }



    }






