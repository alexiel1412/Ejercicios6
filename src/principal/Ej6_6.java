package principal;

import java.util.Scanner;

import funciones.Funciones;

public class Ej6_6 {

	public static void main(String[] args)
	{
		/* Dado un array de tamaño (N,M) de enteros, buscar el máximo valor almacenado. */
		Scanner sc = new Scanner(System.in);
		int fil = 0, col = 0;
		do
		{
			System.out.println("Introduzca el número de filas de la matriz:");
			fil = sc.nextInt();
		} while (fil < 1);
		do
		{
			System.out.println("Introduzca el número de columnas de la matriz:");
			col = sc.nextInt();
		} while (fil < 1);
		
		int [][] matriz = new int [fil][col];

		Funciones.rellenarMatrizRNAmplio(matriz);

		Funciones.mostrarMatriz(matriz);
		
		System.out.printf("En la matriz, el valor máximo es: %d", Funciones.buscarMaximoMatriz(matriz));
	}

}
