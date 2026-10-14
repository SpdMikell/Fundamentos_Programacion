import java.util.Scanner;

public class Elevador {
    public static void main(String[] args) {
        Scanner ingresa = new Scanner(System.in);

        int pisoActual;
        int pisoDestino;

        System.out.println("En que piso te encuentras?");
        pisoActual = ingresa.nextInt();

        if (pisoActual <= 0) {
            System.out.println("No se permite ese número");
            return;
        }

        System.out.println("A que piso quieres ir?");
        pisoDestino = ingresa.nextInt();

        if (pisoDestino <= 0) {
            System.out.println("No se permite ese número");
            return;
        }

        if (pisoActual == pisoDestino) {
            System.out.println("Ya te encuentras en este piso");
            return;
        }

        System.out.println("Elevador funcionando...");
        System.out.println(pisoActual);

        int piso = pisoActual;

        while (piso < pisoDestino) {
            piso++;

            if (piso != 0) {
                System.out.println(piso);
            }
        }

        while (piso > pisoDestino) {
            piso--;

            if (piso != 0) {
                System.out.println(piso);
            }

            System.out.println(pisoDestino);
        }
    }
}