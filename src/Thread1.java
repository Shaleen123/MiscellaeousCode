public class Thread1 extends Thread {

    String lock1;
    String lock2;

    Thread1(String lock1, String lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;

    }

    public Thread1(CountDownLatchThread countDownLatchThread) {
    }

    @Override
    public void run() {

        synchronized (lock1) {
            System.out.println("Holding lock 1");

            synchronized (lock2) {
            }
        }


    }

    public static void main(String[] args) {

    }
}
