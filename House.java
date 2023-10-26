/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building {
  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;  

/**
 * Constructor for House Object 
 * @param name
 * @param address
 * @param nFloors
 * @param hasDiningRoom
 */
  public House(String name, String address, int nFloors, boolean hasDiningRoom){
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<>();
    System.out.println("You have built a house: 🏠");
  }

  /**
   * Gives boolean saying whether or not house has dining room
   * @return whether or not the house has a dining room as boolean
   */
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }

/**
 * Accessor for number of residents
 * @return size of residents list
 */
  public int nResidents(){
    return this.residents.size();
  }

/**
 * Adds resident to house
 * @param name
 */
  public void moveIn(String name){
    if(this.residents.contains(name) == false){
      this.residents.add(name);
    } else {
      throw new RuntimeException("Resident already lives here!");
    }
  }

  /**
   * removes resident from house
   * @param name
   * @return resident's name
   */
  public String moveOut(String name){ 
    if(this.residents.contains(name)){
      this.residents.remove(name);
      return name;
    } else {
      throw new RuntimeException("Resident not found!");
    }
  }

/**
 * Says whether or not person is a resident of house 
 * @param person
 * @return boolean of whether or not person is a resident
 */
  public boolean isResident(String person){
    if(this.residents.contains(name)){
      return true;
    } else {
      return false;
    } 
  }

  // public static void main(String[] args) {
  //   new House();
  // }

}