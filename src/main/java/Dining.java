import java.util.HashMap;

public class Dining extends Room {

    Integer capacity;
    HashMap menu;
    Double totalProfit;

    public Dining(String designation, Enum type, Enum location, Integer capacity) {
        super(designation, type, location);
        this.capacity = 50;
        this.menu = new HashMap();
        this.totalProfit = 0.00;

    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public HashMap getMenu() {
        return menu;
    }

    public void setMenu(HashMap menu) {
        this.menu = menu;
    }
}
