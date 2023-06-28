package principal;

import java.util.Scanner;

import funciones.Funciones;

public class Ej6_10
{
	public static void main(String[] args)
	{
		 /* Realizar un programa para multiplicar matrices */
		
		Scanner sc = new Scanner(System.in);
		int fil = 0, col = 0, col2 = 0;
		do
		{
			System.out.println("Introduzca el número de filas de la matriz:");
			fil = sc.nextInt();
		} while (fil < 1);
		do
		{
			System.out.println("Introduzca el número de columnas de la matriz:");
			col = sc.nextInt();
		} while (col < 1);
		
		int [][] matriz1 = new int [fil][col];
		Funciones.rellenarMatriz(matriz1);

		do
		{
			System.out.println("Introduzca el número de columnas de la segunda matriz:"); //Las filas son iguales por lo que no se pide
			col2 = sc.nextInt();
		} while (col2 < 1);
		
		int [][] matriz2 = new int [col][col2];
		Funciones.rellenarMatriz(matriz2);
		
		int [][] matrizFinal = new int [fil][col2];
		Funciones.multiplicarMatrices(matriz1, matriz2, matrizFinal);

		System.out.println(" ~ Matriz A ~");
		Funciones.mostrarMatriz(matriz1);
		System.out.println("\n ~ Matriz B ~");
		Funciones.mostrarMatriz(matriz2);
		
		System.out.println("\n ~ Matriz resultante ~");
		Funciones.mostrarMatriz(matrizFinal);
	}

}
