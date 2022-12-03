package Chapter13.Type_modifiers;

public class T {
    transient int a; // Will not persist 
    int b; // Will persist
}

// The volatile modifier tells the compiler that the variable modified by volatile can be 
// changed unexpectedly by other parts of your program. One of these situations involves 
// multithreaded programs. In a multithreaded program, sometimes two or more threads 
// share the same variable. For efficiency considerations, each thread can keep its own, private 
// copy of such a shared variable. The real (or master) copy of the variable is updated at 
// various times, such as when a synchronized method is entered. While this approach works 
// fine, it may be inefficient at times. In some cases, all that really matters is that the master 
// copy of a variable always reflects its current state. Also, accesses to the master variable must 
// be executed in the precise order in 
// which they are executed on any private copy