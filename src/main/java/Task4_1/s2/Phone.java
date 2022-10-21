package Task4_1.s2;

public class Phone {
    private Integer number;
    private Double weight;
    private String model;

    public Phone(Integer number, Double weight, String model) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(Integer number, String model) {
        this.number = number;
        this.weight = 100.0;
        this.model = model;
    }

    public Phone(Integer number) {
        this.number = number;
        this.weight = 100.0;
        this.model = "Alcatel";
    }

    public Phone() {
        this.number = 0;
        this.weight = 100.0;
        this.model = "Alcatel";
    }


    public void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    public void receiveCall(String name, Integer number) {
        System.out.println("Calling " + name + " with number " + number);
    }

    public void sendMessage(String mess, Integer... numbers) {
        for (Integer i : numbers) {
            System.out.println("send '" + mess + "' to " + i);
        }
    }

    public Integer getNumber() {
        return number;
    }
}
