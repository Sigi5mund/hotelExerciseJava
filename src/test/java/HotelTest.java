import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {


    Hotel hotel;
    Conference room1;
    Accommodation bedroom1;
    Guest guest1;
    Guest guest2;
    Guest guest3;


    @Before
    public void before() {

        hotel = new Hotel ("Aberdour");
        room1 = new Conference("Olympus", ConferenceType.MEETING, Location.GROUNDFLOOR);
        bedroom1 = new Accommodation(5, AccommodationType.DOUBLE, Location.FIRSTFLOOR);
        guest1 = new Guest("Norma", "Stiller", "USA");
        guest2 = new Guest("Mario", "Pastino", "USA");
        guest3 = new Guest("Roger", "McDuff", "Scotland");
        hotel.addRoom(room1);
        hotel.addRoom(bedroom1);
        hotel.checkInGuestBedroom(bedroom1, guest1);
//        hotel.checkInGuestBedroom(bedroom1, guest2);
//        hotel.checkInGuestBedroom(bedroom1, guest3);

    }


    @Test
    public void hotelHasRooms()
    {assertEquals(2, hotel.rooms.size());

    }
    @Test
    public void canCheckInGuest(){
        assertEquals(false, hotel.checkIfRoomFullBedroom(bedroom1));
    }
}
