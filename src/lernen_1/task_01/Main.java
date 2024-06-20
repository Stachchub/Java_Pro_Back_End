package lernen_1.task_01;

public class Main {
    public static void main(String[] args) {

        MyThread_1 myThread1 = new MyThread_1();
        MyThread_2 myThread2 = new MyThread_2();

        myThread1.start();
//      myThread2.run();  в интерфейсе нет метода start

        Thread thread = new Thread(myThread2);
        thread.setDaemon(true); // - создание демон-потка
        thread.start();




        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Thread 0: " + Thread.currentThread().getName() + " __ " + i);
        }
    }
}
