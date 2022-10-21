package Task4_1.s9;

public abstract class Furniture {
    protected String color;
    protected String material;
    protected String name;

    public Furniture() {

    }

    public Furniture(String color, String material, String name) {
        this.color = color;
        this.material = material;
        this.name = name;
    }

    public abstract String getDescription();
}
