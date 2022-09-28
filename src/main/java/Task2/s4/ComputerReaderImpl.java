package Task2.s4;

import java.util.ArrayList;
import java.util.Scanner;

public class ComputerReaderImpl implements ComputerReader{
    @Override
    public ArrayList<Computer> read() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Computer> res = new ArrayList<>();
        res.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            String name = sc.next();
            res.add(new Computer(name));
        }
        return res;
    }
}
