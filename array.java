package array;

import java.util.Scanner;


public class array {

	// Se definen los valores del array, tamaño del mismo y el valor máximo de los número aleatorios que tendrá dentro de cada celda.
	// Es necesario hacerlo así (definiendo como int) porque será necesarios para posteriormente para hallar el mínimo del array
	
	static int numRegistroArray = 20;
	static int numMaxAleatorioArray = 30; 	

	// Este método genera una sola vez un array y se hace fura del método main para que pueda ser utilizado por todos los métodos
	
	static int[] arrayAleatorio = generaArray(numRegistroArray,numMaxAleatorioArray); 

	// Igual con el método scanner 
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		byte opcion;

		do {

			imprime("\nMenu\n");
			imprime("1 - Imprime el mayor valor del array");
			imprime("2 - Imprime el menor valor del array");
			imprime("3 - Calcular la media de todos los valores del array");
			imprime("4 - Imprime todos los valores del array");
			imprime("5 - Genera una nueva tirada de array personalizado");

			imprime("\nElige una opción");

			opcion = teclado.nextByte();

			switch (opcion) {
			case 1:

				imprime("El valor más alto que se encuentra en el array es " + buscaMayor());

				break;
			case 2:

				imprime("El valor más bajo dentro del array es " + buscaMenor());

				break;

			case 3:

				imprime("La media del array es " + media());

				break;

			case 4:

				imprimeArray();

				break;

			case 5:

				defineArray();

				break;

			default:
				break;
			}

		} while (opcion != 0);

		teclado.close();

	}

	// Métodos útiles

	public static void imprime(String mensaje) {

		System.out.println(mensaje);

	}

	public static int[] generaArray(int numReg, int numAleatorio) {

		int[] numeros = new int[numReg];

		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = (int) (Math.random() * numAleatorio) + 1;

		}

		return numeros;

	}

	public static int buscaMayor() {

		int mayor = 0;

		for (int i = 0; i < arrayAleatorio.length; i++) {

			if (arrayAleatorio[i] > mayor) {

				mayor = arrayAleatorio[i];

			}

		}

		return mayor;
	}

	public static int buscaMenor() {

		int menor = numMaxAleatorioArray; // el máximo valor que generará de forma aleatoria

		for (int i = 0; i < arrayAleatorio.length; i++) {

			if (arrayAleatorio[i] < menor) {

				menor = arrayAleatorio[i];

			}

		}

		return menor;
	}

	public static int media() {

		int media = 0;

		for (int i = 0; i < arrayAleatorio.length; i++) {

			media = media + arrayAleatorio[i];

		}

		media = media / arrayAleatorio.length;

		return media;

	}

	public static void imprimeArray() {

		for (int i = 0; i < arrayAleatorio.length; i++) {

			System.out.print(" " + arrayAleatorio[i]);
		}

	}

	public static void defineArray() {

		imprime("Introduce el número de registros que quieres que tenga el array:");

		numRegistroArray = teclado.nextInt();

		imprime("Introcue el máximo valor de números aleatorios que debe alojar el array en cada celda:");

		numMaxAleatorioArray = teclado.nextInt();	

		arrayAleatorio = generaArray(numRegistroArray,numMaxAleatorioArray); 

		imprime("El nuevo array ha sido generado");

	}
}
