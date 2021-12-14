/**
 * Models a Guest for a hotel
 * @author: Christina Vu and Lilah Kelly
 */
public class Guest{
    private String name;
    private int numPeople;
    private int roomNum;
    private boolean checkedIn;

    /**
     * constructor for Guest class
     * @param name: name of guest
     * @param numPeople: number of people intending to stay
     * @param roomNum the assigned room number
     * @param checkedIn: indicates if guest is checked in or out
     */
    public Guest(String name, int numPeople, int roomNum,boolean checkedIn) {
        this.name = name;
        this.numPeople = numPeople;
        this.roomNum = roomNum;
        this.checkedIn = checkedIn;}


    /**
     * getter method for guest's name
     * @return String name
     */
    public String getName() {   return name;}

    /**
     * setter method for guest's name
     * @param newName String name to add to guest info
     */
    public void setName(String newName) { this.name = newName; }

    /**
     * getter method for number of people for guest
     * @return int number of people
     */
    public int getNumPeople() {return numPeople;}

    /**
     * setter method for number of people for guest
     * @param newIdNum int new id number
     */
    public void setNumPeople(int newIdNum) { this.numPeople = newIdNum; }

    /**
     * getter method for indicating if guest is checked in
     * @return boolean of guest is/is not checked in
     */
    public boolean getCheckedIn(){ return checkedIn;}

    /**
     * switches status to checked in
     * @return changes checkedIn to true
     */
    public boolean setCheckedIn(){return checkedIn = true;}

    /**
     * switches status to checked out
     * @return changes checkedIn to false
     */
    public boolean setCheckedOut() {return checkedIn = false;}


    /**
     * getter method for room number guest is staying in
     * @return int room number of hotel room
     */
    public int getRoomNum() { return roomNum; }

    /**
     * setter method for room number guest is staying in
     * @param roomNum int room number of hotel room
     */
    public void setRoomNum(int roomNum) { this.roomNum = roomNum; }

    /**
     * Prints the info for Guest
     */
    public void printGuest(){
        System.out.println("Guest name: " + this.getName() + ", number of occupants: " + this.getNumPeople() + ", room number: " + this.getRoomNum() + ", checked in: " + this.getCheckedIn());
    }
}
