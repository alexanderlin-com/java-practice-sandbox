package javalearningproject.main.inheritancelearning.hangar;

public class StrikeEagle extends Aircraft {

    int amraams = 4;
    int sidewinders = 4;
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
        return (amraams == 0 && sidewinders == 0);
    }

    public boolean canContinue() {
        return (!winchester() && !bingoFuel());
    }

    public boolean iff;


}