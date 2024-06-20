package homeworks.homework_1;

public class MainControl {

    private static int counter;
    public static synchronized void increment() {
        counter++;
    }


    public static void main(String[] args) {
        HomeworkCounter_1 homeworkCounter1 = new HomeworkCounter_1();
        HomeworkCounter_2 homeworkCounter2 = new HomeworkCounter_2();

        homeworkCounter1.start();
        homeworkCounter2.start();

        try {
            homeworkCounter1.join();
            homeworkCounter2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Количество чисел соответствующих условию задачи: " + counter);
    }

}
