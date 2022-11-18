/*

An exception is an abnormal condition that occurs at runtime.
Runtime error
-A Java exception(error) is an object that describes an exceptional condition that occured in code. 
-When an exception arises an object representing that exception is created and thrown in the method that caused the error.
-Exception handling keyword = try, catch, throw, throws and finally
-Program Statements to be monitored are stored in try block
-if exception occurs it is thrown
-code can catch this exception using catch and handle it in some rational manner
-to manually throw exception use throw
-any exception that is thrown out of method must be specified as such by throws clause.
-Any exception that is not caught by your  program will be dealt by default handler  displaying a string describing exception and terminates the program
-it shows stack trace showing class name method name, file name, and line no.


General form of an exception handling block:

try {
    // block of code to be monitored
}
catch (ExceptionType1 exOb) {
    // exception handler for ExceptionType1
}
catch (ExceptionType2 exOb) {
    // exception handler for ExceptionType2
}

//....

finally {
    //block of code to be executed after try block ends
}

ExceptionType is the type of exception that has occured


*/