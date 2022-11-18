package Chapter9.Interfaces;
/*
-When interface is declare as public then it will have the name same as the file it is in.
-The variables in the interfaces are final and static they cant be changed by implementing class.
-All methods and variables are implicitly public.
-Methods that implement the interface must be public. And type signatures of should be similar to interface
-Methods implementions in a class can be accessed through implenting interface reference variables.
-Interfaces can be nested
-Interface variables must be initialized.
-Interfaces can have static methods to access Static Method it is called in following way
                    "InterfaceName.staticMethodName"

-Multiple Inheritance Issues
    |Class Implementation takes priority over an interface implementation
    |If the two interfaces have same method which is not overridden by Class then error occurs.
    |In case in which one interface inherits another, with both defining  a common default method, the inheriting interface's version of the method takes precedence.
    |It is possible to explicitly refer to a default implementation in an inherited interface by using a new form of super.
     its general form is shown here:
                                    "InterfaceName.super.methodName()"
*/
interface B {
    default void example() {
        System.out.println("This is interface B");
    }
}

public interface A{

    void show(int parameter);

    static void example2() 
    {
        System.out.println("This static Method");
    }
    default void example() {
        System.out.println("This is interface A");
    }


}