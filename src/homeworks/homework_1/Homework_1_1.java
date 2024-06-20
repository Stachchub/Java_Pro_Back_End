package homeworks.homework_1;

public class Homework_1_1 {

    private static int counter;

    public static void main(String[] args) {

        for (int i = 0; i <= 2_000_000 ; i++) {
            // Преобразуем число в строку для проверки наличия цифры 3
            String numString = String.valueOf(i);
            // Проверяем, делится ли число на 21 и содержит ли оно цифру 3
            if (i % 21 == 0 && numString.contains("3")) {
                counter++;
            }
        }
        System.out.println("Количество чисел соответствующих условию задачи: " + counter);
    }

    public int getCounterFirst() {
        return counter;
    }

}
