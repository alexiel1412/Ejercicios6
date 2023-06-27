package principal;

import java.util.Scanner;

import funciones.Funciones;

public class Ej6_1
{
	public static void main(String[] args)
	{
		/*  Dado un array de tamaño (N,M) de enteros, inicializarlo a un valor dado A.*/
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
		
		System.out.println("Introduzca con que valor rellenar la matriz:");
		int num = sc.nextInt();
		
		Funciones.rellenarMatrizEspecifico(matriz, num);
		Funciones.mostrarMatriz(matriz);
	}

}
