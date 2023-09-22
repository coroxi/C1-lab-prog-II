import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int soma = 0;
        int contador = 0;

        System.out.println("Digite números (para calcular a média, digite -1):");

        while (true) {
            numero = scanner.nextInt();

            if (numero == -1) {
                break; // Sai do loop quando -1 é inserido
            }

            soma += numero;
            contador++;
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média dos números inseridos (excluindo -1) é: " + media);
        } else {
            System.out.println("Nenhum número foi inserido (excluindo -1).");
        }

        scanner.close();
    }
}
