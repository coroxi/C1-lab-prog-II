import java.time.LocalDate;
import java.util.Scanner;

public class ExercicioNove {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        LocalDate dataAtual = LocalDate.now();
        String nome1, nome2;
        int idade1, idade2 = 0, anoNasc1, anoNasc2;

        System.out.println("---- Primeira Pessoa ----");
        System.out.print("Digite o nome da primeira pessoa: ");
        nome1 = entrada.next();
        System.out.print("Digite a idade da primeira pessoa: ");
        idade1 = entrada.nextInt();

        System.out.println("\n---- Segunda Pessoa ----");
        System.out.print("Digite o nome da segunda pessoa: ");
        nome2 = entrada.next();
        System.out.print("Digite a idade da segunda pessoa: ");
        idade2 = entrada.nextInt();

         anoNasc1 = dataAtual.getYear() - idade1;
         anoNasc2 = dataAtual.getYear() - idade2;

         if(idade1 > idade2) {
             System.out.print("\nO nome da pessoa é "+nome2+" e nasceu no ano de "+anoNasc2);
         }else {
             System.out.print("\nO nome da pessoa é "+nome1+" e nasceu no ano de "+anoNasc1);
         }

         entrada.close();

    }

}