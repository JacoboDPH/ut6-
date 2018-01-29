package array;

import java.util.Scanner;

public class array {

	//Aquí invocamos el método creado para generar un array, se puede añadir el número de registros y el máximo de de valor que 
	// tendrá como aleatorio.
	
    static int numRegistroArray = 20;
	static int numMaxAleatorioArray = 30; 	
	
	static int[] arrayAleatorio = generaArray(numRegistroArray,numMaxAleatorioArray); 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		byte opcion;

		do {

			imprime("\nMenu\n");
			imprime("1 - Imprime el mayor valor del array");
			imprime("2 - Imprime el menor valor del array");
			imprime("3 - Calcular la media de todos los valores del array");
			imprime("4 - Imprime todos los valores del array");

			imprime("\nElige una opción");

			opcion = teclado.nextByte();

			switch (opcion) {
			case 1:

				imprime("" + buscaMayor());

				break;
			case 2:

				imprime("" + buscaMenor());

				break;

			case 3:

				imprime("" + media());

				break;

			case 4:

				imprimeArray();

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
}
