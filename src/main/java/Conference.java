
public class Conference extends Room {




    Double charge;
    Integer capacity;


    public Conference(String designation, ConferenceType type, Location location ) {
        super(designation, type, location);
        this.charge = ConferenceType.cost();
        this.capacity= ConferenceType.capacity();
    }

    public String prettyPrintName() {
        return "The "+ designation + "room on floor"+ location;
    }

    public Integer getCapacity() {
        return this.capacity;
    }

    public Double getCharge() {
        return charge;
    }

}


//    options like projector, tea