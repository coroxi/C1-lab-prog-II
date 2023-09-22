import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quilometragem inicial do carro: ");
        double quilometragemInicial = scanner.nextDouble();

        System.out.print("Digite a quilometragem final do carro: ");
        double quilometragemFinal = scanner.nextDouble();

        System.out.print("Digite a quantidade total de gasolina consumida (em litros): ");
        double gasolinaConsumida = scanner.nextDouble();

        // Calcular a quilometragem total da viagem
        double quilometragemTotal = quilometragemFinal - quilometragemInicial;

        // Calcular a quilometragem média por litro de gasolina
        double quilometragemMediaPorLitro = quilometragemTotal / gasolinaConsumida;

        // Exibir o resultado
        System.out.println("A quilometragem média por litro de gasolina foi de: " + quilometragemMediaPorLitro + " km/l");

        // Fechar o scanner
        scanner.close();
    }
}
