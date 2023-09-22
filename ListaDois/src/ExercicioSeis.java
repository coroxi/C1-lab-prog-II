import java.util.Scanner;

public class ExercicioSeis {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codigo;
        double pesoTon = 0, pesoKg = 0, valor = 0;

        System.out.print("Digite o codigo da carga: ");
        codigo = entrada.nextInt();

        System.out.print("Defina o peso em toneladas: ");
        pesoTon = entrada.nextDouble();

        pesoKg = pesoTon * 1000;

        if (codigo >= 10 && codigo <= 20) {
            valor = pesoKg * 100;
        }else if(codigo >= 21 && codigo <= 30) {
            valor = pesoKg * 250;
        }else if (codigo >= 31 && codigo <= 40) {
            valor = pesoKg * 330;
        }else {
            System.out.println("Código inválido");
            entrada.close();
            return;
        }

        System.out.println("O peso da carga em kg é de: "+pesoKg);
        System.out.println("o preço da carga do caminhão é de: "+valor);

        entrada.close();
    }

}