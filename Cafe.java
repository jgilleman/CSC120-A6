/* This is a stub for the Cafe class */
public class Cafe extends Building{

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    /*Constructor that makes a new Cafe
     * @param name
     * @param address
     * @param nFloors
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     * @return String
     */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        System.out.println("You have built a cafe.");
    }

    /* Method sells coffee according to size, sugar, and cream requests. If out of some ingredient, restock.
     * @param size
     * @param nSugarPackets
     * @param nCreams
     * @return String
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1; 

        System.out.println("1 cup of coffee sold.");

        if (this.nCoffeeOunces<=0) {
            restock(60, 0, 0, 0);
        } if (this.nSugarPackets<=0) {
            restock(0, 10, 0, 0);
        } if (this.nCreams<=0) {
            restock(0, 0, 10, 0);
        } if (this.nCups<=0) {
            restock(0, 0, 0, 10);
        }
    }

    /* Method restocks inventory
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     * @return String
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
        System.out.println("We have restocked the inventory");
    }


    public static void main(String[] args) {
        Cafe myCafe = new Cafe("CompassCafe", "Smith St Northampton", 4, 12, 12, 12, 12);
        myCafe.sellCoffee(12, 7, 1);

        System.out.println("nCoffeOunces: " + myCafe.nCoffeeOunces +
                            " nSugarPackets: " + myCafe.nSugarPackets +
                            " nCreams: " + myCafe.nCreams +
                            " nCups: " + myCafe.nCups);

        myCafe.sellCoffee(12, 3, 12);

        System.out.println("nCoffeOunces: " + myCafe.nCoffeeOunces +
                            " nSugarPackets: " + myCafe.nSugarPackets +
                            " nCreams: " + myCafe.nCreams +
                            " nCups: " + myCafe.nCups);

        myCafe.sellCoffee(12, 3, 12);

        System.out.println("nCoffeOunces: " + myCafe.nCoffeeOunces +
                            " nSugarPackets: " + myCafe.nSugarPackets +
                            " nCreams: " + myCafe.nCreams +
                            " nCups: " + myCafe.nCups);

    }
    
}
