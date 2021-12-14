/**
 * Models a hotel room.
 * @author Christina Vu and Lilah Kelly
 */
public class Room {
    private String name;
    private int numBed;
    private int roomNum;
    private boolean isAvail;


    /**
     * constructor using guest name, number of beds, room number, and availability
     * @param name name of the guest associated with the room
     * @param numBed number of beds in the room
     * @param roomNum room number
     * @param isAvail current availability of the room
     */
    public Room(String name, int numBed, int roomNum, boolean isAvail) {
        this.name = name;
        this.numBed = numBed;
        this.roomNum = roomNum;
        this.isAvail = isAvail;
    }

    /**
     * Gets the current guest name
     * @return current guest name
     */
    public String getGuestName() {
        return name;
    }

    /**
     * Assigns a new guest name to the room
     * @param name assigns the room's guest name
     */
    public void setGuestName(String name) {
        this.name = name;
    }


    /**
     * Gets the number of beds in the room.
     * @return number of beds
     */
    public int getNumBed() {
        return numBed;
    }

    /**
     * Assigns the room a certain number of beds
     * @param numBed assigned number beds in the room
     */
    public void setNumBed(int numBed) {
        this.numBed = numBed;
    }


    /**
     * Gets the room number
     * @return room number
     */
    public int getRoomNum() {
        return roomNum;
    }

    /**
     * Assigns a room number to a room object
     * @param roomNum assigns a room number
     */
    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    /**
     * Gives the status of the room.
     * @return whether the room is available
     */
    public boolean isAvail() {
        return isAvail;   }

    /**
     * Changes the status of the room to available.
     */
    public void setAvail() {
        isAvail = true;
    }

    /**
     * Changes the status of the room as unavailable.
     */
    public void setUnavail() {
        isAvail = false;
    }


    /**
     * Changes the status of the room (to the opposite of the current state).
     * @return changes the availability/unavailability of the room
     */
    public boolean changeStatus() {
        return !isAvail;
    }

    /**
     * Prints the room object with the info
     */
    public void printRoom(){
        System.out.println("Room guest name: " + this.getGuestName() + ", number of beds: " + this.getNumBed()
                + ", room number: " + this.getRoomNum() + ", availability: " + this.isAvail());
    }

    /**
     * prints room number
     */
    public String printRoomNo() {
        return "" + this.getRoomNum();
    }

    /**
     * Converts room object to string for testing purposes
     * @return String of room object
     */
    public String roomToString(){
        String toReturn = "";
        toReturn += "Room guest name: " + this.getGuestName() + ", number of beds: " + this.getNumBed()
                + ", room number: " + this.getRoomNum() + ", current status: " + this.isAvail();
        return toReturn;
    }
}



