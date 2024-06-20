package lernen_1.task_01;

public class MyThread_2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1000; i < 1010; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 2: " + Thread.currentThread().getName() + " __ "  + i);
        }
    }
}
