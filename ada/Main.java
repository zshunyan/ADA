package ada;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main (String[] args) throws IOException {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader Input=new BufferedReader (reader);
        
		int resul;
		String[] linea1 = Input.readLine().split(" ");
		int dividendo = Integer.parseInt(linea1[0]);
		int divisor = Integer.parseInt(linea1[1]);
		
		resul=division(dividendo,divisor);
		System.out.println(resul);
		
	}
	public static int division(int divid, int div) {
		int resM, resL;
		resM =0;
		resL =0;
		if (div>divid) {
			resM=0;
			resL=0;
			//2/8
		}else {
			resL=division(divid-div, div);
			resM++;
		}
		return resM;
	}

	
}


