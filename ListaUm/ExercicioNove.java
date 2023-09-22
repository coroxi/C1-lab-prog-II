import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercicioNove {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        int codigoPeca1, quantidadePeca1, codigoPeca2, quantidadePeca2;
        double valorPeca1, valorPeca2;

     //A)
        System.out.print("Digite o valor do IPI: ");
        double ipi = entrada.nextDouble();

    //B)
        System.out.print("Digite o código da peça 1: ");
        codigoPeca1 = entrada.nextInt();

        System.out.print("Digite o valor unitário da peça 1: ");
        valorPeca1 = entrada.nextDouble();

        System.out.print("Digite a quantidade de peça 1: ");
        quantidadePeca1 = entrada.nextInt();

    //C)
        System.out.print("Digite o código da peça 2: ");
        codigoPeca2 = entrada.nextInt();

        System.out.print("Digite o valor unitário da peça 2: ");
        valorPeca2 = entrada.nextDouble();

        System.out.print("Digite a quantidade de peça 2: ");
        quantidadePeca2 = entrada.nextInt();


    //Informações das Peças
        System.out.println("\n------ Informações das Peças -------");
        System.out.println("O código da peça 1 é: "+codigoPeca1);
        System.out.println("O valor da peça 1 é: "+valorPeca1);
        System.out.println("A quantidade de peças 1 é: "+quantidadePeca1);
        System.out.println("O código da peça 2 é: "+codigoPeca2);
        System.out.println("O valor da peça 2 é: "+valorPeca2);
        System.out.println("A quantidade de peças 2 é: "+quantidadePeca2);

        double total = ((valorPeca1 * quantidadePeca1) + (valorPeca2 * quantidadePeca2))*(ipi/100 +1);

        System.out.println("\nO total é de:"+df.format(total));
        entrada.close();
    }

}