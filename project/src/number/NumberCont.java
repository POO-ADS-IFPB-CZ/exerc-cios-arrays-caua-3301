package number;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberCont {

    private static Integer calculateMedium(List<Integer> lista, int quant) {
        Integer value = lista.stream().reduce(0, Integer::sum);

        return value/quant;
    }

    public static void activateNumberCount() {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        int counter = 0;

        int number;
        do {
            System.out.println("Informe um numero: (0 cancela)\n");
            number = sc.nextInt();
            numbers.add(number);

            counter++;
        } while (number != 0);

        System.out.printf("Foram digitados %d numeros, e sua media vale %d", counter-1, calculateMedium(numbers, counter-1));
    }
}
