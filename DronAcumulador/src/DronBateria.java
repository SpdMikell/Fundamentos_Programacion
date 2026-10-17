import java.util.Scanner;

public class DronBateria {

    public static void main(String[] args) {

        int minuto = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el porcentaje de batería: ");
        int bateria = scanner.nextInt();

        if (bateria <= 0){
            System.out.println("La bateria ingresada es inválida");
            return;
        }

        System.out.println("Despegando...");

        while (bateria >= 7) {
            bateria -= 7;
            System.out.println("Minuto " + minuto + " -> " + bateria + "%");
            minuto++;
        }

        System.out.println("Se acabo la bateria");

    }

}