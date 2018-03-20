import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class MetodosOrganización {
	//Clase que realiza distintos metodos de organizacion
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out) );
		
		String input = br.readLine();
		int n, q, cases = 1, t, index;
		
		
		while(!input.equals("0 0"))
		{
			bw.write("CASE# " + cases + ":\n");
			n = Integer.parseInt( input.split(" ")[0] );
			q = Integer.parseInt( input.split(" ")[1] );
			
			int[] array = new int[n];
			
			for(int i = 0; i < n; i++)
				array[i] = Integer.parseInt(br.readLine());
			
			array = counting_sort(array.clone());
			
			for(int i = 0; i < q; i++)
			{
				t = Integer.parseInt(br.readLine());
				index = binary_search(t);
				
				if(index != -1)
					bw.write(t + " found at " + (index + 1) + "\n");
				else
					bw.write(t + " not found\n");
			}
				
			bw.flush();
			cases += 1;
			
			input= br.readLine();
		}

	}
	
	public static int[] counting_sort(int[] unsorted)
	{
		int[] sorted = new int[unsorted.length];
		int[] aux = new int[10001];
		int index = 0;
		
		for(int i = 0; i < unsorted.length; i++)
			aux[ unsorted[i] ] += 1;
		
		
		for(int i = 0; i < aux.length; i++)
			if(aux[i] != 0)
				for(int j = 0; j < aux[i]; j++)
				{
					sorted[index] = i;
					index += 1;
				}
		
		return sorted;
	}
	
	public static int binary_search(int value)
	
	{
		int array [] = {1,3,4,10,50,60,90};
		int n = array.length;
		  int central,inf=0, a=n-1;
		   while(inf<= a){
		     central=( a+inf)/2;
		     if(array[central]==value) return central;
		     else if(value < array [central] ){
		        a = central-1;
		     }
		     else {
		       inf=central+1;
		     }
		   }
		   return -1;
	}


	

}
