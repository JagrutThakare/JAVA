package CollectionFrameWork.vetorAndStacks;

import java.util.Stack;
// import java.util.Vector;

public class MainClass {
    public static void main(String[] args) {
    
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        System.out.println("Stack: " + stack);

        while(stack.empty() == false) {
            int popped = stack.pop();
            System.out.println("Popped: " + popped);
        }

        for(int i = 0; i < 10; i++) {
            stack.push(i);
        }

        int peeked = stack.peek();
        System.out.println("Peeked : " + peeked);
        
    }
}
