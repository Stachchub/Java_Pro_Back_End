package homeworks;
//Дан диапазон чисел: от 1 до 2_000_000 включительно.
//Задача: найти, сколько чисел из этого диапазона делятся нацело на 21 и при этом содержат цифру 3.
//Решить данную задачу в один поток.
//Решить данную задачу в два потока, разделив между потоками заданный диапазон чисел.
//Сравнить результаты двух решений - они должны совпадать.

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i <= 2_000_000 ; i++) {
            // Преобразуем число в строку для проверки наличия цифры 3
            String numString = String.valueOf(i);
            // Проверяем, делится ли число на 21 и содержит ли оно цифру 3
            if (i % 21 == 0 && numString.contains("3")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}

// Решение задачи в один поток.
