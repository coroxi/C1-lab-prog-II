import java.util.Scanner;

public class ExercicioQuatro {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite quantas pessoas foram a pizzaria: ");
        int pessoas = entrada.nextInt();

        System.out.println("Digite quantos chopes foram comprados: ");
        int chopes = entrada.nextInt();

        System.out.println("Digire a quantidade de cobertura na pizza: ");
        int cobertura = entrada.nextInt();

          //Calculo da conta
        double valorChope = chopes * 1.80;
        double valorPizza = (cobertura * 3.50) + 25;
        double subtotal = valorPizza + valorChope;
        double taxaGarcom = subtotal * 0.10;
        double total = subtotal + taxaGarcom;
        double divisaoPessoa = total / pessoas;

         //Conta
        System.out.println("\n--- Conta da Pizzaria ---");
         System.out.println("Total de Chopes: " + chopes);
         System.out.println("Valor dos Chopes: R$" + valorChope);
         System.out.println("Pizza com " + cobertura + " coberturas: R$" + valorPizza);
         System.out.println("Subtotal: R$" + subtotal);
         System.out.println("Taxa do Garçom (10%): R$" + taxaGarcom);
        System.out.println("O valor da conta foi de: "+total +" divido em "+pessoas+" pessoas, e ficara "+divisaoPessoa+" para cada.");

        entrada.close();
        }

}
