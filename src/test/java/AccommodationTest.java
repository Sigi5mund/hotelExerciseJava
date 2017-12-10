import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AccommodationTest {

    Accommodation bedroom1;
    Guest guest1;
    Guest guest2;


    @Before
    public void before() {
        bedroom1 = new Accommodation(5, AccommodationType.DOUBLE, Location.FIRSTFLOOR);
        guest1 = new Guest("Norma", "Stiller", "USA");
        guest2 = new Guest("Mario", "Pastino", "USA");

    }

    @Test
    public void canSeeOccupancy() {
        assertEquals(0, bedroom1.checkOccupants());
    }

    @Test
    public void canCheckInOccupant() {
        bedroom1.checkInGuestDirect(guest1);
        assertEquals(1, bedroom1.checkOccupants());
    }

    @Test
    public void accommodationHasCharge(){
        assertEquals(AccommodationType.cost(), bedroom1.getCharge());
    }

    @Test
    public void accommodationHasCapacity(){
        assertEquals(10, java.util.Optional.ofNullable(bedroom1.getCapacity()));
    }

}
