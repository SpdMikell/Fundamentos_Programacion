import java.util.Scanner;

void main(String[] args) {
    Scanner ingresa = new Scanner(System.in);

    System.out.println("Ingresa la temperatura: °C");
    double temperatura = ingresa.nextDouble();

    if (temperatura < 10) {
        System.out.println("El clima está en frío extremo");
    } else if (temperatura <= 20) {
        System.out.println("El clima está fresco");
    } else if (temperatura <= 30) {
        System.out.println("El clima está agradable");
    } else {
        System.out.println("El clima está en calor extremo");
    }

}