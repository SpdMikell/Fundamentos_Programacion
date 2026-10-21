import java.util.Scanner;

public class TorneoVideoJuegos {
    public static void main(String[] args){
        Scanner ingresa = new Scanner(System.in);

        double puntosTotales = 0;
        int partidas100 = 0;
        int partidasMenos1000 = 0;

        for (int i = 1; i <= 7; i++){
            System.out.println("Ingresa lo puntos obtenidos en la partida " +i+ " : ");
            double puntos = ingresa.nextDouble();

            puntosTotales += puntos;

            if (puntos < 1000){
                partidas100++;
            } else {
                partidasMenos1000++;
            }
        }

        double promedio = puntosTotales/7;
        System.out.println("Resultados del torneo: ");
        System.out.println("Puntos acumulados: " + puntosTotales);
        System.out.println("Promedio de puntuación: " + String.format("%.2f", promedio));
        System.out.println("Partidas con más de 1000 puntos: " + partidas100);
        System.out.println("Partidas con 1000 puntos o menos: " + partidasMenos1000);

    }
}
