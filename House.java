/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building {
  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  /* Super Constructor makes House by extending Building
   * @param name
   * @param address
   * @param nFloors
   * @param hasDR
   * @returns String
   */
  public House(String name, String address, int nFloors, boolean hasDR) {
    super(name, address, nFloors); //the first set of steps to constructing this house is to construct building
    this.hasDiningRoom = hasDR;
    this.residents = new ArrayList<String>();

    System.out.println("You have built a house.");
  }

  /* Method keeps track of dining room status
   * @return bool Does it have a dining room
   */
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }

  /* Method number of residents
   * @return int How many residents live in the house
   */
  public int nResidents() {
    return this.residents.size(); //gets the current size of the array list
  }

  /* Method moves resident into house
   * @param name
   * @return String
   */
  public void moveIn(String name) {
    residents.add(name);
    System.out.println("\nMoving " + name + " in. Done.");
  }
  
  /* Method moves resident out
   * @param name
   * @return String If name not found return "not found"
   */
  public String moveOut(String name) {
    boolean b = residents.remove(name);
    System.out.println("\nMoving " + name + " out. Done.");
    return b ? name : "Name not found"; //fancy pants operator that says if b is true (if name is found in list), removes name, if not return "not found"
  }

  /* Method asks if a person is a resident
   * @param person
   * @return bool Is this person a resident?
   */
  public boolean isResident(String person) {
    return residents.contains(person);
  }

  public static void main(String[] args) {
    House myHouse = new House("GillemanHouse", "40 Spring Street", 2, true);
    System.out.println("\n The statement \"This house has a dining room\" is " + myHouse.hasDiningRoom());
    myHouse.moveIn("Jessie");
    myHouse.moveIn("Joey");
    myHouse.moveIn("Johannes");
    myHouse.moveOut("Jessie");
    System.out.println("\n This house has " + myHouse.nResidents() + "residents.");
    System.out.println("\n The statement \"Jessie is a resident of this house\" is " + myHouse.isResident("Jessie"));
    System.out.println("\n The statement \"Jessie is a resident of this house\" is " + myHouse.isResident("Johannes"));
  }

}