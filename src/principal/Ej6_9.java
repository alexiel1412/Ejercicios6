package principal;

import java.util.Scanner;

import funciones.Funciones;

public class Ej6_9
{
	public static void main(String[] args)
	{
		/*  Dada un array de tamaño (M,N) de reales, almacenarlo sobre otro array de tamaño 
			(N,M) de forma transpuesta, es decir, el elemento (1,2) del primer array se almacenará 
			en el elemento (2,1) del segundo. */
		
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
		
		double [][] matriz1 = new double [fil][col];
		double [][] matriz2 = new double [col][fil];

		Funciones.rellenarMatrizRNAmplio(matriz1);
		
		Funciones.rellenarMatrizTranspuesta(matriz1, matriz2);
		
		System.out.println(" ~ Matriz ~");
		Funciones.mostrarMatriz(matriz1);
		
		System.out.println("\n ~ Matriz traspuesta ~");
		Funciones.mostrarMatriz(matriz2);
	}

}
