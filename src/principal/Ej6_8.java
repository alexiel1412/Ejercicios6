package principal;

import java.util.Scanner;

import funciones.Funciones;

public class Ej6_8
{
	public static void main(String[] args)
	{
		/*  Dado un array de tamaño (3,3) de reales, obtener el determinante de la matriz así 
			representada. */
		

		Scanner sc = new Scanner(System.in);
		/*
		int tam = 0;
		do
		{
			System.out.println("Introduzca el tamaño de la matriz cuadrada");
			tam = sc.nextInt();
		} while (tam < 1);
		*/
		int tam = 3;
		
		double [][] matriz = new double [tam][tam];

		Funciones.rellenarMatriz(matriz);

		Funciones.mostrarMatriz(matriz);
		
		System.out.printf("El determinante de la matriz es: %.2f", Funciones.buscarDeterminante(matriz));
	}

}
