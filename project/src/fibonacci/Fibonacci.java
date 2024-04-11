/*2. Faça um programa que imprima os trinta primeiros elementos da série
de Fibonacci. A série é a seguinte: 1, 1, 2, 3, 5, 8,13 etc. Para calculá-la,
o primeiro e segundo elementos valem 1; daí por diante, cada elemento
vale a soma dos dois elementos anteriores.*/

package fibonacci;

import java.util.Arrays;

public class Fibonacci {
    private static final int MAX = 30;

    private static long calculateFibo(long[] fibo, int position) {
        return fibo[position-1] + fibo[position-2];
    }

    private static void showItens(long[] fibo) {
        for (long e: fibo) {
            System.out.printf("%d ", e);
        }
    }

    public static void operateFibonnaci() {
        long[] fibonacci = new long[MAX];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        //inicio em 2 pois as duas primeiras posicoes foram preenchidas
        for (int cont = 2; cont < MAX; cont++) {
            fibonacci[cont] = calculateFibo(fibonacci, cont);
        }

        showItens(fibonacci);
    }
}
