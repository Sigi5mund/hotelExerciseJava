import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {


    Hotel hotel;
    Conference room1;
    Accommodation bedroom1;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    ArrayList<Guest> expected;


    @Before
    public void before() {

        hotel = new Hotel ("Aberdour");
        room1 = new Conference("Olympus", ConferenceType.MEETING, Location.GROUNDFLOOR);
        bedroom1 = new Accommodation(5, AccommodationType.DOUBLE, Location.FIRSTFLOOR);
        guest1 = new Guest("Norma", "Stiller", "USA");
        guest2 = new Guest("Mario", "Pastino", "USA");
        guest3 = new Guest("Roger", "McDuff", "Scotland");
        hotel.addGuest(guest1);
        hotel.addGuest(guest2);
        hotel.addGuest(guest3);
        hotel.addRoom(room1);
        hotel.addRoom(bedroom1);
        hotel.checkInGuestBedroom(bedroom1, guest1);
        expected = new ArrayList<>();
//        hotel.checkInGuestBedroom(bedroom1, guest2);
//        hotel.checkInGuestBedroom(bedroom1, guest3);

    }

    @Test
    public void hotelHasName(){
        assertEquals("Aberdour", hotel.name);
    }

    @Test
    public void hotelHasRooms() {
        assertEquals(2, hotel.rooms.size());
    }


    @Test
    public void canCheckInGuest(){
        assertEquals(1, bedroom1.checkNumberOfOccupants());
    }

    @Test
    public void checkGuestsAreOnList(){
        assertEquals(3, hotel.findguests());
    }

    @Test
    public void checkWhoIsInRoom(){
        expected.add(guest1);
        assertEquals(expected, bedroom1.getOccupants());
    }

}
