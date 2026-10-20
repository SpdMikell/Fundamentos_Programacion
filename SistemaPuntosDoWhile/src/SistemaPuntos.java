import java.util.Scanner;

public class SistemaPuntos {
    public static void main(String[] args) {
        Scanner ingresa = new Scanner(System.in);


        int puntos = 100;
        int opcion;


        do {
            System.out.println("----------Menú----------");
            System.out.println("1.Ganar 20 puntos");
            System.out.println("2.Gastar 15 puntos");
            System.out.println("3.Consultar puntos");
            System.out.println("4.Salir");
            opcion = ingresa.nextInt();


            switch (opcion) {
                case 1:
                    puntos += 20;
                    System.out.println("Has ganado 20 puntos");
                    break;
                case 2:
                    puntos -= 15;
                    System.out.println("Has gastado 15 puntos");
                    break;
                case 3:
                    System.out.println("Tienes " + puntos + " puntos");
                    break;
                case 4:
                    System.out.println("Saliendo del programa..");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo");
            }
        }

        while (opcion != 4);
        System.out.println("Juego terminado, puntos restantes: " + puntos);

    }
}
