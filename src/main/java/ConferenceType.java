public enum ConferenceType {



    WEDDING(50, 5000.00),
    MEETING(10, 250.00);

    public static Integer capacity;
    public static Double cost;

    ConferenceType(Integer i, Double v) {
    }

    public static Integer capacity(){
        return capacity;
    }

    public static Double cost(){
        return cost;
    }

    }




