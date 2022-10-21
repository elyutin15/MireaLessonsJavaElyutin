package Task4.s4;

public class Memory extends Device {

    @Override
    public void start() {
        marka = Marka.KINGSMAN;
        System.out.println("memory started");
    }

    @Override
    public void process() {
        System.out.println("memory process");
    }

    @Override
    public void off() {
        System.out.println("memory off");
    }

    @Override
    void printInfo() {
        System.out.println("memory device with mark " + marka);
    }
}
