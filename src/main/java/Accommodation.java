

public class Accommodation extends Room{

    Integer capacity;
    Double charge;

    public Accommodation(Integer designation, AccommodationType type, Location location) {
        super(designation, type, location);
        this.charge = AccommodationType.cost();
        this.capacity= AccommodationType.capacity();
    }


    public String getFloorName (Accommodation room){
        return (Location.getId());
    }
    public String prettyPrintName(Accommodation room) {
        return getFloorName(room) + room.designation;
    }


    public Integer getCapacity() {
        return capacity;
    }


    public Double getCharge() {
        return charge;
    }


}
