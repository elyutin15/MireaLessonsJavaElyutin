package Task4_1.s9;

public class Chair extends Furniture{

    private Integer countLegs;


    public Chair() {
        super();
        this.countLegs = 0;
    }

    public Chair(String color, String material, String name, Integer countLegs) {
        super(color, material, name);
        this.countLegs = countLegs;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public String getDescription() {
        return "chair" + " with " + countLegs + " legs";
    }
}
