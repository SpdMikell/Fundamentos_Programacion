public class CalificacionesCurva {

    public static void main(String[] args) {
        int[] calificaciones = {55, 68, 72, 90, 61, 98, 45, 77, 83, 59};

        System.out.println("--- Calificaciones Originales ---");
        mostrarArreglo(calificaciones);

        aplicarCurva(calificaciones);

        System.out.println("\n--- Calificaciones con Curva (+5 pts) ---");
        mostrarArreglo(calificaciones);

        int totalAprobados = contarAprobados(calificaciones);
        System.out.println("\nAprobados después de la curva: " + totalAprobados);
    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + arr[i]);
        }
    }

    public static void aplicarCurva(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
            if (arr[i] > 100) {
                arr[i] = 100;
            }
        }
    }

    public static int contarAprobados(int[] arr) {
        int aprobados = 0;
        for (int calificacion : arr) {
            if (calificacion >= 70) {
                aprobados++;
            }
        }
        return aprobados;
    }
}