package principal;

import java.util.Scanner;

import funciones.Funciones;

public class Ej6_2
{
	public static void main(String[] args)
	{
		/*  Dado un array de tamaño (N,M) de enteros, decir si todos sus elementos son cero. */
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
		
		System.out.println("Introduzca que valor comprobar en la matriz:");
		int num = sc.nextInt();

		Funciones.rellenarMatrizEspecifico(matriz, 0); //Si meten un 5, dará true, sino no
		// matriz[0][0] = 0;    //Si pongo esto, hace que falle
		Funciones.mostrarMatriz(matriz);
		
		if (Funciones.comprobarNumEnMatriz(matriz, num))
			System.out.printf("Todos los números son %d.", num);
		else
			System.out.printf("En la matriz hay números distintos a %d.", num);
	}

}
