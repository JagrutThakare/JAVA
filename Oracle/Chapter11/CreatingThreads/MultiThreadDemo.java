package Chapter11.CreatingThreads;

class NewThread implements Runnable {
    String name;
    Thread t;

    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New Thread : " +t);
        t.start();
    }

    public void run() {
        try {
            for(int i = 0; i < 6; i++) {
                System.out.println(name + " : " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println(name + " Was Interrupted");
        }
        System.out.println(name + " exiting.");
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        
        new NewThread("One");
        new NewThread("Two");
        new NewThread("Three");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main Thread was Interrupted");
        }
        System.out.println("Main Thread Exiting");
    }
}
