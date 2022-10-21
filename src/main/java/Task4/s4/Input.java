package Task4.s4;

public class Input extends Device{

    @Override
    public void start() {
        marka = Marka.DEFENDER;
        System.out.println("input started");
    }

    @Override
    public void process() {
        System.out.println("input process");
    }

    @Override
    public void off() {
        System.out.println("input off");
    }

    @Override
    void printInfo() {
        System.out.println("input device with mark " + marka);
    }
}
