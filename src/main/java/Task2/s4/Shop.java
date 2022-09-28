package Task2.s4;

import java.util.ArrayList;

public class Shop {
    private final ArrayList<Computer> availableComputers;

    public Shop() {
        ComputerReaderImpl inp = new ComputerReaderImpl();
        availableComputers = inp.read();
    }

    public Computer findComputer(String name){
        for (Computer availableComputer : availableComputers) {
            if (availableComputer.getName().equals(name)) {
                return availableComputer;
            }
        }
        return null;
    }
    public void addComputer(String name){
        if (findComputer(name) != null) {
            return;
        }
        availableComputers.add(new Computer(name));
    }
    public void removeComputer(String name){
        for (int i = 0; i < availableComputers.size(); ++i) {
            if (availableComputers.get(i).getName().equals(name)) {
                availableComputers.remove(i);
                return;
            }
        }
    }
}
