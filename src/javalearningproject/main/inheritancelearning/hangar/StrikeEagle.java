package javalearningproject.main.inheritancelearning.hangar;

public class StrikeEagle extends Aircraft {

    int amraams = 4;
    int sidewinders = 4;
    public String WSOName;
    boolean masterArm;
    public boolean iff;
    public static String missionType;

    int eagleTrace = log("Strike Eagle: field initializer");


    public StrikeEagle(String pilotName, String WSOName, String missionType) {
        super(pilotName, missionType);
        System.out.println(trace);
        //so this will happen after Aircraft (parent class) is initialized
        isMilitary = true;
        this.WSOName = WSOName;
        this.fuel = 200;
        this.missionType = missionType;
    }

    public void names() {
        System.out.println(
            this.pilotName + " and " + this.WSOName + ", ready to roll for " + this.missionType + " mission.");
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

    public void shootSidewinder() {
        if (sidewinders > 0) {
            System.out.println("Fox Two!");
            sidewinders--;
        } else {
            System.out.println("Winchester on Sidewinders...");
        }
    }

    public void shootAmraam() {
        if (sidewinders > 0) {
            System.out.println("Fox Three! Missile is pitbull!");
            sidewinders--;
        } else {
            System.out.println("Winchester on AMRAAMs...");
        }
    }


}