package Task6.observer;

import Task6.undo.Operation;

public interface Subscriber {
    void notifyMe(Operation operation);
}
