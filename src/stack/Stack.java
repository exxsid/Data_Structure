package stack;

public class Stack<E> implements StackADT<E>{

    private E element;
    private int size;
    private Node<E> top;

    public Stack(E element) {
        this.element = element;
        this.size = 0;
        this.top = null;
        push(element);
    }

    public Stack() {
    }

    @Override
    public void push(E e) {
        Node<E> newElement;
        Node<E> temp = top;
        if(size == 0) {
            newElement = new Node<>(e, null);
        } else {
            newElement = new Node<>(e, top);
        }
        top = newElement;
        size++;
    }

    @Override
    public E pop() throws StackUnderflow{
        if(top == null){
            throw new StackUnderflow("The stack is empty");
        }
        size--;
        Node<E> e = top;
        top = top.getNext();
        return e.getData();
    }

    @Override
    public E peek() throws StackUnderflow{
        if (top == null) {
            throw new StackUnderflow("The stack is empty");
        }
        return top.getData();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() throws StackUnderflow {
        while(top != null) {
            pop();
        }
    }

    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }
    }
}
