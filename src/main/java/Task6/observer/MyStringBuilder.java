package Task6.observer;

import Task6.undo.Operation;

import java.util.ArrayList;

public class MyStringBuilder {
    StringBuilder str;
    ArrayList<Subscriber> subscribers;

    MyStringBuilder() {
        str = new StringBuilder();
        subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber a) {
        subscribers.add(a);
    }

    public void erase(Subscriber a) {
        subscribers.remove(a);
    }

    public void notifyAllSubs(Operation operation) {
        for (Subscriber i : subscribers) {
            i.notifyMe(operation);
        }
    }

    public void append(String s) {
        notifyAllSubs(new Operation(3, str.length(), s.length()));
        str.append(s);
    }

    public void append(char c) {
        notifyAllSubs(new Operation(1, str.length()));
        str.append(c);
    }

    public void setCharAt(int index, char c) {
        notifyAllSubs(new Operation(2, index, c, str.charAt(index)));
        str.setCharAt(index, c);
    }
}
