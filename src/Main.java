import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o número de discos que deseja colocar: ");
        int numDiscos = entrada.nextInt();
        entrada.close();

        System.out.println("Resolvendo a Torre de Hanói com " + numDiscos + " discos:");
        long tempoInicio = System.currentTimeMillis();
        int movimentos = TorreDeHanoi.resolva(numDiscos);
        long tempoFinal = System.currentTimeMillis();
        System.out.println("Resolvido em " + movimentos + " movimentos e " + TorreDeHanoi.formatarTempo(tempoFinal - tempoInicio));
    }
}