
//Chained exception feature allows you to associate another exception with an exception
// This second exception describes cause of the first exception.


public class ChainedException {
    static void demoproc() {
        NullPointerException e = new NullPointerException("Top layer");
        e.initCause(new ArithmeticException("Cause")); // the argument passed here is cause it cant be overwritten
        // e.initCause(new EOFException()); // this line will give errror.
        throw e;
    }
    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Caught : " + e);

            System.out.println("Original cause: " + e.getCause());
        }
    }
}
