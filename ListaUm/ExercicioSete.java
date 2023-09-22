import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercicioSete {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.print("Digite o valor de x1: ");
    	double x1 = scanner.nextDouble();
    	System.out.print("Digite o valor de y1: ");
    	double y1 = scanner.nextDouble();
    	System.out.print("Digite o valor de x2: ");
    	double x2 = scanner.nextDouble();
    	System.out.print("Digite o valor de y2: ");
    	double y2 = scanner.nextDouble();
    	
    	double calculo = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
System.out.println("Distancia utilizando a formula proposta resulta em: " + df.format(calculo));
scanner.close();

	}
}
