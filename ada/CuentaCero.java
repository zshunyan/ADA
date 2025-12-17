package ada;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CuentaCero {
	
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
        
        int k =cuentaCero(v, v.length);
        
	}

	public static int cuentaCero(int[] v, int pos) {
		int i=v.length/2;
		int n=0;
		int []aux1=new int [pos];
		int []aux2=new int [pos];
		if(v[pos]==0) return n++;
		else {
			for(int j=0; j<i; j++){
	            aux1[j]=v[j];
	        }
			for(int j=0; j<v.length; j++){
	            aux2[j]=v[j];
	        }
			
			return cuentaCero(aux1, aux1.length) + cuentaCero(aux2, aux2.length);
		}
	}
	
}
