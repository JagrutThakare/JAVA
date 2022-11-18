

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread(); // This method gives reference to main thread

        System.out.println("Current Thread: " + t); // this outputs : Thread[main,5,main] here first field is name of thread, then its priority, and name of its group{1}

        // Change name of thread
        t.setName("My Thread");
        System.out.println("After name Change" + t);

        try {
            for(int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(100); // suspend for 1000ms
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread interrupted");
        }

        System.out.println(t.getName());


    }

}

/*
Index

1 - Thread group is a DS that controls state of collection of threads as a whole

*/