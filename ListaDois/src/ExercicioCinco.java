import java.util.Scanner;

public class ExercicioCinco {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int sA = 0; 
        
        System.out.print("Informe o saldo: ");
        sA = entrada.nextInt();
        
        if (sA <= 200) {
        	System.out.print("O saldo é de: " + sA + " e infelizmente não possuimos crédito para este valor! ");
        }else if (sA >= 200 && sA <= 400) {
        	double sAtt = (sA * 0.10) + sA;
        	System.out.print("Você possui um valor de crédito de:" + sAtt);
        }else if (sA >= 400) {
        	double sAtt = (sA * 0.20) + sA;
        	System.out.print("Você possui um valor de crédito de:" + sAtt);
        }
     entrada.close();
	}
}
