import java.time.YearMonth;
import java.util.Scanner;

public class ExercicioOnze {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o ano (AAAA): ");
        int ano = entrada.nextInt();

        System.out.print("Informe o mês (1 a 12): ");
        int mes = entrada.nextInt();

        YearMonth yearMonth = YearMonth.of(ano, mes);

        int diasNoMes = yearMonth.lengthOfMonth();

        System.out.println("O mês " + mes + "/" + ano + " possui " + diasNoMes + " dias.");

        entrada.close();

    }

}