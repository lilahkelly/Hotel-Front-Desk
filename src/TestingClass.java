import java.util.*;

public class TestingClass {

    public static void main(String[] args){
        Testing.startTests();
        testingFindRoom();
        testingNumAvail();
        Testing.finishTests();
    }
    public static Hotel makeHotel(){
        Hotel hotel = new Hotel();
        System.out.println("Input 2 for first prompt, 2 for second, and 2 for third");
        hotel.addRooms();
        return hotel;
        }


    public static void testingFindRoom(){
        Hotel hotel = makeHotel();
        int bedNo = 1;
        boolean expected = true;
        Room roomExpected = new Room("None", bedNo, 2, true);
        Room room = hotel.findRoom(1);
        String strRoom = room.roomToString();
        String strRoomExpected = roomExpected.roomToString();
        boolean actual = strRoom.equals(strRoomExpected);
        Testing.assertEquals("Testing Find Room function in Hotel Class:", expected, actual);
    }

    public static void testingNumAvail() {
        Hotel hotel = makeHotel();
        int bedNo = 1;
        int roomsAvail = 5;
        boolean expected = true;
        Room room = hotel.findRoom(1);
        room.setUnavail();
        boolean actual = roomsAvail == hotel.numAvailRooms();
        Testing.assertEquals("Testing number of rooms available function in Hotel Class", expected, actual);
    }
}

