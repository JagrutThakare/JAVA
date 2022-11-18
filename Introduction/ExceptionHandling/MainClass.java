package ExceptionHandling;

public class MainClass {
    public static void main(String[] args) {
        
        try {

            fun1();
            int a = 5;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage() + " occured plz chk your code.");
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    static void fun1() {
        try {
            fun2();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getLocalizedMessage() + " Occured");
        }
        

    }

    static void fun2() throws ArrayIndexOutOfBoundsException {

        // int a[] = new int[5];
        // a[99] = 22;
        throw new ArrayIndexOutOfBoundsException("Danger");
    }
}
