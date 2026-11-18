package sandbox.hangar;

public class HangarRunner {

    public static void main(String[] args) {

        Aircraft airbus = new Aircraft("Jimmy", "Passengers");
        StrikeEagle hitmanOne = new StrikeEagle("Monarch", "President", "Air Superiority");

        //expected: "Monarch and President, ready to roll for Air Superiority mission"
        hitmanOne.names();
        //expected: "Jimmy is checking in with Passengers"
        airbus.names();

//        for(int i = 0; i < 50; i ++) {
//            hitmanOne.depleteFuel();
//        }
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
        //predicted output: delta, then true, then true
        // it returned null instead... how curious.
        System.out.println(airbus.iff + "\n" + hitmanOne.iff + "\n" + skyKeeper.iff);

        System.out.println("Okay but what if we do this");
        Aircraft halberdOne = new StrikeEagle("Frostbite", "Avenger", "Training");
        halberdOne.names();
        //halberdOne.shootAmraam();
        // error during compile time because halberdOne is declared as a parent class and tries to call a child method that the parent does not have access to

        //StrikeEagle mageTwo = new Aircraft("Trigger", "empty");
        //it would appear that this is also an error in compile time due to incompatible type

        System.out.println("iff test\n***\n");

        Aircraft parent = new StrikeEagle("parent", "parent", "parent");
        StrikeEagle child = new StrikeEagle("child", "child", "child");
        System.out.println("parent iff:" + parent.iff + "\nchild iff:" + child.iff);
        System.out.println(halberdOne.iff);



    }
}