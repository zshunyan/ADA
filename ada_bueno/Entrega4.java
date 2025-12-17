package ada_bueno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Entrega4 {
	/*
	 * Estudiar cuantas formas distintas se puede conseguir la cantidad de moneda introducida de programacion dinamica
	 * Shunya Zhan
	 */
	
	public static void main (String[] args) throws IOException{
		
		InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader Input = new BufferedReader(reader);
        float n;
        n = Float.parseFloat(Input.readLine()); //cantidad de moneda
        int cantidad=(int) (n*100);
        int[] monedas= {5,10,20,50,100,200};
        
        int [][]formas=new int[monedas.length+1][cantidad+1];
        for (int i = 0; i <= monedas.length; i++) {
            formas[i][0] = 1; //para sumar uno posteriormente
        }


        for (int i = 1; i <= monedas.length; i++) {//recorrer cada fila de moneda
            for (int j = 1; j <= cantidad; j++) {//recorre cada columna de cantidad, si la cantidad es 25 centimos, entonces tiene 25 columnas
                if (monedas[i - 1] <= j) {
                    formas[i][j] = formas[i - 1][j] + formas[i][j - monedas[i - 1]];
                } else {
                    formas[i][j] = formas[i - 1][j];
                }
            }
        }

        System.out.println(formas[monedas.length][cantidad]);
	}

}
