package homeworks.homework_1;

public class HomeworkCounter_1 extends Thread{
    public void run() {

        for (int i = 0; i < 1_000_000 ; i++) {
            // Преобразуем число в строку для проверки наличия цифры 3
            String numString = String.valueOf(i);
            // Проверяем, делится ли число на 21 и содержит ли оно цифру 3
            if (i % 21 == 0 && numString.contains("3")) {
                MainControl.increment();
            }
        }


    }
}
