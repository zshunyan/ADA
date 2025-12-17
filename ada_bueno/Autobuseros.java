package ada_bueno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Autobuseros {
	//Autor: Shunya Zhan y Laura Reinosa

	public static void main (String[] args) throws IOException{
		InputStreamReader reader = new InputStreamReader(System.in);
	    BufferedReader Input = new BufferedReader(reader);
	    int n=3;
	    int [] v=new int[n];ç
	    String[] elem =Input.readLine().split(" ");
	    for(int i=0; i<n; i++){
	        v[i]= Integer.parseInt(elem[i]);
	    }
	    
	    //por la mañana
	    
	    int[] vecM=new int[v[0]];
		elem =Input.readLine().split(" ");
		for(int j=0; j<v[0]; j++){
			vecM[j]= Integer.parseInt(elem[j]);
		}

		bubbleSort(vecM);
		//por la tarde
	    int[] vecT=new int[v[0]];
		elem =Input.readLine().split(" ");
		for(int j=0; j<v[0]; j++){
			vecT[j]= Integer.parseInt(elem[j]);
		}
		bubbleSort(vecT);
		
		int euroExtra=repartir(vecM, vecT, v[1], v[2]);
		System.out.println(euroExtra);
	    
	}
	
	public static int repartir (int []M,int []T,int maxT, int extra) {
		int []aux=new int[M.length ];
		int resul=0;
		for(int i=0;i<M.length; i++) {
			//for(int j=T.length-1; j>=0; j--) {
				aux[i]=M[i]+T[T.length-i-1];
				
				if(aux[i]>maxT){
					resul=resul+(aux[i]-maxT);
				}
			//}
		}
		return resul*extra;
	}
	
	
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
    
}
