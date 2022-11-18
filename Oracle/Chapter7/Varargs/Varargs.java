package Chapter7.Varargs;

// Varargs Overloading is valid

public class Varargs {

    static void vaTest(String msg, int ... v) { // v is array of arguments, variable length parameter must be last parameter, only one vararg is allowed
        System.out.print(msg + v.length + " Contents: ");

        for(int x : v) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        
        vaTest("One Vararg: ",10);       // 1 args
        vaTest("Three Vararg: ",1, 2, 3); // 3 arg
        vaTest("No Vararg: "); // no args
    }
}

/*  
    Sometimes varargs can create ambiguity.
    Consider following cases:
    static void vaTest(int ...v){
    static void vaTest(boolean ...v){

    if a call in main function is like this = vaTest(); i.e. without arguments 
    then the call is ambiguous

    another example is 

    static void vaTest(int ...v) {
    static void vaTest(int n, int ...v) {

    if a call in main function is like this= vaTest(1); this cant be resolved 
    because compiler cant choose which method is chosen since both are int.

*/
