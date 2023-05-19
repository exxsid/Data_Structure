package stack;

public interface StackADT<E> {

    void push(E e);
    E pop() throws StackUnderflow;
    E peek() throws StackUnderflow;
    boolean isEmpty();
    int size();
    void clear() throws StackUnderflow;

}
