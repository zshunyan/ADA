package ada_bueno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mochila {

	public static void main (String[] args) throws IOException{
		InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader Input = new BufferedReader(reader);
        int vec []=new int[2];
        String[] elem = Input.readLine().split(" ");

        for(int i=0; i<vec.length; i++){
            vec[i]= Integer.parseInt(elem[i]);
        }
        int n=vec[0];
        int m=vec[1];
        
        int [] peso=new int[n];

        elem = Input.readLine().split(" ");

        for(int i=0; i<n; i++){
            peso[i]= Integer.parseInt(elem[i]);
        }
        
        int [] beneficio=new int[n];

        elem = Input.readLine().split(" ");

        for(int i=0; i<n; i++){
            beneficio[i]= Integer.parseInt(elem[i]);
        }
        
		int[][] v = null;

        for(int i=1; i<n; i++) {
        	for(int j=1; j<m; j++) {
				v[i][j]=0;
        	}
        }

        for(int i=1; i<n; i++) {
        	for(int j=1; j<m; j++) {
                int aux=beneficio[i] ;
                int aux2=  v[i-1] [j-peso[i]];
				v[i][j]=Math.max(v[i-1][j] , aux + aux2);
        	}
        }
       int j=m;
       int [] x = new int [n];
        for (int i =n; i<1; i++) {
        	if (v[i][j] == v[i-1][j]) {
        		x[i]=0;
        	}
        		else {
        			x[i]=1;
        			j=j-peso[i];
        		}
        	}
        
        System.out.println(m);
        mostrar(x);
	}
      
	public static void mostrar(int a[]) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
       
	
	
}
