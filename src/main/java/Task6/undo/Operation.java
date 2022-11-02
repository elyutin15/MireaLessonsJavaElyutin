package Task6.undo;

public class Operation {
    int numb;
    int len;
    int index;
    char value;
    char prevValue;

    public Operation(int numb, int index) {
        this.numb = numb;
        this.index = index;
        this.value = 'a';
        this.prevValue = 'a';
    }

    public Operation(int numb, int index, int len) {
        this.numb = numb;
        this.index = index;
        this.len = len;
        this.value = 'a';
        this.prevValue = 'a';
    }

    public Operation(int numb, int index, char value, char prevValue) {
        this.numb = numb;
        this.index = index;
        this.value = value;
        this.prevValue = prevValue;
    }
}
