public class TorreDeHanoi {
    
    public static int resolva(int numDiscos) {
        return mova(numDiscos, 1, 3, 2);
    }

    private static int mova(int numDiscos, int torreDeOrigem, int torreDeDestino, int torreAuxiliar) {
        int movimentos = 0;
        if (numDiscos == 1) {
            System.out.println("Mover disco " + numDiscos + " da torre " + torreDeOrigem + " para a torre " + torreDeDestino);
            movimentos = 1;
        } else {
            movimentos += mova(numDiscos - 1, torreDeOrigem, torreAuxiliar, torreDeDestino);
            System.out.println("Mover disco " + numDiscos + " da torre " + torreDeOrigem + " para a torre " + torreDeDestino);
            movimentos += mova(numDiscos - 1, torreAuxiliar, torreDeDestino, torreDeOrigem);
            movimentos++;
        }
        return movimentos;
    }

    public static String formatarTempo(long millis) {
        long segundos = millis / 1000;
        long minutos = segundos / 60;
        long horas = minutos / 60;
        long segundosRestantes = segundos % 60;
        long minutosRestantes = minutos % 60;
        long horasRestantes = horas % 24;
        return String.format("%02d:%02d:%02d.%03d", horasRestantes, minutosRestantes, segundosRestantes, millis % 1000);
    }
}