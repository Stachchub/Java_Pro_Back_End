package homeworks.homework_1;

public class MainComparison {
    private static int counter;
    public static synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) {
        int numberFirst = dataFirstMethod();
        int numberSecond = dataSecondMethod();

        if (numberSecond == numberFirst) {
            System.out.println("Методы вычисления в однопоточном режиме и многопоточном дают одинаковые значения");
            System.out.println("Данные из первого метода: " + numberFirst + " совпадают с данными полученными из второго метода: " + numberSecond);
        } else {
            System.out.println("Методы вычисления дают разные значения.");
            System.out.println("Данные из первого метода: " + numberFirst);
            System.out.println("Данные из второго метода: " + numberSecond);
        }
    }

    private static int dataFirstMethod() {

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
            return counter;
    }
    private static int dataSecondMethod() {
        for (int i = 0; i <= 2_000_000 ; i++) {
            // Преобразуем число в строку для проверки наличия цифры 3
            String numString = String.valueOf(i);
            // Проверяем, делится ли число на 21 и содержит ли оно цифру 3
            if (i % 21 == 0 && numString.contains("3")) {
                counter++;
            }
        }
        return counter;
    }

}




