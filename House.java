/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building {
  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;  

  public House(String name, String address, int nFloors, boolean hasDiningRoom){
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<>();
    System.out.println("You have built a house: 🏠");
  }

  public void moveIn(String name){
    if(this.residents.contains(name) == false){
      this.residents.add(name);
    } else {
      throw new RuntimeException("Resident already lives here!");
    }
  }

  public String moveOut(String name){ 
    if(this.residents.contains(name)){
      this.residents.remove(name);
      return name;
    } else {
      throw new RuntimeException("Resident not found!");
    }
  }

  public boolean isResident(String person){
    if(this.residents.contains(name)){
      return true;
    } else {
      return false;
    } 
  }

  public static void main(String[] args) {
    new House();
  }

}