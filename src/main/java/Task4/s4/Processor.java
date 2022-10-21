package Task4.s4;

public class Processor extends Device{
    @Override
    public void start() {
        marka = Marka.AMD;
        System.out.println("processor started");
    }

    @Override
    public void process() {
        System.out.println("processor process");
    }

    @Override
    public void off() {
        System.out.println("processor off");
    }

    @Override
    void printInfo() {
        System.out.println("processor with mark " + marka);
    }
}
