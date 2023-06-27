package principal;

import java.util.Scanner;

import funciones.Funciones;

public class Ej6_3 {

	public static void main(String[] args)
	{
		/*  Dado un array de tamaño (N,M) de reales, decir cuántos elementos tiene igual a un 
			número A dado*/
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
		
		double [][] matriz = new double [fil][col];
		
		System.out.println("Introduzca que valor comparar en la matriz:");
		int num = sc.nextInt();
		
		Funciones.rellenarMatriz(matriz);
		Funciones.mostrarMatriz(matriz);
		
		int cont = Funciones.contarCoincidenciasMatriz(matriz, num);
		System.out.printf("En la matriz, el número %d aparece %d veces.",num, cont);
	}

}
