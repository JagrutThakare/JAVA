package Chapter10.ExceptionFundamentals;


// In case of multiple catch clauses the first one to have similar exception is executed and other catch clauses are bypassed most like if else.
// Exception subclasses must come before their superclasses
// Nesting of try is possible 
// each time a try statement is nested the context of that exception is pushed on 
// the stack. If an inner try does not have a catch handler for particular exception 
// the stack is unwound  and the next try statements catch handlers are inspected 
// for a match or jre will handle the exception.

import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int a = 0, b = 0, c= 0;
        Random r = new Random();

        try {
            for(int i = 0; i < 320000; i++)
            {
                System.out.println("i = " +i);
                b = r.nextInt();
                c = r.nextInt();
                a = 12345/(b/c);
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero.");
            System.out.println("Exception : "+e);
            a = 0;
        }
        System.out.println("a : " + a);

    }
}
