/**
 * Models a hotel.
 * @author Christina Vu and Lilah Kelly
 */

import java.util.*;

public class Hotel {
    int maxCap;
    Hashtable<Integer, LinkedList<Room>> hotel = new Hashtable<Integer, LinkedList<Room>>();

    /**
     * default constructor
     */
    public Hotel(){
        this(3);
        maxCap = 3;
    }

    /**
     * constructor using the maximum number of beds the hotel offers
     * @param n the maximum number of beds the hotel offers
     */
    public Hotel(int n) {
        maxCap = n;
        for(int i = 1; i <= maxCap; i++){
            LinkedList<Room> listRooms = new LinkedList<Room>();
            hotel.put(i, listRooms );
        }
    }


    /**
     * adds Room object to LinkedList of Room objects based on user's
     *     preference for amount of beds
     */
    public void addRooms(){
        int roomNo = 1;

        for (int i = 1; i <= maxCap; i++){
            Scanner inputBedsPerList = new Scanner(System.in);
            System.out.println("Enter number of rooms that have " + i + " beds.");
            int bedsPerList = inputBedsPerList.nextInt();

            LinkedList<Room> listRooms = hotel.get(i);

            for (int j = 0; j < bedsPerList; j++){

                Room aRoom = new Room("None", i, roomNo, true);
                listRooms.add(aRoom);
                roomNo ++;
            }
        }
    }

    /**
     * searches LinkedList of Room objects based on number of beds wanted. if
     * the first room in the LinkedList
     * is available, changes room to not available and returns room.
     * else, moves on to next room in LinkedList
     * @param bedNo: number of beds in
     * @return Room object
     */

    public Room findRoom(int bedNo){
        LinkedList<Room> roomList = hotel.get(bedNo);
        Room currRoom = null;
        int i = 0;
        boolean found = false;

        while(!found) {
            currRoom = roomList.get(i);
            if (currRoom.isAvail()) {
                currRoom.changeStatus();
                found = true;
            }
            else {
                i++;
            }
        }
        return currRoom;
    }


    /**
     * Gets string of room number from specified LinkedList
     * @param list the specific linkedlist of a certain room capacity
     * @param index the specific index of the room from the list
     * @return string of room number
     */
    private String getRoom(LinkedList<Room> list, int index) {
        Room room = list.get(index);
        return "Room no: " + room.printRoomNo();
    }


    /**
     * Gets the list of rooms with a certain capacity
     * @param bedCap: bed capacity
     * @return list of string of rooms for a certain capacity of beds.
     */
    private LinkedList<String> getList(int bedCap) {
        LinkedList<String> newList = new LinkedList<String>();
        LinkedList<Room> currList = hotel.get(bedCap);
        for (int i = 0; i < currList.size(); i++) {
            newList.add(this.getRoom(currList, i));
        }
        return newList;
    }

    /**
     * Gets the complete lists of bed capacity linked lists
     * @return string of list of bed capacity lists
     */
    private String getLists() {
        String toReturn = "";
        ArrayList<LinkedList<String>> array = new ArrayList<LinkedList<String>>(maxCap);
        for(int i = 1; i <= maxCap; i++) {
            array.add(this.getList(i));
            toReturn += " Cap: " + i + " "+ this.getList(i);
        }
        return toReturn;
    }


    /**
     * Prints the hotel rooms
     */
    public void printHotel(){
        System.out.println(this.getLists());

    }

    /**
     * Gives the number of available rooms
     * @return the integer of available rooms in the hotel
     */
    public int numAvailRooms() {
        LinkedList<Room> roomList;
        Room currRoom = null;
        int numRooms = 0;

        for (int h = 1; h <= hotel.size(); h++) {
            roomList = hotel.get(h);

            for (int i = 0; i < roomList.size(); i++) {
                currRoom = roomList.get(i);

                if (currRoom.isAvail()) {
                    numRooms++;
                }
            }
        }
        return numRooms;
    }
}
