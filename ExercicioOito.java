import java.util.Scanner;

public class ExercicioOito {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número inteiro: ");
        int num = entrada.nextInt();

        int ant = num - 1;
        int suc = num + 1;

        System.out.println("Seu antecessor é: "+ant);
        System.out.println("Seu sucesspr é: "+suc);

        entrada.close();
    }
}