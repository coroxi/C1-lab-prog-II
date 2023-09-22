public class ExercicioQuatro {
    public static void main(String[] args) {
        int somaRestos = 0;

        for (int i = 1; i <= 200; i++) {
            int numero = i; // Substitua pelo número inteiro desejado
            int resto = numero % 3;
            somaRestos += resto;
        }

        System.out.println("A soma dos restos da divisão por 3 dos 200 números inteiros é: " + somaRestos);
    }
}
