/* This is a stub for the Library class */
import java.util.Hashtable;

import javax.management.RuntimeErrorException;

public class Library extends Building  {
  private Hashtable<String, Boolean> collection;

/**
 * Constructor for Library Object
 * @param name
 * @param address
 * @param nFloors
 */
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<>();
      System.out.println("You have built a library: 📖");
    }

/**
 * Adds Book to Library Collection Hasthable
 * @param title
 */
  public void addTitle(String title){
    if(this.collection.contains(title)){
      throw new RuntimeException("This book already exists in the system!");
    } else {
      this.collection.put(title, true);
    }
  }
/**
 * Removes books from library collection hashtable
 * @param title
 * @return title fo book removes
 */
  public String removeTitle(String title){
    if(!this.collection.contains(title)){
      throw new RuntimeException("This book does not exist in the system!");
    } else {
      this.collection.remove(title, true);
      return title;
    }
  }

  /**
   * changes book value to false
   * @param title
   */
  public void checkOut(String title){
    if(!this.collection.get(title)){
      throw new RuntimeException("This book is not in the system!");
  } else {
    this.collection.replace(title, false);
  }
}
/**
 * Changes book value to true 
 * @param title
 */
  public void returnBook(String title){
    if(this.collection.get(title)){
      throw new RuntimeException("This book has already been returned!");
  } else {
    this.collection.replace(title, true);
    }
  }
/**
 * Says whether or not book is in collection
 * @param title
 * @return boolean representing book's status 
 */
  public boolean containsTitle(String title){
     return this.collection.contains(title);
  }

 /**
  * Says whether or not book is available to borrow
  * @param title
  * @return boolean representing book status
  */
  public boolean isAvailable(String title){
    return this.collection.get(title);

  }

/**
 * Print's library collection 
 */
  public void printCollection(){
    System.out.println(collection.toString());
    }

    public static void main(String[] args) {
      Library myLib = new Library("libby","adress",5);
      myLib.addTitle("Book by Author");
      myLib.addTitle("Another Book by Another Author");

      myLib.printCollection();

    }
  
  }