import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2;
//Entrada
        //Escolhados números
        System.out.print("Digite o primeiro número inteiro: ");
        numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        numero2 = scanner.nextInt();
        //Menu operações
        System.out.println("Escolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int escolha = scanner.nextInt();
        
        int resultado = 0;
        //Processamento
        switch (escolha) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                    extracted();
                }
                break;
            default:
                System.out.println("Opção inválida.");
			extracted();
        }
        
        System.out.println("Resultado: " + resultado);
        
        scanner.close();
    }
	private static void extracted() {
	}
}

