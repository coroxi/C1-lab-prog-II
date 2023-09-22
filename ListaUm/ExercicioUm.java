import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        int nota1 = scanner.nextInt();

        System.out.print("Digite a segunda nota: ");
        int nota2 = scanner.nextInt();

        System.out.print("Digite a terceira nota: ");
        int nota3 = scanner.nextInt();

        // Definir os pesos
        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 5;

        // Calcular a média ponderada
        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        // Exibir a média ponderada
        System.out.println("A média ponderada é: " + mediaPonderada);

        // Fechar o scanner
        scanner.close();
    }
}