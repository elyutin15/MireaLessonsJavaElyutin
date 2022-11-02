package Task6.internetMagaz;

import java.util.Arrays;

public class Computer {
    CPU cpu;
    Device[] devices;
    Memory memory;
    Mark mark;
    int series;

    Computer(int series) {
        cpu = new CPU();
        devices = new Device[2];
        devices[0] = new Device();
        devices[1] = new Device();
        memory = new Memory();
        mark = Mark.MSI;
        this.series = series;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", devices=" + Arrays.toString(devices) +
                ", memory=" + memory +
                ", mark=" + mark +
                ", series=" + series +
                '}';
    }
}