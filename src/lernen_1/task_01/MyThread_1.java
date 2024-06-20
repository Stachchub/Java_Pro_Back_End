package lernen_1.task_01;

public class MyThread_1 extends Thread {

    @Override
    public void run() {
        for (int i = 100; i < 110; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 1: " + Thread.currentThread().getName() + " __ "  + i);
        }

    }
}
