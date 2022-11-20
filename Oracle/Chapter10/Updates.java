package Chapter10;

// Multi Catch feature
/*
alllows the same catch to catch two or more exceptions
each multicatch parameter is implicitly final
*/

public class Updates {
    public static void main(String[] args) {
        int a = 10, b= 0;
        int val[] = {1,2,3};

        try {
            int result = a/b;
            val[10] = 19;
            System.out.println(result);

        } catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {// Multicatch use OR operator
            System.out.println("Exception Caught: " + e);
        }
        System.out.println("After Multi Catch");
    }
}
