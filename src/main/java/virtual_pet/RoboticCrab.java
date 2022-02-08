package virtual_pet;

public abstract class RoboticCrab extends Crab {
    protected int oilLevel;
    protected int maintenanceLevel;
    protected int chargeLevel;

    public RoboticCrab(String name, int age, String shellColor, String type) {
        super(name, age, shellColor,type);
        this.chargeLevel = chargeLevel;
        this.maintenanceLevel = maintenanceLevel;
        this.oilLevel = oilLevel;
        this.name = name;
        this.age = age;
        this.shellColor = shellColor;
    }


    public int getOilLevel() {
        return oilLevel;
    }

    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }
    public boolean alive(){
        if (chargeLevel <= 0 || oilLevel <= 0 || maintenanceLevel <= 0){
            return false;
        }
        return true;
    }
    public void statusMessageRoboticCrabs() {
        System.out.println(name + " - " + type + " - Charge level: " + chargeLevel + " Oil level: " + oilLevel + " Maintenance level:" + maintenanceLevel);
    }
    public void takeSwimming(){
        oilLevel--;
        maintenanceLevel--;
        chargeLevel--;
    }
    public void chargeRoboticCrabs(){
        chargeLevel += 3;
    }
    public void giveOilRoboticCrabs(){
        oilLevel += 3;
    }
    public void tickRoboticCrab(){
        oilLevel--;
        chargeLevel--;
        maintenanceLevel--;
    }
    public void maintenanceRoboticCrabs(){
        maintenanceLevel += 3;
    }
}

