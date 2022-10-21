package Task4.s1;

public enum Season {
    SUMMER(30.0),
    AUTUMN(10.0),
    WINTER(-20.0),
    SPRING(10.0);

    final Double averageTemperature;

    Season(Double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public String getDescription() {
        if (this.equals(Season.SUMMER)) {
            return "Warm season";
        }
        return "Cold season";
    }
}
