
import java.util.Scanner;

public class ExercicioDez {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = entrada.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = entrada.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double n3 = entrada.nextDouble();

        if(n1 > n2 && n1 > n3) {
            System.out.print("O maior número é o primeiro: "+n1);
        }else if(n2 > n1 && n2 > n3) {
            System.out.print("O maior número é o segundo: "+n2);
        }else {
            System.out.print("O maior número é o terceiro: "+n3);
        }
        entrada.close();
    }

}
