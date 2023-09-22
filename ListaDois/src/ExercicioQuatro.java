import java.util.Scanner;

public class ExercicioQuatro {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double sA = 0, nS = 0;

        System.out.print("Digite o código do funcionário: ");
        int codigo = entrada.nextInt();

        System.out.print("Digite o salário atual: ");
        sA = entrada.nextDouble();

        if(codigo == 101) {
             nS = (sA * 0.10) + sA;
            System.out.print(nS);
        }else if (codigo == 102) {
             nS = (sA * 0.20) + sA;
            System.out.print(nS);
        }else if (codigo == 103) {
             nS = (sA * 0.30) + sA;
            System.out.print(nS);
        }else if (codigo != 101 && codigo != 102 && codigo != 103) {
             nS = (sA * 0.05) + sA;
            System.out.print(nS);
        }else {
            System.out.println("digite um numero valido");
        }

        System.out.println("O salario antigo é de: "+sA);
        System.out.println("O salario novo é de: "+nS);

        double diferenca = nS - sA;

        System.out.println("A diferença é de: "+ diferenca);

        entrada.close();
    }

}