package ada_bueno;

import java.io.IOException;
import java.util.Random;

public class Entrega1 {
//*******************************************Enunciado***********************************************
//Estudiar el coste temporal real de algunos algoritmos de ordenacion.
//Los algoritmos ordenaran ascendentemente un vector de enteros de diferente tamaño.
//Implementar los algoritmos de ordenación: Selection sort y Bubble sort
//Comparar el coste entre los algoritmos implementados y los algoritmos ya disponibles (Cocktail Sort y Quicksort ).
	//Nombre:Shunya Zhan

//**********************************************MAIN*************************************************
	public static void main (String[] args) throws IOException{
		
		
		System.out.println("#Ordenacion por BubbleSort, SelectionSort, QuickSort, CocktailSort");
		System.out.println("#Tiempos de ejecucion promedio");
		System.out.println();
		System.out.println("Entrada: un vector ordenado");
	
		System.out.println("#Talla		Tiempo(mseg)		Tiempo(mseg)		Tiempo(mseg)		Tiempo(mseg)");
		System.out.println("#		BubbleSort		SelectionSort		QuickSort		CocktailSort");
		int tam=2000;
		int vez=10;
		int[]a=vectorOrdenado(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));
		
		tam=4000;
		a=vectorOrdenado(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));

		tam=6000;
		a=vectorOrdenado(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));
		
		tam=8000;
		a=vectorOrdenado(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));
		
		tam=10000;
		a=vectorOrdenado(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));

		tam=12000;
		a=vectorOrdenado(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));
		
		tam=14000;
		a=vectorOrdenado(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));
		
		tam=16000;
		a=vectorOrdenado(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));
		
		tam=18000;
		a=vectorOrdenado(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));
		
		tam=20000;
		a=vectorOrdenado(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));
		
		System.out.println();
		System.out.println("Entrada: un vector aleatorio");
		System.out.println("#Talla		Tiempo(mseg)		Tiempo(mseg)		Tiempo(mseg)		Tiempo(mseg)");
		System.out.println("#		BubbleSort		SelectionSort		QuickSort		CocktailSort");
		
		tam=2000;
		a=vectorAleatorio(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));
		
		tam=4000;
		a=vectorAleatorio(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));

		tam=6000;
		a=vectorAleatorio(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));
		
		tam=8000;
		a=vectorAleatorio(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));
		
		tam=10000;
		a=vectorAleatorio(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));

		tam=12000;
		a=vectorAleatorio(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));
		
		tam=14000;
		a=vectorAleatorio(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));
		
		tam=16000;
		a=vectorAleatorio(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));
		
		tam=18000;
		a=vectorAleatorio(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));
		
		tam=20000;
		a=vectorAleatorio(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));
		
		System.out.println();
		System.out.println("Entrada: un vector ordenado inversamente");
		System.out.println("#Talla		Tiempo(mseg)		Tiempo(mseg)		Tiempo(mseg)		Tiempo(mseg)");
		System.out.println("#		BubbleSort		SelectionSort		QuickSort		CocktailSort");
		
		tam=2000;
		a=vectorInversa(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));
		
		tam=4000;
		a=vectorInversa(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));

		tam=6000;
		a=vectorInversa(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));
		
		tam=8000;
		a=vectorInversa(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));
		
		tam=10000;
		a=vectorInversa(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));

		tam=12000;
		a=vectorInversa(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));
		
		tam=14000;
		a=vectorInversa(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));
		
		tam=16000;
		a=vectorInversa(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));
		
		tam=18000;
		a=vectorInversa(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));
		
		tam=20000;
		a=vectorInversa(tam);
		System.out.println(" "+tam+"		"+promedioBS(a, vez)+"			"+promedioSS(a, vez)+"			"+promedioQS(a, vez)+"			"+promedioCS(a, vez));
		
	}
//***************************************************************************************************
	

	
//**********************************************METODOS*************************************************
		
/*
 * Método que calcula tiempo promedio de Bubble Sort, se utiliza un vector que es la copia del vector pasado por parametro
 */
	public static double promedioBS(int[] a,int vez) {
		long t1,t2,tiempo;
		double sumatorio=0;
		for(int i=0; i<vez; i++) {
			int b[]=a.clone();
			t1 = System.currentTimeMillis();
			bubbleSort(b);
			t2 = System.currentTimeMillis();
			tiempo=t2-t1;
			sumatorio+=tiempo;
		}
		sumatorio= (double) sumatorio/vez;
		return sumatorio;
	}
	
/*
 * Método que calcula tiempo promedio de Selection Sort, se utiliza un vector que es la copia del vector pasado por parametro
 */
	public static double promedioSS(int[] a,int vez) {
		long t1,t2,tiempo;
		double sumatorio=0;
		for(int i=0; i<vez; i++) {
			int b[]=a.clone();
			t1 = System.currentTimeMillis();
			selectionSort(b);
			t2 = System.currentTimeMillis();
			tiempo=t2-t1;
			sumatorio+=tiempo;
		}
		sumatorio=(double)sumatorio/vez;
		return sumatorio;
	}
	
/*
* Método que calcula tiempo promedio de Quick Sort, se utiliza un vector que es la copia del vector pasado por parametro
*/
	public static double promedioQS(int[] a,int vez) {
		long t1,t2,tiempo;
		double sumatorio=0;
		for(int i=0; i<vez; i++) {
			int b[]=a.clone();
			t1 = System.currentTimeMillis();
			quickSort(b,0,a.length-1);
			t2 = System.currentTimeMillis();
			tiempo=t2-t1;
			sumatorio+=tiempo;
			}
			sumatorio=(double)sumatorio/vez;
			return sumatorio;
		}
	
/*
 * Método que calcula tiempo promedio de Cocktail sort, se utiliza un vector que es la copia del vector pasado por parametro
 */
	public static double promedioCS(int[] a,int vez) {
		long t1,t2,tiempo;
		double sumatorio=0;
		for(int i=0; i<vez; i++) {
			int b[]=a.clone();
			t1 = System.currentTimeMillis();
			cocktailSort(b);
			t2 = System.currentTimeMillis();
			tiempo=t2-t1;
			sumatorio+=tiempo;
			}
			sumatorio=(double)sumatorio/vez;
			return sumatorio;
		}
	
/*
 * Método de ordenación Bubble Sort; ordena de forma comparando el primero
 * con el siguiente posición, así repetiendo hasta que se quede ordenado el vector
 */
	public static void bubbleSort(int b[]) {
		
		int aux;
		for(int i=b.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(b[j]>b[j+1]) {
					aux=b[j];
					b[j]=b[j+1];
					b[j+1]=aux;
				}
			}
		}
	}
	
/*
 * Método de ordenación Selection Sort; hace una copia de vector y lo ordena de forma buscando el mínimo y 
 * poniendo al principio, así sucesivamente hasta que se quede ordenado el vector
 */
	public static void selectionSort(int a[]) {
		int b[]=a.clone();
		int min,aux;
		for(int i=0;i<b.length-1;i++) {
			min=i;
			for(int j=i+1;j<b.length;j++) {
				if(b[j]<b[min]) {
					min=j;
				}
				aux=b[min];
				b[min]=b[i];
				b[i]=aux;
			}
		}
	}
	
/*
 * Método que se crea un vector de n tamaño con valores aleatorio (Caso Medio)
 */	
	public static int[] vectorAleatorio (int n) {
		Random r=new Random();
		int v[]=new int [n];
		for(int i=0;i<n;i++) {
			v[i]=r.nextInt(n)+1;
		}
		return v;
	}
	
/*
 * Método que se crea un vector de n tamaño con valores ordenado (Caso Mejor)
 */
	public static int[] vectorOrdenado (int n) {
		int v[] = new int[n];
		for (int i=0; i<n; i++) {
			v[i]=i;
		}
		return v;
	}
	
/*
 * Método que se crea un vector de n tamaño con valores ordenado inversamente (Caso Peor)
 */
	public static int[] vectorInversa (int n) {
		int v[] = new int[n];
		for (int i=n-1; i>=0; i--) {
			v[n-1-i]=i;
		}
		return v;
	}
	
	
/*
 * Método que se muestra el vector
 */
	public static void mostrar(int a[]) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	

	
	
	/**
	 * Algoritmo de ordenacion quicksort (Hoare -1963-). Utiliza el algoritmo de
	 * particion debido a Weiss, con mediana de 3 para el calculo del pivote.
	 * Adaptacion de la implementacion de los profesores de EDA del grado de informatica de la UPV
	 * 
	 * quicksort:
	 * https://en.wikipedia.org/wiki/Quicksort
	 * 
	 * @param a   vector a ordenar
	 * @param izq indice del limite inferior a ser ordenado
	 * @param der indice del limite superior a ser ordenado
	 * 
	 **/
	public static void quickSort(int a[], int izq, int der) {
		if (izq < der) {
			int pivot = mediana3(a, izq, der);
			int i = izq;
			int j = der - 1;
			for (; i < j;) {
				while (pivot - a[++i] > 0);
				while (pivot - a[--j] < 0);
				intercambiar(a, i, j);
			}
			intercambiar(a, i, j); // Deshacer el ultimo cambio
			intercambiar(a, i, der - 1); // Restaurar el pivote
			quickSort(a, izq, i - 1); // Ordenar recursivamente los elementos menores
			quickSort(a, i + 1, der); // Ordenar recursivamente los elementos mayores
		}
	}

	// Metodo para intercambiar dos elementos de un array
	private static void intercambiar(int a[], int ind1, int ind2) {
		int tmp = a[ind1];
		a[ind1] = a[ind2];
		a[ind2] = tmp;
	}

	/**
	 * Metodo para calculo de la Mediana de 3, devuelve el valor del pivote
	 */
	private static int mediana3(int a[], int izq, int der) {
		int c = (izq + der) / 2;
		if (a[c] - (a[izq]) < 0)
			intercambiar(a, izq, c);
		if (a[der] - (a[izq]) < 0)
			intercambiar(a, izq, der);
		if (a[der] - (a[c]) < 0)
			intercambiar(a, c, der);
		// (ocultar el pivote en la posicion der-1
		intercambiar(a, c, der - 1);
		return a[der - 1];
	}
	
	
	

//	---------  Cocktail sort ------------------- 
	/**
	 * Cocktail shaker sort (cocktail sort), also known as bidirectional bubble sort
	 * https://en.wikipedia.org/wiki/Cocktail_shaker_sort
	 * 
	 * Implementacion obtenida de:
	 * https://en.wikibooks.org/wiki/Algorithm_Implementation/Sorting/Cocktail_sort
	 * 
	 * @param numbers, recibe el vector a ordenar
	 * 
	 **/
	public static void cocktailSort(int[] numbers) {
		boolean swapped = true;
		int i = 0;
		int j = numbers.length - 1;
		while (i < j && swapped) { 
			swapped = false;
			for (int k = i; k < j; k++) {
				if (numbers[k] > numbers[k + 1]) {
					int temp = numbers[k];
					numbers[k] = numbers[k + 1];
					numbers[k + 1] = temp;
					swapped = true;
				}
			}
			j--;
			if (swapped) {
				swapped = false;
				for (int k = j; k > i; k--) {
					if (numbers[k] < numbers[k - 1]) {
						int temp = numbers[k];
						numbers[k] = numbers[k - 1];
						numbers[k - 1] = temp;
						swapped = true;
					}
				}
			}
			i++;
		}
	}
}
//***************************************************************************************************
