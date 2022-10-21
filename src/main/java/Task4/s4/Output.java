package Task4.s4;

public class Output extends Device{

    @Override
    public void start() {
        marka = Marka.DEFENDER;
        System.out.println("output started");
    }

    @Override
    public void process() {
        System.out.println("output process");
    }

    @Override
    public void off() {
        System.out.println("output off");
    }

    @Override
    void printInfo() {
        System.out.println("output device with mark " + marka);
    }
}
