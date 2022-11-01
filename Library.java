/* This is a stub for the Library class */
import java.util.Hashtable;

public class Library extends Building {
    private Hashtable<String, Boolean> collection;

    /* Super Constructor makes Library by extending Building
     * @param name
     * @param address
     * @param nFloors
     * @return String
     */
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors); //the first set of steps to constructing this house is to construct building
      collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a Library.");
    }
  
    /* Method adds a title to the library
     * @param title
     * @return string
     */
    public void addTitle(String title) {
      collection.put(title, true);
      System.out.println(title + " has been added to the library");
    }

    /* Method removes title from library
     * @param title
     * @return String If name not found print name not found
     */
    public String removeTitle(String title) {
      boolean b = collection.remove(title, true);
      System.out.println(title + " has been removed from the library");
      return b ? title : "Name not found";
    } // return the title that we removed

    /* Method checks out a book
     * @param title
     * @return String
     */
    public void checkOut(String title) {
      collection.replace(title, false);
      System.out.println("The title " + title + " has been checked out.");
    }

    /* Method returns a book
     * @param title
     * @return String
     */
    public void returnTitle(String title) {
      collection.replace(title, true);
      System.out.println("The title " + title + " has been returned.");
    }

    /* Method checks if the title is in the collection
     * @param title
     * @return bool Does the title appear as a key in the library's collection?
     */
    public boolean containsTitle(String title) {
      return collection.containsKey(title);
    } // returns true if the title appears as a key in the Libary's collection, false otherwise
    
    /* Method checks is a book is available (not checked out)
     * @param title
     * @return bool Is the title available?
     */
    public boolean isAvailable(String title) {
      return collection.contains(title);
    } // returns true if the title is currently available, false otherwise
    
    /* Method prints the collection
     * @return Array The collection including checkout status
     */
    public void printCollection() {
      System.out.println(collection);
    } // prints out the entire collection in an easy-to-read way (including checkout status)


    public static void main(String[] args) {
      Library myLibrary = new Library("Neilson", "Smith Street Smith City", 3);
      myLibrary.addTitle("Wheel of Time by some guy");
      myLibrary.addTitle("Have you seen my hat");
      myLibrary.addTitle("If you give a mouse a cookie");
      myLibrary.removeTitle("Wheel of Time by some guy");
      myLibrary.checkOut("James and the Giant Peach by some guy");

      myLibrary.containsTitle("James and the Giant Peach by some guy");
      myLibrary.isAvailable("James and the Giant Peach by some guy");

      myLibrary.returnTitle("James and the Giant Peach by some guy");
      myLibrary.isAvailable("James and the Giant Peach by some guy");

      myLibrary.printCollection();
    }
  
  }