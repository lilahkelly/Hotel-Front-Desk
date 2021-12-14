/**
 * We affirm that we have carried out our academic endeavors with full academic honesty.
 * [Signed: Christina Vu & Lilah Kelly]
 * Models the process of a hotel front desk reservation.
 * @author Christina Vu and Lilah Kelly
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Enter Hotel Info
        Hotel hotelToi = new Hotel(); //change constructor if max amount of beds exceeds 3
        hotelToi.addRooms();
        hotelToi.printHotel();

        //Enter Guest Info
        Scanner inputName = new Scanner(System.in);
        System.out.println("What is guest name?");
        String guestName = inputName.nextLine();
        Scanner inputBeds = new Scanner(System.in);
        System.out.println("How many beds do they need?");
        int bedNo = inputName.nextInt();
        Guest guest = new Guest(guestName, bedNo, 0, false);

        //Finding Room
        Room room = hotelToi.findRoom(bedNo);
        room.setGuestName(guestName);
        room.setUnavail();
        room.printRoom();

        //Update Guest Info
        guest.setRoomNum(room.getRoomNum());
        guest.setCheckedIn();
        guest.printGuest();

        //Hotel Rooms Avail
        System.out.println("Number of rooms available: " + hotelToi.numAvailRooms());
    }
}

