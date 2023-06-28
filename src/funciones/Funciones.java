package funciones;

import java.util.Random;
import java.util.Scanner;

public class Funciones
{
	public static void rellenarMatrizRNReducido(int[][] matriz)
	{
		Scanner teclado = new Scanner(System.in);
		Random random = new Random ();
		for (int fila = 0; fila < matriz.length; fila++)
		{
			for (int col = 0; col < matriz[0].length; col++)
			{
				matriz[fila][col] = random.nextInt(-10, 10);
			}
		}
	}
	
	public static void rellenarMatrizRNReducido(double[][] matriz)
	{
		Scanner teclado = new Scanner(System.in);
		Random random = new Random ();
		for (int fila = 0; fila < matriz.length; fila++)
		{
			for (int col = 0; col < matriz[0].length; col++)
			{
				matriz[fila][col] = random.nextDouble(-10, 10);
			}
		}
	}
	
	public static void rellenarMatrizRN(int matriz[][])
	{
		Scanner teclado = new Scanner(System.in);
		Random random = new Random ();
		for (int fila = 0; fila < matriz.length; fila++)
		{
			for (int col = 0; col < matriz[0].length; col++)
			{
				matriz[fila][col] = random.nextInt(1, 101);
			}
		}
	}
	
	public static void rellenarMatrizRN(double matriz[][])
	{
		Scanner teclado = new Scanner(System.in);
		Random random = new Random ();
		for (int fila = 0; fila < matriz.length; fila++)
		{
			for (int col = 0; col < matriz[0].length; col++)
			{
				matriz[fila][col] = random.nextDouble(1, 101);
			}
		}
	}
	
	public static void rellenarMatrizRNAmplio(int matriz[][])
	{
		Scanner teclado = new Scanner(System.in);
		Random random = new Random ();
		for (int fila = 0; fila < matriz.length; fila++)
		{
			for (int col = 0; col < matriz[0].length; col++)
			{
				matriz[fila][col] = random.nextInt(-100, 101);
			}
		}
	}
	
	public static void rellenarMatrizRNAmplio(double matriz[][])
	{
		Scanner teclado = new Scanner(System.in);
		Random random = new Random ();
		for (int fila = 0; fila < matriz.length; fila++)
		{
			for (int col = 0; col < matriz[0].length; col++)
			{
				matriz[fila][col] = random.nextDouble(-100, 101);
			}
		}
	}
	
	public static void rellenarMatriz(int matriz[][])
	{
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		for (int fila = 0; fila < matriz.length; fila++)
		{
			for (int col = 0; col < matriz[0].length; col++)
			{
				System.out.printf("Introduce el elemmento (%d,%d):", fila, col);
				matriz[fila][col] = teclado.nextInt();
			}
		}
	}
	
	public static void rellenarMatriz(double matriz[][])
	{
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		for (int fila = 0; fila < matriz.length; fila++)
		{
			for (int col = 0; col < matriz[0].length; col++)
			{
				System.out.printf("Introduce el elemmento (%d,%d):", fila, col);
				matriz[fila][col] = teclado.nextDouble();
			}
		}
	}
	
	public static void rellenarMatriz(String matriz[][])
	{
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		for (int fila = 0; fila < matriz.length; fila++)
		{
			for (int col = 0; col < matriz[0].length; col++)
			{
				System.out.printf("Introduce el elemmento (%d,%d):", fila, col);
				matriz[fila][col] = teclado.nextLine();
			}
		}
	}
	
	public static void rellenarMatrizEspecifico(int matriz[][], int num)
	{
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		for (int fila = 0; fila < matriz.length; fila++)
		{
			for (int col = 0; col < matriz[0].length; col++)
			{
				matriz[fila][col] = num;
			}
		}
	}

	public static void mostrarMatriz(int matriz[][])
	{
		// TODO Auto-generated method stub
		for (int fila = 0; fila < matriz.length; fila++)
		{
			for (int col = 0; col < matriz[0].length; col++)
			{
				System.out.printf("(%d,%d) %d\t ", fila, col, matriz[fila][col]);
			}
			System.out.println();
		}
	}

	public static void mostrarMatriz(double matriz[][])
	{
		// TODO Auto-generated method stub
		for (int fila = 0; fila < matriz.length; fila++)
		{
			for (int col = 0; col < matriz[0].length; col++)
			{
				System.out.printf("(%d,%d) %.2f\t", fila, col, matriz[fila][col]);
			}
			System.out.println();
		}
	}

	public static void mostrarMatriz(String matriz[][])
	{
		// TODO Auto-generated method stub
		for (int fila = 0; fila < matriz.length; fila++)
		{
			for (int col = 0; col < matriz[0].length; col++)
			{
				System.out.printf("(%d,%d) %s\t", fila, col, matriz[fila][col]);
			}
			System.out.println();
		}
	}

	public static void mostrarMatrizTriang(double matriz[][])
	{
		// TODO Auto-generated method stub
		for (int fila = 0; fila < matriz.length; fila++)
		{
			for (int col = 0; col < matriz[0].length; col++)
			{
				System.out.printf("(%d,%d) %.0f \t", fila, col, matriz[fila][col]);
			}
			System.out.println();
		}
	}
	
	public static void compararrMatricesTranspuesta(int matriz1[][], int matriz2[][])
	{
		// TODO Auto-generated method stub
		System.out.printf("             Matriz A\t    Matriz B:\n");
		for (int fila = 0; fila < matriz1.length; fila++)
		{
			for (int col = 0; col < matriz1[0].length; col++)
			{
				System.out.printf("(%d,%d)\t\t%d \t\t%d\n", fila, col, matriz1[fila][col], matriz2[fila][col]);
				// System.out.printf("(%d,%d)\t\t%d \t\t(%d,%d)\t%d\n",
				// 		fila, col, matriz1[fila][col], matriz2[matriz2.length - 1 - fila], col, matriz2[matriz2.length - 1 - fila][col]);
	
			}
			System.out.println("~ ~ ~   ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
		}
	}
	
	public static void compararrMatrices(int matriz1[][], int matriz2[][])
	{
		// TODO Auto-generated method stub
		System.out.printf("             Matriz A\t    Matriz B:\n");
		for (int fila = 0; fila < matriz1.length; fila++)
		{
			for (int col = 0; col < matriz1[0].length; col++)
			{
				System.out.printf("(%d,%d)\t\t%d \t\t%d\n", fila, col, matriz1[fila][col], matriz2[fila][col]);
			}
			System.out.println("~ ~ ~   ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
		}
	}
	
	public static void compararrMatrices(double matriz1[][], double matriz2[][])
	{
		// TODO Auto-generated method stub
		System.out.printf("         Matriz A\tMatriz B:\n");
		for (int fila = 0; fila < matriz1.length; fila++)
		{
			for (int col = 0; col < matriz1[0].length; col++)
			{
				System.out.printf("(%d,%d) %.2f \t%.2f\n", fila, col, matriz1[fila][col], matriz2[fila][col]);
			}
		}
	}
	
	public static void compararrMatrices(String matriz1[][], String matriz2[][])
	{
		// TODO Auto-generated method stub
		System.out.printf("         Matriz A\tMatriz B:\n");
		for (int fila = 0; fila < matriz1.length; fila++)
		{
			for (int col = 0; col < matriz1[0].length; col++)
			{
				System.out.printf("(%d,%d) %s\t%s\n", fila, col, matriz1[fila][col], matriz2[fila][col]);
			}
		}
	}

	public static boolean comprobarNumEnMatriz(int[][] matriz, int num)
	{
		// TODO Auto-generated method stub
		for (int fila = 0; fila < matriz.length; fila++)
		{
			for (int col = 0; col < matriz[0].length; col++)
			{
				if (matriz [fila][col] != num)
					return false;
			}
		}
		return true;
	}

	public static int contarCoincidenciasMatriz(double[][] matriz, int num)
	{
		int cont = 0;
		for (int fila = 0; fila < matriz.length; fila++)
		{
			for (int col = 0; col < matriz[0].length; col++)
			{
				if (matriz [fila][col] == num)
					cont++;
			}
		}
		// TODO Auto-generated method stub
		return cont;
	}

	public static boolean compTriangularSup(double[][] matriz)
	{
		for (int fila = 1; fila < matriz.length; fila++)
		{
			for (int col = 0; col <fila; col++)
			{
				if (matriz[fila][col] != 0.0)
					return false;
			}
		}
		return true;
	}

	public static boolean compTriangularInf(double[][] matriz)
	{
		for (int fila = 0; fila < matriz.length - 1; fila++)
		{
			for (int col = fila + 1; col < matriz[0].length; col++)
			{
				if (matriz[fila][col] != 0.0)
					return false;
			}
		}
		return true;
	}

	public static Object buscarMaximoMatriz(int[][] matriz)
	{
		int maximo = matriz [0][0];

		for (int fila = 0; fila < matriz.length; fila++)
		{
			for (int col = 0; col < matriz[0].length; col++)
			{
				maximo = Math.max(maximo, matriz[fila][col]);
			}
		}
		return maximo;
	}

	public static Object buscarMinimoMatriz(int[][] matriz)
	{
		int minimo = matriz [0][0];

		for (int fila = 0; fila < matriz.length; fila++)
		{
			for (int col = 0; col < matriz[0].length; col++)
			{
				minimo = Math.min(minimo, matriz[fila][col]);
			}
		}
		return minimo;
	}

	public static double buscarDeterminante(double[][] matriz)
	{
		double res = 0;

		res = ((matriz[0][0] * matriz[1][1] * matriz[2][2]) +
			   (matriz[1][0] * matriz[2][1] * matriz[0][2]) +
			   (matriz[2][0] * matriz[0][1] * matriz[1][2]))
				                    -
			  ((matriz[0][2] * matriz[1][1] * matriz[2][0]) +
			   (matriz[1][2] * matriz[2][1] * matriz[0][0]) +
			   (matriz[2][2] * matriz[0][1] * matriz[1][0]));
		return res;
	}

	public static void rellenarMatrizTranspuesta(double[][] matriz1, double[][] matriz2)
	{
		for (int fila = 0; fila < matriz1.length; fila++)
			for (int col = 0; col < matriz1[0].length; col++)
				matriz2[col][fila] = matriz1[fila][col];
	}

	public static void multiplicarMatrices(int[][] matriz1, int[][] matriz2, int[][] matrizFinal)
	{
		int res = 0;
		for (int colF = 0; colF < matrizFinal[0].length; colF++)
		{
			for (int fila = 0; fila < matriz1.length; fila++)
			{
				for (int col = 0; col < matriz1[0].length; col++)
					res = res + (matriz1[fila][col] * matriz2[col][colF]);
				matrizFinal[fila][colF] = res;
				res = 0;
			}
		}
	}
}
