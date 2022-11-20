package Chapter10.Throws;


// syntax
// throw ThrowableInstance
// ThrowableInstance is an objec type of Throwable or a subclass of Throwable.
// Primitive types int char and non-Throwable class such as String and Object cant be used as exceptions
// flow of execution stops after throw statement

public class throwStatement {
    static void demoproc() {
        try {
            throw new NullPointerException("demo");// creating new exception with new keyword
        }
        catch (NullPointerException e){
            System.out.println("Caught inside demoproc.");
            throw e;
        }
    }
    public static void main(String[] args) {
        
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Recaught : " + e);
        }
    }
}
