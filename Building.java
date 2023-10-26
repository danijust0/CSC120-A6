public class Building {

    protected String name = "<Name Unknown>";
    protected String address = "<Address Unknown>";
    protected int nFloors = 1;

/**
 * Constructor fo Building Parent Class
 * @param name
 * @param address
 * @param nFloors
 */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

/** 
 * Accessor for Building name 
 * @return Building name 
 */
    public String getName() {
        return this.name;
    }
/**
 * Accessor for Building Adress
 * @return Building Address
 */
    public String getAddress() {
        return this.address;
    }

/**
 * Accessor for number of floors
 * @return number of floors
 */
    public int getFloors() {
        return this.nFloors;
    }

/**
 * @return String representation of Building Object
 */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}
