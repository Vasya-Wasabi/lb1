package org.fibonacci;

import java.util.Scanner;

/**
 * Головний клас для обчислення суми квадратів перших N числе Фібоначчі.
 *
 * @author Taras Trymbulskyi
 * @version 1.0
 */

public class Main {
    /**
     * Точка входу в програму. Зчитує значення N від користувача та обчислює:
     * - суму квадратів перших N числе Фібоначі за допомомогою циклу.
     * - перевірка за допомогою формули.
     *
     * @param args аргументи командного рядка.
     */
    public static void main(String[] args) {

        Fibonacci calculate = new Fibonacci();

        System.out.println("Сума квадратів N перших чисел Фібоначчі: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();


        System.out.println("Сума квадратів перших " + N + " чисел Фібоначчі: " + calculate.sumOfSquaresLoop(N));
        System.out.println("Перевірка за формулою F(" + N + ") * F(" + (N + 1) + ") = " + calculate.sumOfSquaresFormula(N));

    }
}
