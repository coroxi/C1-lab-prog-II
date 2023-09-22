import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do piloto: ");
          String nomePiloto = scanner.nextLine();

        System.out.print("Digite a Kilometragem percorrida: ");
        double quilometragemPercorrida = scanner.nextDouble();

        System.out.print("Digite o tempo gasto do percurso:");
        double tempoGasto = scanner.nextDouble();

        // Calculo de km/h
        double kilometroPorHora = quilometragemPercorrida / tempoGasto;

        // Exibir o resultado
        System.out.println("A velocidade média de " + nomePiloto + " foi " + kilometroPorHora + " km/h");

        // Fechar o scanner
        scanner.close();
    }
}
