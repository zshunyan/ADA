package ada_bueno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Entrega2 {
	public static void main (String[] args) throws IOException{
		InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader Input = new BufferedReader(reader);
        
        //PRIMER LINEA: numero de cadetes en la fila
        int n;
        n = Integer.parseInt(Input.readLine());
        while (1>n || n>5000) {
        	System.out.println("Tiene que ser 1 <= N <= 5000, intentalo otra vez");
            n = Integer.parseInt(Input.readLine());
        }
        
        //SEGUNDO LINEA: las alturas de los cadetes ordenado de menor a mayor por vector

        int [] v=new int[n];
        String[] elem ;
        boolean valida=false;
        while(!valida) {
        	elem=Input.readLine().split(" ");
        	for(int i=0; i<n; i++){
                v[i]= Integer.parseInt(elem[i]);
                if(v[i]<1 || v[i]>10000) {
                	System.out.println("Alguno rango superado, tiene que ser de 1 al 10000");
                	valida=false;
                	break;
                }else {
                	valida=true;
                }
            }
        }
        
        //TERCER LINEA: numero de consulta
        int k;
        k= Integer.parseInt(Input.readLine());
        while (1>k || k>2500) {
        	System.out.println("Tiene que ser 1 <= K <= 2500, intentalo otra vez");
            k = Integer.parseInt(Input.readLine());
        }

        //CUARTA LINEA: alturas de consultas, estos numeros es una supuesta altura de Juan Chulot
        int [] v2=new int[k];
        String[] elem2 ;
        valida=false;
        while(!valida) {
        	elem2=Input.readLine().split(" ");
        	for(int i=0; i<k; i++){
                v2[i]= Integer.parseInt(elem2[i]);
                if(v2[i]<1 || v2[i]>2500) {
                	System.out.println("Alguno rango superado, tiene que ser de 1 al 2500");
                	valida=false;
                	break;
                }else {
                	valida=true;
                }
            }
        }
        
        for (int consulta : v2) {
        	int[] resul=JuanChulot(consulta,v);
        	mostrar(resul);
        }
        
	}
	public static int[] JuanChulot(int consulta, int []v) {
		int i=v.length/2;
        int [] resul=new int[2];
        int []izq=new int [i];
		int []der=new int [v.length-i];
		for(int j=0; j<i; j++){
            izq[j]=v[j];
        }
		for(int j=i+1; j<v.length; j++){
            der[j]=v[j];
        }
		
		if() {
			return
		}
		else {
			JuanChulot(izq)
			JuanChulot(der)
			combinar();
		}
	}
	
	public static void mostrar(int[] res) {
		if(res[0]!=-1) {
			System.out.print(res[0]);
			
		}else {
			System.out.print("null");
		}
		System.out.print(" ");
		
		if(res[1]!=-1) {
			System.out.print(res[1]);
			
		}else {
			System.out.print("null");
		}
		System.out.println();
	}
}
