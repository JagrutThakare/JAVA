/*

If a method is capable of causing an exception that it does not handle it must specify this behaviour so that callers of method guard themselves. You do this by Throws clause
in the method declaration. A throws clause lists the types of exception that a method might throw. except of type Error or RuntimeException, or their subclasses.
all other exception that a method can throw must be declared in throws clause. If not a compile time error occurs
*/


public class throwsStatement {

    static void throwOne() throws IllegalAccessException {
        System.out.println("Inside throwOne.");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Caught " + e);
        }
    }
}
