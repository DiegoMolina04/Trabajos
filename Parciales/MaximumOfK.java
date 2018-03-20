import java.util.Scanner;

public class MaximumOfK {
	//Busca el numero mayor entre un sub grupo de arrays y los imprime 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n=0, k=0,pivot =0, j=0;
		n = sc.nextInt();
		k = sc.nextInt();
		int vector[] = new int[n];
		int max=vector[0];
		
		for (int i = 0; i < n; i++) {
			vector[i]= sc.nextInt();
		}
		
		while (pivot < k ) {
			
			if(n > k) {
			
				if (vector[pivot] > max) {
					
					max=vector[pivot];
				}else {
					
					pivot= pivot +1;
				}
			
			if (pivot == k) {
				
				j= j +1;
				k = k+1;
				pivot = j;
				System.out.println(max);
				max = vector [pivot];
			}else {
				
			}
			
		}
			
	}
		
}

}
