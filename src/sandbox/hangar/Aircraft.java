package sandbox.hangar;


public class Aircraft {

    public int fuel = 100;
    public boolean isMilitary;
    public String pilotName;
    public int totalSorties;
    public String iff;
    public static String cargoType;

    int trace = log("Aircraft: field initializer");

    static int log(String message) {
        System.out.println(message);
        return 0;
    }

    public Aircraft(String pilotName, String cargoType){
        System.out.println(trace);
        // prediction is that this will happen first
        this.pilotName = pilotName;
        this.cargoType = cargoType;
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
        System.out.println(this.pilotName + " is checking in with " + this.cargoType);
    }


    public void fly(int missions) {
        for (int i = 0; i < missions; i ++) {
            totalSorties++;
        }
    }
}