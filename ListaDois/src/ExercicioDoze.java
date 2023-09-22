import java.util.Scanner;

public class ExercicioDoze {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o sexo da pessoa(M/F): ");
        String sexo = entrada.next();
        System.out.print("Digite a idade da pessoa: ");
        int idade = entrada.nextInt();

        if ((sexo.equals("M") && idade >= 21) ||(sexo.equals("F") && idade >= 18)) {
            System.out.print("Maior de idade");
        }else {
            System.out.print("Menor de idade");
        }

        entrada.close();
    }

}