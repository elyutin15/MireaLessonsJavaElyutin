package Task6.undo;

import java.util.ArrayList;

public class MyStringBuilder {
    StringBuilder str;
    ArrayList<Operation> ops;

    MyStringBuilder() {
        str = new StringBuilder();
        ops = new ArrayList<>();
    }
    void append(String s) {
        ops.add(new Operation(3, str.length(), s.length()));
        str.append(s);
    }

    void append(char c) {
        ops.add(new Operation(1, str.length()));
        str.append(c);
    }


    void setCharAt(int index, char c) {
        ops.add(new Operation(2, index, c, str.charAt(index)));
        str.setCharAt(index, c);
    }


    void undo() {
        if (ops.isEmpty()) {
            return;
        }
        Operation op = ops.get(ops.size() - 1);
        ops.remove(ops.size() - 1);
        if (op.numb == 1) {
            str.deleteCharAt(op.index);
        }
        if (op.numb == 2) {
            str.setCharAt(op.index, op.prevValue);
        }
        if (op.numb == 3) {
            str.replace(op.index, op.index + op.len, "");
        }
    }

    @Override
    public String toString() {
        return str.toString();
    }
}
