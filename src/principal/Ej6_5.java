package principal;

import java.util.Scanner;

import funciones.Funciones;

public class Ej6_5
{
	public static void main(String[] args)
	{
		/*  Dado un array de tamaño (N,M), decir si la matriz así representada es triangular 
			inferior.*/
		Scanner sc = new Scanner(System.in);
		int tam = 0;
		do
		{
			System.out.println("Introduzca el tamaño de la matriz cuadrada");
			tam = sc.nextInt();
		} while (tam < 1);
		
		double [][] matriz = new double [tam][tam];

		Funciones.rellenarMatriz(matriz);

		Funciones.mostrarMatrizTriang(matriz);
		
		if (Funciones.compTriangularInf(matriz))
			System.out.printf("La matriz es triangular inferior.");
		else
			System.out.printf("La matriz no es triangular inferior.");

	}

}
