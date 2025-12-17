package ada_bueno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Media {
	//Nombre: Shunya Zhan
	
	public static void main (String[] args) throws IOException{
		InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader Input = new BufferedReader(reader);
        int n;
        n = Integer.parseInt(Input.readLine());
        int [] v=new int[n];

        String[] elem = Input.readLine().split(" ");

        for(int i=0; i<n; i++){
            v[i]= Integer.parseInt(elem[i]);
        }
        
        int k =Media(v);
        System.out.println(k);
	}

	public static int Media(int[] v) {
	    int tam = v.length;	    
	    if (tam == 1) {
	        return v[0];
	    }	    
	    int tamIzq =(int) tam / 2;
	    int[] izq = new int[tamIzq];
	    for (int i = 0; i < tamIzq; i++) {
	        izq[i] = v[i];
	    }	    
	    int tamDer = (int)tam - tamIzq;
	    int[] der = new int[tamDerhttps://campusvirtual.unex.es/zonauex/avuex/mod/vpl/view.php?id=1658969];
	    for (int i = 0; i < tamDer; i++) {
	        der[i] = v[tamIzq + i];
	    }	    
	    int mediaIzq = Media(izq);
	    int mediaDer = Media(der);	    
	    return (mediaIzq + mediaDer) / 2;
	}

	
}
