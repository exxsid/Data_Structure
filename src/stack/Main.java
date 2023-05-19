package stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);
        stack.push(54);
        System.out.println(stack.size());
        try {
//            System.out.println(stack.pop());
//            System.out.println(stack.peek());
//            System.out.println(stack.size());
//            System.out.println(stack.pop());
            stack.clear();
            System.out.println(stack.isEmpty());
//            System.out.println(stack.pop());
            System.out.println(stack.peek());
        } catch (StackUnderflow e) {
            System.out.println(e.getMessage());
        }


    }

}
