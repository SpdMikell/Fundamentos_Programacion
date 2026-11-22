import java.util.Scanner;

public class RegistroCalificaciones {

    public static void main(String[] args) {
        int[] calificaciones = capturarCalificaciones();
        mostrarCalificaciones(calificaciones);

        int aprobados = contarAprobados(calificaciones);
        int reprobados = contarReprobados(calificaciones);

        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos reprobados: " + reprobados);
    }

    public static int[] capturarCalificaciones() {
        Scanner leer = new Scanner(System.in);
        int[] calificaciones = new int[10];

        for (int i = 0; i < 10; i++) {
            int calificacion;
            boolean datoValido;

            do {
                datoValido = true;
                System.out.print("Captura la calificación del alumno " + (i + 1) + ": ");

                if (!leer.hasNextInt()) {
                    System.out.println("No se permiten decimales ni letras. Ingresa un número entero de 0 a 100.");
                    leer.next();
                    datoValido = false;
                    calificacion = -1;
                } else {
                    calificacion = leer.nextInt();
                    if (calificacion < 0 || calificacion > 100) {
                        System.out.println("Calificación fuera de rango (0 a 100). Intenta de nuevo.");
                        datoValido = false;
                    }
                }
            } while (!datoValido);

            calificaciones[i] = calificacion;
        }

        return calificaciones;
    }

    public static void mostrarCalificaciones(int[] calificaciones) {
        System.out.println("\nCalificaciones capturadas:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println();
    }

    public static int contarAprobados(int[] calificaciones) {
        int aprobados = 0;
        for (int i = 0; i < 10; i++) {
            if (calificaciones[i] >= 70) {
                aprobados++;
            }
        }
        return aprobados;
    }

    public static int contarReprobados(int[] calificaciones) {
        int reprobados = 0;
        for (int i = 0; i < 10; i++) {
            if (calificaciones[i] < 70) {
                reprobados++;
            }
        }
        return reprobados;
    }
}