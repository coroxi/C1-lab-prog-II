import java.util.Scanner;

public class ExercicioSete {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        double salario = entrada.nextDouble();

        System.out.print("Digite o valor do financiamento pretendido: ");
        int financia = entrada.nextInt();

        if(financia <= 5 * salario) {
            System.out.println("Financiamento Concedido");
        }else {
            System.out.println("Financiamento Negado");
        }
        System.out.print("Obrigado por nos consultar");
        entrada.close();

    }

}