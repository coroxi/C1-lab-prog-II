import java.util.Scanner;

public class ExercicioQuinze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hora inicial do jogo: ");
        int horaInicio = scanner.nextInt();

        System.out.print("Minuto inicial do jogo: ");
        int minutoInicio = scanner.nextInt();

        System.out.print("Hora final do jogo: ");
        int horaFim = scanner.nextInt();

        System.out.print("Minuto final do jogo: ");
        int minutoFim = scanner.nextInt();

        // Verificar se as horas e minutos fornecidos são válidos
        if (horaInicio < 0 || horaInicio > 24 || horaFim < 0 || horaFim > 24 ||
            minutoInicio < 0 || minutoInicio > 59 || minutoFim < 0 || minutoFim > 59) {
            System.out.println("Entrada de dados não é válida.");
        } else {
            // Calcula a duração do jogo
            int duracaoHoras, duracaoMinutos;

            if (horaFim < horaInicio || (horaFim == horaInicio && minutoFim < minutoInicio)) {
                // O jogo termina no dia seguinte
                horaFim += 24;
            }

            if (minutoFim < minutoInicio) {
                horaFim--;
                minutoFim += 60;
            }

            duracaoHoras = horaFim - horaInicio;
            duracaoMinutos = minutoFim - minutoInicio;

            System.out.println("Duração do jogo: " + duracaoHoras + " horas e " + duracaoMinutos + " minutos.");
        }

        scanner.close();
    }
}
