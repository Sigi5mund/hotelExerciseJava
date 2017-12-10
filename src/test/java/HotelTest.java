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
    ArrayList<Room> expectedRooms;
    Dining restaurant1;


    @Before
    public void before() {

        hotel = new Hotel("Aberdour");
        restaurant1 = new Dining(DiningType.LUXURY, Location.GROUNDFLOOR, "McTaggart's");
        hotel.addRestaurant(restaurant1);
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
        expectedRooms = new ArrayList<>();
        hotel.checkInGuestBedroom(bedroom1, guest2);


    }

    @Test
    public void hotelHasName() {
        assertEquals("Aberdour", hotel.getName());
    }

    @Test
    public void hotelHasRooms() {
        assertEquals(2, hotel.rooms.size());
    }


    @Test
    public void canCheckInGuest() {
        assertEquals(2, bedroom1.checkNumberOfOccupants());
    }

    @Test
    public void checkGuestsAreOnList() {
        assertEquals(1, hotel.findguests());
    }

    @Test
    public void checkWhoIsInRoom() {
        expected.add(guest1);
        expected.add(guest2);
        assertEquals(expected, bedroom1.getOccupants());
    }

    @Test
    public void roomCapacity() {
        hotel.checkInGuestBedroom(bedroom1, guest3);
        assertEquals(2, bedroom1.checkNumberOfOccupants());
    }

    @Test
    public void restaurantHasName() {
        assertEquals("McTaggart's", hotel.getRestaurant());

    }

    @Test
    public void emptyRooms() {
        expectedRooms.add(room1);
        assertEquals(expectedRooms, hotel.emptyRooms());
    }
}
