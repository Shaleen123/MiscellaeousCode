import java.util.concurrent.CountDownLatch;

public class CountDownLatchThread extends Thread {
    CountDownLatch countDownLatch;
    int count;

    CountDownLatchThread(CountDownLatch countDownLatch, int count) {
        this.countDownLatch = countDownLatch;
        this.count = count;
    }

@Override
    public void run() {

        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Before executing job" + countDownLatch.getCount());
            countDownLatch.countDown();
            System.out.println("After executing job" + countDownLatch.getCount());

        }
    }

}
