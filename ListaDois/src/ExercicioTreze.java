import java.util.Scanner;

public class ExercicioTreze {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double desconto = 0;
        double precoCobre = 2.00;
        double precoAluminio = 4.00;

        System.out.print("Quantas hastes de cobre foram compradas? ");
        int hastesCobre = entrada.nextInt();

        System.out.print("Quantas hastes de aluminio foram vendidas? ");
        int hastesAlum = entrada.nextInt();

        double totalSemDesconto = (hastesCobre * precoCobre) + (hastesAlum * precoAluminio);

        int totalHastes = hastesCobre + hastesAlum;

        if(totalHastes >= 5 && totalHastes <= 15) {
            desconto = 0.10;
        }else if(totalHastes >= 16 && totalHastes <= 20) {
            desconto = 0.15;
        }else if(totalHastes > 20) {
            desconto = 0.20;
        }

        double totalComDesconto = totalSemDesconto - (totalSemDesconto * desconto);

        System.out.print("Total pago " +totalComDesconto);
        entrada.close();

    }

}