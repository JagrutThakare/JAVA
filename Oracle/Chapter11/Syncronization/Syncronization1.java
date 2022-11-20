package Chapter11.Syncronization;
// to enter a objects monitor call method modified with synchronized keyword

//race condition : when nothing exist to stop many threads from calling the same method on the same obj at same time

class Callme {
    synchronized void callme(String msg) // synchronized lets only one thread at a time
    {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e)
        {
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
        target.callme(msg);
    }
}

public class Syncronization1 {
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
