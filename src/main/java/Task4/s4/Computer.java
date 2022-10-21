package Task4.s4;

public class Computer{
    private static Marka marka;
    private static final Input inputDevice = new Input();
    private static final Output outputDevice = new Output();
    private static final Memory memory = new Memory();
    private static final Processor processor = new Processor();

    public static void main(String[] args) {
        memory.start();
        processor.start();
        inputDevice.start();
        outputDevice.start();
        start();
        System.out.println();

        memory.printInfo();
        processor.printInfo();
        inputDevice.printInfo();
        outputDevice.printInfo();
        printInfo();
        System.out.println();

        memory.process();
        processor.process();
        inputDevice.process();
        outputDevice.process();
        process();
        System.out.println();

        memory.off();
        processor.off();
        inputDevice.off();
        outputDevice.off();
        off();
    }

    public static void start() {
        marka = Marka.MSI;
        System.out.println("computer started");
    }

    public static void process() {
        System.out.println("computer process");
    }

    public static void off() {
        System.out.println("computer off");
    }

    static void printInfo() {
        System.out.println("computer with mark " + marka);
    }
}
