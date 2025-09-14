package org.fibonacci;

/**
 * Клас для обчислення суми квадратів перших N числе Фібоначчі.
 * Реалізує методи для знаходження суми циклом та математичною формулою.
 *  @author Taras Trymbulskyi
 *  @version 1.0
 */

public class Fibonacci {

    /**
     * Обчислює циклічно суму квадратів N перших чисел.
     * Також виводить у консоль усі числа Фібоначчі з їх номером.
     * @param N - кількість чисел задана користувачем.
     * @return sum - сума квадратів перших N чисел.
     */
    public long sumOfSquaresLoop(int N) {
        long next, a = 1, b = 1;
        long sum = 0;

        for(int i = 1; i <= N; ++i) {
            sum += a * a;
            System.out.println("F" + i + " = " + a);
            next = a + b;
            a = b;
            b = next;
        }
        return sum;
    }

    /**
     * Обчислю суму квадратів перших N чисел за допомогою формули:
     * - F(1)^2 + F(2)^2 + ... + F(N)^2 = F(N) * F(N + 1)
     * @param N - кількість чисел задана користувачем.
     * @return значення виразу F(N) * F(N + 1)
     */
    public long sumOfSquaresFormula(int N) {
        long next, a = 1, b = 1;

        if(N <= 0) {return 0;}

        for(int i = 2; i <= N; ++i) {
            next = a + b;
            a = b;
            b = next;
        }
        return a * b;
    }
}
