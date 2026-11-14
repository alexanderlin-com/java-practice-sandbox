package javalearningproject.main.inheritancelearning.hangar;

public class StrikeEagle extends Aircraft {

    int amraam = 4;
    int sidewinder = 4;
    public String WSOName;
    boolean masterArm;

    public StrikeEagle(String pilotName, String WSOName) {
        super(pilotName);
        isMilitary = true;
        this.WSOName = WSOName;
        this.fuel = 200;
    }
    public void names() {
        System.out.println(this.pilotName + " and " + this.WSOName + ", ready to roll");
    }
    public void masterArmOn() {
        masterArm = true;
    }
    public void masterArmOff() {
        masterArm = false;
    }
    public boolean winchester() {
        return (amraam == 0 && sidewinder == 0);
    }

public boolean canContinue() {
    return (!winchester() && !bingoFuel());
}

public static boolean iff;


}