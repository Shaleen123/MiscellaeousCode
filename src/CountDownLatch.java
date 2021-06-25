public class CountDownLatch {
    /**
     * \
     * It is a kind of synchronizer which makes 1 thread to wait until other thread complete their job.
     * await(),countdown() and getCount() are the key methods
     *
     * @param args
     */

    public static void main(String[] args) throws InterruptedException {
        java.util.concurrent.CountDownLatch count = new java.util.concurrent.CountDownLatch(3);
        Thread t = new Thread(new CountDownLatchThread(count, 3));
        t.start();
        count.await();
        System.out.println("executing main thread now");

    }
}
