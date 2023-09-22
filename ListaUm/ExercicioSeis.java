import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercicioSeis {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.print("Digite um número: ");
    	double num = scanner.nextDouble();
    	
    	double triplo = num * 3;
    	double metade = num / 2;
    	double cubic = Math. cbrt(num);
    	double potFra = Math.cbrt(Math.pow(num, 0.6667));
    	

        // Exibe o resultado
    	System.out.println("O triplo de " + num + " é " + triplo);
    	System.out.println("Metade de " + num + " é " + metade);
    	System.out.println("O valor cubico de " + num + " é " + df.format(cubic));
        System.out.println(num + " elevado a 2/3 é igual a " + df.format(potFra));
        scanner.close();
    }
}
		
		

