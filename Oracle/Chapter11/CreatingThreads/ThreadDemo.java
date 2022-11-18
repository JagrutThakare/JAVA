
public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread(); // Create a new thread

        try {
            for(int i = 5; i>0; i--) {
                System.out.println("Main Thread: " +i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main Thread exiting");
    }
}

class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "Demo Thread"); // passing this indicates we want to call the run method on this object
        System.out.println("Child thread: " + t);
        t.start(); // Start the thread execution at run
    }

    // This is the entry point for the second thread
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Child thread: " +i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting child thread");
    }

}

