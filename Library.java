/* This is a stub for the Library class */
import java.util.Hashtable;

import javax.management.RuntimeErrorException;

public class Library extends Building  {
  private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<>();
      System.out.println("You have built a library: 📖");
    }
  
  public void addTitle(String title){
    if(this.collection.contains(title)){
      throw new RuntimeException("This book already exists in the system!");
    } else {
      this.collection.put(title, true);
    }
  }
  public String removeTitle(String title){
    if(!this.collection.contains(title)){
      throw new RuntimeException("This book does not exist in the system!");
    } else {
      this.collection.remove(title, true);
      return title;
    }
  }

  public void checkOut(String title){
    if(!this.collection.get(title)){
      throw new RuntimeException("This book is not in the system!");
  } else {
    this.collection.replace(title, false);
  }
}
  public void returnBook(String title){
    if(this.collection.get(title)){
      throw new RuntimeException("This book has already been returned!");
  } else {
    this.collection.replace(title, true);
    }
  }

  public boolean containsTitle(String title){
     return this.collection.contains(title);
  }
  public boolean isAvailable(String title){
    return this.collection.get(title);

  }
  public void printCollection(){
  }

    public static void main(String[] args) {
      new Library();
    }
  
  }