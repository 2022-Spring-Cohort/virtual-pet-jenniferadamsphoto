package virtual_pet;

public class RoboticHorseshoeCrab extends RoboticCrab implements Swims{
    public RoboticHorseshoeCrab(String name, int age, String shellColor, String type) {
        super(name, age, shellColor, type);
        this.oilLevel = 10;
        this.maintenanceLevel = 10;
        this.chargeLevel = 10;
        this.name = name;
        this.age = age;
        this.shellColor = shellColor;
        this.type = type;
    }
    String type() {
        return "Robotic Horseshoe Crab";
    }
    public void greetingRoboticHorseshoeCrab(){
        System.out.println("My name is " + name +
                "\nI am a " + type +
                "\nMy shell color is " + shellColor +
                "\nI am " + age + "years old" +
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
        System.out.println("Robotic horseshoe crabs swims quickly");
    }
}


