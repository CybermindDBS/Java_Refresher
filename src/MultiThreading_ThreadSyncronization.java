public class MultiThreading_ThreadSyncronization implements Runnable {
    Object lock;
    String msg;

    MultiThreading_ThreadSyncronization(Object obj, String msg) {
        this.lock = obj;
        this.msg = msg;
    }

    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 4; i++) {
                System.out.println(msg);
                try {
                    Thread.sleep(1000);
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            lock.notify();
        }
    }

    public static void main(String[] args) {
        String lock = "LOCK";
        MultiThreading_ThreadSyncronization m1 = new MultiThreading_ThreadSyncronization(lock, "HI");
        MultiThreading_ThreadSyncronization m2 = new MultiThreading_ThreadSyncronization(lock, "HELLO");

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        t1.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
    }
}
