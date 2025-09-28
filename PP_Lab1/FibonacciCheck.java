package Univer;

import java.util.Scanner;

public class FibonacciCheck {

    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        long a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть N: ");
        int N = sc.nextInt();

        FNumber[] numbers = new FNumber[N];

        for (int i = 0; i < N; i++) {
            long fib = fibonacci(i);
            numbers[i] = new FNumber(i, fib);
        }

        System.out.println("\nРезультати перевірки:");
        for (FNumber num : numbers) {
            System.out.print(num + " -> ");
            if (num.isCubeMinusOne()) {
                System.out.println("можна задати як w^3 - 1");
            } else {
                System.out.println("не підходить");
            }
        }
    }
}



