import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    
    	System.out.print("Digite o valor em Celsius: ");
    	double celsius = scanner.nextDouble();
    
    	//Calculo
    	double calculo = (celsius * 1.8) + 32;
    	
    	System.out.print("A tempera em Fahrenheit é:" + calculo);
    	
    	scanner.close();
    	}
    }