public class StackKonversi19 {
    int[] data;
    int top;
    int size;

    public StackKonversi19() {
        size = 32;
        data = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int x) {
        if (!isFull()) {
            data[++top] = x;
        }
    }

    public int pop() {
        return data[top--];
    }
}
    

