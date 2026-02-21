import java.util.Scanner;



public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=== Задача 1 ===");
        task1();

        System.out.println("\n=== Задача 2 ===");
        task2();

        System.out.println("\n=== Задача 3 ===");
        task3();

        System.out.println("\n=== Задача 4 ===");
        task4();

    }

    // Задача 1
    public static void task1() {

        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        int result;

        if (number > 500) {
            result = ones * 100 + tens * 10 + hundreds;
        } else {
            result = hundreds * 100 + ones * 10 + tens;
        }

        System.out.println("Результат: " + result);
    }


    // Задача 2
    public static void task2() {

        for (int i = 100; i <= 999; i++) {

            if (i % 10 != 0) {
                continue;
            }

            int sum = 0;

            for (int j = 1; j <= i; j++) {

                if (i % j == 0 && j % 2 != 0) {
                    sum += j;
                }

            }

            if (sum % 10 == 0) {
                System.out.println(i);
            }

        }
    }


    // Задача 3
    public static void task3() {

        int people = 0;
        int totalWeight = 0;
        String reason = "";

        while (true) {

            System.out.print("Введите вес человека: ");
            int weight = scanner.nextInt();

            if (people + 1 > 6) {
                reason = "достигнуто максимальное количество людей";
                break;
            }

            if (totalWeight + weight > 450) {
                reason = "превышен максимальный вес";
                break;
            }

            people++;
            totalWeight += weight;
        }

        System.out.println("Количество людей: " + people);
        System.out.println("Общий вес: " + totalWeight);
        System.out.println("Причина остановки: " + reason);

    }


    // Задача 4
    public static void task4() {

        int[] A = {1, 2, 3, 4};
        int[] B = {3, 4, 5};

        System.out.println("Элементы из A, которых нет в B:");

        for (int i = 0; i < A.length; i++) {

            boolean found = false;

            for (int j = 0; j < B.length; j++) {

                if (A[i] == B[j]) {
                    found = true;
                    break;
                }

            }

            if (!found) {
                System.out.println(A[i]);
            }

        }

    }

}