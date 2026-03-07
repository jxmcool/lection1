
package lection2;

import java.util.Scanner;

public class Main {
    //Задача 1
    public static boolean isPointInsideCircle(int x0, int y0, int r, int x, int y) {
        int dx = x - x0;
        int dy = y - y0;
        return dx * dx + dy * dy <= r * r;
    }

    //Задача 2
    public static void printDigits(int n) {
        n = Math.abs(n);
        if (n >= 10) printDigits(n / 10);
        System.out.print(n % 10 + " ");
    }

    public static void main(String[] args) {
        //Задача 1
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите x центра: ");
        int x0 = scanner.nextInt();

        System.out.print("Введите y центра: ");
        int y0 = scanner.nextInt();

        System.out.print("Введите радиус: ");
        int r = scanner.nextInt();

        System.out.print("Введите x точки: ");
        int x = scanner.nextInt();

        System.out.print("Введите y точки: ");
        int y = scanner.nextInt();

        boolean result = isPointInsideCircle(x0, y0, r, x, y);
        System.out.println("Точка внутри круга: " + result);

        //Задача 2
        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        System.out.print("Цифры числа: ");
        printDigits(n);
        System.out.println();
    }
}