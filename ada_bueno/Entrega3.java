package ada_bueno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Entrega3 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader Input = new BufferedReader(reader);
        
        int n;
        n = Integer.parseInt(Input.readLine());
        int [] v=new int[n];

        String[] elem = Input.readLine().split(" ");

        for(int i=0; i<n; i++){
            v[i]= Integer.parseInt(elem[i]);
        }
        
//        invertir(v, 6);
//        mostrar(v);
        System.out.println(ordenarPlatos(v));
    }

    public static int ordenarPlatos(int[] platos) {
        int movimientos = 0;
        for (int i = platos.length - 1; i > 0; i--) {
            int max = maximo(platos, i+1);
            if (max!= i) {
                invertir(platos, max);
                mostrar(platos);

                movimientos += 1;
            }
            
        }
        //mostrar(platos);
        return movimientos;
    }

    public static void mostrar(int a[]) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}

    public static int maximo(int[] platos, int hasta) {
        int max = platos[0];
        int maxI = 0;
        for (int i = 1; i < hasta; i++) {
            if (platos[i] > max) {
                max = platos[i];
                maxI= i;
            }
        }
        return maxI;
    }
    
    public static void invertir(int[] platos, int n) {
    	if (n <= 0) {
            return;
        }
        int aux;
        int n2 = n - 1;
        for(int i = platos.length - 1; i > n2; i--) {
            aux = platos[i];
            platos[i] = platos[n2];
            platos[n2] = aux;
            n2++;
        }
    }

}
