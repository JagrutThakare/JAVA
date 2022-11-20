package Chapter10.Finally;

/*

finally creates block of code executed after try/catch and before it
the block will execute whether or not eception is thrown
finally block executes even if no catch block matches the exception
it is optional
but each try statement requires catch or finally 

*/


public class finallyStatement {

    static void procA() {
        try {
            System.out.println("inside procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("procA's finally");
        }
    }

    static void procB() {
        try {
            System.out.println("Inside procB");
            return;
        } finally {
            System.out.println("procB's finally");
        }
    }

    static void procC() {
        try {
            System.out.println("Inside procC");

        } finally {
            System.out.println("procC's finally");
        }
    }
    public static void main(String[] args) {
        
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
        procB();
        procC();
    }
}
