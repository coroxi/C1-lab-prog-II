import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as alturas das moças (digite 0 para encerrar):");

        double maiorAltura1 = 0;
        double maiorAltura2 = 0;
        double altura;

        do {
            altura = scanner.nextDouble();

            if (altura > maiorAltura1) {
                maiorAltura2 = maiorAltura1;
                maiorAltura1 = altura;
            } else if (altura > maiorAltura2 && altura != maiorAltura1) {
                maiorAltura2 = altura;
            }
        } while (altura != 0);

        System.out.println("As duas maiores alturas são: " + maiorAltura1 + " e " + maiorAltura2);

        scanner.close();
    }
}
