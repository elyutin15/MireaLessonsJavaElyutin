package Task6.internetMagaz;

public class Device {
    Mark mark;

    Device() {
        if (Math.random() * 2 > 1) {
            mark = Mark.DEFENDER;
        }
        else {
            mark = Mark.HP;
        }
    }

    @Override
    public String toString() {
        return "Device{" +
                "mark=" + mark +
                '}';
    }
}
