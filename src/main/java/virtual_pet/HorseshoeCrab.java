package virtual_pet;

public class HorseshoeCrab extends OrganicCrab implements Swims {


    public HorseshoeCrab(String name, int age, String shellColor, String type) {
        super(name, age, shellColor, type);
        this.name = name;
        this.age = age;
        this.shellColor = shellColor;
        this.thirst = 10;
        this.hunger = 10;
        this.saltWaterLevel = 10;
        this.cleanliness = 10;
    }


    String type() {
        return "Horseshoe Crab";
    }

    public void greetingHorseshoeCrab() {
        System.out.println("My name is " + name +
                "\nI am a " + type +
                "\nMy shell color is " + shellColor +
                "\nI am " + age + "years old." +
                "\n          _______ " +
                "\n        [         ]  " +
                "\n      [   @     @   ]  " +
                "\n     |               | " +
                "\n     |  ~~~~~~~~~~~  |   " +
                "\n      [    <   >    ]    " +
                "\n      <[    < >    ]> " +
                "\n       <[__  ~  __]>    " +
                "\n            <|>     " +
                "\n             |     " +
                "\n             |     ");
    }

    @Override
    public void swim() {
        System.out.println("Horseshoe crabs swim slowly");
    }
}
//    public void statusMessage() {
//        System.out.println(name + "Hunger: " + hunger + "Thirst: " + thirst + "Salt water level: " + saltWaterLevel);
//    }

