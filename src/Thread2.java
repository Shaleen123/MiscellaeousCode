public class Thread2 extends Thread {

    String lock1;
    String lock2;

    Thread2(String lock1, String lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {

        synchronized (lock2) {
            System.out.println("Holding lock 2");
            //   Thread.sleep(10000);
            System.out.println("Thread 2: Waiting for lock 1...");

            synchronized (lock1) {
                System.out.println("Holding lock 1");
                // Thread.sleep(10000);
                System.out.println("Thread 2: Holding lock 1 & 2...");

            }

        }

    }

}
