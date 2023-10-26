import javax.management.RuntimeErrorException;

/* This is a stub for the Cafe class */
public class Cafe extends Building {

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

/**
 * Constructor for Cafe Object
 * @param name
 * @param address
 * @param nFloors
 * @param nCoffeeOunces
 * @param nSugarPackets
 * @param nCreams
 * @param nCups
 */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");

    }

    /**
     * Sells a coffee, removes appropriate number of materials used
     * @param size
     * @param nSugarPackets
     * @param nCreams
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
    if (this.nCoffeeOunces - size <= 0 || this.nSugarPackets - nSugarPackets <= 0 || this.nCreams - nCreams <= 0 || this.nCups - 1 <= 0) {
        throw new RuntimeException("insufficient materials");
    } else {
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
    }


    }
/**
 * Restocks materials
 * @param nCoffeeOunces
 * @param nSugarPackets
 * @param nCreams
 * @param nCups
 */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += 1;
    }

    
}
