package Task6.converter;

public class Converter implements Convertable {
    @Override
    public Integer convert(Temperature a, Temperature b, int valueA) {
        if (a.equals(Temperature.CELSIUS)) {
            if (b.equals(Temperature.CELSIUS)) {
                return valueA;
            }
            if (b.equals(Temperature.FAHRENHEIT)) {
                return valueA * 9 / 5 + 32;
            }
            if (b.equals(Temperature.KELVIN)) {
                return valueA + 273;
            }
        }
        if (a.equals(Temperature.FAHRENHEIT)) {
            if (b.equals(Temperature.CELSIUS)) {
                return (valueA - 32) * 5 / 9;
            }
            if (b.equals(Temperature.FAHRENHEIT)) {
                return valueA;
            }
            if (b.equals(Temperature.KELVIN)) {
                return (valueA - 32) * 5 / 9 + 273;
            }
        }
        if (a.equals(Temperature.KELVIN)) {
            if (b.equals(Temperature.CELSIUS)) {
                return valueA - 273;
            }
            if (b.equals(Temperature.FAHRENHEIT)) {
                return (valueA - 273) * 9 / 5 + 32;
            }
            if (b.equals(Temperature.KELVIN)) {
                return valueA;
            }
        }
        return null;
    }
}
