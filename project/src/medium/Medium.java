/*3. Crie um programa que armazene um vetor com as notas de dez alunos,
calcule e imprima a média dessas notas e depois informe a quantidade
de notas acima e abaixo da média calculada.*/

package medium;

public class Medium {

    private static double calculateMedium(double[] notes) {
        double value = 0;
        for (double note: notes) {
            value += note;
        }
        return value/10;
    }

    private static void showMediuns(double[] notes, double medium) {
        System.out.println("A media vale " + medium + "\n");
        for (double note: notes) {
            System.out.printf("Nota %s da media = %.2f %n", note >= medium ? "acima" : "abaixo", note);
        }
    }

    public static void operateMedium() {
        double[] notes = {7.2, 8.0, 5.7, 5.5, 10.0, 9.8, 4.7, 7.7, 4.6, 9};
        showMediuns(notes, calculateMedium(notes));
    }
}
