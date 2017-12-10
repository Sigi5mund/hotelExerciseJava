public enum AccommodationType {



    SINGLE(1, 20.00),
    DOUBLE(2, 40.00),
    FAMILY(4, 70.00);


    private static Integer capacity;
    private static Double cost;


    AccommodationType(Integer i, Double v) {
    }

    public static Integer capacity(){
        return capacity;
    }

    public static Double cost(){
        return cost;
    }


}
