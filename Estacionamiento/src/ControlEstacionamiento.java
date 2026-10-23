import java.util.Scanner;

public class ControlEstacionamiento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAutos = 0;
        double recaudado = 0.0;
        int conDescuento = 0;

        while (true) {
            System.out.print("Ingrese la cantidad de horas estacionado: ");
            int horas = scanner.nextInt();

            if (horas == 0) {
                break;
            }

            if (horas < 0) {
                System.out.println("Las horas negativas no son válidas");
            }

            double costo = horas * 15.0;

            if (horas > 5) {
                System.out.println("Se aplicó descuento");
                costo -= 10.0;
                conDescuento++;
            }

            System.out.println("El auto pagará: $" + costo);

            totalAutos++;
            recaudado += costo;
        }

        System.out.println("------ RESUMEN ------");
        System.out.println("Total de autos atendidos: " + totalAutos);
        System.out.println("Total de dinero recaudado: $" + recaudado);
        System.out.println("Cantidad de autos que recibieron descuento: " + conDescuento);

        if (totalAutos > 0) {
            double promedio = recaudado / totalAutos;
            System.out.println("Promedio pagado por auto: $" + promedio);
        } else {
            System.out.println("No se atendió ningún auto");
        }

    }
}
