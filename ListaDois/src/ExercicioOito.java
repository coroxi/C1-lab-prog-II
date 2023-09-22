import java.util.Scanner;

public class ExercicioOito {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dis1, dis2;
        double tempo1, tempo2;

        System.out.println("---- Carro 1 ----");
        System.out.print("Digite a distância percorrida: ");
        dis1 = entrada.nextInt();
        System.out.print("Digite o tempo demorado: ");
        tempo1 = entrada.nextDouble();

        System.out.println("\n---- Carro 2 ----");
        System.out.print("Digite a distância percorrida: ");
        dis2 = entrada.nextInt();
        System.out.print("Digite o tempo demorado: ");
        tempo2 = entrada.nextDouble();

        double veloMediaCar1 = dis1 / tempo1;
        double veloMediaCar2 = dis2 / tempo2;

        if (veloMediaCar1 > veloMediaCar2) {
            System.out.print("O primeiro carro teve a maior velocidade");
        }else {
            System.out.print("O segundo carro teve a maior velocidade");
        }

        entrada.close();
    }

}