package virtual_pet;

public abstract class Crab {
    protected String name;
    protected int age;
    protected String shellColor;
    protected String type;


    public Crab(String name, int age, String shellColor,String type) {
        //Constructors
        this.name = name;
        this.age = age;
        this.shellColor = shellColor;
        this.type = type;

    }

    //    Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public String getShellColor() {
        return shellColor;
    }

    public abstract boolean alive();


}


