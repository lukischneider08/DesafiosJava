package comDesafioJava2;

import java.util.Scanner;

public class comDesafioJava2Escuela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Nombre;

		String Apellido;

		int suma = 0;

		int notaAlta = -1;

		int notaBaja = 11;

		int promocionan = 0;

		int recursar = 0;

		int promedio = 0;

		String calificacionAlta = "";

		String calificacionBaja = "";

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingresar cantidad de alumnos");

		int cantidadAlumnos = teclado.nextInt();

		System.out.println(cantidadAlumnos);

		for (int i = 0; i < cantidadAlumnos; i++) {

			System.out.println("Ingresar NOMBRE del alumno");

			String nombre = teclado.next();

			System.out.println("Ingresar APELLIDO del alumno");

			String apellido = teclado.next();

			System.out.println("Ingresar cantidadExamen del alumno");

			int cantidadExamen = teclado.nextInt();

			for (int e = 0; e < cantidadExamen; e++) {

				System.out.println("Ingresar nota del alumno");

				int nota = teclado.nextInt();

				if (nota > notaAlta) {

					notaAlta = nota;

					calificacionAlta = nombre + " " + apellido;

				}

				if (nota < notaBaja) {

					notaBaja = nota;

					calificacionBaja = nombre + " " + apellido;

				}

				if (nota < 0 || nota > 10) {

					System.out.println("La nota debe estar entre 0 y 10. Intente nuevamente.");

					i--;

					continue;

				}

				suma += nota;
			}

			promedio = suma / cantidadExamen;

			if (promedio >= 7) {

				promocionan++;

			} else {

				recursar++;

			}
			;

		}

		System.out.println("1- Alumno/s con la calificación más alta: " + calificacionAlta + " con una calificación de "
				+ notaAlta);

		System.out.println("2- Alumno/s con la calificación más baja: " + calificacionBaja + " con una calificación de "
				+ notaBaja);

		System.out.println("3- Alumnos que promocionan: " + promocionan);

		System.out.println("4- Alumnos que deben recursar: " + recursar);

		System.out.println("Promedio de notas: " + promedio);

	}

}
