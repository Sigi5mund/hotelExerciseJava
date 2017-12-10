import java.util.ArrayList;

public class Room<D, T> {


    D designation;
    Enum location;
    T type;
    ArrayList<Guest> occupants;


    public Room(D designation, T type, Enum location) {
        this.designation = designation;
        this.type = type;
        this.location = location;
        this.occupants = new ArrayList<>();
        }


    public D getDesignation() {
        return designation;
    }

    public void setDesignation(D designation) {
        this.designation = designation;
    }

    public Enum getLocation() {
        return location;
    }

    public void setLocation(Enum location) {
        this.location = location;
    }

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public ArrayList<Guest> getOccupants() {
        return occupants;
    }
    public int checkOccupants() {
        return occupants.size();
    }


    public void checkInGuestDirect(Guest guest){
        occupants.add(guest);
    }

    public void checkOutGuest(Guest guest){
        occupants.remove(guest);
    }





    }

