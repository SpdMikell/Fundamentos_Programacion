import java.util.Scanner;

public class Paqueteria {
    public static void main(String[] args) {

        Scanner ingresa = new Scanner(System.in);

        int paquete = 1;
        int aceptados = 0;
        int rechazados = 0;
        int fragilesAceptados = 0;
        boolean dia = true;

        while (dia) {
            System.out.println("\n------------Paqueteria------------");
            System.out.println("Paquete #" + paquete);

            System.out.print("Ingresa el peso en kg (o ingresa 0 para terminar el dia): ");
            double peso = ingresa.nextDouble();

            if (peso == 0) {
                dia = false;
                break;
            }

            if (peso < 0) {
                System.out.println("Peso no valido.");
                continue;
            }

            System.out.println("Tipo de paquete:");
            System.out.println("1. Local");
            System.out.println("2. Nacional");
            System.out.println("3. Express");
            System.out.print("Selecciona una opcion: ");

            int tipo = ingresa.nextInt();
            double limite = 0;
            double base = 0;
            double costoPeso = 0;

            if (tipo == 1) {
                limite = 12;
                base = 30;
                costoPeso = 8;
            } else if (tipo == 2) {
                limite = 20;
                base = 50;
                costoPeso = 12;
            } else if (tipo == 3) {
                limite = 5;
                base = 80;
                costoPeso = 20;
            } else {
                System.out.println("Tipo no valido.");
                continue;
            }

            if (peso <= limite) {
                System.out.println("Paquete aceptado.");

                double costoEnvio = base + (costoPeso * peso);

                System.out.print("¿Es fragil? (1. Si / 2. No): ");
                int esFragil = ingresa.nextInt();

                if (esFragil == 1) {
                    costoEnvio += 25;
                    fragilesAceptados++;
                }

                System.out.println("Costo total de envio: $" + costoEnvio);
                aceptados++;
            } else {
                System.out.println("Paquete rechazado por peso.");
                rechazados++;
            }

            paquete++;
        }

        System.out.println("\n--- RESUMEN DEL DIA ---");
        System.out.println("Paquetes registrados: " + (aceptados + rechazados));
        System.out.println("Paquetes aceptados: " + aceptados);
        System.out.println("Paquetes rechazados: " + rechazados);
        System.out.println("Paquetes fragiles aceptados: " + fragilesAceptados);

        ingresa.close();
    }
}