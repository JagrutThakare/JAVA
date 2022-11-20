package Chapter11.Syncronization;
// Imagine we want to synchronize access to to obj of a class that wasn't designed for multithreading

// access. That is class does not use synchronized methods and this class is not accessible cuz it was not created by us
// The solution is  you put calls to methods defined by this class inside a synchronized block

class Callme {
    void callme(String msg) // synchronized lets only one thread at a time
    {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    Thread t;
    Callme target;

    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        synchronized (target) {
            target.callme(msg);
        }
    }
}

public class Synch1 {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Hello");
        Caller ob2 = new Caller(target, "Synchronised");
        Caller ob3 = new Caller(target, "World");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
