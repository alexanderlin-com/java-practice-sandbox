package javalearningproject.main.inheritancelearning.hangar;

import javalearningproject.main.inheritancelearning.hangar.Aircraft;
import javalearningproject.main.inheritancelearning.hangar.StrikeEagle;

public class Main {

    public static void main(String[] args) {

        Aircraft airbus = new Aircraft("Jimmy");
        StrikeEagle hitmanOne = new StrikeEagle("Monarch", "President");

        //expected: "Monarch and President, ready to roll"
        hitmanOne.names();
        //expected: "Jimmy"
        airbus.names();

        for(int i = 0; i < 50; i ++) {
            hitmanOne.depleteFuel();
        }
        //expected: 100
        System.out.println(airbus.fuel);

        hitmanOne.fly(50);
        System.out.println(hitmanOne.totalSorties);

        Aircraft skyKeeper = hitmanOne;

        //expecting the same as Hitman One
        skyKeeper.names();

        //iff
        airbus.iff = "Delta Flight J890297";
        hitmanOne.iff = true;
        //expected: delta, then true, then true
        System.out.println(airbus.iff + "\n" + hitmanOne.iff + "\n" + skyKeeper.iff);

    }
}