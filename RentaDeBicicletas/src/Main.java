
import java.util.Scanner;

void main(String[] args) {
    Scanner ingresa = new Scanner(System.in);

    double tarifaUrbana = 40.0;
    double tarifaMontaña = 60.0;
    double tarifaElectrica = 90.0;
    double descuentoMembresía = 0.20;

    double tarifaHora = 0;
    String bicicleta = "";

    System.out.println("Sistema de renta de bicis, por favor selecciona una opción:");
    System.out.println("1. Bicicleta urbana ($40 por hora)");
    System.out.println("2. Bicicleta de montaña ($60 por hora)");
    System.out.println("3. Bicicleta eléctrica ($90 por hora)");

    System.out.println("Ingresa el tipo de bicicleta:");

    int tipoBici = ingresa.nextInt();

    switch (tipoBici) {
        case 1:
            bicicleta = "Bicicleta urbana";
            tarifaHora = tarifaUrbana;
            break;
        case 2:
            bicicleta = "Bicicleta de montaña";
            tarifaHora = tarifaMontaña;
            break;
        case 3:
            bicicleta = "Bicicleta eléctrica";
            tarifaHora = tarifaElectrica;
            break;
        default:
            System.out.println("Error, esa bicicleta no existe");
            return;
    }

    System.out.println("Ingresa la cantidad de horas de renta:");

    int horasRenta = ingresa.nextInt();

    if (horasRenta <= 0) {
        System.out.println("Error, cantidad de horas no válida");
        return;
    }

    System.out.println("¿El cliente cuenta con membresía? (true/false)");

    boolean membresía = ingresa.nextBoolean();

    double subtotal = tarifaHora * horasRenta;
    double descuento = 0;

    if (membresía) {
        descuento = subtotal * descuentoMembresía;
    }

    double total = subtotal - descuento;

    System.out.println("Tipo de bicicleta: " + bicicleta);
    System.out.println("Subtotal: $" + subtotal);
    System.out.println("Descuento: $" + descuento);
    System.out.println("Total a pagar: $" + total);
}
