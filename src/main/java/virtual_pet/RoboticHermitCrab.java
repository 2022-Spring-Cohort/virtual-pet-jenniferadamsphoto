package virtual_pet;

public class RoboticHermitCrab extends RoboticCrab {

    public RoboticHermitCrab(String name, int age, String shellColor, String type) {
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
        return "Robotic Hermit Crab";
    }

    public void greetingRoboticHermitCrab() {
        System.out.println("My name is " + name +
                "\nI am a " + type +
                "\nMy shell color is " + shellColor +
                "\nI am " + age + " years old" +
                "\n       __ " +
                "\n      (__) " +
                "\n     (____)  " +
                "\n    (______)  " +
                "\n...[[(  00 )]]]..... ");
    }
}


