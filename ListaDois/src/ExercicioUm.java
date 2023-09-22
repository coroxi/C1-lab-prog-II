import java.util.Scanner;

public class ExercicioUm {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        double div = num1 / num2;

        if(num1 == 0) {
            System.out.print("Resultado invalido");
        }else {
            System.out.print((double)div);
        }

        entrada.close();

    }

}