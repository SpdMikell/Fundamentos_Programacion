import java.util.Scanner;

void main(String[] args) {
    Scanner ingresa = new Scanner(System.in);

    System.out.println("Ingresa el promedio del alumno:");
    double promedio = ingresa.nextDouble();

    System.out.println("Ingresa el porcentaje de asistencia:");
    double asistencia = ingresa.nextDouble();

    if (promedio < 7.0) {
        System.out.println("Reprobado por calificación");
    } else if ( promedio >= 7.0 && asistencia < 80.0) {
        System.out.println("Reprobado por faltas");
    } else if ( promedio == 7.0 && asistencia >= 80.0 ){
        System.out.println("Aprobado regular");
    }

}