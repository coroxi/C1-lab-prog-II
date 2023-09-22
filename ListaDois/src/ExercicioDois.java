import java.util.Scanner;

public class ExercicioDois {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int num = entrada.nextInt();

        if (num % 2 == 0) {
            System.out.print("O número é par");
        }else {
            System.out.print("O número é impar");
        }
        entrada.close();
    }
}