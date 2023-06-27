package principal;

import java.util.Scanner;

import funciones.Funciones;

public class Ej6_4
{
	public static void main(String[] args)
	{
		/*  Dado un array de tamaño (N,M) de reales, decir si la matriz así representada es 
			triangular superior.*/
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
		
		if (Funciones.compTriangularSup(matriz))
			System.out.printf("La matriz es triangular superior.");
		else
			System.out.printf("La matriz no es triangular superior.");
	}

}
