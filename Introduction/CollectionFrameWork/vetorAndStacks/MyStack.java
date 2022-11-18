package CollectionFrameWork.vetorAndStacks;

import CollectionFrameWork.My_Linked_List;

public class MyStack<E> {

    private My_Linked_List<E> ll = new My_Linked_List<E>();

    void push(E e) {
        ll.add(e);
    }

    E pop() throws Exception {
        if (ll.isEmpty()) {
            throw new Exception("Popping from empty stack is not allowed");
        }
        return ll.removeLast();
    }

    E peek() throws Exception {
        return ll.getLast();
    }

    public static void main(String[] args) throws Exception {
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(1);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        System.out.println("Stack: " + stack);

        while (stack.ll.isEmpty() == false) {
            int popped = stack.pop();
            System.out.println("Popped: " + popped);
        }

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        int peeked = stack.peek();
        System.out.println("Peeked : " + peeked);

    }

}
