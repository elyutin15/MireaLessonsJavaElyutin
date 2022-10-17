package Task3.Formatirovanie.s2;

import java.util.HashMap;
import java.util.Map;

public class Tovar {
    private Double cost;
    private final String name;
    private String valute;

    public static Map<String, Double> ratios = new HashMap<>();

    private void initRatios() {
        ratios.put("rub", 1.0);
        ratios.put("dub", 2.0);
        ratios.put("trip", 3.0);
    }

    public Tovar(Double cost, String name, String valute) {
        this.cost = cost;
        this.name = name;
        this.valute = valute;
        initRatios();
    }

    public Tovar(Double cost, String name) {
        this.cost = cost;
        this.name = name;
        this.valute = "rub";
        initRatios();
    }

    public Double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getValute() {
        return valute;
    }

    public void setValute(String valute) {
        try {
            this.cost = this.cost * ratios.get(this.valute) / ratios.get(valute);
            this.valute = valute;
        } catch (Exception e) {
            System.out.println("Unknown valute");
        }
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "cost=" + cost + valute +
                ", name='" + name + '\'' +
                '}';
    }
}
