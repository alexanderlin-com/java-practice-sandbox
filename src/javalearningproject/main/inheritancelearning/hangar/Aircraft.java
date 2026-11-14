package javalearningproject.main.inheritancelearning.hangar;


public class Aircraft {

    public int fuel = 100;
    public boolean isMilitary;
    public String pilotName;

    public Aircraft(String pilotName){
        this.pilotName = pilotName;
    }

    public Integer altitudeRestrictionInAngels() {
        if (isMilitary) {
            return 30;
        } else {
            return null;
        }
    }
    public void depleteFuel() {
        fuel--;
    }

    public boolean bingoFuel() {
        return fuel <= 50;
    }


    public void names() {
        System.out.println(this.pilotName);
    }

    public void fly(int missions) {
        for (int i = 0; i < missions; i ++) {
            totalSorties++;
        }
    }


    public int totalSorties;
    public String iff;
}