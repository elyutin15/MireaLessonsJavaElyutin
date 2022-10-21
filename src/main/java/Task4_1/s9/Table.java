package Task4_1.s9;

public class Table extends Furniture{
    private Integer countLegs;


    public Table() {
        super();
        this.countLegs = 0;
    }

    public Table(String color, String material, String name, Integer countLegs) {
        super(color, material, name);
        this.countLegs = countLegs;
    }

    @Override
    public String toString() {
        return "Table{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public String getDescription() {
        return "table" + " with " + countLegs + " legs";
    }
}
