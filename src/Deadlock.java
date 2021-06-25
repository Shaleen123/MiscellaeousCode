public class Deadlock {

    public static void main(String[] args) {
        String lock1 = "lock1";
        String lock2 = "lock2";
        Thread1 thread1 = new Thread1(lock1, lock2);
        Thread2 thread2 = new Thread2(lock1, lock2);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start();
        t2.start();
    }
}
